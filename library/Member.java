// prinsip encapsulation 
import java.util.ArrayList;

class Member {
  private String id;
  private String name;
  public ArrayList<Book> borrowedBooks = new ArrayList<Book>();

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void receiveBook(Book book) {
    this.borrowedBooks.add(book);
  }

  public void giveBook(Book book) {
    this.borrowedBooks.remove(book);
  }

public Book getBookById(String bookId) {
  for (Book book : this.borrowedBooks) {
    if (book.Id().equals(bookId)) {
      return book;
    }
  }
  System.out.println("Terjadi kesalahan memasukkan id book");
  return null;
  }
}

// Kelas Member menggunakan prinsip encapsulation 
// dengan menggunakan akses modifier private pada atribut-atributnya (misalnya id, name dan, borrowedBooks). 
// Atribut-atribut tersebut hanya dapat diakses melalui metode-metode yang ditentukan (setter dan getter) sehingga data dalam objek 
// tersebut terlindungi dan tidak dapat diubah langsung.
