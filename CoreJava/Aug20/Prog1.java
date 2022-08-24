class Prog1
{
    public static void main(String[] args) {

        int a=7;
        int b=9;
        int res= a+ --a + ++b + a++ + a++;
        System.out.println(res);
        System.out.println(a);
        System.out.println(b);

    }
}