package org.sferadev.laia;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class ValuesActivity extends Activity {

	String Url1 = "file:///android_asset/universal1.png";
	String Url2 = "file:///android_asset/universal2.png";
	String Url3 = "file:///android_asset/universal3.png";
	String Url4 = "file:///android_asset/universal4.png";
	String Url5 = "file:///android_asset/universal5.png";	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_values);
		
		WebView wv1 = (WebView) findViewById(R.id.universal1);
		wv1.loadUrl(Url1);
		
		WebView wv2 = (WebView) findViewById(R.id.universal2);
		wv2.loadUrl(Url2);
		
		WebView wv3 = (WebView) findViewById(R.id.universal3);
		wv3.loadUrl(Url3);
		
		WebView wv4 = (WebView) findViewById(R.id.universal4);
		wv4.loadUrl(Url4);
		
		WebView wv5 = (WebView) findViewById(R.id.universal5);
		wv5.loadUrl(Url5);
	}
}
