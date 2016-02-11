// Artificial Intelligence
// Homework1

package homework1;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {

        String[] population = new String[20];

        for(int i=0; i<20; i++)
        {
            population[i] = generateChromosome();
        }

        System.out.println("Population Generated");
    }

    public static String generateChromosome()
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
}
