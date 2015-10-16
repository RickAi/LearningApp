package com.example.learningapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


public class MainActivity extends Activity {
	
	private ListView lvFruits;
	private FruitListAdapter fruitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // initialize ListView and Adapter
        initComponents();
        initListeners();
    }

	private void initListeners() {
		// click single fruit item, that will make user into fruit page
		lvFruits.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				Intent intent = new Intent(MainActivity.this, FruitActivity.class);
				int fruitId = FruitManager.fruitIds[position];
				intent.putExtra(FruitManager.FRUIT_ID, fruitId);
				startActivity(intent);
			}
		});
	}

	private void initComponents() {
		// initialize manager and adapter
		FruitManager.context = this;
		lvFruits = (ListView) findViewById(R.id.lv_fruits);
		fruitAdapter = new FruitListAdapter(this);
		lvFruits.setAdapter(fruitAdapter);
	}

    
}
