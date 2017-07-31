package com.example.melhoridade.melhoridade;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HobbiesAdapter extends RecyclerView.Adapter<HobbiesAdapter.ViewHolder>{
    private String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public HobbiesAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override
    public HobbiesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hobbie_box, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(HobbiesAdapter.ViewHolder holder, int position) {
        holder.interestTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View mCardView;
        public TextView interestTextView;

        public ViewHolder(View v) {
            super(v);
            mCardView = v;
            interestTextView = (TextView) mCardView.findViewById(R.id.interest_text_view);
        }
    }
}
