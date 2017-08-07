package com.example.melhoridade.melhoridade;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


class FeedAdapter extends RecyclerView.Adapter {
    private List<Conteudo> conteudos;
    private Context context;

    public FeedAdapter(List<Conteudo> conteudos, Context context) {
        this.conteudos = conteudos;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {


        View view = LayoutInflater.from(context)
                .inflate(R.layout.feed_row_adapter, parent, false);

        FeedViewHolder holder = new FeedViewHolder(view);

        return holder;
    }



    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,
                                 int position) {

        FeedViewHolder holder = (FeedViewHolder) viewHolder;

        Conteudo conteudo  = conteudos.get(position) ;

        holder.titulo.setText(conteudo.getTitulo());
        holder.descricao.setText(conteudo.getDescricao());
        holder.categoria.setText(conteudo.getCategoria());

        if (conteudo.getCategoria().equals("culinaria")){
            holder.icone.setImageResource(R.drawable.culinaria);
            holder.layout.setBackground(context.getResources().getDrawable(R.drawable.cardculinaria));
        }else if (conteudo.getCategoria().equals("esportes")){
            holder.icone.setImageResource(R.drawable.esportes);
            holder.layout.setBackground(context.getResources().getDrawable(R.drawable.cardesportes));
        }else if (conteudo.getCategoria().equals("jogos")){
            holder.icone.setImageResource(R.drawable.jogos);
            holder.layout.setBackground(context.getResources().getDrawable(R.drawable.cardjogos));
        }else if (conteudo.getCategoria().equals("novelas")){
            holder.icone.setImageResource(R.drawable.mundotv);
            holder.layout.setBackground(context.getResources().getDrawable(R.drawable.cardnovelas));
        }else if (conteudo.getCategoria().equals("piadas")){
            holder.icone.setImageResource(R.drawable.piadas);
            holder.layout.setBackground(context.getResources().getDrawable(R.drawable.cardpiadas));
        }else if (conteudo.getCategoria().equals("politica")){
            holder.icone.setImageResource(R.drawable.politica);
            holder.layout.setBackground(context.getResources().getDrawable(R.drawable.cardpolitica));
        }else if (conteudo.getCategoria().equals("religiao")){
            holder.icone.setImageResource(R.drawable.religiao);
            holder.layout.setBackground(context.getResources().getDrawable(R.drawable.cardreligiao));
        }else if (conteudo.getCategoria().equals("turismo")){
            holder.icone.setImageResource(R.drawable.turismo);
            holder.layout.setBackground(context.getResources().getDrawable(R.drawable.cardturismo));
        }
    }

    @Override
    public int getItemCount() {
        return conteudos.size();
    }

    public class FeedViewHolder extends RecyclerView.ViewHolder {

        final ImageView icone;
        final TextView titulo;
        final TextView descricao;
        final TextView categoria;
        final LinearLayout layout;


        public FeedViewHolder(View view) {
            super(view);
            titulo = (TextView) view.findViewById(R.id.titulo);
            icone = (ImageView) view.findViewById(R.id.iconecategoria);
            descricao = (TextView) view.findViewById(R.id.descricao);
            categoria = (TextView) view.findViewById(R.id.categoria);
            layout = (LinearLayout) view.findViewById(R.id.bgcategoria);
        }

    }
}
