package Christian.Andrade;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {
private Number number;
    @Test
    public void addNumbers() {
        this.number=new Number(4,5);
        assertEquals(9,this.number.addNumbers());
    }
}