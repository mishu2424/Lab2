/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab_2;

/**
 *
 * @author 88017
 */
public class Task_3 {
    public static void main(String[] args) {
        BillCalculator b1=new BillCalculator();
        var print1=b1.getTotalBill(25);
        System.out.println("Bill for 25:"+print1);
        var print2=b1.getTotalBill(250);
        System.out.println("Bill for 250:"+print2);
    }
}
