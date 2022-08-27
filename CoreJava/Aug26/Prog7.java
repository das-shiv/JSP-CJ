import java.util.Scanner;

class Prog7
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the option");

        char alphabet = s.next().charAt(0);
        switch(alphabet){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The given alphabet is vowel");
                break;
                default:
                System.out.println("The given alphabet is consonent");



        }

    }

}