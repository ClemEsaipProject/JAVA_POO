// Main.java
public class main {
    /**
     * @param args
     */
    public static void main(String[] args) {
      Personne person1 = new Personne(" Danger ", 11 ,"Abella" , "M");
      Personne person2 = new Personne(" Sin ", 12 , "Johnny" , "M");
      Personne person3 = new Personne(" Kalifa ", 29 , "Mia", "F");
      System.out.println("Nom, prenom :"+ person1.getNom() +person1.getPrenom()+ " \n age :" + person1.getAge() + " ans \n sexe :" + person1.getSexe());
      System.out.println("Nom, prenom :"+ person2.getNom() +person2.getPrenom()+ " \n age :" + person2.getAge() + " ans \n sexe :" + person2.getSexe());
      System.out.println("Nom, prenom :"+ person3.getNom() +person3.getPrenom()+ " \n age :" + person3.getAge() + " ans \n sexe :" + person3.getSexe());
    }
  }
  