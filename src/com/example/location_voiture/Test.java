package com.example.location_voiture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Test extends Activity {
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.test);
	        Bundle extras = getIntent().getExtras();
	        if (extras == null) {
	            return;
	            }
	        // Get data via the key
	        String value1 = extras.getString("V1");
	        String value2 = extras.getString("V2");
            VehiculeBDD vBdd = new VehiculeBDD(this);
  
    
    // On ouvre la base de donn�es pour �crire dedans
    vBdd.open();

   /* // Cr�ation et insertion d'un vehicule
    Vehicule v = new Vehicule(value2,value1);
    vBdd.insertVehicule(v);*/

    

    vBdd.close();
}
    

}
