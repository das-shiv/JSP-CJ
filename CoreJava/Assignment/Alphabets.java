import java.util.Scanner;
class Alphabets
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting alphabet");
        char m= s.next().charAt(0);

        System.out.println("Enter the ending alphabet");
        char n= s.next().charAt(0);

        System.out.println("The alphabets are");
        while(m<=n)
        {
            System.out.println(m + " ");
            m++;


        }


    }
}