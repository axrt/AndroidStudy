package com.alext.geoquiz;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends Activity {

	private Button mTrueButton;
	private Button mFalseButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);

		this.mTrueButton = (Button) findViewById(R.id.true_button);
		this.mTrueButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(QuizActivity.this, R.string.correct_toast,
						Toast.LENGTH_SHORT).show();

			}
		});
		this.mFalseButton = (Button) findViewById(R.id.false_button);
		this.mFalseButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(QuizActivity.this, R.string.incorrect_toast,
						Toast.LENGTH_SHORT).show();

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quiz, menu);
		return true;
	}

}
