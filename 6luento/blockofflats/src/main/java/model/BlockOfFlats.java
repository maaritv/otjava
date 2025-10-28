
import java.util.ArrayList;
import java.util.List;

public class BlockOfFlats {

    private List<Apartment> apartments = new ArrayList<Apartment>();
    private String address;
    private double width;
    private double height;
    private double length;

    public BlockOfFlats(String address, double width, double height, double length) {
        this.apartments = new ArrayList<>();
        this.address = address;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public BlockOfFlats() {

    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public String getAddress() {
        return address;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "BlockOfFlats{"
                + "apartments=" + apartments.size() + " kappaletta "
                + ", address='" + address + '\''
                + ", width=" + width
                + ", height=" + height
                + ", length=" + length
                + "\n\napartments\n" + apartments
                + '}';
    }

    public static BlockOfFlats createBlockOfFlatsWithApartments(int numberOfApartments) {
        if (numberOfApartments < 0) {
            throw new IllegalArgumentException("Asuntojen määrä ei voi olla negatiivinen!");
        }
        System.out.println("Tehdään uusi kerrostalo halutulla määrällä asuntoja!");
        BlockOfFlats house = new BlockOfFlats();
        System.out.println(house + "\n");

        for (int i = 0; i < numberOfApartments; i++) {
            Apartment apartment = new Apartment();
            house.addApartment(apartment);
        }
        return house;
    }

}
