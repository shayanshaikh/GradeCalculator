package com.shayanshaikh.gradecalculator;

import android.widget.EditText;
import android.widget.TextView;


public class Message {
	EditText totalGrade = (EditText) findViewById(R.id.editText1);
	String total = totalGrade.getText().toString();
	int Total = Integer.parseInt(total);
	
	EditText weightCategory = (EditText) findViewById(R.id.editText2);
	String weight = weightCategory.getText().toString();
	int Weight = Integer.parseInt(weight);
	
	TextView a = (TextView) findViewById(R.id.textView7);
	String a1 = a.getText().toString();
	int A = Integer.parseInt(a1);
	
	TextView b = (TextView) findViewById(R.id.textView8);
	String b1 = b.getText().toString();
	int B = Integer.parseInt(b1);
	
	TextView c = (TextView) findViewById(R.id.textView9);
	String c1 = c.getText().toString();
	int C = Integer.parseInt(c1);
	
	TextView d = (TextView) findViewById(R.id.textView10);
	String d1 = d.getText().toString();
	int D = Integer.parseInt(d1);
	
	int x = 85;
	
	double y = (100-Total)*Weight+(Total*x); {

		if (y >= 90){
			A = x;
		} else {
			a1 = "impossible";
		}
		if (y >= 80){
			B = x;
		} else {
			b1 = "impossible";
		} 
		
		if (y >= 70){
			C = x;
		} else {
			c1 = "impossible";
		} 
		
		if (y >= 60){
			D = x;
		} else {
			d1 = "impossible";
		}

}

	private TextView findViewById(int textview10) {
		// TODO Auto-generated method stub
		return null;
	}

}

