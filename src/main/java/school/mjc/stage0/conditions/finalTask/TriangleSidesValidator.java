package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public static void main(String[] args) {
        validate(5,25,1);
    }
    public static void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide+secondSide>thirdSide && secondSide+thirdSide>firstSide && firstSide+thirdSide>secondSide) {
                System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }

    }
}
