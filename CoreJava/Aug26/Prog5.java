import java.util.Scanner;

class Prog5{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the option");
        char a = s.next().charAt(0);

        switch(a)
        {
            case 'A': System.out.println("Alphabet a");
                break;
            case 'B': System.out.println("Alphabet b");
                break;
            case 'C': System.out.println("Alphabet c");
                break;
            default : System.out.println("Invalid option");
        }


    }
}