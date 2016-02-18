// Artificial Intelligence
// Homework1

package homework1;
import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        Controller control = new Controller();
        
        control.generateInitialPopulation(); //randomly generates 20 10-bit chromosomes
        
        int generationTotals=0;
        
        System.out.println("pco = 0.7 runs: ");
        for(int i =1; i<=20; i++)
        {
            System.out.println("-------------------");
            System.out.println("Run: "+i);
            generationTotals+= control.geneticAlgorithm(0.7); //compute genetic algorithm with pCo=0.7
            //commented out "printExperimentResults" in the geneticAlgorithm of Generations.java to 
            //make results easier to read
        }
        System.out.println("===================================================");
        System.out.println("Average Number of Generations with pCo=0.7: " + generationTotals/20);
        System.out.println("===================================================");

    //Part 2:
        System.out.println("pco = 0.3 runs: ");
        for(int i =1; i<=20; i++)
        {
            System.out.println("-------------------");
            System.out.println("Run: "+i);
            generationTotals+= control.geneticAlgorithm(0.3); //compute genetic algorithm with pCo=0.7
        }
        System.out.println("===================================================");
        System.out.println("Average Number of Generations with pCo=0.3: " + generationTotals/20);
        System.out.println("===================================================");

        System.out.println("pco = 0.5 runs: ");
        for(int i =1; i<=20; i++)
        {
            System.out.println("-------------------");
            System.out.println("Run: "+i);
            generationTotals+= control.geneticAlgorithm(0.5); //compute genetic algorithm with pCo=0.7
        }
        System.out.println("===================================================");
        System.out.println("Average Number of Generations with pCo=0.5: " + generationTotals/20);
        System.out.println("===================================================");

        System.out.println("pco = 0.9 runs: ");
        for(int i =1; i<=20; i++)
        {
            System.out.println("-------------------");
            System.out.println("Run: "+i);
            generationTotals+= control.geneticAlgorithm(0.9); //compute genetic algorithm with pCo=0.7
        }
        System.out.println("===================================================");
        System.out.println("Average Number of Generations with pCo=0.9: " + generationTotals/20);
        System.out.println("===================================================");

        System.out.println("pco = 0 runs: ");
        for(int i =1; i<=20; i++)
        {
            System.out.println("-------------------");
            System.out.println("Run: "+i);
            generationTotals+= control.geneticAlgorithm(0); //compute genetic algorithm with pCo=0.7
        }
        System.out.println("===================================================");
        System.out.println("Average Number of Generations with pCo=0: " + generationTotals/20);
        System.out.println("===================================================");
       
    }
    
}
