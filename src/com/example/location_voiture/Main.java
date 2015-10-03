package com.example.location_voiture;



import android.app.Activity; 
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.location_voiture.Login;

public class Main extends Activity 
{
    private TextView tv;
	public static final int RESULT_Main = 1;
	private Button mBt1;
	private Button mBt2;
	private Button mBt3;
	private Button mBt4;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main1);	
        
		
		mBt1 = (Button) findViewById(R.id.button1);
		mBt2 = (Button) findViewById(R.id.button2);
		mBt3 = (Button) findViewById(R.id.button3);
		mBt4 = (Button) findViewById(R.id.button4);
		
		 mBt1.setOnClickListener(new View.OnClickListener() {

		        @Override
		        public void onClick(View v) {
		        	
		        		 Action(v);
		        		 
		        		 Intent intent1 = new Intent(Main.this, Resultat.class);
		                 startActivity(intent1);
		        		 } 
	
		          
		          
		        
		        });
		      
		        
		        mBt2.setOnClickListener(new View.OnClickListener() {

		            @Override
		            public void onClick(View v) {
		            	Action(v);
		              Intent intent1 = new Intent(Main.this, Resultat1.class);
		              startActivity(intent1);
		              
		              
		            }
		            });
		        
		        mBt3.setOnClickListener(new View.OnClickListener() {

			        @Override
			        public void onClick(View v) {
			        	Action(v);
			          Intent intent1 = new Intent(Main.this, Modification.class);
			          startActivity(intent1);
			          
			        }
			        });
		        
		        mBt4.setOnClickListener(new View.OnClickListener() {

			        @Override
			        public void onClick(View v) {
			        	Action(v);
			          Intent intent1 = new Intent(Main.this, Suppression.class);
			          startActivity(intent1);
			          
			        }
			        });
			      
		         
		        
		           
		
 		//Appel de la page de Login 
   /*     startActivityForResult(new Intent(Main.this, Login.class), RESULT_Main);
        tv = new TextView(this);
        setContentView(tv);*/
	
	}
        
     
		        public void Action(View v) { 
		        	 // Get instance of Vibrator from current Context
		        	 Vibrator vibreur = (Vibrator) getSystemService(Main.VIBRATOR_SERVICE);
		        	 // Vibrate for 300 milliseconds
		        	 vibreur.vibrate(25);
		        	 }  
 
    private void startup(Intent i) 
	{
		// Récupère l'identifiant        
		int user = i.getIntExtra("userid",-1);
		 
		//Affiche les identifiants de l'utilisateur
        tv.setText("UserID: "+String.valueOf(user)+" logged in");
    }
 
 
    protected void onActivityResult(int requestCode, int resultCode, Intent data) 
	{ 
        if(requestCode == RESULT_Main && resultCode == RESULT_CANCELED)  
            finish(); 
        else 
            startup(data);
    }
}