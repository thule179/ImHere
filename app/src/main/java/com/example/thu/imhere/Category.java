package com.example.thu.imhere;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {
    private Button create_group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button create_group = (Button)findViewById(R.id.create_category_button);
        create_group.setOnClickListener(new View.OnClickListener(){
           @Override
        public void onClick(View v){
               Intent general_options = new Intent(Category.this, GeneralOptions.class);
               startActivity(general_options);
           }
        });

    }

}
