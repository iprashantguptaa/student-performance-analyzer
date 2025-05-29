public class Student extends Person {
    private Subject[] subjects;
    private int totalMarks;
    private float average;

    public Student(String name, int rollNo, Subject[] subjects) {
        super(name, rollNo);
        this.subjects = subjects;
        calculateTotalAndAverage();
    }

    private void calculateTotalAndAverage() {
        totalMarks = 0;
        for (int i = 0; i < subjects.length; i++) {
            totalMarks = totalMarks + subjects[i].getMarks();
        }
        average = (float) totalMarks / subjects.length;
    }

    public void displayReport() {
        showDetails();
        System.out.println("Marks Obtained:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i].getSubjectName() + ": " + subjects[i].getMarks());
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        if (isPass()) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        System.out.println("---------------------------");
    }

    private boolean isPass() {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].getMarks() < 33) {
                return false;
            }
        }
        return true;
    }
}