package com.shayanshaikh.gradecalculator;

import android.widget.EditText;
import android.widget.TextView;

public class Answer {

	EditText totalGrade = (EditText) findViewById(R.id.editText1);
	String total = totalGrade.getText().toString();
	int Total = Integer.parseInt(total);

	EditText weightCategory = (EditText) findViewById(R.id.editText2);
	String weight = weightCategory.getText().toString();
	int Weight = Integer.parseInt(weight);

    public int Score() {

	    for(int score = 0; score < 101; score++){

	    float finalgrade = (100-Total)*Weight+(Total*score);
	
		    if (finalgrade >= 90) {
                return score;
            }
		    else if (finalgrade >= 80 && finalgrade < 90){
			    return score;
		    }
		    else if (finalgrade >= 70 && finalgrade < 80){
			    return score;
		    }
		    else if (finalgrade >= 60 && finalgrade < 70){
			    return score;
		    }
	}
        return 0;
    }
	private EditText findViewById(int edittext1) {
		// TODO Auto-generated method stub
		return null;
	}
}

