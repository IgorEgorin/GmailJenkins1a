import org.testng.annotations.Test;

public class EnterGmailDraft extends Precondition{

    @Test
    public void enterDataIntoDraft() throws Exception{

//            Thread.sleep(20000000);

    mainGooglePage.enterMailAndPassForAuth("9999999593a@gmail.com", "75038237a").
            enterTextInDraftAndThenSave("Test to save from idea");

    Thread.sleep(10000);

    }
}
