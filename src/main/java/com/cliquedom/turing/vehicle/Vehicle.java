package com.cliquedom.turing.vehicle;

import com.cliquedom.turing.interfaces.VehicleImpl;

/**
 *
 * @author green Vehicle class
 */
public class Vehicle implements VehicleImpl {

    private String ownerName;
    private String vehicleColor;
    private VehicleTypeEnum vehicleType;
    private String vehicleManufacturer;
    private Vehicle vehicle;

    @Override
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    @Override
    public String getOwnerName() {
        return this.ownerName;
    }

    @Override
    public void setVehicleColor(String value) {
        this.vehicleColor = value;
    }

    @Override
    public String getVehicleColor() {
        return this.vehicleColor;
    }

    @Override
    public void setVehicleType(VehicleTypeEnum value) {
        this.vehicleType = value;
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return this.vehicleType;
    }

    @Override
    public void setVehicleManufacturer(String value) {
        this.vehicleManufacturer = value;
    }

    @Override
    public String getVehicleManufacturer() {
        return this.vehicleManufacturer;
    }

    @Override
    public Vehicle buildVehicle(String ownerName, String color, String manufacturer,VehicleTypeEnum type){
        this.vehicle = new Vehicle();
        this.vehicle.setOwnerName(ownerName);
        this.vehicle.setVehicleColor(color);
        this.vehicle.setVehicleManufacturer(manufacturer);
        this.vehicle.setVehicleType(type);
        return this.vehicle;
    }

}
