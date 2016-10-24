package demo;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 152033b on 10/24/2016.
 */
public class BookDBAO {
    // get book details given the bookId
    // this method is dummy for now
    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }

    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }

    public List<BookDetails> getAllBookCatalogs() {
        ArrayList<BookDetails> list = new ArrayList<BookDetails>();
        for (int i = 0; i < 6; i++) {
            BookDetails details = new BookDetails();
            details.setBookId("" + i);
            details.setDescription("Book Description: " + i);
            details.setFirstName("First Name: " + i);
            details.setSurname("Surname: " + i);
            details.setInventory(i);
            details.setOnSale(true);
            details.setPrice(1.0f + i);
            details.setTitle("Book Title" + 1);
            details.setYear(2015 + i);
            list.add(details);
        }
       return list;
    }


}
