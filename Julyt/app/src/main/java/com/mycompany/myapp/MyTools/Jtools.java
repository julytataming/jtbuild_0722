package com.mycompany.myapp.MyTools;

import android.support.v4.app.*;

public class Jtools extends Fragment{
		public void CreateFragment(int frame, Fragment fr, String addToBackStack){
				FragmentTransaction ft = getFragmentManager().beginTransaction();
					ft.replace(frame,fr);
					ft.addToBackStack(addToBackStack);
					ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
					ft.commit();
		}
		public void CreateFragment(int frame, Fragment fr, String addToBackStack, int Transisi){
				getFragmentManager().beginTransaction().
						replace(frame,fr).
						addToBackStack(addToBackStack).
						setTransition(Transisi).
						commit();
		}
		
}
