package object_oriented_programming_recap.poo_relations;

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {
    static class Professor {
        private String name;

        public Professor(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class Department {
        private String name;
        private List<Professor> professors;

        public Department(String name, List<Professor> professors) {
            this.name = name;
            this.professors = professors;
        }

        public void showProfessors() {
            System.out.println("Department: " + this.name);
            for (Professor prof : professors) {
                System.out.println("    - " + prof.getName());
            }
        }
    }

    public static void main(String[] args) {
        Professor professor_1 = new Professor("achraf");
        Professor professor_2 = new Professor("akram");
        
        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(professor_1);
        professors.add(professor_2);
        
        Department department = new Department("Mathematics", professors);
        
        department.showProfessors();
    }
}
