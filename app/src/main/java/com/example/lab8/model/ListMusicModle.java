package com.example.lab8.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab8.Music;
import com.example.lab8.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class ListMusicModle extends RecyclerView.Adapter<ListMusicModle.View_Holder> {

    public Context context;
    public List<Music> listMusic = new ArrayList();
    private OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public ListMusicModle(Context context, List<Music> listMusic) {
        this.context = context;
        this.listMusic = listMusic;
    }

    @NonNull
    @Override
    public View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_item,null);
        return new View_Holder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull View_Holder holder, int position) {
        holder.tvNameBaiHat.setText(listMusic.get(position).getNameBaiHat());
        holder.tvNameTacGia.setText(listMusic.get(position).getNameTacGia());
    }

    @Override
    public int getItemCount() {
        return listMusic.size();
    }

    public static class View_Holder extends RecyclerView.ViewHolder{
        TextView tvNameTacGia,tvNameBaiHat;
        public View_Holder(@NonNull View itemView, OnItemClickListener mListener) {
            super(itemView);
            tvNameBaiHat = (TextView) itemView.findViewById(R.id.tv_name_song);
            tvNameTacGia = (TextView) itemView.findViewById(R.id.tv_name_tac_gia);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    mListener.onItemClick(position);
                }
            });
        }
    }

}
