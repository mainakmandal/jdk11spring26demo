package ibm.com.demo.service;

import java.util.HashSet;
import ibm.com.demo.modal.Book;
  
public interface BookService {
     HashSet<Book> findAllBook();
     Book findBookByID(long id);
     void addBook(Book b);
     void deleteAllData();
}