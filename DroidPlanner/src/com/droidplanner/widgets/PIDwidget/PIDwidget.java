package com.droidplanner.widgets.PIDwidget;

import com.droidplanner.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

public class PIDwidget extends RelativeLayout {

	public PIDwidget(Context context) {
		this(context, null);
	}
	
	public PIDwidget(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public PIDwidget(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		LayoutInflater.from(context).inflate(R.layout.pid_widget, this, true);
	}

}
