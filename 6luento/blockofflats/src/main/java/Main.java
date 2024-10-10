
public class Main {
    
    /**
     * Sovellus voidaan rakentaa maven-työkalulla. 
     * clean compile package
     * 
     * ja ajaa Javalla:
     * 
     * java -jar target/blockofflats-1.0-SNAPSHOT.jar  
     * 
     * @param args 
     */
    

  public static void main(String[] args) {
    System.out.println("Tehdään uusi kerrostalo systeemiin!");
    BlockOfFlats house = new BlockOfFlats("Jokitie 8", 10d, 3d, 15d);
    System.out.println(house + "\n");

    Apartment juhaApartment = new Apartment("Juha", 5d, 5d);

    System.out.println("Tehdään huone");
    Room livingroom = new Room();
    livingroom.setWidth(3.4d);
    livingroom.setWidth(4.6d);
    livingroom.setDescription("Juhan Olkkari");
    System.out.println(house + "\n");
    System.out.println("Lisätään huone asuntoon");

    juhaApartment.addRoom(livingroom);
    house.addApartment(juhaApartment);

    System.out.println(house + "\n");
  }
}