package com.example.location_voiture;


import java.util.List;

import com.example.location_voiture.Test;



import android.app.Activity;
import android.content.Intent;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;



public class Modification extends Activity {
	

	private Button button1;
	private ImageButton imageButton;
	private ImageButton imageButton1;
	private CheckBox c;
	private CheckBox c1;
	private CheckBox c2;
	private CheckBox ch;
	private CheckBox ch1;

	private CheckBox che;
	private CheckBox che1;

	private CheckBox check;
	private CheckBox check1;
	private CheckBox check2;
	private EditText e;
	private EditText ed;
	String r="",re="",res="",resultat="";
	TextView mTV;
	
    VehiculeBDD vBdd = new VehiculeBDD(this);
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.modif);	
		 
	      
	      // On ouvre la base de données pour écrire dedans
	      vBdd.open();
		 find_and_modify_text_view();
		
		
		
    }
	
	 public void Action(View v) { 
    	 // Get instance of Vibrator from current Context
    	 Vibrator vibreur = (Vibrator) getSystemService(Main.VIBRATOR_SERVICE);
    	 // Vibrate for 300 milliseconds
    	 vibreur.vibrate(25);
    	 }  
	 private void find_and_modify_text_view() {
		 	//mTV=(TextView) findViewById(R.id.textView3);
		 c = (CheckBox) findViewById(R.id.CheckBox01);
		 	c.setOnCheckedChangeListener(new OnCheckedChangeListener(){

		 	    @Override
		 	    public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {                   
		 	      if (isChecked){
		 	         c1.setEnabled(false); // disable checkbox 
		 	         c2.setEnabled(false);}
		 	      else if(!isChecked){
		 	    	 c1.setEnabled(true);
		 	    	 c2.setEnabled(true);  
		 	      }   
		 	    	  
		 	      }
		 	       
		 	});
	        c1 = (CheckBox) findViewById(R.id.CheckBox03);
	        c1.setOnCheckedChangeListener(new OnCheckedChangeListener(){

		 	    @Override
		 	    public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {                   
		 	      if (isChecked){
		 	         c.setEnabled(false); // disable checkbox 
		 	         c2.setEnabled(false);}
		 	      else if(!isChecked){
		 	    	 c.setEnabled(true);
		 	    	 c2.setEnabled(true);  
		 	      }   
		 	    	  
		 	      }
		 	       
		 	});
	        c2 = (CheckBox) findViewById(R.id.CheckBox02);
	        c2.setOnCheckedChangeListener(new OnCheckedChangeListener(){

		 	    @Override
		 	    public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {                   
		 	      if (isChecked){
		 	         c1.setEnabled(false); // disable checkbox 
		 	         c.setEnabled(false);}
		 	      else if(!isChecked){
		 	    	 c1.setEnabled(true);
		 	    	 c.setEnabled(true);  
		 	      }   
		 	    	  
		 	      }
		 	       
		 	});
	        
	        //freins
	        ch = (CheckBox) findViewById(R.id.CheckBox04);
	        ch.setOnCheckedChangeListener(new OnCheckedChangeListener(){

		 	    @Override
		 	    public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {                   
		 	      if (isChecked){
		 	         ch1.setEnabled(false); // disable checkbox 
		 	         }
		 	      else if(!isChecked){
		 	    	 ch1.setEnabled(true);  
		 	      }   
		 	    	  
		 	      }
		 	       
		 	});
	        ch1 = (CheckBox) findViewById(R.id.CheckBox06);
	        ch1.setOnCheckedChangeListener(new OnCheckedChangeListener(){

		 	    @Override
		 	    public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {                   
		 	      if (isChecked){
		 	         ch.setEnabled(false); // disable checkbox 
		 	         }
		 	      else if(!isChecked){
		 	    	 ch.setEnabled(true);
		 	    	
		 	      }   
		 	    	  
		 	      }
		 	       
		 	});
	        //huile frein
	        che = (CheckBox) findViewById(R.id.checkBox1);
	        che.setOnCheckedChangeListener(new OnCheckedChangeListener(){

		 	    @Override
		 	    public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {                   
		 	      if (isChecked){
		 	         che1.setEnabled(false); // disable checkbox 
		 	        }
		 	      else if(!isChecked){
		 	    	 che1.setEnabled(true);
		 	    	  
		 	      }   
		 	    	  
		 	      }
		 	       
		 	});
	        che1 = (CheckBox) findViewById(R.id.checkBox2);
	        che1.setOnCheckedChangeListener(new OnCheckedChangeListener(){

		 	    @Override
		 	    public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {                   
		 	      if (isChecked){
		 	         che.setEnabled(false); // disable checkbox 
		 	        }
		 	      else if(!isChecked){
		 	    	 che.setEnabled(true);
		 	    
		 	      }   
		 	    	  
		 	      }
		 	       
		 	});
	        //vitre
	        check = (CheckBox) findViewById(R.id.CheckBox07);
	        check.setOnCheckedChangeListener(new OnCheckedChangeListener(){

		 	    @Override
		 	    public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {                   
		 	      if (isChecked){
		 	         check1.setEnabled(false); // disable checkbox 
		 	         check2.setEnabled(false);}
		 	      else if(!isChecked){
		 	    	 check1.setEnabled(true);
		 	    	 check2.setEnabled(true);  
		 	      }   
		 	    	  
		 	      }
		 	       
		 	});
	        check1 = (CheckBox) findViewById(R.id.CheckBox09);
	        check1.setOnCheckedChangeListener(new OnCheckedChangeListener(){

		 	    @Override
		 	    public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {                   
		 	      if (isChecked){
		 	         check.setEnabled(false); // disable checkbox 
		 	         check2.setEnabled(false);}
		 	      else if(!isChecked){
		 	    	 check.setEnabled(true);
		 	    	 check2.setEnabled(true);  
		 	      }   
		 	    	  
		 	      }
		 	       
		 	});
	        check2 = (CheckBox) findViewById(R.id.CheckBox08);
	        check2.setOnCheckedChangeListener(new OnCheckedChangeListener(){

		 	    @Override
		 	    public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {                   
		 	      if (isChecked){
		 	         check.setEnabled(false); // disable checkbox 
		 	         check1.setEnabled(false);}
		 	      else if(!isChecked){
		 	    	 check.setEnabled(true);
		 	    	 check1.setEnabled(true);  
		 	      }   
		 	    	  
		 	      }
		 	       
		 	});

	         e = (EditText) findViewById(R.id.editText1);
	        ed = (EditText) findViewById(R.id.editText2); 
	        
	        imageButton1 = (ImageButton)findViewById(R.id.imageButton2);
	        imageButton1.setOnClickListener(get_view_button_listener);
		
		  }



