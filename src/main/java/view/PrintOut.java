package view;

import domain.Car;

public class PrintOut {
    public static void result(Car car) {
        print(car.getName() + ":" + car.getStringDistance());
    }

    public static void printInputName() {
        print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void printInputLoop() {
        print("시도할 회수는 몇회인가요?");
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

    private static void print(String string) {
        System.out.println(string);
    }
}
