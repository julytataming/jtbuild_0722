package com.mycompany.myapp.views;
import android.content.*;
import android.view.*;
import android.util.*;
import android.graphics.*;

public class CustomView extends View{
		private Rect rect;
		private Paint paint;
		public CustomView(Context context){
				super(context);
				init(null);

		}



		public CustomView(Context context, AttributeSet attr){
				super(context, attr);
				init(attr);

		}

		public CustomView(Context context, AttributeSet attr, int DefStyleAttr){
				super(context, attr, DefStyleAttr);
				init(attr);

		}


		public CustomView(Context context, AttributeSet attr, int DefStyleAttr, int DefStyleRes){
				super(context, attr, DefStyleAttr, DefStyleRes);
				init(attr);

		}

		private void init(AttributeSet set){
			rect = new Rect();
			paint = new Paint(Paint.ANTI_ALIAS_FLAG);
			paint.setColor(Color.WHITE);

		}
		public void RepColor(){
				paint.setColor(paint.getColor() == Color.WHITE ? Color.WHITE: Color.BLACK);
		}

		@Override
		protected void onDraw(Canvas canvas){
				canvas.drawColor(Color.RED);
				rect.left=50;
				rect.top=50;
				rect.bottom=100;
				rect.right=100;
				canvas.drawRect(rect,paint);
		}



}
