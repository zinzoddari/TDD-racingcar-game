package controller;

import domain.Cars;
import service.RacingService;

public class RacingController {

    private final RacingService racingService;

    public RacingController(RacingService racingService) {
        this.racingService = racingService;
    }

    public void start() {
        Cars cars = racingService.carCreate();
    }
}
