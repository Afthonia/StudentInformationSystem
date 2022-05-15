package Practices.StudentInformationSystem;

public class Teacher {
    private String name;
    private String phoneNo;
    private String branch;

    Teacher(String name, String branch, String phoneNo) {
        this.name = name;
        this.branch = branch;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNo);
        System.out.println("Branch: " + branch);
    }
}
