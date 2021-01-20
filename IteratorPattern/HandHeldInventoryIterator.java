package IteratorPattern;

public class HandHeldInventoryIterator implements InventoryIterator{
    private HandHeldInventory handHeldInventory;
    int index = 0;

    public HandHeldInventoryIterator(HandHeldInventory handHeldInventory){
        this.handHeldInventory = handHeldInventory;
    }

    @Override
    public boolean isDone() {
        return this.index < 2;
    }

    @Override
    public void next() {
        this.index+=1;
    }

    @Override
    public Item current() {
        switch (index){
            case 0:
                return this.handHeldInventory.right;
            case 1:
                return this.handHeldInventory.left;
            default:
                return null;
        }
    }
}
