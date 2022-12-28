import controller.RacingController;
import service.RacingService;

public class Application {

    public static void main(String[] args) {
        RacingController racingController = new RacingController(new RacingService());
        racingController.start();
    }
}
