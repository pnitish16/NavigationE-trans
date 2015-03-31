package com.teamtreehouse.oslist;

import com.vijaywebsolutions.vws_library.util.CommonCode.DatePickerFragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Prepaid_Activity extends FragmentActivity{
	
	private Context context;
	private Button btn_from,btn_to,btn_getdata;
	private TextView tv_title;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_prepaid_recharge);
		context = Prepaid_Activity.this;
		
	}
	
	public void invokedialog(View view)
	{
		final Dialog dialog_picker = new Dialog(context);
		dialog_picker.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog_picker.setContentView(R.layout.picker_layout);		
//		dialog_picker.setTitle("Select Date");
		
		tv_title = (TextView) dialog_picker.findViewById(R.id.tv_title);
		btn_from = (Button) dialog_picker.findViewById(R.id.btn_from);
		btn_to = (Button) dialog_picker.findViewById(R.id.btn_to);
		btn_getdata = (Button) dialog_picker.findViewById(R.id.btn_getdata);
		
		tv_title.setText("Select Date");
		
		btn_from.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				
				new DatePickerFragment(btn_from, 0, "dd/MM/yyyy", true).show(getSupportFragmentManager(), "DatePicker");
			}
		});
		
		btn_to.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				new DatePickerFragment(btn_to, 0, "dd/MM/yyyy", true).show(getSupportFragmentManager(), "DatePicker");
			}
		});
		
		btn_getdata.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				dialog_picker.dismiss();
			}
		});
		
		dialog_picker.show();
		
	}

}
