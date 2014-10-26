package com.example.idog_client;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {

	ImageView imgForward;
	ImageView imgBack;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imgForward = (ImageView) findViewById(R.id.imgForward);
		imgBack = (ImageView) findViewById(R.id.imgBack);
		
		//System.out.println("imgForward PivotX = " + imgForward.getPivotX());
		int[] locations = new int[2];
		//imgForward.getLocationOnScreen(locations);
		imgForward.getLocationInWindow(locations);
		
		System.out.println("X = " + locations[0] + ", Y = " + locations[1]);
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
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
	    int x = (int)event.getX();
	    int y = (int)event.getY();
	    
	    //System.out.println( "Event action: " + event.getAction());
	    
	    switch (event.getAction()) {
	        case MotionEvent.ACTION_DOWN:
	        	System.out.println( "Event action: ACTION_DOWN");
	        	break;
	        case MotionEvent.ACTION_MOVE:
	        	System.out.println( "Event action: ACTION_MOVE");
	        	break;
	        case MotionEvent.ACTION_UP:
	        	System.out.println( "Event action: ACTION_UP");
	        	break;
	    }
	    
	    return super.onTouchEvent(event);
	}
}
