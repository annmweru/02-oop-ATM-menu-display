//package org.example;

import org.example.model.Account;
import org.example.services.Calculator;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
////    static  int fibonacci ( int n){
////        if( n <=1){
////            return n;
////
////        }
////        return fibonacci(n-1)+fibonacci(n-2);
////
////    }
////
////        static int factorio( int n){
////        if(n > 1){
////            return n*factorio(n-1);
////        } else {
////            return 1;
////        }
////
////    }
    public static void main(String[] args) {
//        int n = 10;
//                for(int i =0;i<n;i++){
//                    System.out.println("hello"+ fibonacci(i));
//
//                }
//        System.out.println(factorio(5));
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

//            Random no = new Random();
//            int randomNo = no.nextInt(0,101);
////            int randomNo = ThreadLocalRandom.current().nextInt(0,101);
//        int myGuess = 0;
//        do {
//            System.out.print("Type the your number: ");
//             myGuess = scanner.nextInt();
//             if(myGuess == -1){
//                 break;
//             }
//            else if(myGuess > randomNo){
//                System.out.println("Your number is too high");
//            } else if (myGuess < randomNo){
//                System.out.println("Your number is too low");
//            }
//            else {
//                System.out.println("You guessed it right");
//            }
//        } while (randomNo != myGuess);



//        double balance = 10000;
        Account myAccount = new Account();
        Calculator calculator = new Calculator();

        int currentPin = 1994;

//        System.out.println("all" + all);

 int choice = 0;

 do { System.out.println("Welcome to KCB Bank ATM WITHDRAW");
     System.out.println("1:Cash withdraw");
     System.out.println("2:Balance Inquiry");
     System.out.println("3:Deposit");
     System.out.println("4: Funds Transfer");
     System.out.println("5:PIN Change");
     System.out.println("6: Mini Statement");
     System.out.println("0: exit");

     choice = scanner.nextInt();
     if (choice < 0 || choice >=7){
         System.out.println("invalid choice");
         continue;
     }

     switch (choice){
         case 1:  System.out.println("Enter the amount to withdraw");
             double withdrawAmount = scanner.nextInt();
             double currentBalance = calculator.getBalance(myAccount);
             if( withdrawAmount > 0 && withdrawAmount <= currentBalance) {
                  double newBalance= currentBalance -withdrawAmount;
                  myAccount.setBalance(newBalance);
                 System.out.println("Remaining balance:" + myAccount.getBalance() );
             } else {
                 System.out.println("Enter the correct amount" );
             }
             break;
         case 2:  System.out.println(" Your balance is:" + myAccount.getBalance());
             break;
         case 3:  System.out.println(" Enter amount you wish to Deposit ");
             int depositAmount = scanner.nextInt();
             boolean isSuccess = Calculator.deposit(myAccount,depositAmount);
             if(isSuccess ){
                 System.out.println("your total amount is:"+ myAccount.getBalance());
             } else {
                 System.out.println("Deposit must be greater than 0");
             }
             break;
         case 4:System.out.println("Funds Transfer");
             break;
         case 5:
             System.out.println("Enter your Current pin");
             int current = scanner.nextInt();
             if(calculator.setPin(myAccount,current)){
                 System.out.println("Enter your new pin");
                 int newPin = scanner.nextInt();
                 if(newPin <= 999 || newPin>=10000){
                     System.out.println("Enter the pin between 1000 to 9999");
                 } else{
                      int newSet =  newPin;
                     System.out.println("pin successful changed");
                 }
             }
             break;
         case 6:
             System.out.println("Mini Statement");

             break;
         case 0:
             System.out.println("exit");

             break;
//         default:  System.out.println("Invalid number");


     }
 }  while(choice !=0);
    }