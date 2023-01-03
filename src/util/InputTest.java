package util;

import util.Input;
import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input(new Scanner(System.in));

        input.yesNo("Respond by typing (Y)es or (N)o here: ");
        input.getInt(1, 10);
        input.getInt("Type whole number here: ");
        input.getString("Type word(s) here: ");
        input.getDouble(.10, .20);
        input.getDouble("Type decimal here: ");

    }

}
