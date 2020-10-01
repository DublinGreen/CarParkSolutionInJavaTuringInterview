package com.cliquedom.turing.interfaces;

import com.cliquedom.turing.park.Slot;

/**
 *
 * @author green Stores slots
 */
public interface ParkImpl {

    public void checkInStore(Slot slot);

    public void checkOutStore(Slot slot);

    public Slot checkForSlotByKey(int slotKey);

    public int numberofVechicleInPark();

    public void setMaxCapacity(int value);

    public int maxCapacityOfPark();

    public int availableSlotsInPark();

}
