/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raushan;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class LeapY {
    public static void main(String[] args) {
        int a;
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=kb.nextInt();
        if(a%4==0&&a%400==0 ||a%4==0 &&a%100!=0)
           
        
            System.out.println("Leap:");
        else
            System.out.println("Not Leap:");
    }
        
    

    
}
