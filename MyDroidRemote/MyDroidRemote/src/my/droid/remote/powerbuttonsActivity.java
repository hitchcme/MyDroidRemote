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
//import android.widget.Toast;

public class powerbuttonsActivity extends Activity {
// Called when the activity is first created. //

	// Power Buttons
	Button power_power;
	Button power_remotes;
	Button power_inputs;
	Button power_vizio;
	Button power_dtv;
	Button power_wii;
	Button power_dvdvcr;
	Button power_projector;
	Button power_hdmiav;
	Button power_AudioReceiver;

	// Power Buttons Page Actions
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.power);
	
		power_power = (Button) findViewById(R.id.power_power);
		power_inputs = (Button) findViewById(R.id.power_inputs);
		power_remotes = (Button) findViewById(R.id.power_remotes);
		power_vizio = (Button) findViewById(R.id.power_vizio);
		power_dtv = (Button) findViewById(R.id.power_dtv);
		power_wii = (Button) findViewById(R.id.power_wii);
		power_dvdvcr = (Button) findViewById(R.id.power_dvdvcr);
		power_projector = (Button) findViewById(R.id.power_projector);
		power_hdmiav = (Button) findViewById(R.id.power_hdmiav);
		power_AudioReceiver = (Button) findViewById(R.id.power_AudioReceiver);
	
		SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);		
		final String srvaddr = sharedPrefs.getString("srv_addr", "NULL");
		
        power_power.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(powerbuttonsActivity.this,powerbuttonsActivity.class);
        		startActivity(intent);
        	}
        });
		
        power_remotes.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(powerbuttonsActivity.this,MyDroidRemoteActivity.class);
        		startActivity(intent);
        	}
        });
        
        power_inputs.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(powerbuttonsActivity.this,inputsActivity.class);
        		startActivity(intent);
        	}
        });

        
		power_vizio.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		//Set TV to AV Input
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/N20DF10EF";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

        
		power_dtv.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/X0000C105";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});

        power_wii.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/Unknown";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});
        
        power_dvdvcr.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/J0000F6D0";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});
        
        power_projector.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 4;
        		String URL = "http://"+srvaddr+"/NF20A40BF";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        		}}});
        
        power_hdmiav.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/N00FFC837";
        		String URL1 = "http://"+srvaddr+"/Unknown";
        		
        		for ( int i = 0; i<txcount; i++ ) {
        			sendcmd(URL,1);
        			sendcmd(URL1,1);
        		}}});
        
        power_AudioReceiver.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		int txcount = 1;
        		String URL = "http://"+srvaddr+"/S0000540C";
        		
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
