package com.locator;

public class AuditPageLocator {
    public String mRiskAssessmentColor ="//span[contains(text(),'Chief Auditors')]//following::div[@class='FieldLayout---input_below']//following::tbody/tr/td/div/p/a";
    public String mRiskAssessmentText="//span[contains(text(),'Chief Auditors')]//following::div[@class='FieldLayout---input_below']//following::tbody/tr/td/div/p[text()[normalize-space() = '3']]/a/span";
}
