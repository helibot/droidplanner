package com.droidplanner.activitys;

import android.os.Bundle;

import com.droidplanner.R;

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
