import java.util.Scanner;
class Prog3{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the initial number");
        int m = s.nextInt();

        System.out.println("Enter the ending number");
        int n= s.nextInt();

        System.out.println("The even numbers are:");

        while(m<=n)
        {
            if(m%2==0)
            {
                System.out.println(m);
            }
            m++;
        }


    }
}