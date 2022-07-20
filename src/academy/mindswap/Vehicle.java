package academy.mindswap;

import static academy.mindswap.Message.*;

public abstract class Vehicle {
    private int tankFuelLevel;
    private String modelName;
    private float gasConsumption;
    private int maximumSpeed;

    public Vehicle(String modelName, float gasConsumption,int maximumSpeed) {
        this.modelName = modelName;
        this.gasConsumption = gasConsumption;
        tankFuelLevel = 25;
        this.maximumSpeed=maximumSpeed;
    }
    public void startTrip(float distance, float time) {
        if (isSpeedLimitViolated(distance, time)) {
            Message.print(SPEED_LIMIT_VIOLATED);
            return;
        }
        if (!isEnoughtGas(distance)) {
            Message.print(GAS_LIMIT_VIOLATED);
            return;
        }
        decreaseFuel(calculateNecessaryGas(distance));
        Message.print(TRIP_ALLOWED);
    }
    private boolean isSpeedLimitViolated(float distance, float time) {
        return calculateNecessarySpeed(distance, time) > getMaximumSpeed() ? true : false;
    }
    protected float calculateNecessarySpeed(float distance, float time) {
        return distance / time;
    }
    private boolean isEnoughtGas(float distance) {
        return calculateNecessaryGas(distance) <= getTankFuelLevel() ? true : false;
    }

    public void decreaseFuel(float fuelSpent) {
        tankFuelLevel -= fuelSpent;
    }

    public float calculateNecessaryGas(float distance) {
        return (distance * getGasConsumption()) / 100;
    }

    public void refuellGas() {
        tankFuelLevel = 25;
    }

    public int getTankFuelLevel() {
        return tankFuelLevel;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public float getGasConsumption() {
        return gasConsumption;
    }


}

