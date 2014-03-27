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

public class ProjectorRemoteActivity extends Activity {
// Called when the activity is first created. //

	
	// Main Page Remote Control Selector Page Buttons

	// dtv Remote Buttons
	
	Button projector_power;
	Button projector_remotes;
	Button projector_inputs;
	Button projector_menu;
	Button projector_reset;
	Button projector_resync;
	Button projector_freeze;
	Button projector_up;
	Button projector_right;
	Button projector_down;
	Button projector_left;
	Button projector_ok;
	Button projector_screen;
	Button projector_ks1;
	Button projector_ks2;
	Button projector_vga;
	Button projector_hdmi;
	Button projector_composite;
	Button projector_svideo;
	
	
	
	
	// DTV Remote Control Page Actions
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.projector);
	
		projector_power = (Button) findViewById(R.id.projector_power);
		projector_remotes = (Button) findViewById(R.id.projector_remotes);
		projector_inputs = (Button) findViewById(R.id.projector_inputs);
		projector_menu = (Button) findViewById(R.id.projector_menu);
		projector_reset = (Button) findViewById(R.id.projector_reset);
		projector_resync = (Button) findViewById(R.id.projector_resync);
		projector_freeze = (Button) findViewById(R.id.projector_freeze);
		projector_up = (Button) findViewById(R.id.projector_up);
		projector_right = (Button) findViewById(R.id.projector_right);
		projector_down = (Button) findViewById(R.id.projector_down);
		projector_left = (Button) findViewById(R.id.projector_left);
		projector_ok = (Button) findViewById(R.id.projector_ok);
		projector_screen = (Button) findViewById(R.id.projector_screen);
		projector_ks1 = (Button) findViewById(R.id.projector_ks1);
		projector_ks2 = (Button) findViewById(R.id.projector_ks2);
		projector_vga = (Button) findViewById(R.id.projector_vga);
		projector_hdmi = (Button) findViewById(R.id.projector_hdmi);
		projector_composite = (Button) findViewById(R.id.projector_composite);
		projector_svideo = (Button) findViewById(R.id.projector_svideo);
		
		SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);		
		final String srvaddr = sharedPrefs.getString("srv_addr", "NULL");	
				
        projector_power.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(ProjectorRemoteActivity.this,powerbuttonsActivity.class);
        		startActivity(intent);
        	}
        });
        
        projector_remotes.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(ProjectorRemoteActivity.this,MyDroidRemoteActivity.class);
        		startActivity(intent);
        	}
        });
   
        projector_inputs.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(ProjectorRemoteActivity.this,inputsActivity.class);
        		startActivity(intent);
        	}
        });

    	projector_screen.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(ProjectorRemoteActivity.this,projectorscreenActivity.class);
        		startActivity(intent);
        	}
        });
        
    	projector_menu.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20A8877";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});
    	
    	projector_reset.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20AB04F";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_resync.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20A20DF";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_freeze.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20A30CF";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_up.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20AC837";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_right.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20AA857";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_down.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20A28D7";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_left.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20A6897";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_ok.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20AE817";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_ks1.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20A10EF";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_ks2.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20AD02F";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_vga.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20A7887";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_hdmi.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20AD827";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_composite.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20A38C7";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

    	projector_svideo.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/NF20AB847";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});
                
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