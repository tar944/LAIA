package org.sferadev.laia;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class LayoutsActivity extends Activity {

	String Url1 = "file:///android_asset/layouts1.png";
	String Url2 = "file:///android_asset/layouts2.png";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_layouts);
		
		WebView wv1 = (WebView) findViewById(R.id.layouts1);
		wv1.loadUrl(Url1);
		
		WebView wv2 = (WebView) findViewById(R.id.layouts2);
		wv2.loadUrl(Url2);
		
	}

}
