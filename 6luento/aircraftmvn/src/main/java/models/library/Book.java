package models.library;

public class Book implements Cloneable {

    private Integer id;
    private String Isbn;
    private String name;
    private Author author;
    private Genre genre;
    private String backCoverText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    

    public String getBackCoverText() {
        return backCoverText;
    }

    public void setBackCoverText(String backCoverText) {
        this.backCoverText = backCoverText;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Isbn='" + Isbn + '\'' +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", backCoverText='" + backCoverText + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
