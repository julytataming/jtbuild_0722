package com.mycompany.myapp;


import android.graphics.*;
import android.os.*;
import android.support.v4.app.*;
import android.support.v7.appcompat.*;
import android.view.*;
import android.widget.*;

import android.support.v7.appcompat.R;


public class Home extends Fragment{
		Button btn;
		String usernm,sandi;
		CheckBox cb;
		EditText et,et1,et2;



		public Home(){
				//konstruktor
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
				View v = inflater.inflate(R.layout.login_activity,container,false);
				et1 = (EditText)v.findViewById(R.id.editxt1);
				et2 = (EditText)v.findViewById(R.id.editxt2);
				btn = (Button)v.findViewById(R.id.btn);
				cb = (CheckBox)v.findViewById(R.id.cb);
				usernm = "julytataming";
				sandi = "jtbuild";

				return v;
		}

		@Override
		public void onViewCreated(View view, Bundle savedInstanceState){
				et1.setBackground(getActivity().getDrawable(R.drawable.editxt));
				et2.setBackground(getActivity().getDrawable(R.drawable.editxt));

		}


		@Override
		public void onActivityCreated(Bundle savedInstanceState){
				super.onActivityCreated(savedInstanceState);
				btn.setOnClickListener(new View.OnClickListener(){
								@Override
								public void onClick(View v){
										String usr = et1.getText().toString();
										String pw = et2.getText().toString();
										if(usr.equals(usernm)&&pw.equals(sandi)){
												CreateFragment(R.id.mainfr,new Logined(),null);
												Toast.makeText(getActivity(),"Login Berhasil",Toast.LENGTH_LONG).show();
										}else if(usr.equals("")&&pw.equals("")){
												Toast.makeText(getActivity(),"Masukan Username dan Password",Toast.LENGTH_SHORT).show();
										}else{ Toast.makeText(getActivity().getBaseContext(),"Coba Lagi",Toast.LENGTH_LONG).show(); }
										btn.setShadowLayer(1,3,1,Color.parseColor("#000000"));
										System.out.println("button 1"); 
								}

								


						});

				cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
								@Override
								public void onCheckedChanged(CompoundButton p1, boolean p2){
										if(cb.isChecked()){
												Toast.makeText(getActivity(),"Checked",Toast.LENGTH_SHORT).show();
										}else{
												Toast.makeText(getActivity(),"Unchecked",Toast.LENGTH_SHORT).show();
										}
								}
						});

		}
		public void CreateFragment(int frame, Fragment fr, String addToBackStack){
				getFragmentManager().beginTransaction().
						replace(frame,fr).
						addToBackStack(addToBackStack).
						setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
						commit();
		}

}





//Saat Sudah Login
class Logined extends Fragment{
		TextView txt;

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
				View v = inflater.inflate(R.layout.main_activity,container,false);
				txt = (TextView)v.findViewById(R.id.main_activitytxt);

				return v;
		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState){
				super.onActivityCreated(savedInstanceState);
				Toast.makeText(getActivity(),"From Subclas",Toast.LENGTH_LONG).show();
				txt.setOnClickListener(new View.OnClickListener(){
								@Override
								public void onClick(View p1){
										getFragmentManager()
												.beginTransaction()
												.replace(R.id.mainfr,new nextFrag())
												.addToBackStack(null)
												.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
												.commit();

								}});
		}
}


//Fragment lain
class nextFrag extends Fragment{
		public nextFrag(){

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
				View v = inflater.inflate(R.layout.fragment,container,false);


				return v;
		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState){
				super.onActivityCreated(savedInstanceState);
				Toast.makeText(getActivity(),"From Frag",Toast.LENGTH_LONG).show();

		}

}
//Fungsionalisasi FragmentTransaction



//Others
interface July{
		void Jul()
}
class Jul implements July{

		@Override
		public void Jul(){
				// TODO: Implement this method
		}


}
