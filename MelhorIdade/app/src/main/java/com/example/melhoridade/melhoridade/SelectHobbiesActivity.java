package com.example.melhoridade.melhoridade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class SelectHobbiesActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private Button xablau;
    private String[] hobbiesDataset = new String[] {
            "Culinária", "Novelas", "Esportes", "Viagens", "Namoro", "Piadas"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_hobbies);

        mRecyclerView = (RecyclerView) findViewById(R.id.hobbies_recycler_view);

        xablau = (Button) findViewById(R.id.next);
        xablau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SelectHobbiesActivity.this, FeedActivity.class);
                startActivity(i);
            }
        });
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new HobbiesAdapter(hobbiesDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
