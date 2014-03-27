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

public class DTVNumbersActivity extends Activity {
// Called when the activity is first created. //

	

	// dtv Number Buttons
	Button dtv_1;
	Button dtv_2;
	Button dtv_3;
	Button dtv_4;
	Button dtv_5;
	Button dtv_6;
	Button dtv_7;
	Button dtv_8;
	Button dtv_9;
	Button dtv_0;
	Button dtv_tack;
	Button dtv_enter;
	

	// DTV Channel Button Page Actions
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dtv_numbers);
	
		dtv_1 = (Button) findViewById(R.id.dtv_1);
		dtv_2 = (Button) findViewById(R.id.dtv_2);
		dtv_3 = (Button) findViewById(R.id.dtv_3);
		dtv_4 = (Button) findViewById(R.id.dtv_4);
		dtv_5 = (Button) findViewById(R.id.dtv_5);
		dtv_6 = (Button) findViewById(R.id.dtv_6);
		dtv_7 = (Button) findViewById(R.id.dtv_7);
		dtv_8 = (Button) findViewById(R.id.dtv_8);
		dtv_9 = (Button) findViewById(R.id.dtv_9);
		dtv_0 = (Button) findViewById(R.id.dtv_0);
		dtv_tack = (Button) findViewById(R.id.dtv_tack);
		dtv_enter = (Button) findViewById(R.id.dtv_enter);
		
		SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);		
		final String srvaddr = sharedPrefs.getString("srv_addr", "NULL");	
		
		dtv_1.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C011";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
		dtv_2.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C022";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});

        dtv_3.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C033";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
        dtv_4.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C043";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
        dtv_5.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C054";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});
        
        dtv_6.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C065";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});

        dtv_7.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C076";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});

        dtv_8.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C086";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});

        dtv_9.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C097";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});

        dtv_0.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C116";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});

        dtv_tack.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C127";
            	
                for ( int i = 0; i<txcount; i++ ) {
        		sendcmd(URL,1);
        		}}});

        dtv_enter.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 1; 
        		String URL = "http://"+srvaddr+"/X0000C138";
            	
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
