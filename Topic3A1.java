import java.util.Scanner;
import java.text.DecimalFormat;

public class Topic3A1{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        
        int TotalFlour = 0;
        int HeaviestFlour = 0;
        double AverageFlour = 0.0;
        int s = 0;
        int i = 0;
        
        while (s<10){
            int flour = scan.nextInt();
            
            if(flour>=0 && flour <100){
                if(HeaviestFlour<flour){
                    HeaviestFlour = flour;
                }
                TotalFlour= TotalFlour+flour;
                i++;
            }
            s++;
        }
        AverageFlour= (double)TotalFlour/i;
        scan.close();
        
        System.out.println(" Total kg of flour: "+TotalFlour);
        System.out.println("Average kg of flour: "+f.format(AverageFlour)+"kg");
        System.out.println("Flour sack for Old Folk House A: "+HeaviestFlour+"kg");
    }
}