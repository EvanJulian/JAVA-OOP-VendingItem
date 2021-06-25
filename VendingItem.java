public class VendingItem{
    protected String name;
    protected float price;
    protected int quantity;

    protected VendingItem(){
        name = "";
        price = 0f;
        quantity = 0;
    }
    protected VendingItem(String name, float price, int quantity){
        this.name =name;
        this.price = price;
        this.quantity = quantity;
    }
    protected void setName(String name){
        this.name = name;
    }
    protected void setPrice(float price){
        if (price>=0){
            this.price = price;    
        }
        else{
            this.price = 0f;
        }
    }
    protected void setQuantity(int quantity){
        if (price>=0){
            this.quantity = quantity;    
        }
        else{
            this.quantity = 0;
        }
    }
    protected String getName(){
        return this.name;
    }
    protected float getPrice(){
        return this.price;
    }
    protected int getQuantity(){
        return this.quantity;
    }
    @Override
    public String toString(){
        return this.name + " " + this.price + " sejumlah : " + this.quantity;
    }
}