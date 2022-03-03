package com.android.hellolayout_19110232;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridViewProduct;
    ArrayList<Product> productArrayList;
    ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapping();

        adapter = new ProductAdapter(this, R.layout.product_layout, productArrayList);
        gridViewProduct.setAdapter(adapter);
    }

    private void Mapping() {
        gridViewProduct = (GridView) findViewById(R.id.gridView1);
        productArrayList = new ArrayList<>();

        productArrayList.add(new Product("Vagabond Sack", "$120", R.drawable.bag));
        productArrayList.add(new Product("Whitney Belt", "$35", R.drawable.belt));
        productArrayList.add(new Product("Vagabind Ring", "$25", R.drawable.ring));
        productArrayList.add(new Product("Sitebond Sung", "$80", R.drawable.sunglass));
        productArrayList.add(new Product("Etherayte Thing", "$40", R.drawable.thing));
        productArrayList.add(new Product("Vagabond Sack", "$120", R.drawable.bag));
        productArrayList.add(new Product("Whitney Belt", "$35", R.drawable.belt));
        productArrayList.add(new Product("Vagabind Ring", "$25", R.drawable.ring));
        productArrayList.add(new Product("Sitebond Sung", "$80", R.drawable.sunglass));
    }
}