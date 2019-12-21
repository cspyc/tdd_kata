package Collection;

import org.junit.Assert;
import org.junit.Test;

public class ChangeCollectionObjectTest {
    @Test
    public void change_collection_Object_value() {
        ChangeCollectionObject changeObjValue = new ChangeCollectionObject();
        Assert.assertEquals("origin1",changeObjValue.getOriginCollection().get(0).get(0).getValueA());
        Assert.assertEquals("origin2",changeObjValue.getOriginCollection().get(0).get(1).getValueA());
        Assert.assertEquals("changed",changeObjValue.changeValue().get(0).get(0).getValueA());
    }
}
