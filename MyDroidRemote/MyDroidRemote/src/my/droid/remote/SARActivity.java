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

public class SARActivity extends Activity {
// Called when the activity is first created. //

	
	// Main Page Remote Control Selector Page Buttons

	// dtv Remote Buttons
	Button SAR_Power;
	Button SAR_Vid1;
	Button SAR_Vid2;
	Button SAR_Vid3;
	Button SAR_AmpMenu;
	Button SAR_DVDMenu;
	Button SAR_Display;
	Button SAR_Mute;
	Button SAR_VUp;
	Button SAR_VDown;
	Button SAR_Right;
	Button SAR_Down;
	Button SAR_Up;
	Button SAR_Left;
	Button SAR_OK;
	Button SAR_2CH;
	Button SAR_AFD;
	Button SAR_Tuner;
	Button SAR_SACD;
	Button SAR_TV;
	Button SAR_SAT;
	Button SAR_Music;
	Button SAR_Movie;
	Button SAR_DVD;

	
	// DTV Remote Control Page Actions
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.sar_remote);
	
		SAR_Power = (Button) findViewById(R.id.SAR_Power);
		SAR_Vid1 = (Button) findViewById(R.id.SAR_Vid1);
		SAR_Vid2 = (Button) findViewById(R.id.SAR_Vid2);
		SAR_Vid3 = (Button) findViewById(R.id.SAR_Vid3);
		SAR_AmpMenu = (Button) findViewById(R.id.SAR_AmpMenu);
		SAR_DVDMenu = (Button) findViewById(R.id.SAR_DVDMenu);
		SAR_Display = (Button) findViewById(R.id.SAR_Display);
		SAR_Mute = (Button) findViewById(R.id.SAR_Mute);
		SAR_VUp = (Button) findViewById(R.id.SAR_VUp);
		SAR_VDown = (Button) findViewById(R.id.SAR_VDown);
		SAR_Right = (Button) findViewById(R.id.SAR_Right);
		SAR_Down = (Button) findViewById(R.id.SAR_Down);
		SAR_Up = (Button) findViewById(R.id.SAR_Up);
		SAR_Left = (Button) findViewById(R.id.SAR_Left);
		SAR_OK = (Button) findViewById(R.id.SAR_OK);
		SAR_2CH = (Button) findViewById(R.id.SAR_2CH);
		SAR_AFD = (Button) findViewById(R.id.SAR_AFD);
		SAR_Tuner = (Button) findViewById(R.id.SAR_Tuner);
		SAR_SACD = (Button) findViewById(R.id.SAR_SACD);
		SAR_TV = (Button) findViewById(R.id.SAR_TV);
		SAR_SAT = (Button) findViewById(R.id.SAR_SAT);
		SAR_Music = (Button) findViewById(R.id.SAR_Music);
		SAR_Movie = (Button) findViewById(R.id.SAR_Movie);
		SAR_DVD = (Button) findViewById(R.id.SAR_DVD);
		
		SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);		
		final String srvaddr = sharedPrefs.getString("srv_addr", "NULL");	
			
        SAR_Power.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S0000540C";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});

        SAR_Vid1.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S0000220C";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});
        
		SAR_Vid2.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S00003C0C";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});
      
        SAR_Vid3.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S0000210C";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});

        SAR_DVD.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S00005F0C";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});
        
        SAR_SAT.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S0000600D";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});
        
        SAR_TV.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S00002B0C";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});
        
        SAR_SACD.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S0000520C";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});
        
        SAR_Tuner.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S0000420C";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});
                
        SAR_2CH.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S0000410D";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});
        
        SAR_AFD.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S0000210D";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});
        
        SAR_Movie.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
               	
            		int txcount = 1; 
            		String URL = "http://"+srvaddr+"/S0000610D";
                	
                    for ( int i = 0; i<txcount; i++ ) {
            		sendcmd(URL,1);
            		}}});
        
        SAR_Music.setOnClickListener(new OnClickListener() {
        		public void onClick(View v){
                   	
                		int txcount = 1; 
                		String URL = "http://"+srvaddr+"/S0000490D";
                    	
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
