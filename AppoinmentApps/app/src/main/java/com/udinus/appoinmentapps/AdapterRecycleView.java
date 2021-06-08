package com.udinus.appoinmentapps;

import  android.view.View;
import  android.view.LayoutInflater;
import  android.view.ViewGroup;
import  android.widget.ImageView;
import  android.widget.TextView;
import  androidx.annotation.NonNull;
import  androidx.recyclerview.widget.RecyclerView;
import  java.util.ArrayList;
public class AdapterRecycleView extends RecyclerView.Adapter<AdapterRecycleView.ViewHolder> {
    private ArrayList<itemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textHarga;


        ViewHolder(View v) {

            super(v);

            textHead = v.findViewById(R.id.judul);
            textHarga = v.findViewById(R.id.harga);

        }
    }

    AdapterRecycleView(ArrayList<itemModel> data) {

        this.dataItem = data;
    }

    @NonNull
    @Override
    public AdapterRecycleView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daftar, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        TextView textHead = holder.textHead;
        TextView textHarga = holder.textHarga;


        textHead.setText(dataItem.get(position).getName());
        textHarga.setText(dataItem.get(position).getHarga());

    }

    @Override
    public int getItemCount() {

        return dataItem.size();
    }
}
