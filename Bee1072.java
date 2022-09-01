import java.util.Scanner;
import java.io.IOException;

public class Bee1072 {

    public static void main(String args[]) throws IOException{
        Scanner input = new Scanner(System.in);

        int amountIntergerValues = input.nextInt();
        int value, in=0, out=0;

        for(int count=0; count<amountIntergerValues;count++){
            value = input.nextInt();
            if(value>=10 && value<=20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
