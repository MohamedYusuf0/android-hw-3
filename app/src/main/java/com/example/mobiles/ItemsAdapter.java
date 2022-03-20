package com.example.mobiles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter {
    List<PHONES> phones;
    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        phones = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.mobile_list , parent , false);

        PHONES currentPhones = phones.get(position);

        TextView itemName = view.findViewById(R.id.mobileName);
        TextView itemPrice = view.findViewById(R.id.mobilePrice);
        ImageView itemImage = view.findViewById(R.id.mobileImage);

        itemName.setText(currentPhones.getPhoneName());
        itemPrice.setText(currentPhones.getPhonePrice() + "");
        itemImage.setImageResource(currentPhones.getPhoneImage());

        return view;
    }
}
