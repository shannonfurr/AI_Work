// Artificial Intelligence
// Homework1

package homework1;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Controller control = new Controller();
        
        double pCo = 0.7; //percentage crossover
        String crossoverMask = "1111100000";
        
        control.generatePopulation(); //generates 20 10-bit chromosomes

        control.geneticAlgorithm(); 
        //control.crossover(pCo); //performs crossover on population with given pCo
        control.mutation(); //performs mutation on the population
        
        control.printExperimentResults();
    }
    
}
