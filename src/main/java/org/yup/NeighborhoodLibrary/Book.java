package org.yup.NeighborhoodLibrary;



public class Book {

   private int id;
   private String isbn;
   private String title;
   private boolean isCheckedOut;
   private String checkOutTo;

   public Book(int id, String isbn, String title) {
      //these are the properties we get user/developer input for
      this.id = id;
      this.isbn = isbn;
      this.title = title;

      //these i am setting without data passed in to have default values
      this.setCheckedOut(true);
      this.setCheckOutTo("");
   }

// method to checkout a book
   public void checkOut(String name){
      this.setCheckOutTo(name);
      this.setCheckedOut(true);


   }

   public void checkIn(){
      this.setCheckOutTo("");
      this.setCheckedOut(false);



   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getIsbn() {
      return isbn;
   }

   public void setIsbn(String isbn) {
      this.isbn = isbn;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public boolean isCheckedOut() {
      return isCheckedOut;
   }

   public void setCheckedOut(boolean checkedOut) {
      isCheckedOut = checkedOut;
   }

   public String getCheckOutTo() {
      return checkOutTo;
   }

   public void setCheckOutTo(String checkOutTo) {
      this.checkOutTo = checkOutTo;
   }
}
