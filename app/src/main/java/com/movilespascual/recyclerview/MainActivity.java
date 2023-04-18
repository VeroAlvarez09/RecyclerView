package com.movilespascual.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListaElementos> elementos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void  init(){
        elementos = new ArrayList<>();
        elementos.add(new ListaElementos("Alexander","109398","mail.com","12","MDE"));
        elementos.add(new ListaElementos("Alexander","109398","mail.com","12","MDE"));
        elementos.add(new ListaElementos("Alexander","109398","mail.com","12","MDE"));
        elementos.add(new ListaElementos("Alexander","109398","mail.com","12","MDE"));


        ListAdapter listAdapter = new ListAdapter(elementos,this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}