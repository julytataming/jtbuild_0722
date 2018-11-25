package com.mycompany.myapp.aplikasi;

import android.os.*;
import android.support.v4.app.*;
import android.support.v7.appcompat.R;
import android.view.*;
import android.widget.*;
import android.content.*;


public class NewApp extends Fragment{
		public NewApp(){}
		TextView txt;
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
				View v = inflater.inflate(R.layout.newapp,container,false);
				txt = (TextView)v.findViewById(R.id.newappTextView1);
				return v;
		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState){
				super.onActivityCreated(savedInstanceState);
				txt.setOnClickListener(new View.OnClickListener(){

								@Override
								public void onClick(View p1){
									Intent i = new Intent(getActivity(), Main.class);
										startActivity(i);
										
									}


						});
		}


}
