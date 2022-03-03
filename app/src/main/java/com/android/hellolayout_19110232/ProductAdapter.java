package com.android.hellolayout_19110232;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class ProductAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Product> ProductList;

    public ProductAdapter(Context context, int layout, List<Product> productList) {
        this.context = context;
        this.layout = layout;
        ProductList = productList;
    }

    @Override
    public int getCount() {
        return ProductList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView image;
        TextView name, price;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null );

            holder = new ViewHolder();
            // ánh xạ view
            holder.name= (TextView) view.findViewById(R.id.textViewName);
            holder.price = (TextView) view.findViewById(R.id.textViewPrice);
            holder.image = (ImageView) view.findViewById(R.id.imageViewHinh);
            view.setTag(holder);
        }else{
            holder= (ViewHolder) view.getTag();
        }



        //gán giá trị

        Product product = ProductList.get(i);

        holder.name.setText(product.getName());
        holder.price.setText(product.getPrice());
        holder.image.setImageResource(product.getImage());

        return view;
    }
}
