package com.examdple.mylibrary.utils;

import android.app.Activity;
import android.widget.Toast;

public class ShowToast {

	public static void show(final String msg,final Activity context){
		
		if (Thread.currentThread().getName().equals("main")) {
			Toast.makeText(context, msg, 1).show();
		}else {
			context.runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Toast.makeText(context, msg, 1).show();
				}
			});
		}
		
		
	}
}
