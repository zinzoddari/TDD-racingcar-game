package service;

import domain.Cars;
import utils.Console;
import view.PrintIn;

public class RacingService {
    public Cars carCreate() {
        Cars cars;
        String CarName;

        PrintIn.printInputName();

        while(true) {
            try {
                CarName = Console.readLine();
                cars = new Cars(CarName);
            }
            catch (IllegalArgumentException e) {
                continue;
            }

            break;
        }

        return cars;
    }
}
