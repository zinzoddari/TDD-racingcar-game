import domain.Car;
import domain.Cars;
import org.junit.jupiter.api.Test;
import utils.StringUtils;

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

    @Test
    void 문자열_테스트_성공() {
        String input1 = "abcde";
        String input2 = "abc,def";

        String arr[] = StringUtils.stringSplit(input1, ",");
        String arr1[] = StringUtils.stringSplit(input2, ",");

        assertThat(arr).contains("abcde");
        assertThat(arr1).contains("abc", "def");
    }

    @Test
    void 문자열_테스트_실패() {
        String input1 = "abcde";
        String input2 = "abc,def";

        String arr[] = StringUtils.stringSplit(input1, ",");
        String arr1[] = StringUtils.stringSplit(input2, ",");

        assertThat(arr).doesNotContain("");
        assertThat(arr1).doesNotContain("abcd", "defs");
    }

    @Test
    void 자동차_여러대_입력_성공() {
        String input = "zinzo,abcd";
        Cars cars = new Cars(input);

        assertThat(cars.getSize()).isEqualTo(2);
    }

    @Test
    void 자동차_여러대_입력_실패() {
        String input = "zinzo,abcddd";

        assertThatIllegalArgumentException().isThrownBy(() -> {
            Cars cars = new Cars(input);
        });
    }

    @Test
    void 자동차_MAX값_이상_입력_오류() {
        String input = "zinzo,abcd,a,d,c,h,u,g,j,i";

        assertThatIllegalArgumentException().isThrownBy(() -> {
            Cars cars = new Cars(input);
        });
    }

    @Test
    void 자동차_하나_반복횟수_입력_성공() {
        Cars cars = new Cars("abcdef", 3);
    }
}
