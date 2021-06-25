import java.util.*;
public class VendingMachine {
    private float deposit;
    private List<VendingItem> items;
    
    public void setDeposit(float deposit){
        this.deposit =deposit;
    }
    public void setItems(List<VendingItem> items){
        this.items = items;
    }
    public float getDeposit(){
        return this.deposit;
    }
    public VendingItem getItems(int idx){
        return items.get(idx);
    }
    public void addItems(VendingItem i){
        items.add(i);
    }
    public void removeItems(int idx){
        items.remove(idx);
    }
    public void showItem(){
        for(VendingItem x : items){
            if (x != null) {
                System.out.println(x);
            }
        }
    }
    public void buyItems(int idx, int quantity){
        if (items.get(idx).getQuantity()>quantity){
            float totalharga = items.get(idx).price * quantity;
            if (getDeposit() >= totalharga){
                items.get(idx).setQuantity(items.get(idx).getQuantity()-quantity);
                setDeposit(this.deposit-totalharga);
                System.out.println("Pembelian "+items.get(idx).getName() + " sejumlah : " + quantity);
                System.out.println("Total Harga " + totalharga);            
                System.out.println("Sisa Deposit : " + this.deposit);
            }
            else{
                System.out.println("Deposit tidak cukup untuk pembelian");
            }
        }
        else{
            System.out.println("Maaf kami tidak memiliki " + items.get(idx).name + "sebanyak itu.");
        }
    }
    public void showDiscounted(){
        for(VendingItem x : this.items){
            if (x != null) {
                if (x instanceof DiscountedVendingItem){
                    System.out.println(x);
                }
                else{
                    //Nothing
                }
            }
        }
    }
}
