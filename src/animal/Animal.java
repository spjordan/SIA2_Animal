package animal;

/*
 * USER STORY US3
 * 
 * En tant que ministre de la chasse et de la pêche, je souhaite répertorier les animaux afin d'obtenir une liste d'animaux
 * et le % d'animaux chassés. Pour cela, ...
 * 
 */

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    // instance variables - replace the example below with your own
    private String espece;
    private boolean capture;
    private Chasseur chasseur;

    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        this.espece = "";
        this.capture = false;        
    }

    public boolean capturer(Chasseur c)
    {
        this.setChasseur(c);
        this.setCapture();
        
        return this.getCapture();
    }
    
    public String getEspece()
    {
        return this.espece;
    }
    
    public void setEspece(String e)
    {
        this.espece = e;
    }
    
    public void setCapture()
    {
        this.capture = true;
    }
    
    public boolean getCapture()
    {
        return this.capture;
    }
    
    public void setChasseur(Chasseur c)
    {
    	this.chasseur=c;
    }
    
    public Chasseur getChasseur()
    {
    	return this.chasseur;
    }
}
