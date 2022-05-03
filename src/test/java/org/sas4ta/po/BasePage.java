package org.sas4ta.po;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

abstract public class BasePage {
    Page page;
    String baseUrl = "https://ej2.syncfusion.com/showcase/angular/appointmentplanner/#/dashboard";

    private final String SIDE_BAR_SELECTOR = ".sidebar-item";
    public BasePage(Page page) {
        this.page = page;
    }

    public void openPage(String pageName) {
        Page.LocatorOptions opts = new Page.LocatorOptions().setHasText(pageName);
        page.locator(SIDE_BAR_SELECTOR, opts).click();
    }

    public void navigate() {
        page.navigate(baseUrl);
    }
}
