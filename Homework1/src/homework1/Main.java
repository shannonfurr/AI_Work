// Artificial Intelligence
// Homework1

package homework1;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Controller control = new Controller();
        
        double pCo = 0.7; //percentage crossover
        
        control.generateInitialPopulation(); //randomly generates 20 10-bit chromosomes

        for(int i=0; i<19; i++) //running the 'Genetic Algorithm' 20 times
        {
            control.geneticAlgorithm(); 
            control.crossover(0.7); //performs crossover on population with given pCo
            control.mutation(); //performs mutation on the population after crossover
            control.setNewPopulation();
            control.printExperimentResults();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Generations: " + control.getGenerations()+"\n");
        
    //Part 2:
        //control.crossover(0.3);
        //control.mutation();
        //control.printExperimentResults();
        
        //control.crossover(0.5);
        //control.mutation();
        //control.printExperimentResults();
        
        //control.crossover(0.9);
        //control.mutation();
        //control.printExperimentResults();
        
        //control.crossover(0);
        //control.mutation();
        //control.printExperimentResults();
       
    }
    
}
