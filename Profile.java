package com.example.petallies;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    ImageView arrowBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        /* Back Arrow */
        arrowBack = findViewById(R.id.arrow_back);
        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Profile.super.onBackPressed();
            }
        });

        /*
        TextView logoutTextView;
        logoutTextView = findViewById(R.id.logoutTextView);
        logoutTextView.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Logout Confirmation")
                    .setMessage("Are you sure you want to logout and exit the app?")
                    .setPositiveButton("Yes", (dialog, id) -> {
                        // Handle positive button click event, e.g., logout and exit the app
                        finishAffinity();
                    })
                    .setNegativeButton("No", (dialog, id) -> {
                        // Handle negative button click event, e.g., dismiss the dialog
                        dialog.dismiss();
                    });
            AlertDialog dialog = builder.create();
            dialog.show();
        });
         */





    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), Dashboard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Clears the activity stack
        startActivity(intent);
        finish(); // Closes this activity and removes it from the activity stack
    }
}