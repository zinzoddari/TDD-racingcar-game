package view;

import domain.Car;

public class PrintOut extends Print {
    public static void result(Car car) {
        print(car.getName() + ":" + car.getStringDistance());
    }

    public static void printFinalResult(String winner) {
        print("최종 우승자 : " + winner);
    }

    public static void printRunResult() {
        print("실행 결과");
    }

    public static void printEnter() {
        print("");
    }


}
