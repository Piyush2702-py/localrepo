class University {

    String universityName;
    String location;

    University(String uname, String loc) {
        universityName = uname;
        location = loc;
    }

    class Department {
        String deptName;
        String hodName;

        Department(String dname, String hod) {
            deptName = dname;
            hodName = hod;
        }

        void display() {
            System.out.println("University Name: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department Name: " + deptName);
            System.out.println("HOD Name: " + hodName);
        }
    }

    void createDepartment() {
        Department d = new Department("Computer Science", "Dr. Sharma");
        d.display();
    }

    public static void main(String[] args) {
        University u = new University("ABC University", "Delhi");
        u.createDepartment();
    }
}
