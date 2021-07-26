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

import com.bumptech.glide.Glide;
import java.util.ArrayList;

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

        TextView authorNameTextView = (TextView) listItemView.findViewById((R.id.author));
        authorNameTextView.setText(currentSection.getAuthorName());

        TextView sectionNameTextView = (TextView) listItemView.findViewById(R.id.section_name_tv);
        sectionNameTextView.setText(currentSection.getSectionName());

        titleTextView.setText(currentSection.getTitle());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        Glide.with(listItemView).load(currentSection.getImageURL()).into(imageView);

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        String date = "";
        if (currentSection.getDate().contains(dateSeparator)) {
            String[] parts = currentSection.getDate().split(dateSeparator);
            date = parts[0];
        }
        dateView.setText(date);

        return listItemView;
    }
}