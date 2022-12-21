package domain;

public class Car {
    public static final int CAR_NAME_MAX_LENGTH = 5;
    public static final int CAR_NAME_MIN_LENGTH = 1;
    public static final int CAR_MOVE_MIN_ADVANCE = 4;
    private final String name;
    private int distance = 0;

    public Car(String name) {
        this.name = validateName(name);
    }

    private String validateName(String name) {
        if(CAR_NAME_MIN_LENGTH <= name.length() && CAR_NAME_MAX_LENGTH >= name.length()) {
            return name;
        }

        throw new IllegalArgumentException("[ERROR] 이름은 다섯글자 이하여야합니다.");
    }

    public void run(int advance) {
        if(advance >= CAR_MOVE_MIN_ADVANCE) distance++;
    }

    public int getDistance() {
        return distance;
    }
}
