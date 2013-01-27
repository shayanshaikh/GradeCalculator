package com.shayanshaikh.gradecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	EditText totalGrade = (EditText) findViewById(R.id.editText1);
	String total = totalGrade.getText().toString();
	
	EditText weightCategory = (EditText) findViewById(R.id.editText2);
	String weight = weightCategory.getText().toString();
	
	Button run = (Button) findViewById(R.id.button1);
	
	TextView a = (TextView) findViewById(R.id.textView7);
	TextView b = (TextView) findViewById(R.id.textView8);
	TextView c = (TextView) findViewById(R.id.textView9);
	TextView d = (TextView) findViewById(R.id.textView10);

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		run.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
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
