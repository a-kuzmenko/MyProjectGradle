package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardView extends BasePage{
	@FindBy(xpath="//div[@class='section_nav']//span")
	private WebElement userEmail;

	@FindBy(xpath="//div[@class='section_nav']//a[text() = 'Создать письмо']")
	private WebElement createLetter;

	@FindBy(xpath="//div[@class='block_confirmation']//div[contains(text(),'Письмо успешно отправлено адресатам')]")
	private WebElement confirmation;

	@FindBy(xpath="//ul[@class='list_underlined']//li[@class='new']")
	private WebElement incomingEmail;

	@FindBy(xpath="//span[@class='frm'][1]")
	private WebElement incomingLetter;

	@FindBy(xpath="//ul[@class='messages']//h3")
	private WebElement incomingTheme;

	@FindBy(xpath="//div[@class='message_body']//pre")
	private WebElement incomingMessageBody;

	public String getUserEmail(){
	    return  userEmail.getText();
    }

	public String getConfirmation(){
		return  confirmation.getText();
	}

	public String getIncomingTheme(){
		return  incomingTheme.getText();
	}

	public String getIncomingMessageBody(){
		return  incomingMessageBody.getText();
	}

	public DashboardView clickOnCreateLetter() {
		createLetter.click();
		return this;
	}

	public DashboardView clickOnIncomingEmail() {
		incomingEmail.click();
		return this;
	}

	public DashboardView clickOnIncomingLetter() {
		incomingLetter.click();
		return this;
	}
}
