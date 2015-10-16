package com.example.learningapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitListAdapter extends BaseAdapter {
	
	private int[] furitIds;
	private LayoutInflater inflater;
	
	// initialize the inflater and furit ids
	public FruitListAdapter(Context context) {
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		furitIds = FruitManager.fruitIds;
	}

	@Override
	public int getCount() {
		return furitIds.length;
	}

	@Override
	public String getItem(int position) {
		return (String) FruitManager.getFruitFromId(furitIds[position]);
	}

	@Override
	public long getItemId(int position) {
		return furitIds[position];
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// initialize each item with data with a effective way
		if(convertView == null){
			convertView = inflater.inflate(R.layout.item_fruit, null, false);
		}
		
		ImageView furitImage = (ImageView) convertView.findViewById(R.id.iv_fruit);
		TextView furitText = (TextView) convertView.findViewById(R.id.tv_fruit);
		furitImage.setImageResource(furitIds[position]);
		furitText.setText(getItem(position));
		
		return convertView;
	}

}
