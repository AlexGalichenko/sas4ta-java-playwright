package org.sas4ta.test;

import org.junit.jupiter.api.Test;
import org.sas4ta.models.DoctorData;
import org.sas4ta.models.Gender;
import org.sas4ta.po.DashboardPage;
import org.sas4ta.po.DoctorsPage;

import static org.junit.jupiter.api.Assertions.*;

class TestPlaywright2 extends BaseTest {

    @Test
    void testAddDoctor() {
        DashboardPage dashboardPage = new DashboardPage(page);
        dashboardPage.navigate();
        dashboardPage.openPage("Doctors");
        DoctorsPage doctorsPage = new DoctorsPage(page);
        DoctorData doctorData = new DoctorData()
                        .setName("Jane Dou")
                        .setGender(Gender.FEMALE)
                        .setMobile("1234567890")
                        .setEmail("email@email.com")
                        .setEduction("Hogwarts");
        doctorsPage.invokeAddDoctorForm();
        doctorsPage.fillDoctorForm(doctorData);
        doctorsPage.submitDoctorForm();
        assertEquals(doctorsPage.getNumberOfDoctorCards(), 8);
        assertTrue(doctorsPage.getTextOfCard(7).contains("Jane Dou"));
    }

    @Test
    void testCancelAddDoctorForm() {
        DashboardPage dashboardPage = new DashboardPage(page);
        dashboardPage.navigate();
        dashboardPage.openPage("Doctors");
        DoctorsPage doctorsPage = new DoctorsPage(page);
        DoctorData doctorData = new DoctorData()
                .setName("Jane Dou")
                .setGender(Gender.FEMALE)
                .setMobile("1234567890")
                .setEmail("email@email.com")
                .setEduction("Hogwarts");
        doctorsPage.invokeAddDoctorForm();
        doctorsPage.fillDoctorForm(doctorData);
        doctorsPage.closeDoctorForm();
        assertFalse(doctorsPage.getDoctorFormVisibility());
        assertEquals(doctorsPage.getNumberOfDoctorCards(), 7);
    }

    @Test
    void testCannotSaveWithoutMandatoryField() {
        DashboardPage dashboardPage = new DashboardPage(page);
        dashboardPage.navigate();
        dashboardPage.openPage("Doctors");
        DoctorsPage doctorsPage = new DoctorsPage(page);
        DoctorData doctorData = new DoctorData()
                .setName("Jane Dou")
                .setGender(Gender.FEMALE)
                .setMobile("1234567890")
                .setEmail("email@email.com");
        doctorsPage.invokeAddDoctorForm();
        doctorsPage.fillDoctorForm(doctorData);
        doctorsPage.submitDoctorForm();
        assertTrue(doctorsPage.getDoctorFormVisibility());
        assertEquals(doctorsPage.getNumberOfDoctorCards(), 7);
    }

}