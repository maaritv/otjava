import models.library.Author;
import models.library.Book;

/**
 * OLIO-OHJELMOINTI II.
 * - Kloonaus luo kopion kirjan kaikista muista jäsenfunktioista, paitsi
 *   kirjailijasta, joka on luokka.
 * - Alkuperäisen kirjan KIRJAILIJAN muuttaminen muuttaa näin ollen myös
 *   kopiokirjan kirjailjiaa, mutta ei muita jäsenmuuttujia.
 *
 */

public class TestCloneBooksAndAuthors {


    public static void main(String args[]) throws CloneNotSupportedException {

        Book firstBook = new Book();
        firstBook.setId(1);
        firstBook.setName("Pieni merenneito");
        firstBook.setBackCoverText("Aika surullinen tarina.");

        Author anderssen = new Author();
        anderssen.setNationality("dk");
        anderssen.setFirstName("H C");
        anderssen.setLastName("Anderssen");

        firstBook.setAuthor(anderssen);

        Book shallowCopy = (Book) firstBook.clone();

        firstBook.setName("Pieni merenneito II");
        firstBook.setId(10);
        firstBook.getAuthor().setNationality("tanskalainen");

        System.out.println(shallowCopy);
    }
}
