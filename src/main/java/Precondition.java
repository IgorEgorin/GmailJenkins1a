import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Precondition extends InstanceForAllPages{


    @Parameters({"browser"})
    @BeforeMethod
    protected void setUpMethod() {

        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "Chrome";
        Configuration.timeout = 10000;
        Selenide.open("https://mail.google.com/mail/u/0/#inbox");
    }

    @AfterClass
    public void quit() {
        Selenide.close();
    }
}

