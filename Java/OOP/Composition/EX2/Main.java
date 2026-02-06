import java.util.ArrayList;
import java.util.List;

class Room {
    private String name;
    private House house;  // Reference to the house it belongs to

    public Room(String name, House house) {
        this.name = name;
        this.house = house;  // Set house reference upon creation
    }

    public String getName() {
        return name;
    }

    public House getHouse() {
        return house;
    }
}

class House {
    private List<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
        addRoom("Living Room");
        addRoom("Bedroom");
        addRoom("Kitchen");
    }

    private void addRoom(String roomName) {
        Room room = new Room(roomName, this);  // Each room knows its house
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        House house = new House();

        // Display rooms in the house
        for (Room room : house.getRooms()) {
            System.out.println("House has room: " + room.getName());
        }

        // If house is destroyed, rooms are also destroyed
        house = null; // House is destroyed

        // Trying to access rooms will cause an error because they are tied to the house lifecycle
        // System.out.println(house.getRooms()); // Uncommenting this line will cause a NullPointerException
    }
}