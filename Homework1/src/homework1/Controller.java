
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
