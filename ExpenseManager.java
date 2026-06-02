import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;

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
    saveExpenses();
    }

    public void deleteExpense(int id) {

    for (Expense expense : expenses) {

        if (expense.id == id) {
            expenses.remove(expense);
            System.out.println("Expense Deleted Successfully!");
            saveExpenses();
            return;
        }
    }

    System.out.println("Expense ID not found!");
}

public void updateExpense(int id, String category, double amount, String description) {

    for (Expense expense : expenses) {

        if (expense.id == id) {

            expense.category = category;
            expense.amount = amount;
            expense.description = description;

            System.out.println("Expense Updated Successfully!");
            saveExpenses();
            return;
        }
    }

    System.out.println("Expense ID not found!");
}

public void categoryWiseSummary() {

    HashMap<String, Double> summary = new HashMap<>();

    for (Expense expense : expenses) {

        if (summary.containsKey(expense.category)) {

            double currentAmount =
                    summary.get(expense.category);

            summary.put(
                    expense.category,
                    currentAmount + expense.amount);

        } else {

            summary.put(
                    expense.category,
                    expense.amount);
        }
    }

    System.out.println("\nCategory-wise Summary");

    for (String category : summary.keySet()) {

        System.out.println(
                category +
                ": Rs. " +
                summary.get(category));
    }
}

public void viewTotalExpenses() {

    double total = 0;

    for (Expense expense : expenses) {
        total += expense.amount;
    }

    System.out.println("Total Expenses: Rs. " + total);
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

    public void saveExpenses() {

    try {

        FileWriter writer =
                new FileWriter("expenses.txt");

        for (Expense expense : expenses) {

            writer.write(
                    expense.id + "," +
                    expense.category + "," +
                    expense.amount + "," +
                    expense.description + "\n");
        }

        writer.close();

        System.out.println("Expenses saved successfully!");

    } catch (IOException e) {

        System.out.println(
                "Error saving expenses.");
    }
}
}