package com.example.security;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class newVisitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_visitor);
    }

    public void notification(View view) {
        Toast notificationToast = Toast.makeText(getApplicationContext(),"Notification Sent",Toast.LENGTH_SHORT);
        notificationToast.show();
    }

}
