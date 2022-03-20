package com.example.mobiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PHONES> phones = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Samsung
        PHONES phone1 = new PHONES("Samsung",R.drawable.s22ultra_black,
                "Samsung Galaxy S22 Ultra 5G 512GB - Phantom Black",464);
        phones.add(phone1);
        PHONES phone2 = new PHONES("Samsung",R.drawable.z_flod3_black,
                "Samsung Galaxy Z Fold 3 5G 256GB - Black",464);
        phones.add(phone2);
        PHONES phone3 = new PHONES("Samsung",R.drawable.s21ultra_silver,
                "Samsung Galaxy S21 Ultra 256GB - Silver",339);
        phones.add(phone3);
        PHONES phone4 = new PHONES("Samsung",R.drawable.n20_green,
                "Samsung Galaxy Note 20 5G 256GB – Green",219.90);
        phones.add(phone4);


        //Iphones
        PHONES iphone1 = new PHONES("Apple", R.drawable.iphone13_promax_blue,
                "Apple iPhone 13 Pro Max 256GB - Blue",439);
        phones.add(iphone1);
        PHONES iphone2 = new PHONES("Apple", R.drawable.iphone12_promax_gold,
                "Apple iPhone 12 Pro Max 256GB - Gold",439);
        phones.add(iphone2);
        PHONES iphone3 = new PHONES("Apple", R.drawable.iphone11_promax_spacegrey,
                "Apple iPhone 11 Pro Max 256GB - Space Grey",358);
        phones.add(iphone3);
        PHONES iphone4 = new PHONES("Apple", R.drawable.iphonexs_max_red,
                "Apple iPhone Xs Max 256GB - Red",320);
        phones.add(iphone4);



        //الجسر
        ItemsAdapter adapter = new ItemsAdapter(this, 0 , phones);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}