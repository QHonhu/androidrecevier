package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

public class TestBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// ���չ㲥,��������
		if(intent!=null){
			if(TextUtils.equals(intent.getAction(), SendBroadcastActivity.TEST_BTOADCAST)){
				String toastString=intent.getStringExtra("toast");
				Toast.makeText(context, toastString, Toast.LENGTH_LONG).show();
			}
		}
		

	}

}
