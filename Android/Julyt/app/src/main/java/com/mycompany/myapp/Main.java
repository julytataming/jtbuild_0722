package com.mycompany.myapp;


import android.os.*;
import android.support.v4.app.*;
import android.support.v7.appcompat.*;
import android.view.*;
import android.widget.*;

import android.support.v7.appcompat.R;

public class Main extends Fragment{

		TextView txt;

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
				View v = inflater.inflate(R.layout.main_activity,container,false);
				txt = (TextView)v.findViewById(R.id.main_activitytxt);

				//BackAble
				setHasOptionsMenu(true);
				return v;
				}



		@Override
		public void onActivityCreated(Bundle savedInstanceState){
				super.onActivityCreated(savedInstanceState);
				txt.setOnClickListener(new View.OnClickListener(){
								@Override
								public void onClick(View p1){
										getFragmentManager()
												.beginTransaction()
												.replace(R.id.mainfr,new Frag())
												.addToBackStack(null)
												.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
												.commit();

								}});

		}
}

