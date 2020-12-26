package com.hardsoftday.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hardsoftday.recyclerview.R;
import com.hardsoftday.recyclerview.model.Book;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    Context context;
    List<Book> bookList;

    public BookAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.cardview_item_book, parent, false);
        return new BookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {

        holder.bookTitle.setText(bookList.get(position).getTitle());
        holder.bookImg.setImageResource(bookList.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }


    public static final class BookViewHolder extends RecyclerView.ViewHolder {

        TextView bookTitle;
        ImageView bookImg;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);

            bookTitle = itemView.findViewById(R.id.book_title);
            bookImg = itemView.findViewById(R.id.book_img);

        }
    }


}
