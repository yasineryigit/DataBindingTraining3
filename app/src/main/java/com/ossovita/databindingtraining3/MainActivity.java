package com.ossovita.databindingtraining3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ossovita.databindingtraining3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main);
        amb.setContact(getCurrentContact());


    }

    private Contact getCurrentContact(){
        Contact contact = new Contact();
        contact.setId("111");
        contact.setName("Lisa");
        contact.setEmail("lisa@gmail.com");
        return contact;
    }


}