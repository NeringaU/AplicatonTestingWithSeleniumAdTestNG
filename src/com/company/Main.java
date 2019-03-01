package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Main {
    WebDriver browser;

    public static void main(String[] args) {

        System.out.println("Aplikacijos testavimas");
    }

    @BeforeTest

    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neringa\\IdeaProjects\\chromedriver.exe");
        this.browser = new ChromeDriver();
    }

    @Test

    public void testIrasoKuriasTeigiamas() {
        browser.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php?fbclid=IwAR382oSYU0IB--Bx81eXjctFV_-iwsOSB8mFVuqinp4rNy-Ou3zzCO2XZcA");

        String pavadinimas = "Pavasaris";
        String zanras = "drama";
        String rezisierius = "Julia Roberts";

        waitForElementByName(browser, 1, "pavadinimas");

        WebElement searchField = browser.findElement(By.name("pavadinimas"));
        searchField.sendKeys(pavadinimas);

        waitForElementByName(browser, 1, "zanras");

        WebElement searchField1 = browser.findElement(By.name("zanras"));
        searchField1.sendKeys(zanras);

        waitForElementByName(browser, 1, "rezisierius");

        WebElement searchField2 = browser.findElement(By.name("rezisierius"));
        searchField2.sendKeys(rezisierius);

        waitForElementByName(browser, 1, "insert");

        WebElement mygtukasIrasyti = browser.findElement(By.name("insert"));
        mygtukasIrasyti.click();

        waitForElementByClassName(browser, 1, "msg-good");
    }

    @Test

    public void testIrasoKuriasNeigiamas() {
        browser.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php?fbclid=IwAR382oSYU0IB--Bx81eXjctFV_-iwsOSB8mFVuqinp4rNy-Ou3zzCO2XZcA");

        String pavadinimas = "6423";
        String zanras = "242";
        String rezisierius = "44343";

        waitForElementByName(browser, 1, "pavadinimas");
        WebElement searchField = browser.findElement(By.name("pavadinimas"));
        searchField.sendKeys(pavadinimas);

        waitForElementByName(browser, 1, "zanras");
        WebElement searchField1 = browser.findElement(By.name("zanras"));
        searchField1.sendKeys(zanras);

        waitForElementByName(browser, 1, "rezisierius");
        WebElement searchField2 = browser.findElement(By.name("rezisierius"));
        searchField2.sendKeys(rezisierius);

        waitForElementByName(browser, 1, "insert");
        WebElement mygtukasIrasyti = browser.findElement(By.name("insert"));
        mygtukasIrasyti.click();

        waitForElementByClassName(browser, 1, "msg-bad");
    }

    @Test
    public void testIrasoTrynimasSekmingas() {
        browser.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php?fbclid=IwAR382oSYU0IB--Bx81eXjctFV_-iwsOSB8mFVuqinp4rNy-Ou3zzCO2XZcA");

        String id = "101";

        waitForElementByName(browser, 1, "id");

        WebElement searchField3 = browser.findElement(By.name("id"));
        searchField3.sendKeys(id);

        waitForElementByName(browser, 1, "delete");

        WebElement mygtukasTrinti = browser.findElement(By.name("delete"));
        mygtukasTrinti.click();

        waitForElementByClassName(browser, 1, "msg-good");

    }

    @Test

    public void testIrasoRedagavimuiSekmingas() {
        browser.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php?fbclid=IwAR382oSYU0IB--Bx81eXjctFV_-iwsOSB8mFVuqinp4rNy-Ou3zzCO2XZcA");

        String id = "72";
        String pavadinimas = "Vasara";
        String zanras = "komedija";
        String rezisierius = "Demi Moor";

        waitForElementByName(browser, 1, "id");
        WebElement searchField3 = browser.findElement(By.name("id"));
        searchField3.sendKeys(id);

        waitForElementByName(browser, 1, "pavadinimas");
        WebElement searchField = browser.findElement(By.name("pavadinimas"));
        searchField.sendKeys(pavadinimas);

        waitForElementByName(browser, 1, "zanras");
        WebElement searchField1 = browser.findElement(By.name("zanras"));
        searchField1.sendKeys(zanras);

        waitForElementByName(browser, 1, "rezisierius");
        WebElement searchField2 = browser.findElement(By.name("rezisierius"));
        searchField2.sendKeys(rezisierius);

        waitForElementByName(browser, 1, "update");
        WebElement mygtukasredaguoti = browser.findElement(By.name("update"));
        mygtukasredaguoti.click();

        waitForElementByClassName(browser, 1, "msg-good");
    }

    @Test

    public void testIrasoRedagavimuiNeSekmingas() {
        browser.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php?fbclid=IwAR382oSYU0IB--Bx81eXjctFV_-iwsOSB8mFVuqinp4rNy-Ou3zzCO2XZcA");

        String id = "75";
        String pavadinimas = "Ziem2";
        String zanras = "0931?><";
        String rezisierius = "Jonas";

        waitForElementByName(browser, 1, "id");
        WebElement searchField3 = browser.findElement(By.name("id"));
        searchField3.sendKeys(id);

        waitForElementByName(browser, 1, "pavadinimas");
        WebElement searchField = browser.findElement(By.name("pavadinimas"));
        searchField.sendKeys(pavadinimas);

        waitForElementByName(browser, 1, "zanras");
        WebElement searchField1 = browser.findElement(By.name("zanras"));
        searchField1.sendKeys(zanras);

        waitForElementByName(browser, 1, "rezisierius");
        WebElement searchField2 = browser.findElement(By.name("rezisierius"));
        searchField2.sendKeys(rezisierius);

        waitForElementByName(browser, 1, "update");
        WebElement mygtukasredaguoti = browser.findElement(By.name("update"));
        mygtukasredaguoti.click();

        waitForElementByClassName(browser, 1, "msg-bad");
    }


    @AfterTest

    public void browserClose() {
        browser.close();
    }


    static private void waitForElementById(WebDriver browser, int timeOutInSec, String id) {
        WebDriverWait waitas = new WebDriverWait(browser, timeOutInSec);
        waitas.until(ExpectedConditions.elementToBeClickable(By.id(id)));
    }

    static private void waitForElementByClassName(WebDriver browser, int timeOutSec, String className) {
        WebDriverWait waitas = new WebDriverWait(browser, timeOutSec);
        waitas.until(ExpectedConditions.elementToBeClickable(By.className(className)));
    }

    static private void waitForElementByName(WebDriver browser, int timeOutSec, String Name) {
        WebDriverWait waitas = new WebDriverWait(browser, timeOutSec);
        waitas.until(ExpectedConditions.elementToBeClickable(By.name(Name)));
    }

    static private void waitForElementByXpath(WebDriver browser, int timeOutSec, String Xpath) {
        WebDriverWait waitas = new WebDriverWait(browser, timeOutSec);
        waitas.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath)));
    }

}
