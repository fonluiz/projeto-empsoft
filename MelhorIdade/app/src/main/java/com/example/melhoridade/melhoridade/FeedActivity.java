package com.example.melhoridade.melhoridade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);

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

        recyclerView.setAdapter(new FeedAdapter(conteudos, this));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);
    }
}
