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
                CarName = PrintIn.inputValue();
                cars = new Cars(CarName);
            }
            catch (IllegalArgumentException e) {
                continue;
            }

            break;
        }

        cars.setLoop(carPlay());

        return cars;
    }

    public int carPlay() {
        int loop = 0;

        PrintIn.printInputLoop();

        while(true) {
            try {
                loop = Integer.parseInt(Console.readLine());
            }
            catch (IllegalArgumentException e) {
                continue;
            }

            break;
        }

        return loop;
    }
}
