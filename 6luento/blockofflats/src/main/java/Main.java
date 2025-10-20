
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
    livingroom.setWidth(3.8d);
    livingroom.setLength(2.6d);
    livingroom.setDescription("Juhan Olkkari");
    System.out.println(house + "\n");
    System.out.println("Lisätään huone asuntoon");

    juhaApartment.addRoom(livingroom);
    house.addApartment(juhaApartment);
    
    livingroom.setLength(4.5);
    livingroom.setDescription("Juhan korkeampi olohuone");

    System.out.println(house + "\n");
    //Tulostetaan huoneet talon ensimmäisestä asunnosta.
    //livingroom on lisätty tähän asuntoon, joten sen 
    //huoneisiin voidaan osoittaa alla olevan kaltaisella 
    //komennolla.
    System.out.println(house.getApartments().get(0).getRooms());
  }
}