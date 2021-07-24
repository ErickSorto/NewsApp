package com.example.android.newsreport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;


import com.bumptech.glide.Glide;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NewsAdapter extends ArrayAdapter<News> {
    private String dateSeparator = "T";
    public NewsAdapter(@NonNull Context context, @NonNull ArrayList<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        News currentSection = (News) getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.primary_title);

        titleTextView.setText(currentSection.getTitle());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        Glide.with(listItemView).load(currentSection.getImageURL()).into(imageView);

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        String date = "";
        if (currentSection.getDate().contains(dateSeparator)) {
            String[] parts = currentSection.getDate().split(dateSeparator);
            date = parts[0];
        }

        // Display the date of the current news in that TextView
        dateView.setText(date);

        return listItemView;

    }
}