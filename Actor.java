public class Actor extends Personne{
    private String categorie;

    public Actor (String categorie){
        super(categorie, getAge(), categorie, categorie)
        this.categorie = categorie;
    }


    
    public String getCategorie() {
        return categorie;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
