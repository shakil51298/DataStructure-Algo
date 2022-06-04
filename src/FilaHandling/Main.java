package FilaHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File myObj = new File("./e.java");
        System.out.println(myObj.exists());

    }
}
