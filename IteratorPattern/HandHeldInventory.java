package IteratorPattern;

public class HandHeldInventory implements Inventory {
    public Item right;
    public Item left;

    public HandHeldInventory(Item right, Item left) {
        this.right = right;
        this.left = left;
    }

    private void setRight(Item right) {
        this.right = right;
    }

    private void setLeft(Item left) {
        this.left = left;
    }

    public Item getRight() {
        return right;
    }

    public Item getLeft() {
        return left;
    }

    public InventoryIterator getIterator(){
        return new HandHeldInventoryIterator(this);
    }
}
