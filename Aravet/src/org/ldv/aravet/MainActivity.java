package org.ldv.aravet;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class MainActivity extends ActionBarActivity {

	private GridView gridView;
	private ArrayList<Item> gridArray = new ArrayList<Item>();
	private CustomGridViewAdapter customGridAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 //set grid view item
		Bitmap computerIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.computer);
		Bitmap electronicsIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.electronics);
		Bitmap clothesIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.clothes);
		
		gridArray.add(new Item(computerIcon,"Computer"));
		gridArray.add(new Item(electronicsIcon,"Electronics"));
		gridArray.add(new Item(clothesIcon,"Clothes"));
		
		gridView = (GridView) findViewById(R.id.gridView1);
		customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
		gridView.setAdapter(customGridAdapter);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
