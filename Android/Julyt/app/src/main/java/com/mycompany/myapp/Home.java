package com.mycompany.myapp;


//Class Home
import android.app.*;
import android.content.*;
import android.graphics.*;
import android.os.*;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.*;
import android.support.v7.appcompat.*;
import android.text.*;
import android.view.*;
import android.widget.*;
import com.mycompany.*;
import com.mycompany.myapp.MyTools.*;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.appcompat.R;
import android.transition.*;

public class Home extends Fragment{
		Button btn,alertbtn;
		String usernm,sandi,appname,btntxt;
		CheckBox cb;
		EditText et,et1,et2;
		JtoolFragment jtool;
		View customalert;
		Dialog dialog;
		Activity iniFragment;
		public Home(){
				//konstruktor
				}
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
				View v = inflater.inflate(R.layout.login_activity,container,false);
				this.jtool = new JtoolFragment(getActivity());
				this.iniFragment = getActivity();
				et1 = (EditText)v.findViewById(R.id.editxt1);
				et2 = (EditText)v.findViewById(R.id.editxt2);
				btn = (Button)v.findViewById(R.id.btn);
				cb = (CheckBox)v.findViewById(R.id.cb);
				et2.setInputType(InputType.TYPE_CLASS_TEXT);
				et1.setInputType(InputType.TYPE_CLASS_TEXT);
				jtool.showCustomPopUp("ToastWDrawable", getActivity().getLayoutInflater().inflate(R.layout.toast,null));
				usernm = "julytataming";
				sandi = "jtbuild";
				
				//Dialog
				this.customalert = getActivity().getLayoutInflater().inflate(R.layout.custom_dialog,null);
				this.dialog = new Dialog(getActivity());
				this.dialog.setContentView(this.customalert);
				
				
										//Dilarang EditNama Aplikasi
										appname = getString(R.string.app_name).toString();
										boolean apnm = appname.equals("Julyt");
										btntxt = btn.getText().toString();
										if(!apnm){
										getActivity().finishAffinity();
										}
										//Dilarang
				
				return v;
		}

		@Override
		public void onViewCreated(View view, Bundle savedInstanceState){
				et1.setBackground(getActivity().getDrawable(R.drawable.editxt));
				et2.setBackground(getActivity().getDrawable(R.drawable.editxt));
				this.dialog.getWindow().setBackgroundDrawable(iniFragment. getDrawable(R.drawable.custom_dialog_background));
	
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
												
												//dialog.show();
																		//fragmentAlert dialogFrag = new fragmentAlert();
																		//dialogFrag.show(getFragmentManager(),"dialog");
											JtoolFragment Jadev = new JtoolFragment(getFragmentManager());
											Jadev.startFragment(R.id.mainfr,new Logined(),null);
											
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
//Class Logined
class Logined extends Fragment{
		TextView txt;
		JtoolFragment jtool;
		

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
				View v = inflater.inflate(R.layout.main_activity,container,false);
				txt = (TextView)v.findViewById(R.id.main_activitytxt);
				View toas = getActivity().getLayoutInflater().inflate(R.layout.toast,null);
				TextView vtxt = (TextView)toas.findViewById(R.id.Toastxt);
				vtxt.setGravity(Gravity.CENTER);
				vtxt.setBackgroundDrawable(getActivity().getDrawable(R.drawable.toast));
				Toast toa = Toast.makeText(getActivity(),"Pake layout",Toast.LENGTH_LONG);
				toa.setGravity(Gravity.CENTER,0,0);
				toa.setView(toas);
				toa.show();
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
												.replace(R.id.mainfr,new nextFrag())
												.addToBackStack(null)
												.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
												.commit();

								}});
		}
}









//Fragment lain
//Clas nextFrag
class nextFrag extends Fragment{
		TextView txt;
		public nextFrag(){

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
				View v = inflater.inflate(R.layout.fragment,container,false);
				txt = (TextView)v.findViewById(R.id.fragmentTextView1);


				return v;
		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState){
				super.onActivityCreated(savedInstanceState);
				Toast.makeText(getActivity(),"From Frag",Toast.LENGTH_LONG).show();
				txt.setOnClickListener(new View.OnClickListener(){
								@Override
								public void onClick(View p1){
										getFragmentManager().
												beginTransaction().
												replace(R.id.mainfr,new Jtproject()).
												addToBackStack(null).
												setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
												commit();
							}
				});
		}

}

//Dialogfragment
class fragmentAlert extends DialogFragment {
		TextView txt;
		public fragmentAlert(){}
		public fragmentAlert ambilKonten(){
				
				return null;
		}
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
				View v = getActivity().getLayoutInflater().inflate(R.layout.custom_dialog,container,false);
				txt = (TextView)v.findViewById(R.id.btn_okay);
				fragmentAlert fra = new fragmentAlert();
				
				
				return v;
		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState){
					super.onActivityCreated(savedInstanceState);
						txt.setOnClickListener(new View.OnClickListener(){
								@Override
								public void onClick(View p1){
										JtoolFragment jt = new JtoolFragment(getActivity());
										jt.showPopUp("This Is From dialogFragment");
								}
					});
					
		}
		
		
		
}












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
