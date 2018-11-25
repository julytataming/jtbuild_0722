package com.mycompany.myapp.aplikasi;

import android.app.*;
import android.support.v7.appcompat.*;
import android.view.*;

public class Main extends Activity
{

		@Override
		public void setContentView(View view, ViewGroup.LayoutParams params){
				super.setContentView(view,params);
				setContentView(R.layout.newapp);
		}
		
}
