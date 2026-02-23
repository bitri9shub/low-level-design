package object_oriented_programming_recap.poo_relations;

import java.util.ArrayList;

public class CompositionExample {
    static class Room {
        private String name;

        public Room(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    static class House {
        private ArrayList<Room> rooms;

        public House() {
            rooms = new ArrayList<>();
            rooms.add(new Room("Living Room"));
            rooms.add(new Room("Bedroom"));
        }

        public void showRooms() {
            System.out.println("Rooms:");
            for (Room room : rooms) {
                System.out.println("    - " + room.getName());
            }
        }
    }

    public static void main(String[] args) {
        House house = new House();
        house.showRooms();
    }
}
