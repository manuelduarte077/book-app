package com.hardsoftday.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hardsoftday.recyclerview.adapter.BookAdapter;
import com.hardsoftday.recyclerview.model.Book;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bookList = new ArrayList<>();
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.buenos_dias));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.clockwork));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.cormac));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.don));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.gatsby));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.historia));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.islands));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.ruido));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.buenos_dias));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.clockwork));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.cormac));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.don));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.gatsby));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.historia));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.islands));
        bookList.add(new Book("Buenos días triteza", "Category Book", "Description Book", R.drawable.ruido));


        RecyclerView my_recycler = findViewById(R.id.recyclerview_book);
        BookAdapter bookAdapter = new BookAdapter(this, bookList);
        my_recycler.setLayoutManager(new GridLayoutManager(this, 3));
        my_recycler.setAdapter(bookAdapter);
    }
}