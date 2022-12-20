package domain;

public class Car {
    private final String name;

    public Car(String name) {
        this.name = validateName(name);
    }

    private String validateName(String name) {
        if(5 > name.length()) {
            return name;
        }

        throw new IllegalArgumentException("[ERROR] 이름은 다섯글자 이하여야합니다.");
    }
}
