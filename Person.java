public class Person {
    protected String name;
    protected int rollNo;

    public Person(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}