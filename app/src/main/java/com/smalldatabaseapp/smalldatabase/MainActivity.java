package com.smalldatabaseapp.smalldatabase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button mAddBook;
    private Button mAddUser;
    private Button mPurchaseBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAddBook = findViewById(R.id.addBook);
        mAddUser = findViewById(R.id.addUser);
        mPurchaseBook = findViewById(R.id.purchase_book);

        mAddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddBookActivity.class);
                startActivity(intent);

            }
        });

        mAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddUserActivity.class);
                startActivity(intent);
            }
        });

        mPurchaseBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UserOrdersActivity.class);
                startActivity(intent);
            }
        });
    }
}
