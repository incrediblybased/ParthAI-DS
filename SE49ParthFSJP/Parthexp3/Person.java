class Person {
    String name;
    int age;

    void setPersonDetails(String n, int a) {
        name = n;
        age = a;
    }

    // Display person details 
    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}