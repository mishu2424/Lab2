
package com.mycompany.lab_2;

public class BillCalculator {
    
   
     double calculateBasicBill(double unit){
       
        double charge1=1.20;
        double charge2=1.50;
        double charge3=1.80;
        double charge4=2.00;
        if(unit<200){
            return charge1; 
        }
        else if(unit>=200 && unit<400){
           return charge2;
        }
        else if(unit>=400 && unit<600){
           return charge3;
        }
        else {
           return charge4;
        }
       
    }
     double calculateSurcharge(double basicBill){
        
         if(basicBill>400){
             basicBill += basicBill+15/100;
             
         }
         else{
             return 0;
         }
         return basicBill;
         
     }
     double getTotalBill(double unit){
        double total=calculateBasicBill(unit);
        double surcharge=calculateSurcharge(unit);
        double bill=total*surcharge;
        if(bill<=100){
            
            return 100;
        }
        return bill;
        
     }

     
 
}
