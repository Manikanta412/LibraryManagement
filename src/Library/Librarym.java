package Library;

import java.util.ArrayList;
import java.util.Iterator;

public class Librarym {
	
private int libId;
private String location;

private Book b;

private ArrayList<Book> book=new ArrayList<Book>();

//addbook
public void addBook(Book b) {
	book.add(b);
	System.out.println("Book added successfully....");
}
//displayBooks
public void displayBook() {
	if(book.isEmpty()) {
		System.out.println("books are not added yet");
	}else {
		for(Book b:book) {
			b.display();
		}
	}
}
//searchBookBasedOnId
public void searchBookBasedOnId(int bookid) {
	boolean isFound=false;
	if(book.isEmpty()) {
		System.out.println("Books are not yet addedd");
	}else {
		for(Book b:book) {
			if(b.getBookId()==bookid) {
				System.out.println("book found : "+b.getBookTitle());
				isFound=true;
			}
		}
	}
	if (isFound==false) {
		System.out.println("you entered inalid book id,,,");
	}
}

//searchBookbasedAuthor
public void searchBookbasedAuthor(String author) {
	boolean isFound=false;
	if(book.isEmpty()) {
		System.out.println("book are not yet addedd");
	}else {
		for(Book b:book) {
			if(b.getAuthor().equals(author)) {
				System.out.println("book found......."+b.getBookTitle());
				isFound=true;
			}
		}
	}
	if(isFound==false) {
		System.out.println("Your Enterd invalid authorname");
	}
}
//searchBookCostbasedOnTitle
public void searchBookCostbasedOnTitle(String booktitle) {
	boolean isUpdated=false;
	if(book.isEmpty()) {
		System.out.println("Book are not added yet");
	}
	else {
		for(Book b:book) {
			if(b.getBookTitle().equals(booktitle)) {
				b.setCost(1000);
				System.out.println("book cost updated");
				isUpdated=true;
			}
		}
	}
	if(isUpdated==false) {
		System.out.println("enter invalid title,,,book not found");
	}
}
public void removeBookBasedOnbookId(int bookId) {
	Iterator<Book> itr=book.iterator();
	boolean isRemove=false;
	if(book.isEmpty()) {
		System.out.println("Books are not added yet");
	}else {
		for(Book b:book) {
			if(b.getBookId()==bookId) {
				itr.remove();
				System.out.println("Book removed.....");
				isRemove=true;
			}
		}
	}
	if(isRemove==false) {
		System.out.println("Invalid book id ,,,book not found......");
	}
}
}
