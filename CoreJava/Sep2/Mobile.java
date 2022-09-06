class Mobile
{
    String brand; //NonStatic varaible
    int ram;

    public void mobileDetails() //NonStatic method
    {
        System.out.println(brand);
        System.out.println(ram);
    }
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m1.brand = "iPhone";
        m1.ram = 8;

        m2.brand = "OnePlus";
        m2.ram = 12;

        m1.mobileDetails();
        m2.mobileDetails();
    }
}