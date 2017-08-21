package com.example.melhoridade.melhoridade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;

import org.w3c.dom.Text;

public class SelectHobbiesActivity extends AppCompatActivity {
    private TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_hobbies);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        final HobbiesAdapter adapter = new HobbiesAdapter(this);
        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                   adapter.onClickItem(position);
            }
        });

        next = (TextView) findViewById(R.id.confirm_btn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.saveSelectedInterests();

                Intent i = new Intent(SelectHobbiesActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
