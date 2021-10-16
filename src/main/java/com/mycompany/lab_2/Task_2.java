
package com.mycompany.lab_2;

 class Books {
    String author;
    String title,numOfPages,price,edition;
   

    
    void showInfo(){
        System.out.println("Details of author: ");
        System.out.println(title);
        System.out.println(author);
        System.out.println(numOfPages);
        System.out.println("Prices: "+price);
        
        System.out.println(edition);
        System.out.println(" ");
    }
}

public class Task_2 {
    public static void main(String[] args) {
        Books book1=new Books();
        book1.title="Java for beginners 3rd edition";
        book1.author="By Prof. David";
        book1.numOfPages="537 pages";
        book1.price="299 Tk";
        book1.edition="Easy coding applications";
        
        
       
        book1.showInfo();
        
        Books book2=new Books();
        book2.title="Omega point 12th edition";
        book2.author="By Humayun Ahmed";
        book2.numOfPages="122 pages";
        book2.price="128 Tk";
        book2.edition="Shomoy prokashoni";
        
        book2.showInfo();
        
        Books book3=new Books();
        book3.title="Digital fortress 5th edition";
        book3.author="By Dan Brown";
        book3.numOfPages="356 pages";
        book3.price="520 Tk";
        book3.edition="St. Martin press";
       
        book3.showInfo();
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        
        book1=book3;
        book1.edition="1";
        book3.showInfo();
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
