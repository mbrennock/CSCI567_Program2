package com.example.program2;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void button1_pressed(View view){

		TextView txt = (TextView) findViewById(R.id.Text1);
		txt.setText("Button 1 Pressed");
	}

	public void button2_pressed(View view){

		TextView txt = (TextView) findViewById(R.id.Text1);
		txt.setText("Button 2 Pressed");
	}
	
}
