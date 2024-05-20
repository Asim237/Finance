package com.example.financial.Adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.financial.R;
import com.example.financial.domain.domain;
import com.majorik.sparklinelibrary.SparkLineLayout;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class stock_adapter extends RecyclerView.Adapter<stock_adapter.viewHolder> {
    ArrayList<domain> dataList;
    DecimalFormat formatter;

    public stock_adapter(ArrayList<domain> dataList) {
        this.dataList = dataList;
        formatter = new DecimalFormat("###,###,###.##");
    }

    @NonNull
    @Override
    public stock_adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_stock, parent, false);
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull stock_adapter.viewHolder holder, int position) {
        holder.nameTxt.setText(dataList.get(position).getNameTxt());
        holder.changePercentTxt.setText(dataList.get(position).getChangePercentTxt() + "%");
        holder.priceTxt.setText("$" + dataList.get(position).getPriceTxt());
        holder.lineChart.setData(dataList.get(position).getLineData());
        if (dataList.get(position).getChangePercentTxt() < 0) {
            holder.changePercentTxt.setTextColor(Color.parseColor("#ff0000"));
            holder.lineChart.setSparkLineColor(Color.parseColor("#ff0000"));
        } else if (dataList.get(position).getChangePercentTxt() > 0) {
            holder.changePercentTxt.setTextColor(Color.parseColor("#00de12"));
            holder.lineChart.setSparkLineColor(Color.parseColor("#00de12"));
        } else {
            holder.changePercentTxt.setTextColor(Color.parseColor("#fffff"));
            holder.lineChart.setSparkLineColor(Color.parseColor("#ffffff"));
        }
        int drawableResourceID = holder.itemView.getContext().getResources().getIdentifier(dataList.get(position).getNameTxt(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceID).into(holder.logoImage);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nameTxt, changePercentTxt, priceTxt;
        AppCompatImageView logoImage;
        SparkLineLayout lineChart;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nameTxt = itemView.findViewById(R.id.nameTxt);
            changePercentTxt = itemView.findViewById(R.id.changePercentTxt);
            priceTxt = itemView.findViewById(R.id.priceTxt);
            logoImage = itemView.findViewById(R.id.logoImage);
            lineChart = itemView.findViewById(R.id.sparkLineLayout);
        }
    }
}
