package Christian.Andrade;

import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
    private Name name ;
    @Test
    public void numbersOfCharacter(){
        this.name=new Name("Pajaro");
        assertEquals(6,this.name.numbersOfCharacter());
    }
}