import controller.ManagementController;
import domain.Student;
import validate.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ManagementController managementController = new ManagementController();
        managementController.run();
    }
}
