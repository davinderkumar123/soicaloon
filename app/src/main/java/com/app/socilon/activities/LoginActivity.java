package com.app.socilon.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.os.Handler;

import com.app.socilon.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                NavController navController=Navigation.findNavController(LoginActivity.this,R.id.frameLayout);
                navController.navigateUp();
                navController.navigate(R.id.exploring1Fragment);
            }
        },1000);

    }
}