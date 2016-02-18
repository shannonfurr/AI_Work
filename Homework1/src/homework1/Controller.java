
package homework1;
import java.io.*;

public class Controller 
{
    Generations generation = new Generations();
    
    public void generateInitialPopulation()
    {
        generation.generateInitialPopulation();
    }
    
    public int geneticAlgorithm(double Pco)
    {
        return generation.geneticAlgorithm(Pco);
    }
    
    public void setInitialPopulation()
    {
        generation.setInitialPopulation();
    }
    
}
