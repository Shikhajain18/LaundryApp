package com.example.laundryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_details);

        ListView detaillistview = (ListView) findViewById(R.id.listofitem);
        HashMap<String, String> details = new HashMap<>();
        details.put("Shirts/T-Shirts", "Rs 45");
        details.put("Trousers", "Rs 45");
        details.put("Towels", "Rs 30");
        details.put("Bedsheets", "Rs 45");
        details.put("Kids wear", "Rs 25");
        details.put("Winterwears", "Rs 55");

        List<HashMap<String, String>> listitems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listitems, R.layout.list_items, new String[]{"First Line", "Second Line"},
                new int[]{R.id.maindetail, R.id.subdetail});

        Iterator it = details.entrySet().iterator();
        while (it.hasNext()) {
            HashMap<String, String> resultmap = new HashMap<>();
            Map.Entry pair = (Map.Entry) it.next();
            resultmap.put("First Line", pair.getKey().toString());
            resultmap.put("Second Line", pair.getKey().toString());
            listitems.add(resultmap);
        }

        detaillistview.setAdapter(adapter);

    }



}