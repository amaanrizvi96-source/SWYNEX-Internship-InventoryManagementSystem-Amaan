public class Clothing extends Product{

    @Override
    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Product Price: ₹" + getProductPrice());
        System.out.println("Product Quantity: " + getProductQuantity());
        System.out.println("Clothing Size: " + getSize());
    }

    private int size;
    public Clothing(int productId,String productName,int productPrice,int productQuantity,int size){
        super(productId, productName, productPrice, productQuantity);
        this.size = size;
    }

    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }

}
