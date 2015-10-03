package com.example.location_voiture;


import java.util.List;

import com.example.location_voiture.Test;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;



public class Resultat1 extends Activity {
	
	private ImageButton button1;
	private EditText e;
	String r="";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.check1);	
			
		 	
	        e = (EditText) findViewById(R.id.editText1);
	        button1 = (ImageButton) findViewById(R.id.button1);
		 
		   button1.setOnClickListener(new View.OnClickListener() {

		       @Override
		        public void onClick(View v) {
		    	   Action(v);
		    	  
		    	   String chaine = e.getText().toString();
		    	   if(chaine.compareTo("")!=0){
		 
		    	      Intent i = new Intent(Resultat1.this, Recuperation.class);
		    		  i.putExtra("V", chaine);
		    		  e.setText(null);
		    		  startActivity(i);
		    		  }
		    	   else {
		    	    	 Toast.makeText(Resultat1.this, "Veuillez resseyer le remplissage", Toast.LENGTH_SHORT).show();
		    	         e.setText(null);
		    	    }
		    	      
		    	       
		    	    
		    	 
		       }
	        });
		   
		  
		   
	}
	
	 public void Action(View v) { 
    	 // Get instance of Vibrator from current Context
    	 Vibrator vibreur = (Vibrator) getSystemService(Main.VIBRATOR_SERVICE);
    	 // Vibrate for 300 milliseconds
    	 vibreur.vibrate(25);
    	 }  
	
}
	 







	

	
	

	
		
	
	
	 


