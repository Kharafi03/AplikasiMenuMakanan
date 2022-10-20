package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    ArrayList<makanan> listmakanan;
    RecyclerView recMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.menuRecyclerView);
        daftar_makanan();

        recMakanan.setAdapter(new recycler_view_adapter(listmakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));

    }

    private void daftar_makanan(){
        listmakanan = new ArrayList<>();

        listmakanan.add(new makanan("Ayam Bakar", "Rp. 25.000",
                "Paket ayam bakar berisi nasi, ayam bakar, sambal, lalapan, dan teh",
                R.drawable.ayambakar));
        listmakanan.add(new makanan("Ayam Geprek", "Rp. 15.000",
                "Paket ayam geprek berisi nasi, ayam geprek level 1-10, lalapan, dan teh",
                R.drawable.ayamgeprek));
        listmakanan.add(new makanan("Capcay", "Rp. 20.000",
                "Capcay komplit isi bakso, sosis, jamur, daging ayam",
                R.drawable.capcay));
        listmakanan.add(new makanan("Kwetiau Goreng", "Rp. 14.000",
                "Kwetiau goreng dengan topping daging ayam, udang, dan bakso",
                R.drawable.kwetiaugoreng));
        listmakanan.add(new makanan("Mie Goreng", "Rp. 12.000",
                "Mie goreng komplit bakso sosis telur",
                R.drawable.miegoreng));
        listmakanan.add(new makanan("Nasi Goreng", "Rp. 18.000",
                "Nasi goreng special komplit telur bakso sosis",
                R.drawable.nasigoreng));
        listmakanan.add(new makanan("Pecel Lele", "Rp. 16.000",
                "Pecel lele, nasi, sambal dan lalapan",
                R.drawable.pecellele));
        listmakanan.add(new makanan("Rendang", "Rp. 25.000",
                "Rendang daging sapi",
                R.drawable.rendang));
        listmakanan.add(new makanan("Soto Ayam", "Rp. 13.000",
                "Paket soto ayam + nasi",
                R.drawable.sotoayam));

    }

}