import java.util.Scanner;
import java.text.DecimalFormat;

public class Topic3A2{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        
        int NumOfStudents = scan.nextInt();
        int Totals = 0;
        double Average = 0.0;
        int Fail = 0;
        double percentage = 0.00;
        int TotalStudent = NumOfStudents;
        int Success = 0;
        
        while(NumOfStudents>0){
            int steps = scan.nextInt();
            Totals = Totals + steps;
            NumOfStudents--;
            
            if(steps<10000){
                Fail++;
            }else{
                Success++;
            }
            
        }
        Average=(double)Totals/TotalStudent;
        percentage =((double)Success/TotalStudent)*100;
        scan.close();
        
        System.out.println("=WALKING CHALLENGE SUMMARY=");
        System.out.println("Total steps: "+Totals);
        System.out.println("Average steps: "+ f.format(Average));
        System.out.println("Students achieved target: "+Success);
        System.out.println("students did not achieve target: "+Fail);
        System.out.println("Percentage achieved: "+f.format(percentage)+"%");
    }
}