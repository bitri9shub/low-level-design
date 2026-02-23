package object_oriented_programming_recap.poo_relations;

public class AssociationExample {

    static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class Teacher {
        private String name;

        public Teacher(String name) {
            this.name = name;
        }

        public String isTeaching(Student student) {
            return this.name + " is teaching " + student.getName();
        }
    }

    public static void main(String[] args) {
        Student student = new Student("karim");
        Teacher teacher = new Teacher("morad");

        System.out.println(teacher.isTeaching(student));
    }
}