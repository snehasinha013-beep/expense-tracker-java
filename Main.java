import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {

            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4. Update Expense");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();

                    manager.addExpense(
                    category,
                    amount,
                    description);
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    System.out.print("Enter Expense ID to delete: ");
                    int id = sc.nextInt();
                    
                    manager.deleteExpense(id);
                    
                    break;

                case 4:
                    System.out.print("Enter Expense ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Category: ");
                    String newCategory = sc.nextLine();

                    System.out.print("Enter New Amount: ");
                    double newAmount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter New Description: ");
                    String newDescription = sc.nextLine();

                    manager.updateExpense(
                            updateId,
                            newCategory,
                            newAmount,
                            newDescription);

                    break;

                case 5:
                    System.out.println("Thank you for using Expense Tracker!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}