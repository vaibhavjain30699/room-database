package com.example.roomdatabase;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter_items extends RecyclerView.Adapter<Adapter_items.MyViewHolder> {

    List<Contacts> contacts;

    public Adapter_items(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView name,phone;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            phone = itemView.findViewById(R.id.phone);

        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        Contacts contact = contacts.get(i);
        myViewHolder.name.setText(contact.getFirstname()+ " " +contact.getLastname());
        myViewHolder.phone.setText(contact.getPhoneNumber());

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }


}
