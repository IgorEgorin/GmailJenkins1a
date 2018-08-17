import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainGooglePage {
    private SelenideElement enterMailOnAuthPage;
    private SelenideElement pressEnterOnMailOnAuthPage;

    private SelenideElement enterPassOnAuthPage;
    private SelenideElement pressEnterOnPassOnAuthPage;


    private SelenideElement writeTab;
    private SelenideElement draftClickOnEmptySpaceTextWindow;
    private SelenideElement closeLetterWindow;

    public MainGooglePage() {
        this.enterMailOnAuthPage = $("[type=\"email\"]");
        this.pressEnterOnMailOnAuthPage = $("[class=\"CwaK9\"]",1);
        this.enterPassOnAuthPage = $("[type=\"password\"]");
        this.pressEnterOnPassOnAuthPage = $("[class=\"RveJvd snByac\"]",0);

        this.writeTab = $("[class=\"T-I J-J5-Ji T-I-KE L3\"]");
        this.draftClickOnEmptySpaceTextWindow = $("[class=\"Am Al editable LW-avf\"]");
        this.closeLetterWindow = $("[class=\"Ha\"]");
    }

    public MainGooglePage enterMailAndPassForAuth(String s, String sTwo) {
        enterMailOnAuthPage.sendKeys(s);
        pressEnterOnMailOnAuthPage.click();
        enterPassOnAuthPage.sendKeys(sTwo);
        pressEnterOnPassOnAuthPage.click();
        return new MainGooglePage();
    }

    public MainGooglePage enterTextInDraftAndThenSave(String s) {
        writeTab.click();
        draftClickOnEmptySpaceTextWindow.sendKeys(s);
        closeLetterWindow.click();
        return new MainGooglePage();
    }
}
