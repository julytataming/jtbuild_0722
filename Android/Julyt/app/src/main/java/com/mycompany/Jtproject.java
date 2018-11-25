package com.mycompany;
import android.support.v4.app.*;
import android.os.*;
import android.view.*;
import android.support.v7.appcompat.*;
import android.widget.*;

public class Jtproject extends Fragment
{

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
				View v = inflater.inflate(R.layout.newapp,container,false);
				showPopUp("From package com.mycompany by Jtproject");
				return v;
				
				
		}
		private void showPopUp(CharSequence txt){
				Toast.makeText(getActivity(),txt,Toast.LENGTH_SHORT).
				show();
		}
}
