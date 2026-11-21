import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int funny = 1, serious = scan.nextInt();
        funny = serious * funny;
        switch (funny){
            case 0 :
                System.out.println("that is funny.");
                break;
            case 1:
                System.out.println("that is serious.");
                break;
            case 2:
                System.out.println("that is seriously funny.");
                break;
            default:
                System.out.println(funny);
}
        scan.close();
    }
}