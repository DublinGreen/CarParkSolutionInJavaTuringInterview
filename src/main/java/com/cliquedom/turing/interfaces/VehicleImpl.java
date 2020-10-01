package com.cliquedom.turing.interfaces;

import com.cliquedom.turing.exceptions.SlotKeyGeneratorException;
import com.cliquedom.turing.vehicle.Vehicle;
import com.cliquedom.turing.vehicle.VehicleTypeEnum;

/**
 *
 * @author green
 */
public interface VehicleImpl {
    
    public void setOwnerName(String value);
    public String getOwnerName();
    
    public void setVehicleColor(String value);
    public String getVehicleColor();
    
    public void setVehicleType(VehicleTypeEnum value);
    public VehicleTypeEnum getVehicleType();
    
    public void setVehicleManufacturer(String value);
    public String getVehicleManufacturer();
    
    public Vehicle buildVehicle(String ownerName, String color, String manufacturer,VehicleTypeEnum type);
}
