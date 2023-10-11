
/*
* orienté objet 
* Person.java
* 
* 
* 
* 
*/
public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String sexe  ;

    // constructeur 
    public Personne(String nom, int age, String prenom , String sexe ) {
        this.nom = nom;
        this.age = age;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    //getter ou acceseur
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public int getAge() {
        return age;
    }
    public String getSexe(){
        return sexe;
    }

    //setter ou mutateur 
    public void setNom( String nom){
        this.nom = nom;
    }
    public void setPrenom( String Prenom){
        this.prenom = Prenom;
    }
    public void setAge( int age){
        this.age = age;
    }
    public void setSexe( String sexe){
        this.sexe = sexe;
    }
}

