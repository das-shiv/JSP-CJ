import java.util.Scanner;
class Prog3
{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the starting number");
        int m = s.nextInt();

        System.out.println("Enter the endding number");
        int n = s.nextInt();

        int sum=0;

        System.out.println("The sum of natural numbers are");

        do{
            sum = sum+m;
            m++;
        }
        while(m<=n);
        System.out.println(sum);

    }
}