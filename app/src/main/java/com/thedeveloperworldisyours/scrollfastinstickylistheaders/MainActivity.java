package com.thedeveloperworldisyours.scrollfastinstickylistheaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.activity_main_list);
        listView.setFastScrollEnabled(true);
        String[] fruits = getResources().getStringArray(R.array.fruits_array);

        List<String> fruitList = Arrays.asList(fruits);
        ListAdapter listAdapter = new ListAdapter(this, fruitList);
        listView.setAdapter(listAdapter);
    }
}
