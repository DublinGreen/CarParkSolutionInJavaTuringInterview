package com.cliquedom.turing.park;

import com.cliquedom.turing.interfaces.SlotImpl;
import com.cliquedom.turing.vehicle.Vehicle;

/**
 *
 * @author green Slots to be used in the park
 */
public class Slot implements SlotImpl {

    private Vehicle vehicle;
    private int slotKey;
    private Slot slot;    

    @Override
    public void buildSlot(Vehicle vehicle, int slotKey) {
        this.vehicle = vehicle;
        this.slotKey = slotKey;
    }
    
    @Override
    public Slot getSlot(){
        return this.slot;
    }

    @Override
    public Vehicle getVehicle(int slotKey) {
        if (slotKey == this.slotKey) {
            return this.vehicle;
        } else {
            return null;
        }
    }
    
    @Override
    public int getKey(){
        return this.slotKey;
    }

}
