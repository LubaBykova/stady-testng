
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests {

   @ Test
   public void addTest() {
      Calculator calculator = new Calculator();
      int resultsAdd = calculator.add(3, 5);

      Assert.assertEquals(resultsAdd, 8);
   }

   @ Test
   public void multiTest() {
      Calculator calculator = new Calculator();
      int resultsAdd = calculator.multi(3, 5);

      Assert.assertEquals(resultsAdd, 15);
   }

   @ Test
   public void subTest() {
      Calculator calculator = new Calculator();
      int resultsAdd = calculator.sub(3, 5);

      Assert.assertEquals(resultsAdd, -2);
   }

   @ Test
   public void divTest() {
      Calculator calculator = new Calculator();
      int resultsAdd = calculator.div(5, 5);

      Assert.assertEquals(resultsAdd, 1);
   }





}
