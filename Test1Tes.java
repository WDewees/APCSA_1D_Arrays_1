import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Test1Test {

   @Test
   public void testCalcSum()
   {
     Test1 t = new Test1();
     int[] array = {1,2,3,4,5};
     assertEquals(15,t.calcSum(array));
   }
}
