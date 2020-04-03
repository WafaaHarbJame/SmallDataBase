package com.smalldatabaseapp.smalldatabase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.smalldatabaseapp.smalldatabase.databinding.ActivityAddBookBinding;
import com.smalldatabaseapp.smalldatabase.databinding.ActivityUserOrdersBinding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserOrdersActivity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    ActivityUserOrdersBinding activityUserOrdersBinding;

    private DocumentReference BooksDatabaseRef;
    //    private DocumentReference noteRef=db.collection("Notebook").document("My First Note");


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        activityUserOrdersBinding = ActivityUserOrdersBinding.inflate(getLayoutInflater());
        View view = activityUserOrdersBinding.getRoot();
        setContentView(view);
        activityUserOrdersBinding.Addorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addOrder(view);

            }
        });


    }

    public void addOrder(View view) {

        String BookId  = activityUserOrdersBinding.BookId.getText().toString();
        String userId = activityUserOrdersBinding.userId.getText().toString();
        String bookPrice = activityUserOrdersBinding.bookPrice.getText().toString();
        String numberOfBooksPurchase = activityUserOrdersBinding.numberOfBooksPurchase.getText().toString();
        BooksDatabaseRef= db.collection("UsersPurchaseBooks").document("UserId:"+userId);

        Orders orders=new Orders(Integer.valueOf(userId),Integer.valueOf(BookId),
                Integer.valueOf(bookPrice),Integer.valueOf(numberOfBooksPurchase),
                Integer.valueOf(numberOfBooksPurchase)*Integer.valueOf(bookPrice));
        BooksDatabaseRef.set(orders).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(UserOrdersActivity.this, "Added Successful", Toast.LENGTH_SHORT).show();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(UserOrdersActivity.this, "Failure", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
