package my.droid.remote;

import java.io.IOException;

//import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ToggleButton;
//import android.widget.Toast;

public class DTVRemoteActivity extends Activity {
// Called when the activity is first created. //

	
	// Main Page Remote Control Selector Page Buttons

	// dtv Remote Buttons
	Button dtv_power;
	Button dtv_inputs;
	Button dtv_guide;
	Button dtv_menu;
	Button dtv_info;
	Button dtv_exit;
	Button dtv_remotes;
	Button dtv_up;
	Button dtv_right;
	Button dtv_down;
	Button dtv_left;
	Button dtv_ok;
	Button dtv_volup;
	Button dtv_voldown;
	Button dtv_chup;
	Button dtv_chdown;
	Button dtv_channel;
	Button dtv_mute;
	Button dtv_prev;
	ToggleButton SRSToggle;
	
	
	// DTV Remote Control Page Actions
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.dtv_remote);
	
		dtv_power = (Button) findViewById(R.id.dtv_power);
		dtv_remotes = (Button) findViewById(R.id.dtv_remotes);
		dtv_channel = (Button) findViewById(R.id.dtv_channel);
		dtv_inputs = (Button) findViewById(R.id.dtv_inputs);
		dtv_guide = (Button) findViewById(R.id.dtv_guide);
		dtv_menu = (Button) findViewById(R.id.dtv_menu);
		dtv_info = (Button) findViewById(R.id.dtv_info);
		dtv_exit = (Button) findViewById(R.id.dtv_exit);
		dtv_up = (Button) findViewById(R.id.dtv_up);
		dtv_right = (Button) findViewById(R.id.dtv_right);
		dtv_down = (Button) findViewById(R.id.dtv_down);
		dtv_left = (Button) findViewById(R.id.dtv_left);
		dtv_ok = (Button) findViewById(R.id.dtv_ok);
		dtv_chup = (Button) findViewById(R.id.dtv_chup);
		dtv_chdown = (Button) findViewById(R.id.dtv_chdown);
		dtv_volup = (Button) findViewById(R.id.dtv_volup);
		dtv_voldown = (Button) findViewById(R.id.dtv_voldown);
		dtv_prev = (Button) findViewById(R.id.dtv_prev);
		dtv_mute = (Button) findViewById(R.id.dtv_mute);
		SRSToggle = (ToggleButton) findViewById(R.id.SRSToggle);
		
		SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);		
		final String srvaddr = sharedPrefs.getString("srv_addr", "NULL");	
		
		final boolean audiomode = sharedPrefs.getBoolean("audio_mode", true);
		
		if (audiomode == true){
			SRSToggle.setChecked(true);			
		}
		else {
			SRSToggle.setChecked(false);
		}
		
		
		
		
		
		
		
		
        dtv_power.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(DTVRemoteActivity.this,powerbuttonsActivity.class);
        		startActivity(intent);
        	}
        });        
        dtv_remotes.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(DTVRemoteActivity.this,MyDroidRemoteActivity.class);
        		startActivity(intent);
        	}
        });   
        dtv_channel.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(DTVRemoteActivity.this,DTVNumbersActivity.class);
        		startActivity(intent);
        	}
        });
               
        dtv_inputs.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(DTVRemoteActivity.this,inputsActivity.class);
        		startActivity(intent);
        	}
        });
        
        dtv_guide.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C280";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});

        dtv_menu.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C20A";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
		dtv_info.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C2E5";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
      
        dtv_exit.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C26F";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});

        dtv_up.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C21B";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
        dtv_right.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C24D";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
        dtv_down.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C22C";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
        dtv_left.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C23D";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
        dtv_ok.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C25E";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
                
        dtv_chup.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C0DA";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
        dtv_chdown.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C0EB";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
        dtv_prev.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C0FC";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
        dtv_volup.setOnClickListener(new OnClickListener() {
        		public void onClick(View v){
        			if((SRSToggle.isChecked())){
                    	
                		int txcount = 1; 
                		String URL = "http://"+srvaddr+"/S0000240C";
                    	
                        for ( int i = 0; i<txcount; i++ ) {
                		sendcmd(URL,1);
                		}}
        		
        			else {
                    	
                		int txcount = 1; 
                		String URL = "http://"+srvaddr+"/N20DF40BF";
                    	
                        for ( int i = 0; i<txcount; i++ ) {
                		sendcmd(URL,1);
                        }}}});
        
                dtv_voldown.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		if((SRSToggle.isChecked())) {
                	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S0000640C";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}
    		
    			else {
                	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/N20DFC03F";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
                    }}}});
    
                dtv_mute.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		if((SRSToggle.isChecked())) {
                	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S0000140C";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}
    		
    			else {
                	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/N20DF906F";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
                    }}}});
	}
	@SuppressWarnings("unused")
	public void sendcmd(String URL, int txcount){
	for ( int i = 0; i<txcount; i++ ) {
		HttpClient httpclient = new DefaultHttpClient();
	    HttpGet httpget = new HttpGet(URL);
	    try {
			httpclient.execute(httpget);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return;
	}}

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
