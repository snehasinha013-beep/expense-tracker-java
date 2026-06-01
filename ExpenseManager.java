import java.util.ArrayList;

public class ExpenseManager {

    ArrayList<Expense> expenses = new ArrayList<>();
    private int nextId = 1;

    public void addExpense(String category, double amount, String description) {

    Expense expense = new Expense(
            nextId,
            category,
            amount,
            description);

    expenses.add(expense);

    nextId++;

    System.out.println("Expense Added Successfully!");
    }

    public void deleteExpense(int id) {

    for (Expense expense : expenses) {

        if (expense.id == id) {
            expenses.remove(expense);
            System.out.println("Expense Deleted Successfully!");
            return;
        }
    }

    System.out.println("Expense ID not found!");
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