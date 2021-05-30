import tech.tablesaw.api.Table;

import java.io.IOException;

public class test_maven {


    public static void main(String[] args) throws IOException {
        Table titanic;
        titanic=Table.read().csv("/home/mostafa/Desktop/titanic/titanic.csv");
        System.out.println(titanic);
    }
}
