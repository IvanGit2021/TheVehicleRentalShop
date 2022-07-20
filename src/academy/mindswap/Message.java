package academy.mindswap;

public final class Message {
    public static final String SPEED_LIMIT_VIOLATED = "The speed necessary to perform this trip in the required time, is higher than the vehicle's maximum speed.";
    public static final String GAS_LIMIT_VIOLATED = "The gas necessary to perform this trip in the required time, is higher than the car's maximum gas level.";
    public static final String TRIP_ALLOWED = "You're allowed to perform your trip.";
    public static final String HYBRID_TRIP_ALLOWED = "You made your trip in electric mode.";
    public static final String DISTANCE_LIMIT_VIOLATED = "Your motorcycle can't perform distances bigger than 80KM.";

    private Message() {
    }
    public static void print(String message) {
        System.out.println(message);
    }
}
