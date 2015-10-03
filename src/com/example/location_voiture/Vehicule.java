package com.example.location_voiture;

 public class Vehicule {
	
	private String immatricule; 
    private String etatPneu;
    private String etatVitre;
    private String etatFrein;
    private String huileFrein;
    private String commentaire;
    private int id;
    
 
    public Vehicule() {
 
    }
 
    public Vehicule(String immatricule,String etatP,String etatF,String huileF,String etatV,String com) {
        super();
        this.immatricule=immatricule;
        this.etatPneu = etatP;
        this.etatFrein = etatF;
        this.etatVitre = etatV;
        this.huileFrein = huileF;
        this.commentaire=com;
    }
    
    public String getImmatricule() {
        return immatricule;
    }
 
    public void setImmatricule(String imm) {
        this.immatricule= imm;
    }
 
    public String getEtatPneu() {
        return etatPneu;
    }
 
    public void setEtatPneu(String etat) {
        this.etatPneu= etat;
    }
    
    public String getEtatFrein() {
        return etatFrein;
    }
 
    public void setEtatFrein(String etatF) {
        this.etatFrein= etatF;
    }
    
    public String getEtatVitre() {
        return etatVitre;
    }
 
    public void setEtatVitre(String etatV) {
        this.etatVitre= etatV;
    }
    
    public String getHuileFrein() {
        return huileFrein;
    }
 
    public void setHuileFrein(String huileF) {
        this.huileFrein= huileF;
    }
    
    public String getCommentaire() {
        return commentaire;
    }
 
    public void setCommentaire(String com) {
        this.commentaire= com;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id= id;
    }
 
 
    @Override
    public String toString() {
        return "[Id] : " + id+"\n"+ "[Immatricule] : " + immatricule+"\n"+"[EtatPneu] : " + etatPneu +"\n"+"[EtatVitre] : " + etatVitre 
        		+"\n"+"[EtatFrein] : " + etatFrein +"\n"+"[HuileFrein] : " + huileFrein+"\n"+"[Commentaires] : " + commentaire+"\n" ;
    }
 
}
