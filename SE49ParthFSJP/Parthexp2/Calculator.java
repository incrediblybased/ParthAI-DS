class Calculator {
    int num1, num2;

    Calculator() {
        System.out.println("Welcome to Calculator!");
    }

    Calculator(int a, int b) {
        num1 = a;
        num2 = b;
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    void add() {
        int a = 5, b = 10;
        int summation = a + b;
        System.out.println("Sum of " + a + " and " + b + " is : " + summation);
    }

    void add(int a, int b) {
        int summation1 = a+b;
        System.out.println("Sum of " + a + " and " + b + " is : " + summation1);

    }

    void add(float a, float b, float c) {
        float summation2 = a+b+c;
        System.out.println("Sum of " + a + " and " + b + " and " + c + " is : " + summation2);

        
    }
}
