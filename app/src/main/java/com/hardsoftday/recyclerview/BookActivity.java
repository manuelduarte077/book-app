package com.hardsoftday.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private TextView tvTitle, tvDescription, tvCategory;
    private ImageView tvImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        tvTitle =  findViewById(R.id.bookDescTitle);
        tvDescription =  findViewById(R.id.bookDescDescription);
        tvCategory =  findViewById(R.id.bookDescCategory);
        tvImage = findViewById(R.id.bookThumbnail);

        // Recieve Data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        // Setings value
        tvTitle.setText(Title);
        tvDescription.setText(Description);
        tvImage.setImageResource(image);

    }
}