package src.com.vivamostoles.homework03;

public class Book {
    private String authorLastName;
    private String authorFirstName;
    private String patronymicName;
    private String literaryWork;

    public Book(String authorLastName, String authorFirstName, String patronymicName, String literaryWork) {
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
        this.patronymicName = patronymicName;
        this.literaryWork = literaryWork;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getLiteraryWork() {
        return literaryWork;
    }

    public void setLiteraryWork(String literaryWork) {
        this.literaryWork = literaryWork;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Book book = (Book) object;

        if (authorLastName != null ? !authorLastName.equals(book.authorLastName) : book.authorLastName != null)
            return false;
        if (authorFirstName != null ? !authorFirstName.equals(book.authorFirstName) : book.authorFirstName != null)
            return false;
        if (patronymicName != null ? !patronymicName.equals(book.patronymicName) : book.patronymicName != null)
            return false;
        return literaryWork != null ? literaryWork.equals(book.literaryWork) : book.literaryWork == null;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (authorLastName != null ? authorLastName.hashCode() : 0);
        result = 31 * result + (authorFirstName != null ? authorFirstName.hashCode() : 0);
        result = 31 * result + (patronymicName != null ? patronymicName.hashCode() : 0);
        result = 31 * result + (literaryWork != null ? literaryWork.hashCode() : 0);
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Book{" +
                "authorLastName='" + authorLastName + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", literaryWork='" + literaryWork + '\'' +
                '}';
    }
}
