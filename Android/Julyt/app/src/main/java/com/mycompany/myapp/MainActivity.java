package com.mycompany.myapp;

import android.graphics.*;
import android.os.*;
import android.support.v4.app.*;
import android.support.v7.app.*;
import android.support.v7.appcompat.*;
import android.support.v7.widget.*;
import android.text.*;
import android.text.style.*;
import android.view.*;
import android.widget.*;

import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.appcompat.R;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity{
		TextView tbTxt;
		ActionBar ab;
		Toolbar mtoolbar;
		FragmentTransaction ft;
		ActionBarDrawerToggle abdt;
		

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
				//View
				
				
				
				//cara membuat view: View v = getLayoutInflater().inflate(R.layout.main_activity,null);
				
				//SetSupportToolbar
				View v = getLayoutInflater().inflate(R.layout.toolbar,null);
			  mtoolbar = (Toolbar)findViewById(R.id.maintoolbar);
				setSupportActionBar(mtoolbar);
				ab = getSupportActionBar();
				ab.setDisplayHomeAsUpEnabled(true);
				ab.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
				ab.setCustomView(v);
				ab.setBackgroundDrawable(getDrawable(R.drawable.toolbar));
				View abview = ab.getCustomView();
				tbTxt = (TextView)abview.findViewById(R.id.tbtext);
				tbTxt.setOnClickListener(new View.OnClickListener(){
								@Override
								public void onClick(View p1){
										tbTxt.setText("Julyanus");
								}
				});
				
				//Fragment
				getSupportFragmentManager().beginTransaction().add(R.id.mainfr, new Home()).addToBackStack("Fragment").setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
		}
		@Override
		public boolean onCreateOptionsMenu(Menu menu){
				getMenuInflater().inflate(R.menu.menu,menu);
				MenuItem menutem = menu.findItem(R.id.item);
				
				
				return true;
				
		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item){
				return super.onOptionsItemSelected(item);
		}

		

		
		
		
		
	}
		
		
		
/*
		@Override
		public void onBackPressed(){
				
				int count = getSupportFragmentManager().getBackStackEntryCount();
				List<Fragment> frags = (List<Fragment>) getSupportFragmentManager().getFragments();
				Fragment lastFrag = getLastNotNull(frags);
				//nothing else in back stack || nothing in back stack is instance of our interface
				if (count == 0 || !(lastFrag instanceof FragmentBackable)) {
						super.onBackPressed();
				} else {
						((FragmentBackable) lastFrag).tombolback();
				}
		}

		private Fragment getLastNotNull(List<Fragment> list){
				for (int i= list.size()-1;i>=0;i--){
						Fragment frag = list.get(i);
						if (frag != null){
								return frag;
						}
				}
				return null;
				
		}
		
				
	}*/
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		


		

		
