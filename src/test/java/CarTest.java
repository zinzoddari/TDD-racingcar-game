import domain.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarTest {
    @Test
    void 자동차_하나_입력_성공() {
        String input = "zinzo";
        Car car = new Car(input);
    }

    @Test
    void 자동차_하나_입력_오류() {
        String input = "abcdef";
        assertThatIllegalArgumentException().isThrownBy(() -> {
            Car car = new Car(input);
        });
    }
}
