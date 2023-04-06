package org.example.momento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    private final Map<String, Momento> savepointStorage = new HashMap<String, Momento>();

    public void saveMomento(Momento momento, String savepointName) {
        System.out.println("Saving state..." + savepointName);
        savepointStorage.put(savepointName, momento);
    }

    public Momento getMomento(String savepointName) {
        System.out.println("Undo at ..." + savepointName);

        return savepointStorage.get(savepointName);
    }

    public void clearSavepoints() {
        System.out.println("Clearing all save points...");

        savepointStorage.clear();
    }
}
