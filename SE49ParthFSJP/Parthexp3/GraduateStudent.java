class GraduateStudent extends Student {
    int graduationYear;

    void setGraduateStudentDetails(String n, int a, String c, int r, int y) {
        setStudentDetails(n, a, c, r);
        graduationYear = y;
    }

    // Display graudate student details 
    void displayGraduateStudentDetails() {
        displayPersonDetails();
        System.out.println("Graduation Year : " + graduationYear);
    }
}