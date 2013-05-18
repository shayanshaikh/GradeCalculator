package com.shayanshaikh.gradecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Answer mAnswer = new Answer();


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

    Button run = (Button) findViewById(R.id.button1);
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		run.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
            handleAnswer();
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
    private void handleAnswer() {
        int answer = mAnswer.Score();

        A = answer;
        B = answer;
        C = answer;
        D = answer;
    }
}
