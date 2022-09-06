class PanCard
{
    String name;
    int panno;
    String type;
    public void panDetails()
    {
        System.out.println(name);
        System.out.println(panno);
        System.out.println(type);
    }

    public static void main(String[] args) {
        PanCard p = new PanCard();
        p.name = "Teddy";
        p.panno = 467476873;
        p.type = "Personal";
        p.panDetails();
    }
}