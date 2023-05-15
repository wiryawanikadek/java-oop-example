//saya mengisi komen di github 

import java.util.Scanner;
import java.util.InputMismatchException;

class Main {

  static Scanner scan = new Scanner(System.in);
  static Library library = new Library();

  public static void main(String[] args) {
    initLibraryData();

    String isContinue = "y";

    while (isContinue.equals("y")) {
      showMenu();
      int selectedMenu = chooseMenu();

      if (selectedMenu == 1) {
        showBooks();
      } else if (selectedMenu == 2) {
        addBook();
      } else if (selectedMenu == 3) {
        showMembers();
      } else if (selectedMenu == 4) {
        addMember();
      } else if (selectedMenu == 5) {
        borrowBook();
      } else if (selectedMenu == 6) {
        returnBook();
      } else {
        System.out.println("wrong input");
      }

      System.out.print("continue ? ");
      isContinue = scan.next();
    }
  }

  public static void showMenu() {
    System.out.println("================================");
    System.out.println("1. show books list");
    System.out.println("2. add book");
    System.out.println("3. show members list");
    System.out.println("4. add member");
    System.out.println("5. borrow book");
    System.out.println("6. return book");
    System.out.println("================================");
  }

  public static void initLibraryData() {
    Book book1 = new Book();
    book1.id = "1";
    book1.title = "pemrograman java";

    Book book2 = new Book();
    book2.id = "2";
    book2.title = "pemrograman oop";

    Book book3 = new Book();
    book3.id = "3";
    book3.title = "pemrograman android";

    Member member1 = new Member();
    member1.id = "1";
    member1.name = "aka";

    Member member2 = new Member();
    member2.id = "2";
    member2.name = "budi";

    Member member3 = new Member();
    member3.id = "3";
    member3.name = "tono";

    library.books.add(book1);
    library.books.add(book2);
    library.books.add(book3);

    library.members.add(member1);
    library.members.add(member2);
    library.members.add(member3);
  }

  public static int chooseMenu() {
    int pilihan = 0;
    boolean validInput = false;
    
    while (!validInput) {
        try {
            System.out.print("choose menu : ");
            pilihan = scan.nextInt();
            validInput = true;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scan.next(); // clear scanner buffer
        }
    }
    
    return pilihan;
}

  public static void showBooks() {
    for (Book book : library.books) {
      System.out.println(book.id + " " + book.title);
    }
  }

  public static void addBook() {
    Book book = new Book();

    System.out.print("id : ");
    book.id = scan.next();

    System.out.print("title : ");
    book.title = scan.next();

    library.addBook(book);
  }

  public static void showMembers() {
    for (Member member : library.members) {
      System.out.println(member.id + " " + member.name);
    }
  }

  public static void addMember() {
    Member member = new Member();

    System.out.print("id : ");
    member.id = scan.next();

    System.out.print("name : ");
    member.name = scan.next();

    library.addMember(member);
  }

  public static void borrowBook() {
    try {
      System.out.print("id member : ");
      String memberId = scan.next();
  
      System.out.print("id book : ");
      String bookId = scan.next();
  
      library.giveBook(memberId, bookId);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Terjadi error pada inputan");
    }
  }

  public static void returnBook() {
    try {
      System.out.print("id member : ");
      String memberId = scan.next();
  
      System.out.print("id book : ");
      String bookId = scan.next();
  
      library.receiveBook(memberId, bookId);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Terjadi error pada inputan");
    }
  }
}