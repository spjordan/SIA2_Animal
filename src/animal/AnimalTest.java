package animal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import animal.Animal;
import animal.Chasseur;

/**
 * The test class AnimalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AnimalTest
{
    Animal animal1;
    Chasseur chasseur1;
    
    /**
     * Default constructor for test class AnimalTest
     */
    public AnimalTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        this.animal1 = new Animal();
        this.chasseur1 = new Chasseur();        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    
    @Test
    public void testRobustesse()
    {
    	chasseur1.setNom("Dimi");
    	animal1.setEspece("Lapin");
    
    	//Notre animal est capturé par le chasseur
    	//Animal : Lapin
    	//Chasseur : Dimi
    	chasseur1.capturerAnimal(this.animal1);
    	
    	//Notre instance Animal dans la liste de Chasseur doit être le même que l'instance Animal de la classe Test
    	assertEquals(animal1, chasseur1.getLastAnimal());
    	//Notre instance Chasseur dans la liste de Animal doit être le même que l'instance Chasseur de la classe Test
    	assertEquals(chasseur1, animal1.getChasseur());
    }

	private void setNomChasseur() {
		chasseur1.setNom("Dimi");
	}


	/*
     * USER STORY US
     * 
     * En tant que <Chasseur> je souhaite <capturer un animal spécifique> afin que je puisse vérifier s'il est différent des 
     * autres animaux que j'ai capturé 
     * 
     */
	
    @Test
    public void testCapturerFromChasseur()
    {
    	setNomChasseur();
    	animal1.setEspece("Lapin");
        assertEquals("Lapin", this.chasseur1.capturerAnimal(this.animal1));
    }
    
}







