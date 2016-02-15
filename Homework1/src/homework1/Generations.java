
package homework1;

import java.util.Random;


public class Generations 
{
    int populationSize=20;
    String[] population = new String[populationSize];
    int[] numbOnes = new int[populationSize];
    int generations=0;
        
    public void generatePopulation()
    {
        for(int i=0; i<populationSize; i++)
        {
            population[i] = generateChromosome();
        }
        generations++;
    }
    
    public String generateChromosome()
    {
        Random rand = new Random();
        int decimalNum = rand.nextInt(513);
        String chromo = Integer.toBinaryString(decimalNum);

        int bits = chromo.length();
        if(bits!=10)
        {
            int zeros = 10 - bits;
            for(int i = zeros; i>0; i--)
            {
                chromo = "0"+chromo;
            }
        }
        return chromo;
    }
    
    public void geneticAlgorithm()
    {
        for(int i=0; i<populationSize; i++)
        {
            numbOnes[i] = fitnessFunc(population[i]);
            
            if(numbOnes[i]==10)
            {
                System.out.println("Population contains chromosome 1111111111.");
                System.out.println("Generations: "+ generations);
                System.exit(0);
            }
        }
    }
    
    public int fitnessFunc(String chromo) //finds # of 1's in chromosome
    {
        int ones = chromo.length() - chromo.replace("1","").length();
        return ones;
    }
 
    public void printExperimentResults()
    {
        System.out.println("Initial      |  Fitness |\nPopulation:  |  Values: |   ");
        System.out.println("-----------------------------------------------");
        for(int i=0; i<20; i++)
        {
            System.out.println(population[i] + "         " + numbOnes[i]); 
            //print population, fitnessvalues, population after crossover, population after mutation
        }
    }
}
