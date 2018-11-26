package com.mycompany.myapp.MyTools;
import android.app.*;
import android.content.*;
import android.graphics.drawable.*;
import android.support.v4.app.*;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.*;
import android.view.*;
import android.widget.*;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.appcompat.*;

public class JtoolFragment extends Fragment implements toast{
		Activity activity;
		Context context;
		Class kelas;
		Fragment frag;
		int fram;
		String a;
		Dialog dialog;
		View dialogview;
		FragmentManager Fragmanager;
		
		//Constructor
		public JtoolFragment(Activity ac){	
				this.activity = ac;
		}
		public JtoolFragment(Context ctx){	
				this.context = ctx;
		}
		public JtoolFragment(Context ctx,Activity ac){	
				this.context = ctx;
				this.activity = ac;
		}
		public JtoolFragment(Class cls){	
				this.kelas = cls;
		}
		public JtoolFragment(FragmentManager frg){	
				this.Fragmanager = frg;
		}
		public JtoolFragment(FragmentManager frg, Activity ac){	
				this.Fragmanager = frg;
				this.activity = ac;
		}
		public JtoolFragment(Context ctx, FragmentManager frg){	
				this.context = ctx;
				this.Fragmanager = frg;
		}
		public JtoolFragment(Context ctx,Activity ac,Class cls, FragmentManager frg){	
				this.context = ctx;
				this.activity = ac;
				this.kelas = cls;
				this.Fragmanager = frg;
		}
		
		
//Toast
		//Custom Toast
		@Override
		public void showCustomPopUp(CharSequence txt, Drawable draw){
				Toast toast = Toast.makeText(activity,txt,Toast.LENGTH_SHORT);
				toast.getView().setBackgroundDrawable(draw);
				toast.show();
		}
		@Override
		public void showCustomPopUp(CharSequence txt, Drawable draw, int dur){
		Toast toast = Toast.makeText(activity,txt,Toast.LENGTH_SHORT);
		toast.getView().setBackgroundDrawable(draw);
		toast.setDuration(dur);
		toast.show();
		
		}
		@Override
		public void showCustomPopUp(String txt, View v){
				Toast tst = Toast.makeText(activity,txt,Toast.LENGTH_SHORT);
				tst.setView(v);
				tst.show();

		}

		//Normal Toast
		public void showPopUp(CharSequence teks){
				Toast.makeText(activity,teks,Toast.LENGTH_LONG).
						show();
		}
		public void showPopUp(Context cnt, CharSequence chr){
				Toast.makeText(activity,chr,Toast.LENGTH_SHORT).
						show();
		}
		public void showPopUp(CharSequence chr, int P){

				if(P==1){
						P = Toast.LENGTH_LONG;
				}else if(P==2){
						P = Toast.LENGTH_SHORT;
				}else{
						P = 0;
				}
				Toast.makeText(activity,chr,P).
						show();
		}

		
		
//Fragment
		public void startFragment(int frame, Fragment fr, String stack){
				this.fram =frame;
				this.frag=fr;
				this.a=stack;
				Fragmanager.
						beginTransaction().
						replace(fram,frag).
						addToBackStack(a).
						setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
						commit();
		}
		
		
//CustomDialog
		public void bekingDialog(View vdialog){
				this.dialog = new Dialog(activity);
				this.dialog.setContentView(vdialog);
				this.dialog.show();
		}
		public void bekingDialog(View vdialog, Drawable draw){
				this.dialog = new Dialog(activity);
				this.dialog.setContentView(vdialog);
				this.dialog.getWindow().setBackgroundDrawable(draw);
				this.dialog.show();
		}
		public void bekingDialog(View vdialog, Drawable draw, boolean bisaCancel){
				this.dialog = new Dialog(activity);
				this.dialog.setContentView(vdialog);
				this.dialog.setCancelable(bisaCancel);
				this.dialog.getWindow().setBackgroundDrawable(draw);
				this.dialog.show();
		}
		
		public void bekingDialog(String pesan){
				this.dialogview = activity. getLayoutInflater().inflate(R.layout.custom_dialog,null);
				this.dialog = new Dialog(activity);
				this.dialog.setContentView(dialogview);
				this.dialog.getWindow().setBackgroundDrawable(activity.getDrawable(R.drawable.laylogin));
				this.dialog.show();
		}
		//DialogFragment
		
		public void buatDialogFragment(DialogFragment a){
				a.show(Fragmanager,"");
				
		}
		
	}
