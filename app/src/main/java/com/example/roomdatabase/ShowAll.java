package com.example.roomdatabase;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.LinearLayout;

import java.util.List;

public class ShowAll extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter_items adapter;
    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        appDatabase = Room.databaseBuilder(this,AppDatabase.class,"db_contacts").allowMainThreadQueries().build();
        ContactsDAO contactsDAO = appDatabase.getContactDAO();

        List<Contacts> contactsList;
        contactsList = contactsDAO.getAllContacts();
        adapter = new Adapter_items(contactsList);
        recyclerView.setAdapter(adapter);


    }
}
