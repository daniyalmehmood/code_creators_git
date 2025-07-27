import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        char choose = ' ';
        int count = 0;
        System.out.println("Welcome to Mini Bank System");
        List<CreateAccountTest> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int userID;
        CreateAccountTest userInfo;
        List<String> s=new ArrayList<>();
        while(choose != 'e') {
            System.out.println("Please enter your choice");
            System.out.println("a. Create Account");
            System.out.println("b. Deposit or Withdraw");
            System.out.println("c. View Balance");
            System.out.println("d. View transaction history");
            System.out.println("e. Exit");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case 'a':
                    CreateAccountTest userAccount=new CreateAccountTest();
                    System.out.println("Please enter your full name");
                    String name = sc.nextLine();
                    userAccount.setName(name);
                    System.out.println("Please enter your Phone number");
                    String phone = sc.nextLine();
                    userAccount.setPhone(phone);
                    userAccount.setBalance(0.0);
                    System.out.println("Please enter your current state (working , not working)");
                    String state = sc.nextLine();
                    userAccount.setState(state);
                    System.out.println("Please enter your civil id number");
                    String civilID = sc.nextLine();
                    userAccount.setCivilId(civilID);
                    result.add(userAccount);
                    System.out.println(result);
                    System.out.println("You Bank Account Created Successfully");
                    System.out.println("Your Bank ID is:" + count);
                    count++;

                    break;
                case 'b':
                        System.out.println("Please enter your bank ID");
                         userID = sc.nextInt();
                        sc.nextLine();
                        if (userID < 0 || userID >= result.size()) {
                        System.out.println("❌ There is no account with that ID.");
                        break;
                          }
                        userInfo=result.get(userID);
                        double userBalance=userInfo.getBalance();
                        double v = DepositWithdraw.depositOrWithdraw(userBalance);


                        if(v!=0)
                        {

                            userInfo.setBalance(v);
                            System.out.println("Your new balance is "+userInfo.getBalance());
                            if(userBalance >userInfo.getBalance())
                            {
                                String v1 = String.valueOf(userBalance-userInfo.getBalance());

                                s.add("WithDrawl :"+v1);
                                userInfo.setTransactionsHistory(s);

                                System.out.println("Withdraw Successful");
                            }
                            else {
                                String v1 = String.valueOf(userBalance);

                                s.add("Deposit :"+v1);
                                userInfo.setTransactionsHistory(s);
                                System.out.println("Deposit Successful");
                            }
                        }
                        else
                        {
                            System.out.println("You don't have sufficient money in your account");
                        }
                         System.out.println(result.get(userID));
                        break;

                case 'c':  System.out.println("Please enter your bank ID");
                            userID = sc.nextInt();
                            sc.nextLine();
                            if (userID < 0 || userID >= result.size()) {
                                System.out.println("❌ There is no account with that ID.");

                            }
                            else
                            {
                                userInfo=result.get(userID);
                                double accountBalance=userInfo.getBalance();
                                System.out.println("Your current balance is "+accountBalance);
                            }
                    break;
                case 'd':
                    System.out.println("Please enter your bank ID");
                    userID = sc.nextInt();
                    sc.nextLine();
                    if (userID < 0 || userID >= result.size()) {
                        System.out.println("❌ There is no account with that ID.");
                        break;
                    }
                    userInfo=result.get(userID);
                    System.out.println("Your Transaction history is "+userInfo.getTransactionsHistory());

                }
            }
        }
    }

