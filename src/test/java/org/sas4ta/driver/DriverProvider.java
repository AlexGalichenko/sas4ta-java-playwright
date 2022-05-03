package org.sas4ta.driver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class DriverProvider {

    BrowserType.LaunchOptions opts;
    BrowserType browser;

    public DriverProvider() {
        String browserName = System.getenv().get("BROWSER") != null
                ? System.getenv().get("BROWSER")
                : "chromium";
        boolean headless = System.getenv().get("HEADLESS") != null && System.getenv().get("HEADLESS").equals("true");
        Playwright playwright = Playwright.create();
        opts = new BrowserType.LaunchOptions()
                .setHeadless(headless)
                .setSlowMo(50);
        switch (browserName) {
            case "webkit" -> browser = playwright.webkit();
            case "firefox" -> browser = playwright.firefox();
            case "chromium" -> browser = playwright.chromium();
            case "chrome" -> {
                browser = playwright.chromium();
                opts.setChannel("chrome");

            }
            case "edge" -> {
                browser = playwright.chromium();
                opts.setChannel("msedge");
            }
            default -> throw new IllegalStateException("Unexpected value: " + browserName);
        }
    }

    public Browser start() {
        return browser.launch(opts);
    }

}
