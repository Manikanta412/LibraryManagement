package Library;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Librarym l=new Librarym();
      Scanner sc=new Scanner(System.in);
      boolean isStart=true;
      while(isStart) {
    	  System.out.println("Enter the choice : \n 1.AddBook\n 2.Books details \n 3.searchbook \n 4.Authorname \n 5.update \n 6.remove \n 7.thank you");
    	  int ch=sc.nextInt();
    	  switch(ch) {
    	  case 1:
    	  {
    		  System.out.println("Enter the bookTitle");
    		  String title=sc.next();
    		  System.out.println("Enter the Book Id");
    		  int id=sc.nextInt();
    		  System.out.println("Enter the BookCst");
    		  int cost=sc.nextInt();
    		  System.out.println("Enter the Book NoofPages");
    		  int noofpages=sc.nextInt();
    		  System.out.println("Enter the Book Author");
    		  String author=sc.next();
    		  l.addBook(new Book(title,id, cost,noofpages,author));
    	  }
    	  break;
    	  case 2:{
    		  l.displayBook();
    	  }
    	  break;
    	  case 3:{
    		  System.out.println("Enter book id to SearchBook");
    		  int id=sc.nextInt();
    		  l.searchBookBasedOnId(id);
    	  }
    	  break;
    	  case 4:{
    		  System.out.println("Enter The AuthorName to Search Book");
    		  String author=sc.next();
    		  l.searchBookbasedAuthor(author);
    	  }
    	  break;
    	  case 5:{
    		  System.out.println("Enter Title to update cost");
    		  String title=sc.next();
    		  l.searchBookCostbasedOnTitle(title);
    	  }
    	  break;
    	  case 6:
    	  {
    		  System.out.println("Enter Book id to remove book");
    		  int id=sc.nextInt();
    		  l.removeBookBasedOnbookId(id);
    	  }
    	  break; 
    	  case 7:{
    		  isStart=false;
    		  System.out.println("Thank You.......");
    	  }
    	  break;
    	  default:
    		  System.out.println("Enter valid choice ............");
    	  }
      }
	}

}
