package com.example.managebuildingdesign.Activitis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.managebuildingdesign.Main_Fragment.Admin_Fragment;
import com.example.managebuildingdesign.Main_Fragment.Build_Fragment;
import com.example.managebuildingdesign.Main_Fragment.Parts_Fragment;
import com.example.managebuildingdesign.Main_Fragment.Services_Fragment;
import com.example.managebuildingdesign.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    FragmentContainerView main_fragmentContainerView ;
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    Parts_Fragment parts_fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_fragmentContainerView = findViewById(R.id.Main_fragment_container_view);
        bottomNavigationView = findViewById(R.id.bottom);
       fragmentManager = getSupportFragmentManager();
          parts_fragment = new Parts_Fragment();

          fragmentManager.
                  beginTransaction()
                  .replace( main_fragmentContainerView.getId(), Admin_Fragment.class , null)
                  .commit();

          bottomNavigationView.setOnItemSelectedListener(callback);
    }
    private BottomNavigationView.OnItemSelectedListener callback = new NavigationBarView.OnItemSelectedListener(){

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.nav_buildInforamtion:
                    fragmentManager.
                            beginTransaction()
                            .replace( main_fragmentContainerView.getId(), Build_Fragment.class , null)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.nav_partInforamtion:
                    fragmentManager.
                            beginTransaction()
                            .replace( main_fragmentContainerView.getId(), Parts_Fragment.class , null)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.nav_service:
                    fragmentManager.
                            beginTransaction()
                            .replace( main_fragmentContainerView.getId(), Services_Fragment.class , null)
                            .addToBackStack(null)
                            .commit();
                    break;
                case R.id.nav_personalInforamtion:
                    fragmentManager.
                            beginTransaction()
                            .replace( main_fragmentContainerView.getId(), Admin_Fragment.class , null)
                            .addToBackStack(null)
                            .commit();

                    break;
            }
            return true;
        }
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        bottomNavigationView.setOnItemSelectedListener(null);
        Fragment curentFragment = fragmentManager.findFragmentById(main_fragmentContainerView.getId());

        if (curentFragment instanceof Admin_Fragment){
            bottomNavigationView.setSelectedItemId(R.id.nav_personalInforamtion);
        }else if(curentFragment instanceof Build_Fragment){
            bottomNavigationView.setSelectedItemId(R.id.nav_buildInforamtion);
        }else if(curentFragment instanceof Parts_Fragment){
            bottomNavigationView.setSelectedItemId(R.id.nav_partInforamtion);
        }else if(curentFragment instanceof Services_Fragment){
            bottomNavigationView.setSelectedItemId(R.id.nav_service);
        }
        bottomNavigationView.setOnItemSelectedListener(callback);
    }
}