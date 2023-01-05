package domain;

import java.util.stream.Collectors;

public class Winner {
    public static String winner = "";

    public static String awards(Cars cars) {
        int maxDistance = cars.getCar().stream()
                .mapToInt(v -> v.getDistance())
                .max()
                .getAsInt();

        cars.getCar().stream()
                .filter(car -> car.getDistance() == maxDistance)
                .collect(Collectors.toList())
                .forEach(car -> {
                    winner += car.getName() + ",";
                });

        return winner.substring(0, winner.length() - 1);
    }
}
