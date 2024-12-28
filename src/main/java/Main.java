import model.Item;

public class Main{
    public static void main(String[] args){
        
        
        Item item=new Item();
        item.setPrice();
        System.out.println(item.getPrice());
        System.out.println(item.getName());

        Item item2=new Item();
        item2.setPrice();
        System.out.println(item2.getPrice());
        


    }
}