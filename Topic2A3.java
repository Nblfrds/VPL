import java.util.Scanner;
import java.text.DecimalFormat;


public class Topic2A3{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        
        String TOV = scan.next();
        Double ParkDuration = scan.nextDouble();
        Double fee = 0.00;
        Double ExtraHours = 0.00;
        String vehicleName = "";
        
        if (ParkDuration <= 0){ 
            System.out.println("Invalid input");
            return;
        }
        switch(TOV){
            case "1":
                if(ParkDuration<= 2){
                    fee = 2.0;
                    vehicleName = "Motorcycle";
                    
                }else{
                    ExtraHours= Math.ceil(ParkDuration-2);
                    fee = 2 + (ExtraHours*1);
                    vehicleName = "Motorcycle";
                }
                break;
                
            case "2":
                if(ParkDuration<= 2){
                    fee = 5.0;
                    vehicleName = "Car";
                    
                }else{
                    ExtraHours= Math.ceil(ParkDuration-2);
                    fee = 5 + (ExtraHours*2);
                    vehicleName = "Car";
                }
                break;
                
            case "3":
                if(ParkDuration<= 2){
                    fee = 8.0;
                    vehicleName = "Van";
                    
                }else{
                    ExtraHours= Math.ceil(ParkDuration-2);
                    fee = 8 + (ExtraHours*3);
                    vehicleName = "Van";
                }
                break;
                
            default:
                System.out.println("Invalid Input");
                return;
        }
        
        System.out.println("++++++++++++++++++++++");
        System.out.println("Gateway Smart Parking");
        System.out.println("++++++++++++++++++++++");
        System.out.println(vehicleName);
        System.out.println(ParkDuration);
        System.out.println("RM "+f.format(fee));
        
    }
}