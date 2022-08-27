import java.util.Scanner;

class Prog2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter name");
        String name = s.nextLine();
        System.out.println("Enter age");
        int age = s.nextInt();
        System.out.println("Enter gender");
        char gender = s.next().charAt(0);
        System.out.println("-------------");

        System.out.println(name +" "+ age + " " + gender);

    }
}