package Library;

public class Book {
private String bookTitle;
private int bookId;
private int cost;
private int noOfpages;
private String author;
Book(){
}
public Book(String bookTitle,int bookId,int cost,int noOfpages,String author) {
	if(validateBookTitle(bookTitle)) {
	this.bookTitle=bookTitle;
	}else {
		throw new TitleMismatchException();
	}
	if(validateBookId(bookId)) {
	this.bookId=bookId;
	}else {
		throw new InvalidIdException();
	}
	if(validateCost(cost)) {
	this.cost=cost;
	}else {
		System.out.println("provide cost in below 40000");
	}
	this.noOfpages=noOfpages;
	this.author=author;
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle=bookTitle;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public int getNoOfpages() {
	return noOfpages;
}
public void setNoOfpages(int noOfpages) {
	this.noOfpages = noOfpages;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String toString() {
	return bookTitle+" "+bookId+" "+cost+" "+noOfpages+" "+author+"\n";
}
//validation for title
public boolean validateBookTitle(String title) {
if(title.equals("java")||title.equals("sql")||title.equals("python")) {
	return true;
}else {
	return false;
 }	
}
//validation for bookid
public boolean validateBookId(int id) {
	if(id%2==0) {
		return true;
	}else {
		return false;
	}
}
//validation for cost
public boolean validateCost(int cost) {
	if(cost>=4000) {
		return true;
	}else {
		return false;
	}
}
public void display() {
	System.out.println("booktitle : "+getBookTitle());
	System.out.println("bookid : "+getBookId());
	System.out.println("book cost : "+getCost());
	System.out.println("book noOfpages : "+getNoOfpages());
	System.out.println("book  Author : "+getAuthor());
}
}
