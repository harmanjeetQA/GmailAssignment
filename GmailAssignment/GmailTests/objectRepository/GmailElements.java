package objectRepository;

public interface GmailElements {
	
	public String URL = "https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/&hl=en";
	public String xpath_Username = "//input[@id='identifierId']";
	public String id_NextButton1 = "identifierNext";
	public String xpath_Password = "//input[@name='password']";
	public String xpath_ComposeMail = "//div[contains(text(),'Compose')]";
	public String xpath_ToRecipient = "//*[text()='To']/../../..//textarea";
	public String name_SubjectTextbox = "subjectbox";
	public String xpath_MoreIcon = "//*[@class='btC']/td[5]/div[1]/div[1]/div[1]/div[2]";
    public String xpath_AddLabelOption = "//div[@id=':r2']";
    public String xpath_EnterLabelNameToAdd ="//div[@class='J-M-JJ asg']//input[@type='text']";
	public String xpath_SelectLabelCheckbox ="//*[@class='J-M-Jz aXjCH']/div[5]/div[1]/div[1]";
	public String xpath_ApplyLabel = "//div[contains(text(),'Apply')]";
	public String xpath_SendEmailButton = "//*[@class='btC']/td[1]/div[1]/div[2]";
	public String xpath_SentFolder = "//*[@class='TN bzz aHS-bnu']/div[2]/span/a']";
	public String xpath_OpenSentMail = "//*[@class='Cp']/div[1]/table/tbody/tr[1]/td[6]/div[1]/div[1]/div[2]/span/span";
	public String xpath_SentMailSubject = "//h2[@class='hP']";
	public String xpath_SentMailLabel = "//*[@class='hN']";

	public String value_Username = "testmail@gmail.com";
	public String value_Password = "testpassword";
	
	public String value_ToRecipient = "*******@gmail.com";
	public String value_EnterLabelNameToAdd = "Labeltest";







}
