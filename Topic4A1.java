import java.util.Scanner;

public class Topic4A1{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		if (rows%2==0){
		    System.out.print("Invalid input");
		}
		for(int i=0; i<rows; i++) {
			for(int j=0; j<rows;j++) {
				if(i%2==0 && j%2==0 && (j==0||j==rows-1)){
                    System.out.print("+");
                }else if((i==0||i==rows-1)||(j==0||j==rows-1)){
                    System.out.print("-");
                }else{
                    System.out.print(" ");
                }
		    }
        System.out.println();
	    }
		scan.close();
    }
}   