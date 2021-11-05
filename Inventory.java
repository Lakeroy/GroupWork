import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> inventory = new ArrayList<Item>();

    public void addToInventory(Item item)
    {
        inventory.add(item);
    }

    public void removeFromInventory(Item item)
    {
        inventory.remove(item);
    }
}
