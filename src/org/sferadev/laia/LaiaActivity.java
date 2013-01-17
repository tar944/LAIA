package org.sferadev.laia;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LaiaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laia);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_laia, menu);
        return true;
    }
    
}
