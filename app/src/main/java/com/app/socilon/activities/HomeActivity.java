package com.app.socilon.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.app.socilon.R;
import com.app.socilon.databinding.ActivityHomeBinding;
import com.app.socilon.fragments.calendar.CalendarFragment;
import com.app.socilon.fragments.events.EventsFragment;
import com.app.socilon.fragments.home_fragments.HomeFragment;
import com.app.socilon.fragments.location.LocationFragment;
import com.app.socilon.fragments.user_profile_section.UserProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    public static ActivityHomeBinding homeBinding;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeBinding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(homeBinding.getRoot());
        onClicks();
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);

    }

    @Override
    protected void onResume() {

        super.onResume();
        Toast.makeText(HomeActivity.this, "home", Toast.LENGTH_SHORT).show();


    }

    private void onClicks() {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
             Navigation.findNavController(HomeActivity.this,R.id.fragment_container_view).navigate(R.id.homeFragment);
                return true;

            case R.id.events:
                Navigation.findNavController(HomeActivity.this,R.id.fragment_container_view).navigate(R.id.eventsFragment);
                return true;

            case R.id.home_location:
                Navigation.findNavController(HomeActivity.this,R.id.fragment_container_view).navigate(R.id.createLiveFragment2);
                return true;

            case R.id.calendar:
                Navigation.findNavController(HomeActivity.this,R.id.fragment_container_view).navigate(R.id.calendarFragment);
                return  true;
            case R.id.goToProfile:
                Navigation.findNavController(HomeActivity.this,R.id.fragment_container_view).navigate(R.id.userProfileFragment);
                return  true;
        }
        return false;
    }


}