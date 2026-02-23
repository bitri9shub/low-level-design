package object_oriented_programming_recap.poo_relations;

public class InheritanceExample {
    static class Animal {
        private String name;
        private String sound;

        public Animal(String name, String sound) {
            this.name = name;
            this.sound = sound;
        }

        public String getName() {
            return name;
        }

        public String getSound() {
            return sound;
        }
    }

    static class Dog extends Animal {
        private String name;
        private String sound;

        public Dog(String name, String sound) {
            super(name, sound);
        }

        public void toBark() {
            System.out.println(this.getName() + " is barking: " + this.getSound());
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("myDog", "Woof Woof");
        dog.toBark();
    }
}
