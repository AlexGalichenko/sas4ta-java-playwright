package org.sas4ta.po;

import com.microsoft.playwright.Page;
import org.sas4ta.po.BasePage;

public class DoctorForm extends BasePage {
    private final String FORM_SELECTOR = "[cssclass=\"new-doctor-dialog\"]";
    private final String NAME_INPUT_SELECTOR = "input[name=Name]";
    private final String GENDER_SELECTOR = ".gender label[for]";
    private final String MOBILE_SELECTOR = "input[name=Mobile]";
    private final String EMAIL_SELECTOR = "input[name=Email]";
    private final String EDUCATION_SELECTOR = "input[name=Education]";
    private final String SUBMIT_BUTTON = ".button-container button.e-primary";
    private final String CANCEL_BUTTON = ".button-container button:nth-child(1)";

    public DoctorForm(Page page) {
        super(page);
    }

    public void setName(String name) {
        if (name != null) {
            page.locator(NAME_INPUT_SELECTOR).type(name);
        }
    }

    public void setGender(String gender) {
        if (gender != null) {
            page.locator(GENDER_SELECTOR, new Page.LocatorOptions().setHasText(gender)).click();
        }
    }

    public void setMobile(String mobile) {
        if (mobile != null) {
            page.locator(MOBILE_SELECTOR).type(mobile);
        }
    }

    public void setEmail(String email) {
        if (email != null) {
            page.locator(EMAIL_SELECTOR).type(email);
        }
    }

    public void setEducation(String education) {
        if (education != null) {
            page.locator(EDUCATION_SELECTOR).type(education);
        }
    }

    public void cancel() {
        page.locator(CANCEL_BUTTON).click();
    }

    public void submit() {
        page.locator(SUBMIT_BUTTON).click();
    }


    public boolean isVisible() {
        return page.locator(FORM_SELECTOR).isVisible();
    }
}
