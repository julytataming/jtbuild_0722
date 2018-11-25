package com.mycompany.myapp.MyTools;
import android.content.*;
import android.graphics.drawable.*;
import android.view.*;
import javax.xml.datatype.*;

public interface toast{
		void showPopUp(CharSequence activity)
		void showPopUp(Context cnt, CharSequence chr)
		void showPopUp(CharSequence chr,int lama)
		void showCustomPopUp(CharSequence txt, Drawable draw)
		void showCustomPopUp(String txt, View v)
		void showCustomPopUp(CharSequence txt, Drawable draw, int dur)
		
}
