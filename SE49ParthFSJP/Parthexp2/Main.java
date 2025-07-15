public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();

        Calculator calc2 = new Calculator(15, 25);

        calc1.add();                    
        calc1.add(20, 30);              
        calc1.add(12.5f, 15.5f, 10.0f); 

    }
}
