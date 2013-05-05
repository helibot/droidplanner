package com.droidplanner;

import com.droidplanner.activitys.SuperActivity;

import android.os.Bundle;

public class PIDActivity extends SuperActivity {

	@Override
	int getNavigationItem() {
		return 4;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.pid);
		
	}


	
}
