import java.lang.String;
import java.util.List;
import java.util.ArrayList;

public class Apartment {

  private String owner;
  private Double width;
  private Double length;
  private Integer floor;
  private List<Room> rooms = new ArrayList<Room>();

  public Apartment(String owner, Double width, Double length) {
    this.owner = owner;
    this.width = width;
    this.length = length;
  }

  public void addRoom(Room room) {
    this.rooms.add(room);
  }

  public List<Room> getRooms() {
    return this.rooms;
  }

  public Double calculateArea() {
    return this.width * this.length;
  }

  public String toString() {
    return "owner:\t" + this.owner + "\nWidth:\t" + this.width + "\nLength:\t" + this.length + "\nHuoneita:\t"
        + this.rooms.size();
  }

}