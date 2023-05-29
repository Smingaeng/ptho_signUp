package com.example.ptho;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//찜 페이지
public class heartpage extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MyRecyclerAdapter_heart mRecyclerAdapter;
    private ArrayList<ProductItem> mProductItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heart_page);

        mRecyclerView = (RecyclerView) findViewById(R.id.heart_recyclerView);

        /* initiate adapter */
        mRecyclerAdapter = new MyRecyclerAdapter_heart();

        /* initiate recyclerview */
        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));

        /* adapt data */
        mProductItems = new ArrayList<>();

        //데이터베이스에서 정보가져와야함
        for(int i=1;i<=10;i++){
            if(i%2==0)
                mProductItems.add(new ProductItem(R.drawable.text_product_img,"brand", "name", 999));
            else
                mProductItems.add(new ProductItem(R.drawable.text_product_img,"brand","nam", 999));

        }
        mRecyclerAdapter.setProductList(mProductItems);
    }
}
