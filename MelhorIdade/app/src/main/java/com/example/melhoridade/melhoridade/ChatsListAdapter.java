package com.example.melhoridade.melhoridade;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatsListAdapter extends RecyclerView.Adapter<ChatsListAdapter.ViewHolder>{
    private String[] mDataset;
    private Context mContext;

    public ChatsListAdapter(String[] myDataset, Context context) {
        mDataset = myDataset;
        mContext = context;
    }

    @Override
    public ChatsListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chats_list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ChatsListAdapter.ViewHolder holder, int position) {
        if (mDataset[position].equals("Política")){
            holder.mImageView.setImageResource(R.drawable.chatroom_politica);
        }else if (mDataset[position].equals("Culinária")){
            holder.mImageView.setImageResource(R.drawable.chatroom_culinaria);
        }else if (mDataset[position].equals("Piadas")){
            holder.mImageView.setImageResource(R.drawable.chatroom_piadas);
        }else if (mDataset[position].equals("Mundo da TV")){
            holder.mImageView.setImageResource(R.drawable.chatroom_mundotv);
        }else if (mDataset[position].equals("Jogos")){
            holder.mImageView.setImageResource(R.drawable.chatroom_jogos);
        }else if (mDataset[position].equals("Saúde")){
            holder.mImageView.setImageResource(R.drawable.chatroom_saude);
        }else if (mDataset[position].equals("Esportes")){
            holder.mImageView.setImageResource(R.drawable.chatroom_esportes);
        }else if (mDataset[position].equals("Proximidades")){
            holder.mImageView.setImageResource(R.drawable.chatroom_proximidade);
        } else if (mDataset[position].equals("Turismo")){
            holder.mImageView.setImageResource(R.drawable.chatroom_turismo);
        }else if (mDataset[position].equals("Religião")){
            holder.mImageView.setImageResource(R.drawable.chatroom_religiao);
        }
    }

    @Override
    public int getItemCount() {
       return mDataset.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView mImageView;
        public ViewHolder(View v) {
            super(v);
            mImageView = (ImageView) v.findViewById(R.id.chatroom_image);
        }
    }
}
