import org.junit.Assert;
import org.junit.Test;

public class ExpEvaluatorTest {

    @Test
    public void testFractionAddition() {
        ExpEvaluator solution = new ExpEvaluator();

        // 测试样例 1: "-1/2+1/2"
        String expression1 = "-1/2+1/2";
        String expected1 = "0/1";
        String result1 = solution.fractionAddition(expression1);
        Assert.assertEquals(expected1, result1);

        // 测试样例 2: "-1/2+1/2+1/3"
        String expression2 = "-1/2+1/2+1/3";
        String expected2 = "1/3";
        // 把1/3改为1/6，到步骤2后重新改为1/3
        String result2 = solution.fractionAddition(expression2);
        Assert.assertEquals(expected2, result2);

        // 测试样例 3: "1/3-1/2"
        String expression3 = "1/3-1/2";
        String expected3 = "-1/6";
        String result3 = solution.fractionAddition(expression3);
        Assert.assertEquals(expected3, result3);
    }
}