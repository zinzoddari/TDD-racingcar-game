import domain.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RunTest {
    @Test
    void 전진_성공() {
        int advance = 4;
        Car car = new Car("zz");
        car.run(advance);

        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void 전진_실패() {
        int advance = 4;
        Car car = new Car("zz");
        car.run(advance);

        assertThat(car.getDistance()).isNotEqualTo(0);
    }

    @Test
    void 멈춤_성공() {
        int advance = 3;
        Car car = new Car("zz");
        car.run(advance);

        assertThat(car.getDistance()).isEqualTo(0);
    }

    @Test
    void 멈춤_실패() {
        int advance = 3;
        Car car = new Car("zz");
        car.run(advance);

        assertThat(car.getDistance()).isNotEqualTo(1);
    }
}
