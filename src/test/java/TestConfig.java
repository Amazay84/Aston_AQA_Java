import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public abstract class TestConfig {
    protected static EventFiringWebDriver driver;
    protected static CalcMainScreen calc;
    public String expectedExpr;
    public String expectedExprRes;
    public String actualExpr;
    public String actualExprRes;

    public static void initDrv() {
        driver = MobileFactory.getAndroidDriver();
        calc = new CalcMainScreen(driver);
        driver.register(new CustomRep());
    }
    @BeforeAll
    public static void setup() {
        initDrv();
        calc.clear().clear();
    }

    @AfterEach
    public void tearDown() {
        actualExpr = "";
        actualExprRes = "";
        expectedExpr = "";
        expectedExprRes = "";
        calc.clear().clear();
        System.out.println("----------");
    }

    @AfterAll
    public static void teardown() {
        calc.closeCalcApp();
    }
}
