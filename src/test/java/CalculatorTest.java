import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
//    Calculator casio = new Calculator(); mozhno vinesti na urovenj klassa tem samim uprostitj test
    // net neobhodimosti togda eto pisatj pered Assert.asertEquals()!
    @Test
    public void testSum() {
        Calculator casio = new Calculator(); // sozdatj novij objekt kaljkuljatora, chtobi vizvatj metodi
        //int sumNumber = casio.sum(5,6); // sohranjaem rezultat v peremennuju
        //System.out.println(sumNumber);//prisvoitj rezultat peremennoj
        Assert.assertEquals(casio.sum(10, 50), 60); // imeet raznuju realizaciju vnutri ctrl+P
    }
    @Test
    public void testSubstract() {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.substract(80, 50), 30);
    }
    @Test
    public void testDivide() {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.divide(80, 40), 2);
    }
    @Test
    public void testMultiply() {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.multiply(5,4), 20);
    }
}
