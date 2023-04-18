package com.movilespascual.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private List<ListaElementos> misDatos;
    private LayoutInflater myInflater;
    private Context myContext;


    public ListAdapter(List<ListaElementos> itemList, Context context) {
        this.misDatos = itemList;
        this.myInflater = LayoutInflater.from(context);
        this.myContext = context;
    }


    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = myInflater.inflate(R.layout.list_element,null);
        return new ListAdapter.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(misDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return misDatos.size();
    }

    //public void setItems(List<ListaElementos> items){ misDatos= items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name, tel, email, yearOld, city;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconoImageView);
            name = itemView.findViewById(R.id.nameTextView);
            tel = itemView.findViewById(R.id.telTextView);
            email = itemView.findViewById(R.id.emailTextView);
            yearOld = itemView.findViewById(R.id.yearoldTextView);
            city = itemView.findViewById(R.id.cityTextView);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {

                        ListaElementos clickedItem = misDatos.get(position);

                        Intent intent = new Intent(myContext,ViewData.class);
                        intent.putExtra("name", clickedItem.getName());
                        intent.putExtra("tel", clickedItem.getTel());;
                        intent.putExtra("email", clickedItem.getEmail());;
                        intent.putExtra("City", clickedItem.getCity());;

                        myContext.startActivity(intent);
                    }
                }
            });
        }

        void bindData(final ListaElementos item){
            iconImage.setColorFilter(Color.parseColor("#7B1FA2"), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            tel.setText(item.getTel());
            email.setText(item.getEmail());
            yearOld.setText(item.getYearOld());
            city.setText(item.getCity());
        }
    }

}
