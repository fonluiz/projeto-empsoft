package com.example.melhoridade.melhoridade;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FeedFragment extends Fragment {

    public FeedFragment() {
        // Required empty public constructor
    }

    public static FeedFragment newInstance() {
        FeedFragment fragment = new FeedFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mainView = inflater.inflate(R.layout.fragment_feed, container, false);

        RecyclerView recyclerView = (RecyclerView) mainView.findViewById(R.id.recycler);

        List<Conteudo> conteudos = new ArrayList<>();

        String descript = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        List<String> categorias = new ArrayList<>();
        categorias.add("culinaria");
        categorias.add("esportes");
        categorias.add("jogos");
        categorias.add("novelas");
        categorias.add("piadas");
        categorias.add("politica");
        categorias.add("religiao");
        categorias.add("turismo");


        for (int i=0; i<10; i++){
            if(i>7){
                Conteudo conteudo = new Conteudo("titulo" + i, descript, categorias.get(4));
                conteudos.add(conteudo);
            }else{
                Conteudo conteudo = new Conteudo("titulo" + i, descript, categorias.get(i));
                conteudos.add(conteudo);
            }
        }

        recyclerView.setAdapter(new FeedAdapter(conteudos, getContext()));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

        return mainView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
