import java.util.Scanner;

public class DepositWithdraw {
    public static double depositOrWithdraw( double userBalance){
        Scanner sc = new Scanner(System.in);
        System.out.println("please select the operation you want (1:deposit or 2:withdraw)");
        String operation=sc.nextLine();
        double amount;
//        double userAmount=Double.parseDouble(userBalance);
        if(operation.equals("2") ){
            System.out.println("please enter the amount you want to withdraw");
             amount= sc.nextDouble();
            if(amount<=userBalance)
            {
                userBalance-=amount;
            }
            else
            {
                return 0;
            }

        }
        else if(operation.equals("1")){
            System.out.println("please enter the amount you want to deposit");
            amount= sc.nextDouble();
            userBalance+=amount;
        }
        else {

            return 0;
        }
        return userBalance;
    }
}
