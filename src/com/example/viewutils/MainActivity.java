package com.example.viewutils;

import com.example.myviewutils.OnClick;
import com.example.myviewutils.ViewInject;
import com.example.myviewutils.ViewUtils;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity  {

	private static final String TAG = "MainActivity";

	@ViewInject(R.id.tv1)
	private TextView textView1;
	
	@ViewInject(R.id.tv2)
	private TextView textView2;
	
	private String name;
	
	private integer age;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//让VIewUtils框架处理Activity的控件的绑定和点击事件
		ViewUtils.inject(this);
		
		Log.d(TAG, "textView1="+textView1.getText().toString());
		Log.d(TAG, "textView2="+textView2.getText().toString());
	}
	
	@OnClick({R.id.btn1,R.id.btn2})
	public void click(View view){
		switch (view.getId()) {
		case R.id.btn1:
			Toast.makeText(this, "button1被点击了", Toast.LENGTH_SHORT).show();
			break;
			
		case R.id.btn2:
			Toast.makeText(this, "button2被点击了", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
	}

	
}
