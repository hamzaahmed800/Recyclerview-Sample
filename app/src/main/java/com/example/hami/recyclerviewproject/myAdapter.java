package com.example.hami.recyclerviewproject;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;


public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

   public List<listItem> listItems;
    Context context;


    public myAdapter(List<listItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

       final listItem listItem = listItems.get(position);

        holder.head.setText("Name: "+listItem.getHead());
        holder.des.setText("Real Name: "+listItem.getRealname()+"\nTeam: "+listItem.getTeam()+"\nFirstAppearence: "+
                listItem.getFirstapp()+"\nCreditBy: "+listItem.getCredit()+"\nPublisher: "+listItem.getPublish()+"\nBio: "+listItem.getBio());

        Picasso.with(context)
        .load(listItem.getUrl())
        .into(holder.img);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,listItem.getHead(),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
       return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView head;
        public TextView des;
        public ImageView img;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            head = (TextView) itemView.findViewById(R.id.head);
            des = (TextView)itemView.findViewById(R.id.desc);
            img = (ImageView) itemView.findViewById(R.id.img);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.innerLayout);
        }
    }
}
