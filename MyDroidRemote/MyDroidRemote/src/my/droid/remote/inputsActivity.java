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

public class inputsActivity extends Activity {
// Called when the activity is first created. //

	
	// Input Selector Page Buttons
	Button inputs_power;
	Button inputs_remotes;
	Button inputs_inputs;
	Button inputs_dtv;
	Button inputs_wii;
	Button inputs_dvdvcr;
	Button inputs_hdmi_auxiliary;
	Button inputs_usb_media;
	Button inputs_rf;
	
	
	// Input Selector Page Actions
@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inputs);
	
		inputs_power = (Button) findViewById(R.id.inputs_power);
		inputs_inputs = (Button) findViewById(R.id.inputs_inputs);
		inputs_remotes = (Button) findViewById(R.id.inputs_remotes);
		inputs_dtv = (Button) findViewById(R.id.inputs_dtv);
		inputs_wii = (Button) findViewById(R.id.inputs_wii);
		inputs_dvdvcr = (Button) findViewById(R.id.inputs_dvdvcr);
		inputs_hdmi_auxiliary = (Button) findViewById(R.id.inputs_hdmi_auxiliary);
		inputs_usb_media = (Button) findViewById(R.id.inputs_usb_media);
		inputs_rf = (Button) findViewById(R.id.inputs_rf);
		
		SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);		
		final String srvaddr = sharedPrefs.getString("srv_addr", "NULL");

		
        inputs_power.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(inputsActivity.this,powerbuttonsActivity.class);
        		startActivity(intent);
        	}
        });		
        inputs_remotes.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(inputsActivity.this,MyDroidRemoteActivity.class);
        		startActivity(intent);
        	}
        });        
        inputs_inputs.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		Intent intent = new Intent(inputsActivity.this,inputsActivity.class);
        		startActivity(intent);
        	}
        });
		
        inputs_dtv.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		
        		int txcount = 3;               
        		
        		String URL = "http://"+srvaddr+"/N41FF807F";
                String URL1 = "http://"+srvaddr+"/N20DF857A";
                String URL2 = "http://"+srvaddr+"/NF20A38C7";
                String URL3 = "http://"+srvaddr+"/S00002B0C";
        		
                for ( int i = 0; i<txcount; i++ ) {
                
                sendcmd(URL,1);
                sendcmd(URL1,1);
        		sendcmd(URL2,1);
                sendcmd(URL3,1);

        	}}});

        inputs_wii.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	int txcount = 3; 
            		    String URL = "http://"+srvaddr+"/N41FFE01F";
                        String URL1 = "http://"+srvaddr+"/N20DF857A";
                        String URL2 = "http://"+srvaddr+"/NF20A38C7";
                        String URL3 = "http://"+srvaddr+"/S00002B0C";

                        for ( int i = 0; i<txcount; i++ ) {
                        sendcmd(URL,1);
                        sendcmd(URL1,1);
                        sendcmd(URL2,1);
                        sendcmd(URL3,1);
        	}}});
        
        inputs_dvdvcr.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 4; 
        		String URL = "http://"+srvaddr+"/N41FFC03F";
                String URL1 = "http://"+srvaddr+"/N20DF857A";
                String URL2 = "http://"+srvaddr+"/NF20A38C7";
                String URL3 = "http://"+srvaddr+"/S00003C0C";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
                sendcmd(URL1,1);
                sendcmd(URL2,1);
                sendcmd(URL3,1);
        		}}});
                
        inputs_hdmi_auxiliary.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){

        		int txcount = 4; 
        		String URL = "http://"+srvaddr+"/N20DF41BE";

                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,4);
            	}}});
        
        inputs_usb_media.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {

        		int txcount = 4; 
        		String URL = "http://"+srvaddr+"/N00000000";

        		for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
            	}}});
        
        inputs_rf.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {

        		int txcount = 4; 
        		String URL = "http://"+srvaddr+"/N00000000";
                String URL1 = "http://"+srvaddr+"/N00000000";

                for ( int i = 0; i<txcount; i++ ) {
                sendcmd(URL,1);
        		sendcmd(URL1,4);
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
