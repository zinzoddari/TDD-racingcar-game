package controller;

import domain.Cars;
import domain.Winner;
import service.RacingService;
import view.PrintOut;

public class RacingController {

    private final RacingService racingService;

    public RacingController(RacingService racingService) {
        this.racingService = racingService;
    }

    public void start() {
        Cars cars = racingService.carCreate();

        PrintOut.printRunResult();
        for (int i = 0; i < cars.getLoop(); i++) {
            cars.run();
        }

        PrintOut.printFinalResult(Winner.awards(cars));
    }
}
