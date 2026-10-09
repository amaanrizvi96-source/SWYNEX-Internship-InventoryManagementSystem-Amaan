public abstract class Product {
    private int productId;
    private String productName;
    private int productPrice;
    private int productQuantity;

    public abstract void displayDetails();


    public Product(int productId,String productName,int productPrice,int productQuantity){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public int getProductId(){
        return productId;
    }
    public void setProductId(int newId){
        productId = newId;
    }

    public String getProductName(){
        return productName;
    }
    public void setProductName(String newName){
        productName = newName;
    }

    public int getProductPrice(){
        return productPrice;
    }
    public void setProductPrice(int newPrice){
        productPrice = newPrice;
    }

    public int getProductQuantity(){
        return productQuantity;
    }
    public void setProductQuantity(int newQuantity){
        productQuantity = newQuantity;
    }

}


