import domain.Car;
import domain.Cars;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RunTest {
    @Test
    void 전진_성공() {
        int advance = 4;
        Car car = new Car("zz");
        car.move(advance);

        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void 전진_실패() {
        int advance = 4;
        Car car = new Car("zz");
        car.move(advance);

        assertThat(car.getDistance()).isNotEqualTo(0);
    }

    @Test
    void 멈춤_성공() {
        int advance = 3;
        Car car = new Car("zz");
        car.move(advance);

        assertThat(car.getDistance()).isEqualTo(0);
    }

    @Test
    void 멈춤_실패() {
        int advance = 3;
        Car car = new Car("zz");
        car.move(advance);

        assertThat(car.getDistance()).isNotEqualTo(1);
    }

    @Test
    void 반복_2번_전체_이동_성공() {
//        Cars cars = new Cars("zz", 2);
//        int advance = 4;
//
//        cars.play(advance);
//        Cars winner = cars.win();
//
//        assertThat(winner.getSize()).isEqualTo(2);
    }
}
