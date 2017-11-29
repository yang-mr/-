package com.zjxx.android.cafebox.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by root on 17-11-29.
 *
 * @DESCRIPTION --------------------
 */

public class GeneralRecyclerAdapter<VH extends RecyclerView.ViewHolder, D> extends RecyclerView.Adapter<VH> {
    private List<D> data;
    private int mRes;
    private OnItemClickListener mOnItemClickListener;
    private BindData mBindData;

    public GeneralRecyclerAdapter(List<D> data, int res, BindData bindData) {
        this.data = data;
        this.mRes = res;
        this.mBindData = bindData;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mRes == 0) {
            throw new RuntimeException("请设置资源文件");
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(mRes, parent, false);
        return (VH) new RecyclerViewHolder(view);
    }

    public void setmOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        mBindData.bindItemData(holder, position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(holder.itemView, position);
                }
            }
        });
    }

    public void setData(List<D> mData) {
        this.data = mData;
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private SparseArray<View> mViews;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            if (mViews == null) {
                mViews = new SparseArray<>();
            }
        }

        public <V extends View> V getViewById(int id) {
            View view = mViews.get(id);
            if (view == null) {
                view = itemView.findViewById(id);
                mViews.put(id, view);
            }
            return (V)view;
        }

        public void setTextView(int id, CharSequence s) {
            TextView textView = getViewById(id);
            textView.setText(s);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(View v, int position);
    }

    public interface BindData<VH> {
        void bindItemData(VH holder, int position);
    }
}
