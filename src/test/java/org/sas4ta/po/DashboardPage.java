package org.sas4ta.po;

import com.microsoft.playwright.Page;

public class DashboardPage extends BasePage {

    String url = "https://ej2.syncfusion.com/showcase/angular/appointmentplanner/#/dashboard";

    public DashboardPage(Page page) {
        super(page);
    }
}
