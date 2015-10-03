package com.example.location_voiture;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class VehiculeBDD {
	 
    private static final int VERSION_BDD = 1;
    private static final String NOM_BDD = "vehicule.db";
 
    private static final String TABLE_VEHICULE = "table_vehicule";
    private static final String id="id" ;
    private static final String ETATPNEU = "ETATPNEU";
    private static final String ETATFREIN = "ETATFREIN";
    private static final String ETATVITRE = "ETATVITRE";
    private static final String HUILEFREIN = "HUILEFREIN";
    private static final String COMMENTAIRE = "COMMENTAIRE";
    private static final String IMMATRICULE = "IMMATRICULE";
    private static final int NUM_COL_ETATPNEU = 2;
    private static final int NUM_COL_IMMATRICULE = 1;
    

    private SQLiteDatabase bdd;
 
    private MySQLiteDatabase maBaseSQLite;
 
    public VehiculeBDD(Context context) {
        maBaseSQLite = new MySQLiteDatabase(context, NOM_BDD, null, VERSION_BDD);
    }
 
    /**
     * Ouvre la BDD en écriture
     */
    public void open() {
        bdd = maBaseSQLite.getWritableDatabase();
    }
 
    /**
     * Ferme l'accès à la BDD
     */
    public void close() {
        bdd.close();
    }
 
    public SQLiteDatabase getBDD() {
        return bdd;
    }
 
    /**
     * Insère un vehicule en base de données
     *
     * @param vehicule
     *            le vehicule à insérer
     * @return l'identifiant de la ligne insérée
     */
    public long insertVehicule(Vehicule vehicule) {
        ContentValues values = new ContentValues();
 
        // On insère les valeurs dans le ContentValues : on n'ajoute pas
        // l'identifiant car il est créé automatiquement
        values.put(IMMATRICULE, vehicule.getImmatricule());
        values.put(ETATPNEU, vehicule.getEtatPneu());
        values.put(ETATFREIN, vehicule.getEtatFrein());
        values.put(ETATVITRE, vehicule.getEtatVitre());
        values.put(HUILEFREIN, vehicule.getHuileFrein());
        values.put(COMMENTAIRE, vehicule.getCommentaire());
 
        return bdd.insert(TABLE_VEHICULE, null, values);
    }
 
    /**
     * Met à jour le vehicule en base de données
     *
     */
    	public int updateVehicule(String imm, Vehicule vehicule) {
        ContentValues values = new ContentValues();
        values.put(ETATPNEU, vehicule.getEtatPneu());
        values.put(ETATFREIN, vehicule.getEtatFrein());
        values.put(ETATVITRE, vehicule.getEtatVitre());
        values.put(HUILEFREIN, vehicule.getHuileFrein());
        values.put(COMMENTAIRE, vehicule.getCommentaire());
        return bdd.update(TABLE_VEHICULE, values, IMMATRICULE + " = '" + imm+"'", null);
    }
 
 
    /**
     * Supprime un vehicule de la BDD (celui dont l'immatriculation est passé en
     * paramètres)
     *
     */
    	public int removeVehiculeWithImm(String imm) {
        return bdd.delete(TABLE_VEHICULE, IMMATRICULE + " = '" + imm+"'", null);
    }
 


    public Vehicule getFirstVehiculeWithNumeroImm(String numeroImm) {
        Cursor c = bdd.query(TABLE_VEHICULE, new String[] { id, IMMATRICULE, ETATPNEU, ETATFREIN, HUILEFREIN, ETATVITRE, COMMENTAIRE }, 
        		IMMATRICULE+ " LIKE '" + numeroImm +"'", null, null, null, null);
        return cursorToContact(c);
    }
 
    /**
     * Convertit le cursor en vehicule
     *
     * @param c
     *            le cursor à convertir
     * @return le vehicule créé à partir du Cursor
     */
    private Vehicule cursorToContact(Cursor c) {
        // si aucun élément n'a été retourné dans la requête, on renvoie null
        if (c.getCount() == 0)
            return null;
 
        // Sinon on se place sur le premier élément
        c.moveToFirst();
 
       Vehicule v = new Vehicule();
        v.setId(c.getInt(0));
        v.setImmatricule(c.getString(NUM_COL_IMMATRICULE));
        v.setEtatPneu(c.getString(NUM_COL_ETATPNEU));
        v.setEtatFrein(c.getString(3));
        v.setHuileFrein(c.getString(4));
        v.setEtatVitre(c.getString(5));
        v.setCommentaire(c.getString(6));
        
       
        c.close();
 
        return v;
    }
}