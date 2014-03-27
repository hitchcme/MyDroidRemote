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

public class projectorscreenActivity extends Activity {
// Called when the activity is first created. //

	
	// Input Selector Page Buttons
	Button projector_up;
	Button projector_down;
	Button projector_stop;
	
	
	// Input Selector Page Actions
@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.projector_screen);
	
		projector_up = (Button) findViewById(R.id.projector_up);
		projector_down = (Button) findViewById(R.id.projector_down);
		projector_stop = (Button) findViewById(R.id.projector_stop);

		
		SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);		
		final String srvaddr = sharedPrefs.getString("srv_addr", "NULL");

		

		
        projector_up.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	int txcount = 3; 
            		    String URL = "http://"+srvaddr+"/Y00000142";

                        for ( int i = 0; i<txcount; i++ ) {
                        sendcmd(URL,1);

        	}}});
        
        projector_down.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	int txcount = 1; 
            		    String URL = "http://"+srvaddr+"/Y00000122";

                        for ( int i = 0; i<txcount; i++ ) {
                        sendcmd(URL,1);
                        
        	}}});
        
        projector_stop.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
            	
        		int txcount = 2; 
        		String URL = "http://"+srvaddr+"/Y00000152";
                            	
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
