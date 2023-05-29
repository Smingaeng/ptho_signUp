package com.example.ptho;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerAdapter_heart extends RecyclerView.Adapter<MyRecyclerAdapter_heart.ViewHolder> {

    private ArrayList<ProductItem> mProductList;

    @NonNull
    @Override
    public MyRecyclerAdapter_heart.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.heart_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerAdapter_heart.ViewHolder holder, int position) {
        holder.onBind(mProductList.get(position));
    }

    public void setProductList(ArrayList<ProductItem> list){
        this.mProductList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mProductList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView product_img;
        TextView name;
        TextView brand;
        TextView price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            product_img = (ImageView) itemView.findViewById(R.id.product_img);
            name = (TextView) itemView.findViewById(R.id.product_name);
            brand = (TextView) itemView.findViewById(R.id.brand_name);
            price = (TextView) itemView.findViewById(R.id.price);
        }

        void onBind(ProductItem item){
            product_img.setImageResource(item.getpResourceId());
            brand.setText(item.getBrand());
            name.setText(item.getName());
            price.setText(item.getPrice());
        }
    }
}