package com.example.thu.imhere;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FirstCategory extends AppCompatActivity {
    private Button add_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_category);
        Button add_button = (Button)findViewById(R.id.first_category_button);

        //when user presses "+"
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent category_screen = new Intent(FirstCategory.this, Category.class);
                startActivity(category_screen);
            }
        });
    }

}
