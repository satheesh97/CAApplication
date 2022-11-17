package com.step.steps;
import Enum.Log4Config;
import com.Steps.Definitions.AbstractStepDef;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class ManageRiskStep extends AbstractStepDef {

    WebDriver driver = getDrivr();
    SoftAssert softAssert = new SoftAssert();


    public void validateTabel(){

        String table ="//span[contains(text(),'Chief Auditors')]//following::div[@class='FieldLayout---input_below']//following::tbody/tr/td/div/p[text()[normalize-space() = '']]/a/span";
        String colour = null;
         List<WebElement> list= driver.findElements(By.xpath(table));
        for(int i =1;i<=6;i++){
            String rwoPath ="//span[contains(text(),'Chief Auditors')]//following::div[@class='FieldLayout---input_below']//following::tbody/tr["+i+"]/td/div/p[text()[normalize-space() = '']]";
            List <WebElement> listRow= driver.findElements(By.xpath(rwoPath));
            for(int l=1;l<listRow.size();l++) {
                String text = listRow.get(l).getText().trim();
                String Cell = "//span[contains(text(),'Chief Auditors')]//following::div[@class='FieldLayout---input_below']//following::tbody/tr["+i+"]/td/div/p[text()[normalize-space() = '"+text+"']]/a/span";
                if(text.length()<4) {
                    if(!text.isEmpty()) {
                        List<WebElement> listColor = driver.findElements(By.xpath(Cell));
                        for (int k = 0; k < listColor.size(); k++) {
                            colour = listColor.get(k).getCssValue("color");
                           // log.info("print color" + colour);

                        }

                    colorComparision(colour,  text);
                }
                }
            }
        }

    }

    public void colorComparision(String rgba, String code){
        float value = Float.parseFloat(code);
        if((value>=1.0&&value<2.5)){
            softAssert.assertEquals(rgba,"rgba(28, 193, 1, 1)");//green
        }else if((value>=2.5&&value<3.5)){
            softAssert.assertEquals(rgba,"rgba(247, 142, 21, 1)");//amber
        }else if(value>=3.5){
            softAssert.assertEquals(rgba,"rgba(222, 0, 55, 1)");///red
        }



    }
}
