import org.testng.Assert;
import org.testng.annotations.Test;

public class mainMethodTest {


    @Test
    public void shouldGetCorrectNumber() {

        Assert.assertEquals(MainMethod.fizzBuzz(1),"1");
    }
    @Test
    public void shouldGetFizz() {
        Assert.assertEquals(MainMethod.fizzBuzz(3),"Fizz");
    }
    @Test
    public void shouldGetBuzz() {
        Assert.assertEquals(MainMethod.fizzBuzz(5),"Buzz");
    }
    @Test
    public void shouldGetFizzBuzz() {
        Assert.assertEquals(MainMethod.fizzBuzz(30),"FizzBuzz");
    }

}