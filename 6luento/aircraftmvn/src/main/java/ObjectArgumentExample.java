import models.library.Author;
import models.library.Book;

public class ObjectArgumentExample {

    /**
     * OLIO-OHJELMOINTI I
     * - Olioviittaukset.
     */

    public static void modifyAuthor(Author author) {
        //luodaan uusi ilmentymä kirjailijasta, joten
        //yhteys alkuperäiseen kirjailijailmentymään
        //katkeaa. Jos tätä ei tehtäisi. Muutos kohdistuisi
        //kutsuvan funktion tarjoamaan kirjailijailmentymään.
       author = new Author();
       author.setFirstName("Kirjailijaa on muutettu!");
    }

    /**
     * Muokataan argumenttina saadun kirjan jäsenmuuttujaa.
     * Muutos välittyy myös alkuperäiseen book-olioon!
     *
     * @param book
     */
    public static void modifyAuthorOfBook(Book book) {
        book.getAuthor().setFirstName("Kirjan kirjailijaa on muutettu!");
    }


    public static void main(String[] args){
        Author enid = new Author();
        enid.setFirstName("Enid");
        enid.setLastName("Blyton");
        modifyAuthor(enid);
        System.out.println("Kirjailijan Nimi on edelleen "+enid.getFirstName());

        Book book=new Book();
        book.setName("Viisikko Karkuteillä");
        book.setAuthor(enid);
        modifyAuthorOfBook(book);
        System.out.println("Kirjailijan Nimi onkin nyt "+book.getAuthor().getFirstName());
    }
}
