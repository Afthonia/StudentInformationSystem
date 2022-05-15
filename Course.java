package Practices.StudentInformationSystem;

public class Course {
    private String name;
    private String code;
    private String prefix;
    private int score;
    private int viva;
    Teacher teacher;


    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getViva() {
        return viva;
    }

    public void setViva(int viva) {
        this.viva = viva;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.getBranch().equals(prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("This teacher cannot give this course.");
        }
    }

    public void printTeacherInfo() {
        teacher.print();
    }
}