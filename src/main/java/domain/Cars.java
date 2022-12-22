package domain;

import utils.Randoms;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {

    public static final String CAR_NAME_DELIM = ",";
    public static final int CARS_MIN_SIZE = 1;
    public static final int CARS_MAX_SIZE = 9;
    private final List<Car> car;
    private final int loop;

    public Cars(String input) {
        this.car = validateCars(setCar(input));
        this.loop = 0;
    }

    public Cars(String input, int count) {
         this.car = validateCars(setCar(input));
         this.loop = count;
    }

    private List<Car> validateCars(List<Car> carList) {
        if(CARS_MIN_SIZE <= carList.size() && CARS_MAX_SIZE >= carList.size()) return carList;
        throw new IllegalArgumentException("[ERROR] 한자릿 수까지만 가능합니다.");
    }

    private List<Car> setCar(String input) {
        String nameArr[] = StringUtils.stringSplit(input, CAR_NAME_DELIM);

        List<Car> carList = new ArrayList<>();
        for (String name : nameArr) {
            carList.add(new Car(name));
        }

        return carList;
    }

    public int getSize() {
        return car.size();
    }

    private Car run(Car car, int advance) {
        return car.move(advance);
    }

    public void play() {
        for (int i = 0; i < loop; i++) {
            for (Car car : car) {
                car = run(car, Randoms.pickNumberInRange(0, 9));
            }
        }
    }

    public void play(int advance) {
        for (int i = 0; i < loop; i++) {
            for (Car car : car) {
                car = run(car, advance);
            }
        }
    }

    public List<Car> win() {
        for (int i = 0; i < loop; i++) {

        }

        return null;
    }
}
