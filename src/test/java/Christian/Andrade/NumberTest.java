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
    @Test
    public void substractNumbers(){
        this.number=new Number (2,2);
        assertEquals(0,this.number.substractNumbers());

    }
    @Test
    public void multiplyNumbers(){
        this.number=new Number(2,2);
        assertEquals("4",this.number.multiplyNumbers());
    }
}