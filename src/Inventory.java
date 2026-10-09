import java.util.ArrayList;


public class Inventory {
    ArrayList<Product> inventryList = new ArrayList<>();

    //Method to add a product
    public void addProducts(Product addProduct){
        inventryList.add(addProduct);
        System.out.println("Product added successfully!");
    }

    //Method to view all product
    public void viewProducts() {

        if (inventryList.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }

        for (Product addProduct : inventryList) {
            addProduct.displayDetails();
            System.out.println("----------------------");
        }
    }


    //Method to search a product by ID
    public void searchProduct(int id){

        for(Product addProduct : inventryList){

            if (addProduct.getProductId() == id) {
                System.out.println("Product Found!");
                addProduct.displayDetails();
                return;
            }
        }
        System.out.println("Product not found!");
    }

    // Method to update product quantity
    public void updateQuantity(int id, int newQuantity) {

        for (Product addProduct : inventryList) {

            if (addProduct.getProductId() == id) {

                if (newQuantity < 0) {
                    System.out.println("Quantity cannot be negative!");
                    return;
                }

                addProduct.setProductQuantity(newQuantity);

                System.out.println("Product quantity updated successfully!");
                return;
            }
        }

        System.out.println("Product not found!");
    }

    // Method to remove a product
    public void removeProduct(int id) {

        for (Product addProduct : inventryList) {

            if (addProduct.getProductId() == id) {

                inventryList.remove(addProduct);

                System.out.println("Product removed successfully!");
                return;
            }
        }

        System.out.println("Product not found!");
    }
}
