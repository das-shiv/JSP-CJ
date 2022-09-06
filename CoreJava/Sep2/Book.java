class Book
{
    String title;
    int pageno;
    double cost;
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        b1.title = "Harry potter";
        b1.pageno = 400;
        b1.cost = 200.45;

        b2.title = "Song of ice and fire";
        b2.pageno = 500;
        b2.cost = 300.34;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.title);
        System.out.println(b1.pageno);
        System.out.println(b1.cost);
        System.out.println("-------------");
        System.out.println(b2.title);
        System.out.println(b2.pageno);
        System.out.println(b2.cost);
    }
}