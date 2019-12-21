package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class ChangeCollectionObject {
    private Vector<List<TestObj>> originCollection = new Vector<List<TestObj>>();

    public Vector<List<TestObj>> changeValue() {
        for (int i = 0; i < originCollection.size(); i++) {
            List<TestObj> objList = originCollection.get(i);
            for (TestObj obj : objList) {
                obj.setValueA("changed");
            }
        }
        return originCollection;
    }

    public ChangeCollectionObject() {
        List<TestObj> list = new ArrayList<TestObj>();

        list.add(new TestObj("origin1"));
        list.add(new TestObj("origin2"));

        originCollection.add(list);
    }


    public Vector<List<TestObj>> getOriginCollection() {
        return originCollection;
    }

    public static  boolean saveActTest() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        saveActTest();
    }
}
