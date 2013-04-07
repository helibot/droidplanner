package com.droidplanner;

import android.os.Bundle;

public class PIDActivity extends SuperActivity {

	@Override
	int getNavigationItem() {
		return 6;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.pid);
		
	}


	
}
