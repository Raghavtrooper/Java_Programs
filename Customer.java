class Customer {
    private double balance;

    public Customer() {
        this.balance = 0.0;
    }

    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added " + amount + " to the balance.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void addBalance(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added " + amount + " to the balance.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    protected void deductBalance(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Deducted " + amount + " from the balance.");
        } else {
            System.out.println("Invalid deduction.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.addBalance(150.75);
        customer.addBalance(50);    

        customer.showBalance();

        customer.deductBalance(100);
        customer.showBalance();

        customer.deductBalance(200);
    }
}
