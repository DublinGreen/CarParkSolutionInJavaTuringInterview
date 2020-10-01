package com.cliquedom.turing.interfaces;

import com.cliquedom.turing.park.Slot;
import com.cliquedom.turing.vehicle.Vehicle;

/**
 *
 * @author green
 */
public interface SlotImpl {

    public void buildSlot(Vehicle vehicle, int slotKey);

    public Slot getSlot();

    public Vehicle getVehicle(int slotKey);

    public int getKey();
}
