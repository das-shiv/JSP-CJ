import java.util.Scanner;// 1st step

class Prog1{
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);//2nd step
        System.out.println("Enter the number");
        int a = s.nextInt();//call method with refernce of scanner object

        System.out.println("Enter long");
        long b=  s.nextLong();

        System.out.println("Enter String data");
        String c = s.next();

        System.out.println("-------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }
}