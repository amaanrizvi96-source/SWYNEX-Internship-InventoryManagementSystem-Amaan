import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventory in = new Inventory();

        int choice;

        do {

            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Clothing");
            System.out.println("3. View All Products");
            System.out.println("4. Search Product");
            System.out.println("5. Update Product Quantity");
            System.out.println("6. Remove Product");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Product Price: ");
                    int price = sc.nextInt();

                    System.out.print("Enter Product Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Warranty Period in Years: ");
                    int warranty = sc.nextInt();

                    Product electronics = new Electronics(
                            id, name, price, quantity, warranty
                    );

                    in.addProducts(electronics);
                    break;
                }

                case 2: {
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Product Price: ");
                    int price = sc.nextInt();

                    System.out.print("Enter Product Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Clothing Size: ");
                    int size = sc.nextInt();

                    Product clothing = new Clothing(
                            id, name, price, quantity, size
                    );

                    in.addProducts(clothing);
                    break;
                }

                case 3:
                    in.viewProducts();
                    break;

                case 4:
                    System.out.print("Enter Product ID to search: ");
                    int searchId = sc.nextInt();

                    in.searchProduct(searchId);
                    break;

                case 5:
                    System.out.print("Enter Product ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    int newQuantity = sc.nextInt();

                    in.updateQuantity(updateId, newQuantity);
                    break;

                case 6:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = sc.nextInt();

                    in.removeProduct(removeId);
                    break;

                case 7:
                    System.out.println("Thank you for using Inventory Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}