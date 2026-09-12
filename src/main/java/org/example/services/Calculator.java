package org.example.services;

import org.example.model.Atm;
import org.example.model.Salary;
import org.example.model.Student;
import org.example.model.Vehicle;

public class Calculator {
     public static double calculateNet(double grossAmount){
         Salary amount = new Salary();
         double results;
         results= grossAmount -(grossAmount*amount.getNhif()/100)-(grossAmount*amount.getNssf()/100)-(grossAmount*amount.getHouseLevy()/100)-(grossAmount*amount.getPaye()/100);
         System.out.println("NetPayeE: " + results);
         return  results;
    }
    public static double carLoanCalculater (double pAmount){
        Vehicle p1 = new Vehicle();
        p1.setPrincipal(pAmount);
        double monthly;
        float n = p1.getNoOfYears()/12;
        monthly = p1.getPrincipal() * (p1.getInterestRate()* Math.pow(1 + p1.getInterestRate(), p1.getNoOfYears()))/ (Math.pow(1 + p1.getInterestRate(), p1.getNoOfYears()) - 1);;
        System.out.println("NetPayeE: monthly" + monthly +"Y"+n);
        return monthly;
    }
    public static int studentGrading(int english,int kiswahili,int math,int history,int biology,int chemistry){
        Student s1 = new Student();
        int total;
        total = english + kiswahili + math + history + biology + chemistry;
        System.out.println(total);

        double average = total/5;
         if(s1.getMarks() >= 60){
             System.out.println("passed");
         } else {
             System.out.println("failed");
         }
        System.out.println(total);
        System.out.println(average);
        return total;
    }
    public  static double getBalance (double account){
         Atm V1 = new Atm();
        V1.setBalance(account);
         return account;
    }
}
