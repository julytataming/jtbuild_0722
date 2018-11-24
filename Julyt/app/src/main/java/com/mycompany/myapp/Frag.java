package com.mycompany.myapp;

import android.os.*;
import android.support.v4.app.*;
import android.support.v7.appcompat.*;
import android.view.*;

import android.support.v7.appcompat.R;

public class Frag extends Fragment
{
		public Frag(){
				
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
			View v = inflater.inflate(R.layout.fragment, container, false);
			
			setHasOptionsMenu(true);
			return v;
		}
		
		
}
