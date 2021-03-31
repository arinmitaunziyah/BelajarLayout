package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private ArrayList<String> minuman = new ArrayList<>();
    private ArrayList<String> namaminuman = new ArrayList<>();
    private ArrayList<String> infominuman = new ArrayList<>();
    private Context context;

    public RecycleViewAdapter(ArrayList<String> minuman, ArrayList<String> namaminuman, ArrayList<String> infominuman, Context context) {
        this.minuman = minuman;
        this.namaminuman = namaminuman;
        this.infominuman = infominuman;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_layout_adapter, parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
            public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).asBitmap().load(minuman.get(position)).into(holder.imgview_minuman);

        holder.textview_namaminuman.setText(namaminuman.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //Toast.makeText(context, namaminuman.get(position), Toast.LENGTH_SHORT).show();

                Intent intent =  new Intent(context, DetailActivity.class);

                intent.putExtra("minuman", minuman.get(position));
                intent.putExtra("nama_minuman", namaminuman.get(position));
                intent.putExtra("info_minuman", infominuman.get(position));

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namaminuman.size();
    }

        public class ViewHolder extends RecyclerView.ViewHolder{
        
            CircleImageView imgview_minuman;
            TextView textview_namaminuman;
            ConstraintLayout constraintLayout;

            public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgview_minuman = itemView.findViewById(R.id.imgview_minuman);
            textview_namaminuman = itemView.findViewById(R.id.textview_namaminuman);
            constraintLayout = itemView.findViewById(R.id.constraint_layout);
        }
    }
}
