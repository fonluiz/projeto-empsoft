package com.example.melhoridade.melhoridade;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.melhoridade.melhoridade.utils.SharedPreferencesUtils;

public class ChatsListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public ChatsListFragment() {
        // Required empty public constructor
    }

    public static ChatsListFragment newInstance() {
        ChatsListFragment fragment = new ChatsListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mainView =  inflater.inflate(R.layout.fragment_chats_list, container, false);

        mRecyclerView = (RecyclerView) mainView.findViewById(R.id.chats_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new ChatsListAdapter(SharedPreferencesUtils.retrieveInterests(getContext()));
        mRecyclerView.setAdapter(mAdapter);


        return mainView;
    }
}
