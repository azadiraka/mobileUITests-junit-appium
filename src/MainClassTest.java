import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        int expected = 14;
        Assert.assertTrue("getLocalNumber() returns the wrong value, it doesn't equal 14",this.getLocalNumber() == expected);
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("getClassNumber() returns the wrong value, it doesn't more than 45", this.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue("getClassString() returns the wrong value, it doesn't match 'hello' or 'Hello'", this.getClassString().contains("hello") || this.getClassString().contains("Hello"));
    }
}
