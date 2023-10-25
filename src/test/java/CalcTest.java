import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@Epic("Calculator Test Epic")
@Feature("Calculating Some Valid Values")
@ExtendWith(TestListener.class)
public class CalcTest extends TestConfig {

    @Owner("Mazay - Aston_AQA_Academy_Student")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Division of some values")
    @Description("Calculate the division of some values")
    @Test
    public void divideTest() {
        calc.nine().zero().divide().three().equal();
        actualExpr = calc.getExpr();
        actualExprRes = calc.getExprRes();
        expectedExpr = "90÷3";
        expectedExprRes = "= 30";
        System.out.println(calc.getExpr() + "\n" + calc.getExprRes());
        Assertions.assertAll(() -> Assertions.assertTrue(expectedExpr.equals(actualExpr)),
                () -> Assertions.assertTrue(expectedExprRes.equals(actualExprRes)));
    }

    @Owner("Mazay - Aston_AQA_Academy_Student")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Multiplication of some values")
    @Description("Calculate the multiplication of some values")
    @Test
    public void multiplyTest() {
        calc.clear().clear().one().eight().multiply().nine().equal();
        actualExpr = calc.getExpr();
        actualExprRes = calc.getExprRes();
        expectedExpr = "18×9";
        expectedExprRes = "= 162";
        System.out.println(calc.getExpr() + "\n" + calc.getExprRes());
        Assertions.assertAll(() -> Assertions.assertTrue(expectedExpr.equals(actualExpr)),
                () -> Assertions.assertTrue(actualExprRes.equals(expectedExprRes)));
    }
    @Owner("Mazay - Aston_AQA_Academy_Student")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Summing of some values")
    @Description("Calculate the summing of some values")
    @Test
    public void sumTest() {
        calc.clear().clear().one().eight().nine().plus().two().seven().nine().equal();
        actualExpr = calc.getExpr();
        actualExprRes = calc.getExprRes();
        expectedExpr = "189+279";
        expectedExprRes = "= 468";
        System.out.println(calc.getExpr() + "\n" + calc.getExprRes());
        Assertions.assertAll(() -> Assertions.assertTrue(expectedExpr.equals(actualExpr)),
                () -> Assertions.assertTrue(actualExprRes.equals(expectedExprRes)));
    }
    @Owner("Mazay -  Aston_AQA_Academy_Student")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Difference between two values")
    @Description("Calculate the difference between two values")
    @Test
    public void subTest() {
        calc.clear().clear().three().nine().six().sub().six().three().nine().equal();
        actualExpr = calc.getExpr();
        actualExprRes = calc.getExprRes();
        expectedExpr = "396-639";
        expectedExprRes = "= -243";
        System.out.println(calc.getExpr() + "\n" + calc.getExprRes());
        Assertions.assertAll(() -> Assertions.assertTrue(expectedExpr.equals(actualExpr)),
                () -> Assertions.assertTrue(actualExprRes.equals(expectedExprRes)));
    }
}
