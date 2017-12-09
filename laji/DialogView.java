package com.zjxx.android.cafebox.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by root on 17-11-28.
 *
 * @DESCRIPTION --------------------
 */

public class DialogView extends DialogFragment {

    private static int mRes = 0;
    private static View mView;
    private static Activity mContext;
    private DialogFactory.OnDialogClickResult mOnDialogClickResult;

    private int mTitle;

    public void setmOnDialogClickResult(DialogFactory.OnDialogClickResult mOnDialogClickResult) {
        this.mOnDialogClickResult = mOnDialogClickResult;
    }

    private int mMsg;

    public void setmTitle(int mTitle) {
        this.mTitle = mTitle;
    }

    public void setmMsg(int mMsg) {
        this.mMsg = mMsg;
    }

    public DialogView() {
        super();
    }

    public static DialogView getInstance(Activity context, int res) {
        mContext = context;
        mRes = res;
        return new DialogView();
    }

    public static DialogView getInstance(Activity context, View view) {
        mView = view;
        mContext = context;
        return new DialogView();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (mRes != 0) {
            return super.onCreateDialog(savedInstanceState);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        if (mRes != 0) {
            LayoutInflater inflater = mContext.getLayoutInflater();
            View view = inflater.inflate(mRes, null);
            mView = view;
            return null;
        }

        builder.setView(mView)
                .setTitle(mTitle)
                .setPositiveButton("ok", null).setNegativeButton("Cancel", null);
        if (mMsg != 0) {
            builder.setMessage(mMsg);
        }
        AlertDialog alertDialog = builder.create();
        alertDialog.setCanceledOnTouchOutside(false);

        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                Button positionButton = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                Button negativeButton = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);
                positionButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mOnDialogClickResult != null) {
                            mOnDialogClickResult.onClickOK();
                        }
                    }
                });
                negativeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
            }
        });
        return alertDialog;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if (mRes != 0) {
            return inflater.inflate(mRes, container, false);
        } else {
            return super.onCreateView(inflater, container, savedInstanceState);
        }
    }

    public void show() {
        super.show(mContext.getFragmentManager(), "show");
    }

    @Override
    public void dismiss() {
        super.dismiss();
    }
}
