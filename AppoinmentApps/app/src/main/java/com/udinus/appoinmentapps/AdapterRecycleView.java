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

        TextView textDate;
        TextView textPlace;
        TextView textWith;


        ViewHolder(View v) {

            super(v);

            textDate = v.findViewById(R.id.date);
            textPlace = v.findViewById(R.id.place);
            textWith = v.findViewById(R.id.with);

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

        TextView textDate = holder.textDate;
        TextView textPlace = holder.textPlace;
        TextView textWith = holder.textWith;


        textDate.setText(dataItem.get(position).getDate());
        textPlace.setText(dataItem.get(position).getPlace());
        textWith.setText(dataItem.get(position).getWith());

    }

    @Override
    public int getItemCount() {

        return dataItem.size();
    }
}
