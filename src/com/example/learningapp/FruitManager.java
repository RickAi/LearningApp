package com.example.learningapp;

import android.content.Context;
import android.content.res.Resources;

public class FruitManager {

	public static Context context;
	public static final String FRUIT_ID = "fruit_id";

	// save all the fruit drawable id
	public static final int[] fruitIds = { R.drawable.apple, R.drawable.banana,
			R.drawable.grape, R.drawable.orange, R.drawable.pineapple,
			R.drawable.pitaya, R.drawable.strawberry, R.drawable.watermelon,
			R.drawable.apple, R.drawable.banana, R.drawable.grape,
			R.drawable.orange, R.drawable.pineapple, R.drawable.pitaya,
			R.drawable.strawberry, R.drawable.watermelon };

	// get the name of fruit by it's id
	public static String getFruitFromId(int fruitId) {
		Resources resources = context.getResources();

		switch (fruitId) {
		case R.drawable.apple:
			return resources.getString(R.string.apple);
		case R.drawable.banana:
			return resources.getString(R.string.banana);
		case R.drawable.grape:
			return resources.getString(R.string.grape);
		case R.drawable.orange:
			return resources.getString(R.string.orange);
		case R.drawable.pineapple:
			return resources.getString(R.string.pineapple);
		case R.drawable.pitaya:
			return resources.getString(R.string.pitaya);
		case R.drawable.strawberry:
			return resources.getString(R.string.strawberry);
		case R.drawable.watermelon:
			return resources.getString(R.string.watermelon);
		default:
			break;
		}
		return resources.getString(R.string.unknown);
	}

}
