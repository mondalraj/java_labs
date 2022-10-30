class variable {
    int showinglocalvariables() {
        int lv1 = 10;
        int lv2 = 5;
        System.out.println("Multiplication is : " + (lv1 * lv2));
        return (0);
    }

    public static void main(String args[]) {
        System.out.println("!!! Implementing Local Variables !!!");
        System.out.println("-> Multiplication of two Local Variables !!!");
        variable v = new variable();
        v.showinglocalvariables();
    }
}
