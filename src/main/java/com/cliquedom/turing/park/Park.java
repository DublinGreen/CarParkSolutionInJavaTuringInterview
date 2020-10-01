package com.cliquedom.turing.park;

import java.util.HashMap;
import com.cliquedom.turing.interfaces.ParkImpl;

/**
 *
 * @author green
 */
public class Park implements ParkImpl {

    private final HashMap<Integer, Slot> slots = new HashMap();
    private int maxCapacity = 0;

    @Override
    public void checkInStore(Slot slot) {
        if (!this.slots.containsKey(slot.getKey())) {
            this.slots.put(slot.getKey(), slot);
        }
    }

    @Override
    public void checkOutStore(Slot slot) {
        if (this.slots.containsKey(slot.getKey())) {
            this.slots.remove(slot.getKey());
        }
    }

    @Override
    public int numberofVechicleInPark() {
        return this.slots.size();
    }

    @Override
    public void setMaxCapacity(int value) {
        this.maxCapacity = value;
    }

    @Override
    public int maxCapacityOfPark() {
        return this.maxCapacity;
    }

    @Override
    public int availableSlotsInPark() {
        return this.maxCapacity - this.slots.size();
    }

    @Override
    public Slot checkForSlotByKey(int slotKey) {
        if (this.slots.containsKey(slotKey)) {
            return this.slots.get(slotKey);
        } else {
            return new Slot();
        }
    }

}
