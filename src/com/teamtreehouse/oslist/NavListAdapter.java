package com.teamtreehouse.oslist;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.widget.AdapterViewCompat.OnItemClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class NavListAdapter extends BaseAdapter {
	ArrayList<String> contactList;
	LayoutInflater inflater;
	Activity activity;
	
	
	 public NavListAdapter(Activity a, ArrayList<String> contactList) {
	    	
	    	/********** Take passed values **********/
	        activity = a;
	        this.contactList=contactList;
	        
	        /***********  Layout inflator to call external xml layout () **********************/
	        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	        
	    }
	
	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 2;
	}
	
	@Override
	public int getItemViewType(int position) {
	    return (position == 0) ? 0 : 1;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return contactList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return contactList.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		  View v = convertView;
		    int type = getItemViewType(position);
		    if (v == null) {
		        // Inflate the layout according to the view type
		        if (type == 0) {
		            // Inflate the layout with image
		            v = inflater.inflate(R.layout.row_image, parent, false);
		        }
		        else {
		            v = inflater.inflate(R.layout.row_noimage, parent, false);
		        }
		    }
		    //
//		    Contact c = contactList.get(position);
		 
//		    TextView surname = (TextView) v.findViewById(R.id.surname);
		    TextView name = (TextView) v.findViewById(R.id.name);
//		    TextView email = (TextView) v.findViewById(R.id.email);
//		 
//		    if (type == 0) {
//		        ImageView img = (ImageView) v.findViewById(R.id.img);
//		        img.setImageResource(c.imageId);
//		    }
		 
//		    surname.setText(c.surname);
		    name.setText(contactList.get(position));
//		    email.setText(c.email);
		 
		    return v;
	}

}
