package com.example.managebuildingdesign.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import com.example.managebuildingdesign.R;

public class SignUp extends AppCompatActivity {
    FragmentContainerView fragmentContainerView=null;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        next = findViewById(R.id.btn_next);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SignUp_Admin_information_fragment signUpAdmin_information_fragment =new SignUp_Admin_information_fragment();
       fragmentTransaction.replace(R.id.fragmentContainerView, signUpAdmin_information_fragment).commit();
       fragmentTransaction.addToBackStack(null);


    }
}