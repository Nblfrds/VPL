import java.util.Scanner;
import java.text.DecimalFormat;

public class Topic3A3{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.0");
        
        int NumOfStudents = scan.nextInt();
        int Marks = 0;
        int GradeA=0, GradeB=0, GradeC=0, GradeD=0, GradeE=0, GradeF=0;
        double SumGradeA = 0.00, SumGradeB = 0.00, SumGradeC = 0.00, SumGradeD = 0.00, SumGradeE = 0.00, SumGradeF = 0.00;
        double AverageGradeA = 0.00, AverageGradeB = 0.00, AverageGradeC = 0.00, AverageGradeD = 0.00, AverageGradeE = 0.00, AverageGradeF = 0.00;
        
        while(NumOfStudents>0){
            int Totals = 0;
            for(int i=1; i<4;i++){
                Marks = scan.nextInt();
                Totals = Totals + Marks;
            }
            if(Totals>=90){
                GradeA++;
                SumGradeA += Totals;
            }else if(Totals>=80){
                GradeB++;
                SumGradeB += Totals;
            }else if(Totals>=70){
                GradeC++;
                SumGradeC += Totals;
            }else if(Totals>=60){
                GradeD++;
                SumGradeD += Totals;
            }else if(Totals>=50){
                GradeE++;
                SumGradeE += Totals;
            }else{
                GradeF++;
                SumGradeF += Totals;
            }
    
            NumOfStudents--;
        }
        
        AverageGradeA= (GradeA==0)? 0.0 :(double)SumGradeA/GradeA;
        AverageGradeB= (GradeB==0)? 0.0 :(double)SumGradeB/GradeB;
        AverageGradeC= (GradeC==0)? 0.0 :(double)SumGradeC/GradeC;
        AverageGradeD= (GradeD==0)? 0.0 :(double)SumGradeD/GradeD;
        AverageGradeE= (GradeE==0)? 0.0 :(double)SumGradeE/GradeE;
        AverageGradeF= (GradeF==0)? 0.0 :(double)SumGradeF/GradeF;
        
        System.out.println("Grade A: "+GradeA+" student(s)");
        System.out.println("Average Mark of Grade: "+f.format(AverageGradeA));
        System.out.println("");
        System.out.println("Grade B: "+GradeB+" student(s)");
        System.out.println("Average Mark of Grade: "+f.format(AverageGradeB));
        System.out.println("");
        System.out.println("Grade C: "+GradeC+" student(s)");
        System.out.println("Average Mark of Grade: "+f.format(AverageGradeC));
        System.out.println("");
        System.out.println("Grade D: "+GradeD+" student(s)");
        System.out.println("Average Mark of Grade: "+f.format(AverageGradeD));
        System.out.println("");
        System.out.println("Grade E: "+GradeE+" student(s)");
        System.out.println("Average Mark of Grade: "+f.format(AverageGradeE));
        System.out.println("");
        System.out.println("Grade F: "+GradeF+" student(s)");
        System.out.println("Average Mark of Grade: "+f.format(AverageGradeF));
        
    }
}