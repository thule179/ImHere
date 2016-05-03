package com.example.thu.imhere;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Templates extends AppCompatActivity {
    Button addTemplate;
    Button next;
    TemplateDb templateDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templates);
        addTemplate = (Button) findViewById(R.id.add_template);

        // Get an instance of the database helper class
        templateDB = new TemplateDb(this);

        Cursor res = templateDB.getAllData();
        if (res.getCount() == 0) {
            return;
        }

        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()) {
            buffer.append(res.getString(0) + "\n");
        }

        // call the method to show all data on the GUI
        Toast.makeText(getApplicationContext(), buffer.toString(), Toast.LENGTH_LONG).show();

        // when user presses addTemplate
        addTemplate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "We're getting there!", Toast.LENGTH_SHORT).show();
                Intent create_template = new Intent(Templates.this, CreateTemplate.class);
                startActivity(create_template);
            }
        });
    }
}





