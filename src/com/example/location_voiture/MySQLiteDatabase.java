package com.example.location_voiture;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
 
public class MySQLiteDatabase extends SQLiteOpenHelper {
 
    private static final String TABLE_VEHICULE = "table_vehicule";
    private static final String IMMATRICULE= "IMMATRICULE";
    private static final String id= "id";
    private static final String ETATPNEU = "ETATPNEU";
    private static final String ETATFREIN = "ETATFREIN";
    private static final String ETATVITRE = "ETATVITRE";
    private static final String HUILEFREIN = "HUILEFREIN";
    private static final String COMMENTAIRE = "COMMENTAIRE";

 
    private static final String CREATE_TABLE_VEHICULE = "CREATE TABLE  "+TABLE_VEHICULE+ "("+ id + " INTEGER PRIMARY KEY AUTOINCREMENT, "+ IMMATRICULE+ " TEXT NOT NULL, "+ ETATPNEU+" TEXT NOT NULL,"+ ETATFREIN+" TEXT NOT NULL,"+ HUILEFREIN+ " TEXT NOT NULL,"+ ETATVITRE+" TEXT NOT NULL,"+ COMMENTAIRE+" TEXT NOT NULL);";
            
    //private static final String CREATE_TABLE_VEHICULE = "CREATE TABLE  TABLE_VEHICULE (" +" id INTEGER PRIMARY KEY AUTOINCREMENT," + "IMMATRICULE TEXT,"+ "ETATPNEU TEXT)";          
 
  
    										
    public MySQLiteDatabase(Context context, String name, CursorFactory factory,
            int version) {
        super(context, name, factory, version);
    }
 
    /**
     * Cette méthode est appelée lors de la toute première création de la base
     * de données. Ici, on doit créer les tables et éventuellement les populer.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // on crée la table table_vehicule dans la BDD
        db.execSQL(CREATE_TABLE_VEHICULE);
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on supprime la table table_vehicule de la BDD et on recrée la BDD
        db.execSQL("DROP TABLE " + TABLE_VEHICULE + ";");
        onCreate(db);
    }
 
}
