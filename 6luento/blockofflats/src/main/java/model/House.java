import java.lang.String;
import java.util.List;
import java.util.ArrayList;

public class House {

  private String address;
  private Integer builtYear;
  private String builder;
  private Double width;
  private Double height;
  private Double length;
  private Integer numberOfFloors;
  private List<Room> rooms = new ArrayList<Room>();

  public House(String address, Double width, Double height, Double length) {
    this.address = address;
    this.width = width;
    this.height = height;
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
    return "Address:\t" + this.address + "\nWidth:\t" + this.width + "\nHeight:\t" + this.height + "\nLength:\t"
        + this.length + "\nHuoneita:\t" + this.rooms.size();
  }

}