package my.droid.remote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
//import android.widget.Toast;

public class MyDroidRemoteActivity extends Activity {

// Called when the activity is first created. //

	Button remotes_power;
	Button remotes_remotes;
	Button remotes_inputs;
	Button remotes_dtv;
	Button remotes_wii;
	Button remotes_dvdvcr;
	Button remotes_appleremote;
	Button remotes_vizio;
	Button remotes_sar;
	Button remotes_projector;
	
	
	
	// Main Page Remote Control Selector Page Button Actions
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = 
				new StrictMode.ThreadPolicy.Builder().permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}


		
        setContentView(R.layout.main);
        
		remotes_power = (Button) findViewById(R.id.remotes_power);
		remotes_inputs = (Button) findViewById(R.id.remotes_inputs);
		remotes_remotes = (Button) findViewById(R.id.remotes_remotes);
        remotes_dtv = (Button) findViewById(R.id.remotes_dtv);
        remotes_wii = (Button) findViewById(R.id.remotes_wii);
        remotes_dvdvcr = (Button) findViewById(R.id.remotes_dvdvcr);
        remotes_appleremote = (Button) findViewById(R.id.remotes_appleremote);
        remotes_vizio = (Button) findViewById(R.id.remotes_vizio);
        remotes_sar = (Button) findViewById(R.id.remotes_sar);
        remotes_projector = (Button) findViewById(R.id.remotes_projector);

        remotes_power.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(MyDroidRemoteActivity.this,powerbuttonsActivity.class);
        		startActivity(intent);
        	}
        });
		
        remotes_remotes.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(MyDroidRemoteActivity.this,MyDroidRemoteActivity.class);
        		startActivity(intent);
        	}
        });
        
        remotes_inputs.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(MyDroidRemoteActivity.this,inputsActivity.class);
        		startActivity(intent);
        	}
        });

        
        
        remotes_dtv.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
       		Intent intent = new Intent(MyDroidRemoteActivity.this,DTVRemoteActivity.class);
    		startActivity(intent);
        	}
        });

        remotes_wii.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
//           		Intent intent = new Intent(MyDroidRemoteActivity.this,WiiRemoteActivity.class);
//        		startActivity(intent);        	
        	}
        });
        
        remotes_dvdvcr.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
//           		Intent intent = new Intent(MyDroidRemoteActivity.this,DVDVCRRemoteActivity.class);
//        		startActivity(intent);
        	}
        });
                
        remotes_appleremote.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
//           		Intent intent = new Intent(MyDroidRemoteActivity.this,appleRemoteActivity.class);
//        		startActivity(intent);
        		}
        });
        
        remotes_vizio.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
//           		Intent intent = new Intent(MyDroidRemoteActivity.this,VizioRemoteActivity.class);
//        		startActivity(intent);
        		}
        });
        
        remotes_sar.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
           		Intent intent = new Intent(MyDroidRemoteActivity.this,SARActivity.class);
        		startActivity(intent);

        		}
        });   
        remotes_projector.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
       		Intent intent = new Intent(MyDroidRemoteActivity.this,ProjectorRemoteActivity.class);
        		startActivity(intent);
        	}
        });
        
	
	}
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);
	    return true;
	}	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
	    case R.id.preferences:
	    startActivity(new Intent(this, PreferencesActivity.class));
	    return true;
	    default:
	    return super.onOptionsItemSelected(item);
	}
	    //respond to menu item selection
	}
}

	
