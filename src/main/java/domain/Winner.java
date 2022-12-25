package domain;

public class Winner {
    public static String winner;

    public static String awards(Cars cars) {
        int maxDistance = 0;

        for (Car car : cars.getCar()) {
            if(car.getDistance() == maxDistance) {
                winner += car.getName() + ",";
            }

            else if(car.getDistance() > maxDistance) {
                maxDistance = car.getDistance();

                winner = car.getName() + ",";
            }
        }

        return winner.substring(0, winner.length() - 1);
    }
}
