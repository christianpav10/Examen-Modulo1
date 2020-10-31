package Christian.Andrade;

public class Number {
    private int Number1,Number2;

    public Number(int number1, int number2) {
        Number1 = number1;
        Number2 = number2;
    }

    public int getNumber1() {
        return Number1;
    }

    public void setNumber1(int number1) {
        Number1 = number1;
    }

    public int getNumber2() {
        return Number2;
    }

    public void setNumber2(int number2) {
        Number2 = number2;
    }
    public int addNumbers(){
        return this.Number1+this.Number2;

    }
    public int substractNumbers(){
        return this.Number1-this.Number2;

    }
}
