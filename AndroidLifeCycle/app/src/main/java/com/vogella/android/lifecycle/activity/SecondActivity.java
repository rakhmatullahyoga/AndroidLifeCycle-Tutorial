package com.vogella.android.lifecycle.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] values = getResources().getStringArray(R.array.operating_systems);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        spinner.setAdapter(adapter);
    }

}
