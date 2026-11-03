import java.util.Scanner;

public class Topic1A1{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        
            int a = 3;
            int n = scan.nextInt();
            int m = scan.nextInt();
            
            double y = Math.pow(a,n)*Math.pow(a,m);
        
        System.out.println("the result is "+(int)y);
    } 
}