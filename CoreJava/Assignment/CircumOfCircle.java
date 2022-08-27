class CircumOfCircle{

    public static double findCircum(double r){
        double circum = 2*3.14*r;
        return circum;
    }


    public static void main(String[] args) {

        double circumference = findCircum(2.2);
        System.out.println("The circumference of the circle is:"+circumference);

    }
}