private ImageButton.OnClickListener get_view_button_listener = new ImageButton.OnClickListener() {
    public void onClick(View v) {
     Action(v);
      if (c.isChecked()) {
        r = r + "," + c.getText();
        c.setChecked(false);
      }
      if (c1.isChecked()) {
        r = r + "," + c1.getText();
        c1.setChecked(false);
      }
      if (c2.isChecked()) {
        r = r + "," + c2.getText();
        c2.setChecked(false);
      }
      
      if (ch.isChecked()) {
          re = re + "," + ch.getText();
          ch.setChecked(false);
        }
        if (ch1.isChecked()) {
          re = re + "," + ch1.getText();
          ch1.setChecked(false);
        }
//---------huile frein-------       
      
        if (che.isChecked()) {
            res = res + "," + che.getText();
            che.setChecked(false);
          }
          if (che1.isChecked()) {
            res = res + "," + che1.getText();
            che1.setChecked(false);
          } 
          
//----------vitre-------
          if (check.isChecked()) {
              resultat = re + "," + check.getText();
              check.setChecked(false);
            }
            if (check1.isChecked()) {
            	resultat = resultat + "," + check1.getText();
              check1.setChecked(false);
            }
            if (check2.isChecked()) {
            	resultat = resultat + "," + check2.getText();
                check2.setChecked(false);
            }
            
//--------commentaire---------
          
     String chaine1=ed.getText().toString();
     
     // int in=0;
      String chaine = e.getText().toString();
     
	 
     if(r!="" &&re!=""&&res!=""&&resultat!=""&& chaine.compareTo("")!=0 && chaine1.compareTo("")!=0){
      
      // Création et insertion d'un contact
    	 Vehicule vehiculeFromBdd = vBdd
    	          .getFirstVehiculeWithNumeroImm(chaine);
    	 if(vehiculeFromBdd!=null){
      
             vehiculeFromBdd.setEtatPneu(r);
             vehiculeFromBdd.setEtatFrein(re);
             vehiculeFromBdd.setHuileFrein(res);
             vehiculeFromBdd.setEtatVitre(resultat);
             vehiculeFromBdd.setCommentaire(chaine1);
             
             vBdd.updateVehicule(vehiculeFromBdd.getImmatricule(), vehiculeFromBdd);
         
      Toast.makeText(Modification.this, "L'etat de vehicule a été bien modifié", Toast.LENGTH_SHORT).show();
      e.setText(null);
      ed.setText(null);}
    	 else  {Toast.makeText(Modification.this, "Ce vehicule n'existe pas", Toast.LENGTH_SHORT).show();
    	 e.setText(null);
    	 ed.setText(null);
    	 }
     }
     else 
    	 Toast.makeText(Modification.this, "Veuillez resseyer le remplissage", Toast.LENGTH_SHORT).show();
         r="";
         e.setText(null);
         ed.setText(null);
    }
  };
}



	

	
	
	
		
	
	
	 


