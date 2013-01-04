package com.shayanshaikh.gradecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText g = (EditText) findViewById(R.id.editText1);
		EditText t = (EditText) findViewById(R.id.editText2);
		Button run = (Button) findViewById(R.id.button1);
		TextView a = (TextView) findViewById(R.id.textView7);
		TextView b = (TextView) findViewById(R.id.textView8);
		TextView c = (TextView) findViewById(R.id.textView9);
		TextView d = (TextView) findViewById(R.id.textView10);
		
		run.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				[(100-g)*t]+(g*x)) = y;
		if (y == 90){
			return y;
		} else if (y == 80){
			return y;
		} else if (y == 70){
			return y;
		} else if (y == 60){
			return y;
		} else {
			return impossible;
		}
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
