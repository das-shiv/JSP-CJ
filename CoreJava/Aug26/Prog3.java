import java.util.Scanner;

class Prog3{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

       // System.out.println("Enter age");
        //int age = s.nextInt();

        System.out.println("Enter name");
        String name1= s.next();

        System.out.println("Enter name");
        String name = s.nextLine();

        System.out.println(name1+ " " +name);
    }
}