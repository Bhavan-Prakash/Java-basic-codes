import java.util.Scanner;

public class Q22 {

    int deposit(int balance, Scanner sc){
        System.out.println("enter the amount you want to deposit :\n");
        int depo = sc.nextInt();
        System.out.println("the amount has been deposited successfully!!!");
        balance += depo;
        return balance;
    }

    int withdraw(int balance, Scanner sc){
        System.out.println("enter the amount you want to withdraw :\n");
        int draw = sc.nextInt();
        if(draw>balance){
            System.out.println("you dont have enough money, please deposit first");
        }else{
            balance -= draw;
            System.out.println("your request has been processed!!!");
        }
        return balance;
    }

    int check(int balance){
        System.out.println("your balance is : \n" + balance);
        return balance;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int balance = 0;

        Q22 atm = new Q22();

        int inp;

        do{
            System.out.println("please choose:\n 1 for balance check\n 2 for deposit\n 3 for withdraw\n 4 for exit \n");

            inp = sc.nextInt();

            switch (inp){
                case 1:
                    atm.check(balance);
                    break;
                case 2:
                    balance = atm.deposit(balance,sc);
                    System.out.println("your new balance is : \n" + balance);
                    break;
                case 3:
                    balance = atm.withdraw(balance,sc);
                    System.out.println("your new balance is : \n" + balance);
                    break;
                case 4:
                    System.out.println("thanls for choosing atm have a wonderfull day!!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }while(inp != 4);
        sc.close();

    }
}
