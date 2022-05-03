package org.sas4ta.po;

import com.microsoft.playwright.Page;
import org.sas4ta.models.DoctorData;

public class DoctorsPage extends BasePage {

    String url = "#/doctors";
    private final String ADD_DOCTOR_BUTTON_SELECTOR = ".specialization-types button.e-control.e-primary";
    private final String DOCTOR_CARDS_SELECTOR = ".specialist-display > div";
    private final DoctorForm doctorForm;
    public DoctorsPage(Page page) {
        super(page);
        this.doctorForm = new DoctorForm(page);
    }

    public void invokeAddDoctorForm() {
        page.locator(ADD_DOCTOR_BUTTON_SELECTOR).click();
    }

    public void closeDoctorForm() {
        doctorForm.cancel();
    }

    public void submitDoctorForm() {
        doctorForm.submit();
    }

    public boolean getDoctorFormVisibility() {
        return doctorForm.isVisible();
    }

    public void fillDoctorForm(DoctorData doctorData) {
        doctorForm.setName(doctorData.getName());
        doctorForm.setGender(doctorData.getGender().getGender());
        doctorForm.setMobile(doctorData.getMobile());
        doctorForm.setEmail(doctorData.getEmail());
        doctorForm.setEducation(doctorData.getEduction());
    }

    public int getNumberOfDoctorCards() {
        return page.locator(DOCTOR_CARDS_SELECTOR).count();
    }

    public String getTextOfCard(int n) {
        return page.locator(DOCTOR_CARDS_SELECTOR).nth(n).textContent();
    }
}