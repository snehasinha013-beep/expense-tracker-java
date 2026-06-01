public class Expense {
    int id;
    String category;
    double amount;
    String description;

    public Expense(int id, String category, double amount, String description) {
        this.id=id;
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Category: " + category);
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Description: " + description);
        System.out.println("-------------------");
    }
}