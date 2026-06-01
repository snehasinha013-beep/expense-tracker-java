import java.util.ArrayList;

public class ExpenseManager {

    ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense Added Successfully!");
    }

    public void viewExpenses() {

        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        for (Expense expense : expenses) {
            expense.display();
        }
    }
}