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
import com.smalldatabaseapp.smalldatabase.databinding.ActivityAddUserBinding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddUserActivity extends AppCompatActivity {

    ActivityAddUserBinding activityAddUserBinding;

    // Access a Cloud Firestore instance from your Activity
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    int Counter=0;

    private CollectionReference BooksDatabaseRef = db.collection("Users");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityAddUserBinding = ActivityAddUserBinding.inflate(getLayoutInflater());
        View view = activityAddUserBinding.getRoot();
        setContentView(view);
        activityAddUserBinding.save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Counter=Counter+1;
                addUser(view);

            }
        });


    }

    public void addUser(View view) {

        String firstName = activityAddUserBinding.firstName.getText().toString();
        String lastName = activityAddUserBinding.lastName.getText().toString();
        String phone = activityAddUserBinding.phone.getText().toString();
        Users  users=new Users(Counter,firstName,lastName,phone);
        BooksDatabaseRef.add(users).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(AddUserActivity.this, "Added Successful", Toast.LENGTH_SHORT).show();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(AddUserActivity.this, "Failure", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
