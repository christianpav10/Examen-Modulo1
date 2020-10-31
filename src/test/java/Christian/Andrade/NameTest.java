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
    @Test
    public void changeWord(){
        this.name=new Name("LAPIZ");
        assertEquals("ZIPAL",this.name.changeWord());
    }
}