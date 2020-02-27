/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stiacc;

/**
 *
 * @author Administrator
 */
import java.util.*;
public class Stiacc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter Last Name: ");
        String lname = input.nextLine();
        
        System.out.print("Enter 11 digit Student#: ");
        String sid = input.nextLine();
        
        System.out.print("enter City: ");
        String city = input.nextLine();
        
        System.out.print("Enter Birth Year: ");
        String b = input.nextLine();
        
        
        System.out.print("Enter Birth Month: ");
        String m = input.nextLine();
        
        System.out.print("Enter Birth Date: ");
        String y = input.nextLine();
        
        //02000193208
        System.out.println("\n*******************************************");
        lname = Character.toUpperCase(lname.charAt(0)) + lname.substring(1);
        System.out.println("User: " + lname + "." + sid.charAt(5) + sid.charAt(6) + sid.charAt(7) + sid.charAt(8) + sid.charAt(9) + sid.charAt(10) + "@" + city + ".sti.edu.ph");  
        System.out.println("Password: " + lname + b + m + y);
        System.out.println("*******************************************");
        
        
    }
    
}
