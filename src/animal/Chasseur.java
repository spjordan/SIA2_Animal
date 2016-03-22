package animal;


import java.util.ArrayList;

/*
 * USER STORY US1
 * 
 * En tant que ministre de la chasse et de la pêche, je souhaite répertorier les chasseurs afin d'obtenir une liste des chasseurs existants
 * Pour cela, .......
 * 
 */

/**
 * Write a description of class Chasseur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chasseur
{
    // instance variables - replace the example below with your own
    private String nom;
    private ArrayList<Animal> animals;
    
    /**
     * Constructor for objects of class Chasseur
     */
    public Chasseur()
    {
        this.nom = "";
        animals = new ArrayList<Animal>();
    }

   public String getNom()
    {
        return this.nom;
    }
    
    public void setNom(String n)
    {
        this.nom = n;
    }
    
    public Animal getLastAnimal()
    {
        return animals.get(animals.size()-1);
    }

       
    /*
     * USER STORY US2
     * 
     * En tant que chasseur, je souhaite enregistrer mes animaux capturés afin qu'ils soient répertoriés.
     * 
     */
    
    public String capturerAnimal(Animal a){
        animals.add(a);
        a.setChasseur(this);
        
        return animals.get(animals.size()-1).getEspece();
    }
}
