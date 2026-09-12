package org.example;

import org.example.model.Atm;
import org.example.model.Student;
import org.example.model.Vehicle;
import org.example.services.Calculator;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the English: ");
//        int english = scanner.nextInt();
//        System.out.print("Enter the Kiswahili: ");
//        int kiswahili = scanner.nextInt();
//        System.out.print("Enter the math: ");
//        int math = scanner.nextInt();
//        System.out.print("Enter the history: ");
//        int history = scanner.nextInt();
//        System.out.print("Enter the biology: ");
//        int biology = scanner.nextInt();
//        System.out.print("Enter the chemistry: ");
//        int chemistry = scanner.nextInt();
//
//        int grading = Calculator.studentGrading(english,chemistry,kiswahili,history,biology,math);

            Random no = new Random();
            int randomNo = no.nextInt(0,101);
//            int randomNo = ThreadLocalRandom.current().nextInt(0,101);
        int myGuess = 0;
        do {
            System.out.print("Type the your number: ");
             myGuess = scanner.nextInt();
             if(myGuess == -1){
                 break;
             }
            else if(myGuess > randomNo){
                System.out.println("Your number is too high");
            } else if (myGuess < randomNo){
                System.out.println("Your number is too low");
            }
            else {
                System.out.println("You guessed it right");
            }
        } while (randomNo != myGuess);










//
//        double balance = 10000;
//
//        int currentPin = 1994;
//
////        double all =  Calculator.getBalance(amount);
////        System.out.println("all" + all);
//
// int choice = 0;
//
// do { System.out.println("Welcome to KCB Bank ATM WITHDRAW");
//     System.out.println("1:Cash withdraw");
//     System.out.println("2:Balance Inquiry");
//     System.out.println("3:Deposit");
//     System.out.println("4: Funds Transfer");
//     System.out.println("5:PIN Change");
//     System.out.println("6: Mini Statement");
//     System.out.println("0: exit");
//
//     choice = scanner.nextInt();
//     if (choice < 0 || choice >=7){
//         System.out.println("invalid choice");
//         continue;
//     }
//
//     switch (choice){
//         case 1:  System.out.println("Enter the amount to withdraw");
//             int withdrawAmount = scanner.nextInt();
//             if( withdrawAmount > 0 && withdrawAmount <= balance) {
//                 System.out.println("Withdraw successfully:" + withdrawAmount);
//                 balance -=withdrawAmount;
//                 System.out.println("Remaining balance:" + balance );
//             } else {
//                 System.out.println("Enter the correct amount" );
//             }
//             break;
//         case 2:  System.out.println(" Your balance is:" + balance);
//             break;
//         case 3:  System.out.println(" Enter amount you wish to Deposit ");
//             int depositAmount = scanner.nextInt();
//             if(depositAmount>0 ){
//                 balance+= depositAmount;
//                 System.out.println("your total amount is:"+ balance);
//             } else {
//                 System.out.println("Deposit must be greater than 0");
//             }
//             break;
//         case 4:System.out.println("Funds Transfer");
//             break;
//         case 5:
//             System.out.println("Enter your Current pin");
//             int current = scanner.nextInt();
//             if(currentPin == current){
//                 System.out.println("You've entered the correct current pin");
//                 System.out.println("Enter your new pin");
//                 int newPin = scanner.nextInt();
//                 if(newPin <= 999 || newPin>=10000){
//                     System.out.println("Enter the pin between 1000 to 9999");
//                 } else{
//                     currentPin = newPin;
//                     System.out.println("pin successful changed");
//                 }
//             }
//             break;
//         case 6:
//             System.out.println("Mini Statement");
//
//             break;
//         case 0:
//             System.out.println("exit");
//
//             break;
////         default:  System.out.println("Invalid number");
//
//
//     }
// }  while(choice !=0);

//        if(choice == 1){
//            System.out.println("Enter the amount to withdraw");
//            int withdrawAmount = scanner.nextInt();
//            if( withdrawAmount > 0 && withdrawAmount <= balance ) {
//                System.out.println("Withdraw successfully:" + withdrawAmount);
//                balance -=withdrawAmount;
//                System.out.println("Remaining balance:" + balance );
//            } else {
//                System.out.println("Enter the correct amount" );
//            }
//
//        } else if (choice == 2){
//            System.out.println(" Your balance is:" + balance);
//        }
//        else if (choice == 3){
//            System.out.println(" Enter amount you wish to Deposit ");
//            int depositAmount = scanner.nextInt();
//            if(depositAmount>0 ){
//                balance+= depositAmount;
//                System.out.println("your total amount is:"+ balance);
//            } else {
//                System.out.println("Deposit must be greater than 0");
//            }
//
//        }
//        else if (choice == 4){
//            System.out.println("Funds Transfer");
//
//        }
//        else if (choice == 5){
//            System.out.println("Enter your Current pin");
//            int current = scanner.nextInt();
//            if(currentPin == current){
//                System.out.println("You've entered the correct current pin");
//                System.out.println("Enter your new pin");
//                int newPin = scanner.nextInt();
//                currentPin = newPin;
//                System.out.println("pin successful changed");
//
//            } else {
//                System.out.println("You've entered incorrect current pin");
//            }
//
//
//
//        }
//        else if (choice == 6){
//            System.out.println("Mini Statement");
//
//        } else {
//            System.out.println("Invalid number");
//
//        }
  }
    }