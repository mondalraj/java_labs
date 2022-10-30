class calculator {
    static int a = 10;
    static int b = 5;
    static char airth = '+';

    public static void main(String args[]) {
        System.out.println("-> A is : " + a);
        System.out.println("-> B is : " + b);
        switch (airth) {
            case '+':
                System.out.println("Performing Addition");
                System.out.println("Addition of A and B is : " + (a + b));
                break;
            case '-':
                System.out.println("Performing Subtraction");
                System.out.println("Subtraction of A and B is : " + (a - b));
                break;
            case '*':
                System.out.println("Performing Multiplication");
                System.out.println("Multiplication of A and B is : " + (a * b));
                break;
            case '/':
                System.out.println("Performing Division");
                System.out.println("Addition of A and B is : " + (a / b));
                break;
        }
    }
}
