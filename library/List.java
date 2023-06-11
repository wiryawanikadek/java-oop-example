abstract class List {
    abstract void addBook(Book book); 
    abstract void addMember(Member member);
    abstract Boolean isBookIdExist(String id);
    abstract Boolean isMemberIdExist(String id);
    abstract void giveBook(String bookId, String memberId);
    abstract void receiveBook(String bookId, String memberId);
     // Overloaded method
    abstract Book getBookById(String id);
  }
  