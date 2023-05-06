package org.yup.NeighborhoodLibrary;
import java.util.Scanner;
public class Screens {

    public static int  mainMenu(){
        Scanner theScanner = new Scanner(System.in);
        int choice = theScanner.nextInt();

        System.out.println("what would you like to check out?");
        System.out.println("1: show available books");
        System.out.println("2: Show checked out books");
        System.out.println("3: Exist");



return 0;
    }

private static int availableBooks(Book[] theBook){
    Scanner theScanner = new Scanner(System.in);
    System.out.println("These are the available books:\n");

    for (int i = 0; i < theBook.length; i++){
        if (theBook[i].isCheckedOut() == false){

            Book currentBook = theBook[i];
            System.out.println(i + 1 + ": " + currentBook.getTitle() + " - id:" + currentBook.getId() + "ISNBN:" + currentBook.getIsbn());
        }
    }
    return 0;
}

}
