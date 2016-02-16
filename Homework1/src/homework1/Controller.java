
package homework1;

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
}
