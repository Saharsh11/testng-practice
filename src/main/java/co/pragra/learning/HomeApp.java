package co.pragra.learning;

import java.util.ArrayList;
import java.util.List;

public class HomeApp {
    List<String> names = new ArrayList<String>();

    public boolean addName(String name) {
        return names.add(name);
    }
    public boolean removeName(String name){
        return names.remove(name);
    }

    public List<String> getNames() {
        return names;
    }
}
