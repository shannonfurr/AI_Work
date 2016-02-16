
package homework1;

public class Controller 
{
    Generations generation = new Generations();
    
    public void generateInitialPopulation()
    {
        generation.generateInitialPopulation();
    }
    
    public void geneticAlgorithm()
    {
        generation.geneticAlgorithm();
    }
    
    public void crossover(double pco)
    {
        generation.crossover(pco);
    }
    
    public void mutation()
    {
        generation.mutation();
    }
    
    public void printExperimentResults()
    {
        generation.printExperimentResults();
    }
    public void setNewPopulation()
    {
        generation.setNewPopulation();
    }
    
    public int getGenerations()
    {
        return generation.getGenerations();
    }
}
