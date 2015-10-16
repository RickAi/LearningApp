package com.example.learningapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressLint("DefaultLocale") public class FruitActivity extends Activity {
	
	private TextView tvFruitName;
	private ImageView ivFruitImage;
	private TextView tvCapital;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fruit);
		
		// initialize ImageView and TextViews
		initComponents();
		setComponentsValue();
	}


	// set content to three widgets
	private void setComponentsValue() {
		Intent intent = getIntent();
		int fruitId = intent.getIntExtra(FruitManager.FRUIT_ID, 0);
		if(fruitId != 0){
			String fruitName = FruitManager.getFruitFromId(fruitId);
			ivFruitImage.setImageResource(fruitId);
			tvFruitName.setText(fruitName);
			tvCapital.setText(getFirstLetterCapital(fruitName));
		}
	}

	private void initComponents() {
		tvFruitName = (TextView) findViewById(R.id.tv_fruit_name);
		ivFruitImage = (ImageView) findViewById(R.id.iv_fruit_image);
		tvCapital = (TextView) findViewById(R.id.tv_capital);
	}
	
	// get the first capital letter of the fruit name
	private String getFirstLetterCapital(String fruitName){
		char charAt = fruitName.toUpperCase().charAt(0);
		return String.valueOf(charAt);
	}

}
