import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestSumOfNumbers{

	@Test
	public void testSumOfNumbers(){
		
		int num = 30;
		int methodHolder = SumOfNumbers.sumOfNumbers(num);
		int expectedResult = 165;
		assertEquals(expectedResult,methodHolder);
	}
}