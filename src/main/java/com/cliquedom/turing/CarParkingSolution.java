package com.cliquedom.turing;

import com.cliquedom.turing.park.Slot;
import com.cliquedom.turing.park.SlotKeyGenerator;
import com.cliquedom.turing.park.Park;
import com.cliquedom.turing.vehicle.Vehicle;
import com.cliquedom.turing.vehicle.VehicleTypeEnum;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarParkingSolution {

    public static void main(String args[]) {

        try {
            SlotKeyGenerator slotKeyGenerator = new SlotKeyGenerator();
            Park park = new Park();

            slotKeyGenerator.buildSlotKeyGenerator(54);
            park.setMaxCapacity(54);

            int slotKey = slotKeyGenerator.generate();
            int slotKey2 = slotKeyGenerator.generate();
            int slotKey3 = slotKeyGenerator.generate();            
//            int limit = slotKeyGenerator.getSlotKeyLimit();

            Vehicle vehicle = new Vehicle();
            Vehicle vehicle2 = new Vehicle();
            Vehicle vehicle3 = new Vehicle();

            vehicle = vehicle.buildVehicle("Idisimagha Dublin-Green", "black", "bmw", VehicleTypeEnum.SALOON);
            Slot slot = new Slot();
            slot.buildSlot(vehicle, slotKey);

            vehicle2 = vehicle.buildVehicle("femi ibitolu", "dark blue", "toyota camry", VehicleTypeEnum.SEDAN);
            Slot slot2 = new Slot();
            slot2.buildSlot(vehicle2, slotKey2);
            
            vehicle3 = vehicle.buildVehicle("micheal alao", "red", "kawasaki ninja bike", VehicleTypeEnum.MOTOCYCLE);
            Slot slot3 = new Slot();
            slot3.buildSlot(vehicle3, slotKey3);

            park.checkInStore(slot);
            park.checkInStore(slot2);
            park.checkInStore(slot3);
            
            Slot returnSlot = park.checkForSlotByKey(slotKey);
            Slot returnSlot2 = park.checkForSlotByKey(slotKey2);
            Slot returnSlot3 = park.checkForSlotByKey(slotKey3);
            
            Vehicle storeVehicle = returnSlot.getVehicle(returnSlot.getKey());
            Vehicle storeVehicle2 = returnSlot2.getVehicle(returnSlot2.getKey());
            Vehicle storeVehicle3 = returnSlot3.getVehicle(returnSlot3.getKey());
            
            System.out.println("SLOT 1 : " + storeVehicle.getOwnerName() + ", " + storeVehicle.getVehicleColor() + " , " + storeVehicle.getVehicleManufacturer() + ", " + storeVehicle.getVehicleType());
            System.out.println("SLOT 2 : " + storeVehicle2.getOwnerName() + ", " + storeVehicle2.getVehicleColor() + " , " + storeVehicle2.getVehicleManufacturer() + ", " + storeVehicle2.getVehicleType());
            System.out.println("SLOT 3 : " + storeVehicle3.getOwnerName() + ", " + storeVehicle3.getVehicleColor() + " , " + storeVehicle3.getVehicleManufacturer() + ", " + storeVehicle3.getVehicleType());
            
            System.out.println("Available slots in park : " + park.availableSlotsInPark());
            System.out.println("Maximum capacity : " + park.maxCapacityOfPark());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(CarParkingSolution.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
