
package homework1;

import java.util.Random;


public class Generations 
{
    int populationSize=20;
    String[] initialPopulation = new String[populationSize];
    String[] population = new String[populationSize];
    int[] numbOnes = new int[populationSize];
    String[] populationMutation = new String[populationSize];
    String[] populationCrossover = new String[populationSize];
    int generations=0;
        
    public void generateInitialPopulation()
    {
        System.out.println("Initial Population: ");
        for(int i=0; i<populationSize; i++)
        {
            initialPopulation[i] = generateChromosome();
            population[i] = initialPopulation[i];
            System.out.println(initialPopulation[i]);
        }
        System.out.println("-------------");
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
    
    public void geneticAlgorithm() //uses fitness function & determines if program needs to stop
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
        generations++;
    }
    
    public int fitnessFunc(String chromo) //finds # of 1's in chromosome
    {
        int ones = chromo.length() - chromo.replace("1","").length();
        return ones;
    }
 
    public void crossover(double pCo)  //does a crossover on chromosomes from population
    {
        String crossoverMask = "1111100000";
        double pairs = (pCo*20)/2;  //this is how many pairs will be crossed-over 
        
        for (int i=0; i<20; i++)
        {
            populationCrossover[i] = population[i];
        }
        for(int i =0; i<pairs; i=i+2)
        {
            String chromo1 = populationCrossover[i];
            String chromo2 = populationCrossover[i+1];
            
            String chromo1end = chromo1.substring(5);
            String chromo2end = chromo2.substring(5);
            
            chromo1.replace(chromo1end, chromo2end);
            chromo2.replace(chromo2end, chromo1end);  
            
            populationCrossover[i] = chromo1;
            populationCrossover[i+1] = chromo2;
        }
    }
    
    public void mutation() //choose 1 random chromosome and invert 1 random bit (from population after crossover)
    {
        Random num = new Random();
        int randomChromo = num.nextInt(20); //choose a random chromosome from population[]
        int randomBit = num.nextInt(10);    //random bit to change in chromosome
        for(int i=0; i<20; i++)
        {
            populationMutation[i]=populationCrossover[i];
        }
        
        String chromo = populationMutation[randomChromo];
        
        char[] chromoToMutate = chromo.toCharArray();   //turn String chromosome into char[]
        
        if(chromoToMutate[randomBit]=='1')      //if random bit is 1, invert to 0
            chromoToMutate[randomBit] = '0';    
        else
            chromoToMutate[randomBit] = '1';    //else invert to 1
        
        chromo = String.valueOf(chromoToMutate);    //convert char[] back to String
        
        populationMutation[randomChromo] = chromo;
    }
    
    public void printExperimentResults()    
    {
        System.out.println("| Fitness | Population After | Population After  |"
                + "\n| Values: | Crossover        | Mutation:         |  ");
        System.out.println("-----------------------------------------------");
        for(int i=0; i<20; i++)
        {
            System.out.println("    " + numbOnes[i] +"          " + populationCrossover[i] 
                    + "         " + populationMutation[i]); 
            //print population, fitnessvalues, population after crossover, population after mutation
        }
    }
    
    public void setNewPopulation()
    {
        for(int i=0; i<20; i++)
        {
            population[i] = populationMutation[i];
        }
    }
}
