
package homework1;

public class Controller 
{
    Generations generation = new Generations();
    
    public void generatePopulation()
    {
        generation.generatePopulation();
    }
    
    public void geneticAlgorithm()
    {
        generation.geneticAlgorithm();
    }
    
    public void mutation()
    {
        generation.mutation();
    }
    
    public void printExperimentResults()
    {
        generation.printExperimentResults();
    }
}
