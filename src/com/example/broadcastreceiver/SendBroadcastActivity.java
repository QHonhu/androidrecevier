package com.example.broadcastreceiver;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SendBroadcastActivity extends Activity {
	public static final String TEST_BTOADCAST="com.example.test.broadcast";
	private TestBroadcastReceiver mTestBroadcastReceiver=new TestBroadcastReceiver();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_receiver);
		IntentFilter intentFilter=new IntentFilter();
		intentFilter.addAction(TEST_BTOADCAST);
		registerReceiver(mTestBroadcastReceiver, intentFilter);
		
		Button sendBroadcastButton=(Button)findViewById(R.id.button_receiver);
		sendBroadcastButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setAction(TEST_BTOADCAST);
				intent.putExtra("toast", "hello qingdao!");
				
				sendBroadcast(intent);
			}
		});
		
	}
}
