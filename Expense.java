public class Expense {
    String category;
    double amount;
    String description;

    public Expense(String category, double amount, String description) {
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    public void display() {
        System.out.println("Category: " + category);
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Description: " + description);
        System.out.println("-------------------");
    }
}