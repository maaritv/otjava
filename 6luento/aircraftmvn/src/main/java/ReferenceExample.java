import models.library.Author;
import models.library.Book;

/**
 * OLIO-OHJELMOINTI I
 *
 * - Luokkien määrittely ja käyttäminen oliohierarkian luomiseen.
 * - Olioviittauksen syntyminen. Kaksi luokkaa jakaa saman ilmentymän
 *   toisesta luokasta. (Kahdella kirjailijalla on sama kirjailija)
 */


public class ReferenceExample {
    public static void main(String[] args) {

        System.out.println("Luodaan yksi ilmentymä kirjailijasta!");

        Author author=new Author();
        author.setFirstName("Miia");
        author.setLastName("Vuorinen");
        author.setNationality("FI");

        System.out.println("Luodaan kaksi hänen kirjoittamaansa kirjaa!");

        Book bookA = new Book();
        bookA.setAuthor(author);
        bookA.setName("Oudon tien salaisuus");
        bookA.setBackCoverText("Tosi jännä tarina");

        Book bookB = new Book();
        bookB.setAuthor(author);
        bookB.setName("Kummallisen kujan arvoitus");
        bookB.setBackCoverText("Jatko-osa oudon tien arvoitukseen.");

        System.out.println(bookA);
        System.out.println(bookB);

        System.out.println("Vaihdamme kirjan A kirjailijan sukunimen Kallioksi.");
        System.out.println("Huomataan, että se vaihtuu molempiin kirjoihin.");
        System.out.println("Koska molemmat kirjat sisältävät viittauksen samaan kirjailijailmentymään.");
        bookA.getAuthor().setLastName("Kallio");

        System.out.println(bookA);
        System.out.println(bookB);
    }
}