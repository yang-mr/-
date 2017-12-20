package com.zjxx.android.cafebox.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zjxx.android.cafebox.R;
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
    private int mPosition;

    private final static int HEAD = 1;
    private final static int CONTENT = 2;

    public GeneralRecyclerAdapter(List<D> data, int res, BindData bindData) {
        this.data = data;
        this.mRes = res;
        this.mBindData = bindData;
    }

    public void setmPosition(int mPosition) {
        this.mPosition = mPosition;
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
        if (position != 0 && mPosition == position) {
            RecyclerViewHolder viewHolder = (RecyclerViewHolder) holder;
            viewHolder.setTextView(R.id.tv_name, "通讯录好友");
            viewHolder.getViewById(R.id.iv_avatar).setVisibility(View.GONE);

            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100);
            viewHolder.itemView.setLayoutParams(layoutParams);
            return;
        }

        mBindData.bindItemData(holder, position, data.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(holder.itemView, position);
                }
            }
        });
    }

    @Override
    public int getItemViewType(int position) {
        //暂时不支持 position == 0 后续根据业务加
        if (position == mPosition && position != 0) {
            return HEAD;
        }
        return CONTENT;
    }

    public void setData(List<D> mData) {
        this.data = mData;
        this.notifyDataSetChanged();
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

    public interface BindData<VH, D> {
        void bindItemData(VH holder, int position, D data);
    }
}
