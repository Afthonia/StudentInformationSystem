package Practices.StudentInformationSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    private String name;
    private String studNo;
    private String classes;
    private double average;
    private boolean isPassed;

    Student(String name, String studNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studNo = studNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPassed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudNo() {
        return studNo;
    }

    public String getClasses() {
        return classes;
    }


    public void addBulkExamNote(int score1, int score2, int score3) {
        if (score1 >= 0 && score1 <= 100) {
            c1.setScore(score1);
        }
        if (score2 >= 0 && score2 <= 100) {
            c2.setScore(score2);
        }
        if (score3 >= 0 && score3 <= 100) {
            c3.setScore(score3);
        }
    }

    void isPassed() {
        double c1Avg = (c1.getScore() * 0.80) + (c1.getViva() * 0.20);
        double c2Avg = (c2.getScore() * 0.80) + (c2.getViva() * 0.20);
        double c3Avg = (c3.getScore() * 0.80) + (c3.getViva() * 0.20);

        average = (c1Avg + c2Avg + c3Avg) / 3.0;

        if (average > 55) {
            System.out.println("The student has passed! ");
            isPassed = true;
        } else {
            System.out.println("The student has failed :(");
            isPassed = false;
        }
        printNote();
        System.out.println("Your average is " + average);
    }

    public void printNote() {
        System.out.println(c1.getName() + " score is " + c1.getScore() + ", viva is " + c1.getViva());
        System.out.println(c2.getName() + " score is " + c2.getScore() + ", viva is " + c2.getViva());
        System.out.println(c3.getName() + " score is " + c3.getScore() + ", viva is " + c3.getViva());
    }
}