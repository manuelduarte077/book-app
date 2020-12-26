package com.hardsoftday.recyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.hardsoftday.recyclerview.BookActivity;
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

        // Onclick Listener
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, BookActivity.class);

                i.putExtra("Title", bookList.get(position).getTitle());
                i.putExtra("Description", bookList.get(position).getDescription());
                i.putExtra("Thumbnail", bookList.get(position).getThumbnail());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }


    public static final class BookViewHolder extends RecyclerView.ViewHolder {

        TextView bookTitle;
        ImageView bookImg;
        CardView cardView;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);

            bookTitle = itemView.findViewById(R.id.book_title);
            bookImg = itemView.findViewById(R.id.book_img);
            cardView = itemView.findViewById(R.id.card_view);

        }
    }


}
