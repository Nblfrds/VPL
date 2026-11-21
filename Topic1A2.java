import java.util.Scanner;

public class Topic1A2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        final int bpenprice = 6 ;
        final int bbookprice = 2;
        final int spenprice = 8;
        final int sbookprice = 5;
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        
        int modal = bpenprice*x + bbookprice*y;
        int sell = spenprice*x + sbookprice*y;
        int profit = sell-modal;
        
        System.out.printf("RM%.2f\n", (double)profit);
    }
}