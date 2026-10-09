public class Electronics extends Product{

    @Override
    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Product Price: ₹" + getProductPrice());
        System.out.println("Product Quantity: " + getProductQuantity());
        System.out.println("Warranty: " + getWarrantyPeriod() + " years");
    }

    private int warrantyPeriod;

    public Electronics(int productId,String productName,int productPrice,int productQuantity,int warrantyPeriod){
        super(productId, productName, productPrice, productQuantity);
        this.warrantyPeriod = warrantyPeriod;
    }
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }
    public void setWarrantyPeriod(int warrantyPeriod){
        this.warrantyPeriod = warrantyPeriod;
    }


}
