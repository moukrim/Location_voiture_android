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



public class Suppression extends Activity {
	
	private ImageButton button1;
	private EditText e;
	String r="";
	VehiculeBDD vBdd = new VehiculeBDD(this);


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.suppr);	
			
		vBdd.open();
	        e = (EditText) findViewById(R.id.editText1);
	        button1 = (ImageButton) findViewById(R.id.button1);
		 
		   button1.setOnClickListener(new View.OnClickListener() {

		       @Override
		        public void onClick(View v) {
		    	  Action(v);
		    	   String chaine = e.getText().toString();
		    	   Vehicule vehiculeFromBdd = vBdd
		    	              .getFirstVehiculeWithNumeroImm(chaine);
		    
		    
		 if(chaine.compareTo("")!=0){
		    		   if (vehiculeFromBdd != null){
		    	     // int in = Integer.parseInt(chaine);
		    	      vBdd.removeVehiculeWithImm(vehiculeFromBdd.getImmatricule());
		    	      Toast.makeText(Suppression.this, "La suppression a été bien pris en compte", Toast.LENGTH_SHORT).show();
		    	      e.setText(null);
		    	      
		    		  } else 	      
		    		  	{ Toast.makeText(Suppression.this, "Ce véhicule n'existe pas dans la base de données", Toast.LENGTH_SHORT).show();
	                     e.setText(null);  }
		    	  
		           }
		      else {
		    	    	 Toast.makeText(Suppression.this, "Veuillez resseyer le remplissage", Toast.LENGTH_SHORT).show();
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
	 







	

	
	

	
		
	
	
	 


