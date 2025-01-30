public class ExpenseTracker {
 public static void main(String[] args) {
        double[] expenses = {120.50, 45.30, 60.75, 150.20, 200.00}; 
        displayExpenses(expenses);
    }
    public static void displayExpenses(double[] expenses) {
        double total = 0;
         System.out.println("Expenses List:");
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("Expense " + (i + 1) + ": $" + expenses[i]);
            total += expenses[i];
        }
         System.out.println("\nTotal Expenses: $" + total);
    }
}

