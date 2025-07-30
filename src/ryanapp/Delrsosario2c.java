

package ryanapp;

import java.util.Scanner;




public class Delrsosario2c {

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter Employee Name: ");
        name =sc.nextLine();
        float nw;
        
        float rate;
        System.out.print("Enter Hourly Rate: ");
        rate = sc.nextFloat();
        
        int total;
        System.out.print("Enter Total Hours Worked this Week: ");
        total = sc.nextInt();
        
        System.out.println("-----Wage Summary-----");
        System.out.println("Employee: "+name);
        System.out.printf("Hourly Rate: ₱%.2f\n", rate);
        System.out.println("Hours Worked: "+total);
        
        float gross;
        gross = rate * total;
        System.out.printf("Gross Weekly: ₱%.2f\n", gross);
        
        float discount;
        discount = gross / 10;
        System.out.printf("SSS Contribution:", discount);
        System.out.print("\n-------------------------\n");
        nw = gross - discount;
        System.out.printf("Next Weekly Wage: ₱%.2f\n", nw);
        
       
        
        
        
        
        
        
        
    }
    
}
