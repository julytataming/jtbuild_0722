package com.mycompany.myapp.MyTools;

import android.app.*;
import android.content.*;
import android.widget.*;
import android.graphics.drawable.*;
import android.view.*;

public class JtoolsActivity extends Activity implements toast{

		@Override
		public void showCustomPopUp(CharSequence txt, Drawable draw){
				// TODO: Implement this method
		}

		@Override
		public void showCustomPopUp(String txt, View v){
				// TODO: Implement this method
		}

		@Override
		public void showCustomPopUp(CharSequence txt, Drawable draw, int dur){
				// TODO: Implement this method
		}



		@Override
		public void showPopUp(CharSequence activity){
				Toast.makeText(this,activity,Toast.LENGTH_LONG).
				show();
		}

		@Override
		public void showPopUp(Context cnt, CharSequence chr){
				Toast.makeText(cnt,chr,Toast.LENGTH_SHORT).
				show();
		}

		@Override
		public void showPopUp(CharSequence chr, int P){
				
				if(P==1){
						P = Toast.LENGTH_LONG;
				}else if(P==2){
						P = Toast.LENGTH_SHORT;
				}else{
						P = 0;
				}
						Toast.makeText(getApplicationContext(),chr,P).
						show();
		}
		
		
}


