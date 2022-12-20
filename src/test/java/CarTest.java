import domain.Car;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void 자동차_하나_입력_성공() {
        String input = "zinzo";
        Car car = new Car(input);
    }
}
