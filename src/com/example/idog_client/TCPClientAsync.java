package com.example.idog_client;

import android.os.AsyncTask;

public class TCPClientAsync extends AsyncTask<String, Void, String> {

	@Override
	protected String doInBackground(String... params) {
		 
		return null;
	}

	@Override
	protected void onProgressUpdate(Void... values) {
		super.onProgressUpdate(values);
	}

	@Override
	protected void onPostExecute(String result) {
		//MainActivity.createTCPServer();
		
		if (result == "true") {
			// MainActivity.setMessageStatus(true);
		} else {
			// MainActivity.setMessageStatus(false);
		}
	}
}
