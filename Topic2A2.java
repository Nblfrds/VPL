import java.util.Scanner;
import java.text.DecimalFormat;

public class Topic2A2{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        
        int password = 1234;
        int userpassword = scan.nextInt();
        Double balance = 1000.00;
        Double userdepo = 0.00;
        Double userwithdraw = 0.00;
        
        
        if(password==userpassword){
            String ATMOperation = scan.next();
            
            switch(ATMOperation){
                case "1":
                    balance = balance + 0;
                        System.out.println("Authentication successful!");
                        System.out.println("Your current balance is: RM"+f.format(balance));
                    return;
                    
                    
                case "2":
                    userdepo = scan.nextDouble();
                        if (userdepo>0){
                            System.out.println("Authentication successful!");
                            System.out.println("Successfully deposited: RM"+f.format(userdepo));
                        }else{
                            System.out.println("Authentication successful!");
                            System.out.println("Invalid deposit amount");
                        }
                    return;
                    
                case "3":
                    userwithdraw = scan.nextDouble();
                        if (balance >= userwithdraw && userwithdraw>0){
                            System.out.println("Authentication successful!");
                            System.out.println("successfully withdrew: RM"+f.format(userwithdraw)); 
                            return;
                        }else if(balance < userwithdraw && userwithdraw>0){
                            System.out.println("Authentication successful!");
                            System.out.println("Insufficient funds");
                        }else{
                            System.out.println("Authentication successful!");
                            System.out.println("Invalid withdrawal amount");
                        }
                    return;
                    
                case "4":
                    System.out.println("Authentication successful!");
                    System.out.println("Thank you");
                    return;
                    
                default:
                    System.out.println("Authentication successful!");
                    System.out.println("Invalid option");
            }
            
            
            
        }else{
            System.out.println("Invalid PIN");
            return;
        }
        
    }
}