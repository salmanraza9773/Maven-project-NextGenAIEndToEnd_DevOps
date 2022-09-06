package com.telus.testng;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDemoEndToEnd {

	public WebDriver driver;

	// Parameterization of input values.
	String firstNamePathInput = "Salman";
	String lastNamePathInput = "Raza";
	String streetAddressPathInput = "Siwan,Bihar";
	String apartmentNoPathInput = "42";
	String statePathInput = "Bihar";
	String postalZipCodePathInput = "841226";
	String countryPathInput = "Austria";
	String emailPathInput = "salmanraza1306@gmail.com";
	String dateOfDemoPathInput = "30/07/2022";
	String convTimeHHPathInput = "05";
	String convTimeMMPathInput = "10";
	String mobilePathInput = "9773782031";
	String queryPathInput = "How to opt for a course?";

	// Parameterization of WebElemet path.
	String qaAutomationPath = "QA AUTOMATION";
	String practiceAutomationPath = "Practice Automation";
	String registrationFormPath = "Registration Form";
	String titlePath = "//*[@id=\"item-vfb-1\"]/div/h3";
	String firstNamePath = "vfb-5";
	String lastNamePath = "vfb-7";
	String genderMalePath = "vfb-8-1";
	String streetAddressPath = "vfb-13-address";
	String apartmentNoPath = "vfb-13-address-2";
	String statePath = "vfb-13-state";
	String postalZipCodePath = "vfb-13-zip";
	String countryPath = "//*[@id=\"vfb-13-country\"]";
	String emailPath = "vfb-14";
	String dateOfDemoPath = "vfb-18";
	String convTimeHHPath = "vfb-16-hour";
	String convTimeMMPath = "vfb-16-min";
	String mobilePath = "vfb-19";
	String functionalTestingPath = "vfb-20-4";
	String testNgPath = "vfb-20-1";
	String queryPath = "vfb-23";
	String retreiveValPath = "//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label";
	String verificationBoxPath = "//*[@id=\"vfb-3\"]";
	String submitButtonPath = "vfb-4";
	String verificationSuccessMsg = "//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div[1]/div/div/div/div/div";

	@Test(priority = 1)
	public void launchApplication() {

		// Set the system property for the Chrome driver.
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// Creating instance of Chrome driver.
		driver = new ChromeDriver();

		// Storing the Application Url in the String Variable.
		String url = "https://nxtgenaiacademy.com/";

		// Launch the application.
		driver.get(url);
		System.out.println("Application Launched.");

		// Maximize the window.
		driver.manage().window().maximize();

	}

	@Test(priority = 2)

	public void navigateToRegistrationForm() {

		Actions action = new Actions(driver);
		// Performing The Mouse Hover Action on the QA Automation.
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationPath));

		// Verify QA Automation is Displayed or Not.
		if (qaAutomation.isDisplayed()) {
			System.out.println("\nQA AUTOMATION is Displayed.");
			action.moveToElement(qaAutomation).perform();
		} else {
			System.out.println("QA AUTOMATION is Not Displayed.");
		}

		// Performing The Mouse Hover Action on the Practice Automation.
		WebElement pracAutomation = driver.findElement(By.linkText(practiceAutomationPath));

		// Verifying Practice Automation is Displayed or Not.
		if (pracAutomation.isDisplayed()) {
			System.out.println("Practice Automation is Displayed.");
			action.moveToElement(pracAutomation).perform();
		} else {
			System.out.println("Practice Automation is Not Displayed.");
		}

		WebElement registrationForm = driver.findElement(By.partialLinkText(registrationFormPath));
		// Verifying Registration Form is Displayed or Not.
		if (registrationForm.isDisplayed()) {
			System.out.println("Demo Site – Registration Form is Displayed.");

			// Clicking on Registration Form.
			registrationForm.click();
			System.out.println("Demo Site – Registration Form Page is Selected.");
		} else {
			System.out.println("Registration Form is not Displayed.");
		}

	}

	@Test(priority = 3)
	public void registerUserAccount() {

		// Verifying the Title of registration form.
		WebElement titleOfReg = driver.findElement(By.xpath(titlePath));
		String actTitle = titleOfReg.getText();
		String expTitle = "Register For Demo";

		// Verifying the Title of registration is Displayed or Not.
		if (titleOfReg.isDisplayed()) {
			System.out.println("\nThe Title is Displayed.");
		} else {
			System.out.println("The Title is not Displayed.");
		}

		// Comparing Actual Title with Expected Title.
		if (actTitle.equals(expTitle)) {
			System.out.println("The Title is Validated.");
			System.out.println("The Actual Title is " + actTitle+".");
		} else {
			System.out.println("The Actual Title and Expected Title are not Same.");
			System.out.println("The Actual Title is " + actTitle);
			System.out.println("The Expected Title is " + expTitle);
		}
		System.out.println("---------------------------------------------------------");

		// First Name.
		WebElement firstName = driver.findElement(By.id(firstNamePath));

		// Verifying First Name is Displayed or Not.
		if (firstName.isDisplayed()) {
			System.out.println("The First Name is Displayed.");
		} else {
			System.out.println("The First Name is not Displayed.");
		}

		// Verifying First Name is Enabled or Not.
		if (firstName.isEnabled()) {
			System.out.println("The First Name is Enabled.");

			// Enter First Name.
			firstName.sendKeys(firstNamePathInput);
			System.out.println("The First Name is " + firstNamePathInput+".");
		} else {
			System.out.println("The First Name is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

		// Last Name.
		WebElement lastName = driver.findElement(By.id(lastNamePath));

		// Verifying Last Name is Displayed or Not.
		if (lastName.isDisplayed()) {
			System.out.println("The Last Name is Displayed.");
		} else {
			System.out.println("The Last Name is not Displayed.");
		}

		// Verifying First Name is Enabled or Not.
		if (lastName.isEnabled()) {
			System.out.println("The Last Name is Enabled.");

			// Enter Last Name.
			lastName.sendKeys(lastNamePathInput);
			System.out.println("The Last Name is " + lastNamePathInput+".");
		} else {
			System.out.println("The Last Name is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

		// Gender
		WebElement gender = driver.findElement(By.id(genderMalePath));

		// Verifying Gender is Displayed or Not.
		if (gender.isDisplayed()) {
			System.out.println("Gender is Displayed.");
		} else {
			System.out.println("Gender is not Displayed.");
		}
		// Verifying Gender is Enabled or Not.
		if (gender.isEnabled()) {
			System.out.println("Gender is Enabled.");

			// Selecting Gender.
			gender.click();
		} else {
			System.out.println("Gender is Disabled.");
		}

		// Checking if Gender is Selected or Not.
		if (gender.isSelected()) {
			System.out.println("Gender Male is Selected.");
		} else {
			System.out.println("Gender Male is not Selected.");
		}

		System.out.println("---------------------------------------------------------");

		// Address.
		// Street Address.
		WebElement streetAddress = driver.findElement(By.id(streetAddressPath));

		// Verifying Street Address is Displayed or Not.
		if (streetAddress.isDisplayed()) {
			System.out.println("The Street Address is Displayed.");
		} else {
			System.out.println("The Street Address is not Displayed.");
		}

		// Verifying Street Address is Enabled or Not.
		if (streetAddress.isEnabled()) {
			System.out.println("The Street Address is Enabled.");

			// Enter Street Address.
			streetAddress.sendKeys(streetAddressPathInput);
			System.out.println("The Street Address is " + streetAddressPathInput+".");
		} else {
			System.out.println("The Street Address is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

		// Apartment.
		WebElement apartmentNo = driver.findElement(By.id(apartmentNoPath));

		// Verifying Apartment is Displayed or Not.
		if (apartmentNo.isDisplayed()) {
			System.out.println("Apartment is Displayed.");
		} else {
			System.out.println("The Apartment is not Displayed.");
		}
		// Verifying Apartment is Enabled or Not.
		if (apartmentNo.isEnabled()) {
			System.out.println("Apartment is Enabled.");
			// Enter Apartment.
			apartmentNo.sendKeys(apartmentNoPathInput);
			System.out.println("The Apartment Number is " + apartmentNoPathInput + ".");
		} else {
			System.out.println("The Apartment is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

		// State.
		WebElement state = driver.findElement(By.id(statePath));

		// Verifying State is Displayed or Not.
		if (state.isDisplayed()) {
			System.out.println("The State is Displayed.");
		} else {
			System.out.println("The State is not Displayed.");
		}

		// Verifying State is Enabled or Not.
		if (state.isEnabled()) {
			System.out.println("The State is Enabled.");
			// Enter State.
			state.sendKeys(statePathInput);
			System.out.println("The State is " + statePathInput + ".");
		} else {
			System.out.println("The State is not Enabled.");
		}

		System.out.println("---------------------------------------------------------");

		// Postal zip Code.
		WebElement postalZipCode = driver.findElement(By.id(postalZipCodePath));

		// Verifying Postal zip Code is Displayed or Not.
		if (postalZipCode.isDisplayed()) {
			System.out.println("The Postal Zip Code is Displayed.");
		} else {
			System.out.println("The Postal Zip Code is not Displayed.");
		}

		// Verifying Postal zip Code is Enabled or Not.
		if (postalZipCode.isEnabled()) {
			System.out.println("The Postal Zip Code is Enabled.");

			// Enter Postal zip Code.
			postalZipCode.sendKeys(postalZipCodePathInput);
			System.out.println("The Postal Zip Code is " + postalZipCodePathInput+".");
		} else {
			System.out.println("The Postal Zip Code is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

		// Country.
		WebElement country = driver.findElement(By.xpath(countryPath));

		// Verifying Country is Displayed or Not.
		if (country.isDisplayed()) {
			System.out.println("Country is Displayed.");
		} else {
			System.out.println("Country is not Displayed.");
		}
		// Creating Select For DropDown.
		Select dropDown = new Select(country);
		// String countryName = countryPathInput;

		// Verifying Country is Enabled or Not.
		if (country.isEnabled()) {
			System.out.println("The Country is Enabled.");
			dropDown.selectByVisibleText(countryPathInput);
			System.out.println("Country " + countryPathInput + " is selected.");
		} else {
			System.out.println("Country is Disabled");
		}

		System.out.println("---------------------------------------------------------");

		// Email.
		WebElement email = driver.findElement(By.id(emailPath));

		// Verifying Email is Displayed or Not.
		if (email.isDisplayed()) {
			System.out.println("Email is Displayed.");
		} else {
			System.out.println("Email is not Displayed.");
		}

		// Verifying Email is Enabled or Not.
		if (email.isEnabled()) {
			System.out.println("Email is Enabled.");

			// Enter Email.
			email.sendKeys(emailPathInput);
			System.out.println("The Email is " + emailPathInput+".");
		} else {
			System.out.println("Email is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

		// Date Of Demo.
		WebElement dateOfDemo = driver.findElement(By.id(dateOfDemoPath));

		// Verifying Date Of Demo is Displayed or Not.
		if (dateOfDemo.isDisplayed()) {
			System.out.println("The Date of Demo is Displayed.");
		} else {
			System.out.println("The Date of Demo is not Displayed.");
		}
		// Verifying Date Of Demo is Enabled or Not.
		if (dateOfDemo.isEnabled()) {
			System.out.println("The Date of Demo is Enabled.");
			// Enter Date Of Demo.
			dateOfDemo.sendKeys(dateOfDemoPathInput);
			System.out.println("The Date of Demo is " + dateOfDemoPathInput+".");
		} else {
			System.out.println("The Date Of Demo is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

		WebElement ConvTimeHH = driver.findElement(By.id(convTimeHHPath));

		// Verifying Convenient Time HH is Displayed or Not.
		if (ConvTimeHH.isDisplayed()) {
			System.out.println("The Convenient Time HH is Displayed.");
		} else {
			System.out.println("The Convenient Time HH is not Displayed.");
		}

		// Creating Select Object to Select The Value From Drop down.
		Select dropDownO = new Select(ConvTimeHH);
		String hour = convTimeHHPathInput;

		// Verifying Convenient Time HH is Enabled or Not.
		if (ConvTimeHH.isEnabled()) {
			System.out.println("The Convenient Time HH is Enabled.");

			// Selecting Hour By Visible Text.
			dropDownO.selectByVisibleText(hour);
			System.out.println("HH "+ hour + " is Selected.");
		} else {
			System.out.println("The Convenient Time HH is Disabled.");
		}

		WebElement ConvTimeMM = driver.findElement(By.id(convTimeMMPath));

		// Creating Select Object to Select The Value From Dropdown.
		Select dropDownT = new Select(ConvTimeMM);
		String min = convTimeMMPathInput;

		// Verifying Convenient Time MM is Displayed or Not.
		if (ConvTimeMM.isDisplayed()) {
			System.out.println("Convenient Time MM is Displayed.");
		} else {
			System.out.println("The Convenient Time HH is not Displayed.");
		}

		// Verifying Convenient Time MM is Enabled or Not.
		if (ConvTimeMM.isEnabled()) {
			System.out.println("The Convenient Time MM is Enabled.");

			// Selecting Minute By Visible Text.
			dropDownT.selectByVisibleText(min);
			System.out.println("MM "+ min + " is Selected.");
		} else {
			System.out.println("The Convenient Time MM is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

		// Mobile Number.
		WebElement mobile = driver.findElement(By.id(mobilePath));

		// Verifying Mobile Number is Displayed or Not.
		if (mobile.isDisplayed()) {
			System.out.println("Mobile is Displayed.");
		} else {
			System.out.println("Mobile is not Displayed.");
		}

		// Verifying Mobile Number is Enabled or Not.
		if (mobile.isEnabled()) {
			System.out.println("Mobile is Enabled.");

			// Enter Mobile Number
			mobile.sendKeys(mobilePathInput);
			System.out.println("The Mobile Number is " + mobilePathInput+".");
		} else {
			System.out.println("The Mobile Number is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

		// Course Interested.

		// functionalTesting CheckBox.
		WebElement functionalTesting = driver.findElement(By.id(functionalTestingPath));

		// Verify Functional Testing is Displayed or Not.
		if (functionalTesting.isDisplayed()) {
			System.out.println("The Course Functional Testing is Displayed.");
		} else {
			System.out.println("The Course Functional Testing is not Displayed.");
		}

		// Verify Functional Testing is Enabled or Not.
		if (functionalTesting.isEnabled()) {
			System.out.println("The Course Functional Testing is Enabled.");
			// Select Functional Testing
			functionalTesting.click();
		} else {
			System.out.println("The Course Funtional Testing is Disabled.");
		}

		// Verify if Functional Testing is Selected or Not.
		if (functionalTesting.isSelected()) {
			System.out.println("The Course Funtional Testing is Selected.");
		} else {
			System.out.println("The Course Functional Testing is not Selected.");
		}

		System.out.println("---------------------------------------------------------");

		// TestNG Checkbox.
		WebElement TestNg = driver.findElement(By.id(testNgPath));

		// Verify TestNg is Displayed or Not.
		if (TestNg.isDisplayed()) {
			System.out.println("The Course TestNg is Displayed.");
		} else {
			System.out.println("The Course TestNg is not Displayed.");
		}

		// Verify TestNg is Enabled or Not.
		if (TestNg.isEnabled()) {
			System.out.println("The Course TestNg is Enabled.");
			// Select TestNg.
			TestNg.click();
		} else {
			System.out.println("The Course TestNg is Disabled.");
		}
		// Verify if TestNg is Selected or Not.
		if (TestNg.isSelected()) {
			System.out.println("The Course TestNg is Selected.");
		} else {
			System.out.println("The Course TestNg is not Selected.");
		}

		System.out.println("---------------------------------------------------------");

		// Enter your query.
		WebElement query = driver.findElement(By.id(queryPath));

		// Verify Query is Displayed or Not.
		if (query.isDisplayed()) {
			System.out.println("Enter Your Query is Displayed.");
		} else {
			System.out.println("Enter Your Query is Not Displayed.");
		}

		// Verify Query is Enabled or Not.
		if (query.isEnabled()) {
			System.out.println("The Query is Enabled.");
			// Enter Query
			query.sendKeys(queryPathInput);
			System.out.println("The Query is " + queryPathInput);
		} else {
			System.out.println("Enter Your Query is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

		// Retrieval of Verification Message value.
		WebElement retrieveVal = driver.findElement(By.xpath(retreiveValPath));

		// Retrieving Message Using getText().
		String retrievedVal = retrieveVal.getText();
		// Splitting Retrieved Value.
		String messVal[] = retrievedVal.split(":");
		// trim the message value.
		String inputValue = messVal[1].trim();

		// Verification input value.
		WebElement verification = driver.findElement(By.xpath(verificationBoxPath));

		// Verify Verification Box is Displayed or Not.
		if (verification.isDisplayed()) {
			System.out.println("The Verification Box is Displayed.");
		} else {
			System.out.println("The Verification Box is not Displayed.");
		}

		// Verify Verification Box is Enabled or Not.
		if (verification.isEnabled()) {
			System.out.println("The Verification Box is Enabled.");

			// Send Value.
			verification.sendKeys(inputValue);
			System.out.println("The Verification Value is " + inputValue+".");
		} else {
			System.out.println("The Verification Box is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

		WebElement submit = driver.findElement(By.id(submitButtonPath));

		// Verify Submit Button is Displayed or Not.
		if (submit.isDisplayed()) {
			System.out.println("The Submit Button is Displayed.");
		} else {
			System.out.println("The Submit Button is not Displayed.");
		}
		// Verify Submit Button is Enabled or Not.
		if (submit.isEnabled()) {
			System.out.println("The Submit Button is Enabled.");
			// Clicking The Submit Button
			submit.click();
			System.out.println("Submit Button is Clicked.");
		} else {
			System.out.println("The Submit Button is Disabled.");
		}

		System.out.println("---------------------------------------------------------");

	}

	@Test(priority = 4)
	public void successfulMessage() {
		// Verification of Successful Message.
		WebElement verifySuccMsg = driver.findElement(By.xpath(verificationSuccessMsg));

		// Expected Message.
		String expMsg = "Registration Form is Successfully Submitted.";

		// Verify Verification Success Message is Displayed or Not.
		if (verifySuccMsg.isDisplayed()) {
			System.out.println("The Registration Successful Message is Displayed.");

			// Retrieving the Actual Verification Success Message.
			String actMsg = verifySuccMsg.getText();
			String transId[] = actMsg.split(":");
			System.out.println("Transaction Id is " + transId[1]);

		} else {
			System.out.println("The Registration Successful Message is not Displayed.");
		}
		// Compare Actual Message and Expected Message.
		String actMsg = verifySuccMsg.getText();
		if (actMsg.contains(expMsg)) {
			System.out.println("The Actual and Expected Message of Successful Registration are Same.");
			System.out.println("The Actual Successful Registration Message is - " + actMsg);
		} else {
			System.out.println("The Actual and Expected Message of Successful Registration are not Same.");
			System.out.println("The Actual Successful Registration Message is " + actMsg);
			System.out.println("The Expected Message of Successful Registration is " + expMsg);
		}

	}

	@Test(priority = 5)
	public void closeApplication() {
		// Close the Application.
		driver.close();
		System.out.println("\nApplication Closed.");

	}
}
