import java.util.Scanner;
class Prog5
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();
        int count = 0;

        for(int i=1; i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }

        }
        if(count==2)
        {
            System.out.println("The number is prime");
        }
        else {
            System.out.println("The number is not prime");
        }
    }
}