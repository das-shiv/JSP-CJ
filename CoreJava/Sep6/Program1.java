class Program1 {

    {
        int a = 10;
        System.out.println(a);
        System.out.println("Non static initializer");
    }

    public static void main(String[] args) {

        Program1 p = new Program1();
    }

    {


        System.out.println("Good afternoon");
    }

}