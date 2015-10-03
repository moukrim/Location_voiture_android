package com.example.location_voiture;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Recuperation extends Activity {
	TextView text;
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.test1);
	        
	        text=(TextView) findViewById(R.id.text);
	        Bundle extras = getIntent().getExtras();
	        if (extras == null) {
	            return;
	            }
	        // Get data via the key
	        String value = extras.getString("V");
           VehiculeBDD vBdd = new VehiculeBDD(this);
 
   
   // On ouvre la base de données pour écrire dedans
   vBdd.open();



   

   // Récupération du vehicule
   Vehicule vehiculeFromBdd = vBdd
          .getFirstVehiculeWithNumeroImm(value);
   // Si le vehicule à bien été ajouté à la BDD, on affiche les données du
   // vehicule dans un Toast et on modifie son numéro de téléphone dans la
   // BDD
   if (vehiculeFromBdd != null) {
	   
	   text.setText(vehiculeFromBdd.toString());
       Toast.makeText(this, vehiculeFromBdd.toString(), Toast.LENGTH_LONG)
               .show();
      
   }
   else  text.setText("Le vehicule avec cet immatricule n'existe pas");

 
   vBdd.close();
}
   

}
