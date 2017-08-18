package com.example.melhoridade.melhoridade;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.melhoridade.melhoridade.utils.SharedPreferencesUtils;

import java.util.ArrayList;
import java.util.List;

public class HobbiesAdapter extends BaseAdapter {
    private Context mContext;
//    Ordem: Política, culinária, piadas, mundo tv, jogos, saude, esportes, proximidades, turismo, religião
    private Interest[] mDataset;

    private String[] names = {"Política", "Culinária", "Piadas", "Mundo da TV", "Jogos", "Saúde",
            "Esportes", "Proximidades", "Turismo", "Religião"};

    private int[] normalImages = {
            R.drawable.politica,  R.drawable.culinaria, R.drawable.piadas, R.drawable.mundotv,
            R.drawable.jogos, R.drawable.saude, R.drawable.esportes, R.drawable.proximidade,
            R.drawable.turismo, R.drawable.religiao
    };
    private int[] selectedImages = {
            R.drawable.politica_check, R.drawable.culinaria_check, R.drawable.piadas_check,
            R.drawable.mundotv_check, R.drawable.jogos_check, R.drawable.saude_check,
            R.drawable.esportes_check, R.drawable.proximidade_check, R.drawable.turismo_check,
            R.drawable.religiao_check
    };

    // Provide a suitable constructor (depends on the kind of dataset)
    public HobbiesAdapter(Context context) {
        mContext = context;
        mDataset = new Interest[10];
        for (int i = 0; i < 10; i++) {
            Interest interest = new Interest(names[i], normalImages[i], selectedImages[i]);
            mDataset[i] = interest;
        }
    }

    @Override
    public int getCount() {
        return mDataset.length;
    }

    @Override
    public Object getItem(int position) {
        return mDataset[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mDataset[position].getImage());
        return imageView;
    }

    public void onClickItem(int position){
        mDataset[position].changeIcon();
        notifyDataSetChanged();

    }

    public void saveSelectedInterests() {
        List<String> interestsToSave = new ArrayList<>();
        for (Interest i : mDataset) {
            if (i.isSelected()) {
                interestsToSave.add(i.getName());
            }
        }
        String[] array = interestsToSave.toArray(new String[interestsToSave.size()]);
        SharedPreferencesUtils.saveInterests(mContext, array);
    }


}
