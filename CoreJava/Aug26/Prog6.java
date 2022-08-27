import java.util.Scanner;

class Prog6
{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the option");
        int option = s.nextInt();

        switch(option){ //variables
            case 1:  //pass option
                System.out.println("1 is executing");
                break;
            case 2:
                System.out.println("2 is executing");
                break;
            case 3:
                System.out.println("3 is executing");
                break;
            case 4:
                System.out.println("4 is executing");
                break;

            default:
                System.out.println("Invalid option");

        }



    }
}