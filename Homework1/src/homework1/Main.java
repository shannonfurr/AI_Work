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
        int generations = 0;
        
        
        control.generatePopulation();
        generations++;

        control.geneticAlgorithm();
       
        System.out.println("Population Generated");
    }
    
}
