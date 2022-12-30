package service;

import domain.Cars;
import utils.Console;
import view.Print;
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
