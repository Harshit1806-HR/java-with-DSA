import java.util.Scanner;

public class loop{
    public static void main (String[]args){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        {
            //find the largest 3 numbers ;
            
            // int max = a;
            // if(b > max){
            //     max = b;
            //     };
            
            // if(c > max){
            //     max = c;
            //     };
            // System.out.println(max);

            int n = 45534515;  //to find the number of 5's in the given number
            int count = 0;
            while(n > 0){
                int rem = n % 10;
                if (rem == 5){
                    count++;
                }
                n = n / 10;
            }
            System.out.println(count);
        }
    }
}