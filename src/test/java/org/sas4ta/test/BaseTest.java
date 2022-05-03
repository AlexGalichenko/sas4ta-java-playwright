package org.sas4ta.test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.sas4ta.driver.DriverProvider;
import org.sas4ta.driver.ViewPort;

public class BaseTest {

    static Browser driver;
    Page page;
    BrowserContext context;

    @BeforeAll
    static void beforeAll() {
        driver = new DriverProvider().start();
    }

    @BeforeEach
    void before() {
        ViewPort viewPort = new ViewPort();
        context = driver.newContext(
                new Browser.NewContextOptions()
                        .setViewportSize(viewPort.width, viewPort.height)
        );
        page = context.newPage();
    }

    @AfterEach
    void after() {
        context.close();
    }

    @AfterAll
    static void afterAll() {
        driver.close();
    }
}
