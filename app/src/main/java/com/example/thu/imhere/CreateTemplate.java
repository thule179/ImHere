package com.example.thu.imhere;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class CreateTemplate extends AppCompatActivity {
    Button ViewTemplate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_template);
        ViewTemplate = (Button)findViewById(R.id.add_message_button) ;
        ViewTemplate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // go back to template View
                Intent template_screen = new Intent(CreateTemplate.this, Templates.class);
                startActivity(template_screen);
            }

        });
    }

}
