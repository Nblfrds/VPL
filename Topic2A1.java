import java.util.Scanner;
import java.text.DecimalFormat;

public class Topic2A1{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        
        Double heights = scan.nextDouble();
        Double Weights = scan.nextDouble();
        Double BMI = Weights / (Math.pow(heights, 2));
        String bmiresult;
        scan.close();
        
        if(heights<=0 || Weights <=0){
            System.out.println("Invalid Input");
            return;
        }
        
        if (BMI<18.5){
            bmiresult = "Underweight";
        }else if(BMI>=18.5 && BMI <=24.9){
            bmiresult = "Normal";
        }else if(BMI>=25 && BMI <= 29.9){
            bmiresult = "Overweight";
        }else{
           bmiresult = "Obese"; 
        }
        
        System.out.println("Height: " +f.format(heights)+ " m");
        System.out.println("Weight: "+ f.format(Weights)+ " kg");
        System.out.println("BMI: " +f.format(BMI));
        System.out.println("Result: "+ bmiresult);
    }
}