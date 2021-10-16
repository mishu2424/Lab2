
package com.mycompany.lab_2;


public class Testllibrary1 {
    public static void main(String[] args) {
        Books author1= new Books();
        author1.setinformations("Shafiul Haque","JIboner okanto iccha","By humayun ahmed",180,250);
        author1.showInfo();
        Books author2= new Books();
        author2.setinformations("Sajjad Haque","okanto", "By Prof. David",150,200);
        author2.showInfo();
         Books author3= new Books();
        author3.setinformations("Kanchon roy","kolikota","By shukanto battacharya",250,305);
        author3.showInfo();
        
    }
}
 class Books {
    String author;
    String title,edition;
    int price,numOfPages;
    
    void setinformations(String a,String t,String e,int nop,int p){
        author=a;
        title=t;
        edition=e;
        numOfPages=nop;
        price=p;
        
    }
    
    void showInfo(){
        System.out.println("Details of author: ");
        System.out.println(author);
        System.out.println(title);
        System.out.println(price);
        System.out.println(numOfPages);
        System.out.println(edition);
        System.out.println(" ");
    }
}