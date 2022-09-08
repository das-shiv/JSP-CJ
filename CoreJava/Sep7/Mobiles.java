class Mobiles
{
    String brand;
    String color;
    double cost;

    Mobiles(String b, String c,double c1 )
    {
        brand = b;
        color = c;
        cost = c1;

    }

    public void mobileDetails()
    {
        System.out.println(brand);
        System.out.println(color);
        System.out.println(cost);
    }


    public static void main(String[] args) {

        Mobiles m = new Mobiles("iPhone", "Silver", 50000);
        m.mobileDetails();


    }
















}