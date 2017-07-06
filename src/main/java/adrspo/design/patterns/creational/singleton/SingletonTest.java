package adrspo.design.patterns.creational.singleton;

import java.util.LinkedHashMap;
import java.util.List;

public class SingletonTest {

    public static void main(String args[]) {

        DatabaseConnector dbConnector = DatabaseConnector.getInstance();

        dbConnector.connect();
        LinkedHashMap<String, List<String>> queryresult = dbConnector.executeQuery("SELECT * FROM table");

        dbConnector.disconnect();
    }


}
