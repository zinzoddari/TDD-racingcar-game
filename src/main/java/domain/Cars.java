package domain;

import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    public static final String CAR_NAME_DELIM = ",";
    private final List<Car> car;

    public Cars(String input) {
         this.car = setCar(input);
    }

    private List<Car> setCar(String input) {
        String nameArr[] = StringUtils.stringSplit(input, CAR_NAME_DELIM);

        List<Car> carList = new ArrayList<>();
        for (String name : nameArr) {
            carList.add(new Car(name));
        }

        return carList;
    }
}
