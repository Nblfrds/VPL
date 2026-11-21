import java.util.Scanner;

public class Topic4A2{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int thresholdf = scan.nextInt();
        int numsofdatasets = scan.nextInt();
        int currentdataset = 1;
        int SumMax=0;
        if(numsofdatasets>0){
            while(currentdataset<=(numsofdatasets)){
                int userinput = scan.nextInt();
            
                while(userinput!=-1){
                    SumMax+=userinput;
                    userinput=scan.nextInt();
                }
                if(SumMax>thresholdf){
                    System.out.println("Setdata "+currentdataset+ " with sum = "+SumMax+" greater than "+thresholdf);
                }else{
                    System.out.println("Setdata "+currentdataset+ " with sum = "+SumMax+" lower than "+thresholdf);
                }
                currentdataset++;
                SumMax=0;
            }
        }else{
            System.out.println("Invalid number of dataset");
        }
        scan.close();
    }
}