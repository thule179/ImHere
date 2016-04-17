package com.example.thu.imhere;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ListView;

public class GeneralOptions extends FragmentActivity {
    private ListView listView;
    private Button groups_button, templates_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_options);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.listView);
        //get Buttons
        Button groups_button=(Button)findViewById(R.id.groups_button);
        Button templates_button=(Button)findViewById(R.id.templates_button);
        // when user presses templates_button
        templates_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent templates = new Intent(GeneralOptions.this, Templates.class);
                startActivity(templates);
            }
        });



        // Defined Array values to show in ListView
        String[] values = new String[] { "<Group_name> <template_name>",
                "<Group_name> <template_name>",
                "<Group_name> <template_name>",
                "<Group_name> <template_name>",
                "<Group_name> <template_name>",
                "<Group_name> <template_name>",
                "<Group_name> <template_name>",
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }

        });


    }
}


