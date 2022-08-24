class Program3
{
    static int a=10; //global variable
    public static void main(String[] args) {

        int a=20; //local variable, has priority over GV
        System.out.println(a);
        System.out.println(a);


    }
}