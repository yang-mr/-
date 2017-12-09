package com.zjxx.android.cafebox.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;

/**
 * Created by root on 17-11-28.
 *
 * @DESCRIPTION --------------------
 */

public class DialogFactory {
    private DialogView mDialog;

   /* public DialogFactory(Activity context, int res) {
        this.mDialog = DialogView.getInstance(res);
        mDialog.show();
    }

    public DialogFactory(Activity context, View view) {
        this.mDialog = DialogView.getInstance(context, view);
        mDialog.show();
    }*/

    public static DialogView createDialog(Activity context, View view, int title, int msg){
        DialogView dialogView = DialogView.getInstance(context, view);
        dialogView.setmTitle(title);
        dialogView.setmMsg(msg);
        return dialogView;
    }

    public static DialogView createDialog(Activity context, int res){
        DialogView dialogView = DialogView.getInstance(context, res);
        return dialogView;
    }

    public interface OnDialogClickResult {
        void onClickOK();
    }
}
