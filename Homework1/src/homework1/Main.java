// Artificial Intelligence
// Homework1

package homework1;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Controller control = new Controller();
        
        control.generateInitialPopulation(); //randomly generates 20 10-bit chromosomes
        
        int generationTotals=0;
        
        for(int i =0; i<20; i++)
        {
            System.out.println("============================================================");
            generationTotals+= control.geneticAlgorithm(0.7); //compute genetic algorithm with pCo=0.7
        }
        System.out.println("============================================================");
        System.out.println("Average Number of Generations: " + generationTotals/20 +"\n");
        
    //Part 2:
        //control.geneticAlgorithm(0.3);
        //control.geneticAlgorithm(0.5);
        //control.geneticAlgorithm(0.9);
        //control.geneticAlgorithm(0);
        
       
    }
    
}
