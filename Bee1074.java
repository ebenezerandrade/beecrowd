import java.util.Scanner;
import java.io.IOException;

public class Bee1074 {

    public static void main(String args[]) throws IOException{
        Scanner input = new Scanner(System.in);

        int numberCases = input.nextInt();
        int value=0;

        for(int count=1; count<=numberCases ; count++){
            value = input.nextInt();
            if (value == 0){
                System.out.println("NULL");
            } else if(value%2==0){
                if (value>0){
                    System.out.println("EVEN POSITIVE");
                }else{
                    System.out.println("EVEN NEGATIVE");
                }
            } else{
                if (value>0){
                    System.out.println("ODD POSITIVE");
                }else{
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
    }
}
