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
        
        //System.out.println("Initial Population:");
        control.generatePopulation();

        control.geneticAlgorithm();
        control.mutation();
        
        control.printExperimentResults();
    }
    
}
