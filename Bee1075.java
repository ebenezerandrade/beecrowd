import java.util.Scanner;
import java.io.IOException;

public class Bee1075 {

    public static void main(String args[]) throws IOException{
        Scanner input = new Scanner(System.in);

        int value = input.nextInt();
        for(int count=1; count < 10000; count++){
            if(count%value==2){
                System.out.println(count);
            }
        }

    }
}
