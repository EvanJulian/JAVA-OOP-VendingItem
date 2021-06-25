public class DiscountedVendingItem extends VendingItem {
    private float discount;
    
    public DiscountedVendingItem(){
        super();
        discount = 0f;
    }
    public DiscountedVendingItem(String name, float price, int quantity, float discount){
        super(name, price, quantity);
        this.discount = discount;
    }
    public void setDiscount(float discount){
        if(discount>=0f && discount<=1f){
            this.discount = discount;
        }
        else{
            this.discount = 0f;
        }
        
    }
    public float getDiscount(){
        return this.discount;
    }
    public float getTotalPrice(){
        return this.price-(this.discount*this.price);
    }
    @Override
    public String toString(){
        return this.name + " " + this.price + " " + "Sejumlah : " + this.quantity + " " + this.discount*100 + "% menjadi : " + getTotalPrice();
    }
}
