package stepdefinitions.darksky;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import java.util.List;

import static stepdefinitions.MainSD.mainController;

public class DarkSkySD {

    private WebElement webElement;

    @And("^Verify current temperature is between low and high value$")
    public void verifyCurrentTemperatureIsBetweenLowAndHighValue(DataTable table) throws Throwable {
        Thread.sleep(1000);
        List<List<String>> data = table.raw();

        this.webElement = mainController.getDriver().findElement(By.xpath(data.get(1).get(0)));
        int currentValue = this.getNumberFromString(this.webElement.getText(), 0);


        this.webElement = mainController.getDriver().findElement(By.xpath(data.get(1).get(1)));
        int lowValue = this.getNumberFromString(this.webElement.getText(), 1);


        this.webElement = mainController.getDriver().findElement(By.xpath(data.get(1).get(2)));
        int highValue = this.getNumberFromString(this.webElement.getText(), 1);

        Assert.assertTrue(currentValue >= lowValue && currentValue <= highValue);
    }

    private int getNumberFromString(String str, int index) {


        String strNum = str.split(" ")[index].substring(0, str.split(" ")[index].length() - 1);
        int num = 0;
        try {
            num = Integer.parseInt(strNum);
        } catch (Exception e) {

        }
        return num;
    }
}
