import static java.lang.System.*;
import java.util.*;
public class Main {
    public Main(){
        Scanner sc = new Scanner(in);
        List<VendingItem> items = new ArrayList<>();
        VendingItem i = new VendingItem("1. Milo Coklat ", 1000, 5);
        items.add(i);
        VendingItem j = new VendingItem("2. Donut ", 2000, 5);
        items.add(j);
        VendingItem k = new DiscountedVendingItem("3. Kelapa ", 1000, 5, 0.2f);
        items.add(k);
        VendingMachine e = new VendingMachine();
        e.setItems(items);
        e.setDeposit(1000);
        while(true){
            out.println("Vending Machine 1.0");
            out.println("===================================");
            int deposit;
            out.println("Current Deposit : " + e.getDeposit());
            out.println("1. Buy an Item");
            out.println("2. Add Deposit");
            out.println("3. See All Item");
            out.println("4. See Discounted Items");
            out.println("5. Exit");
            int pilihan;
            pilihan = sc.nextInt();
            if (pilihan ==1){
                e.showItem();
                out.println("pilihan ?");
                int idx = sc.nextInt();
                out.println("jumlah ?");
                int jumlah = sc.nextInt();
                e.buyItems(idx-1, jumlah);
            }
            else if(pilihan == 2){
                out.print("Berapa Deposit anda : ");
                deposit = sc.nextInt();
                e.setDeposit(e.getDeposit()+deposit);
            }
            else if(pilihan == 3){
                e.showItem();
            }
            else if(pilihan == 4){
                e.showDiscounted();
            }
            else{
                out.println("Terima Kasih.");
                break;
            }
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}