package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.pages.objectRespository.DownloadsPageObjectRepository;
import com.jbk.utility.CommonCode;


public class DownloadPage extends DownloadsPageObjectRepository {
	WebDriver driver;

	public DownloadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public boolean validedImageDisplay() {
		CommonCode.click(downloads);
		for (WebElement element : images) {
			boolean flag = element.isDisplayed();
			if (flag == true) {
				System.out.println("The Image of Vendors Is Displayed");
				return true;
			} else {
				System.out.println("The Image of Vendors Is Not Displayed");
				return false;
			}
		}
		return true;
	}

	public boolean validedHeaderList() {
		CommonCode.click(downloads);
		ArrayList<String> expectedHeader = new ArrayList<String>();
		expectedHeader.add("Srs");
		expectedHeader.add("Name");
		expectedHeader.add("vendor");
		expectedHeader.add("Version");
		expectedHeader.add("32bit");
		expectedHeader.add("64bit");
		expectedHeader.add("Common");
		expectedHeader.add("Official Source\n*For prevoius and latest releases");	
		for (int i = 0; i < header.size();i++) {
			if (header.get(i).getText().equals(expectedHeader.get(i))) {
				System.out.println("Header List Match Successfully");				
			}else {
				System.out.println("Header List Not Match Successfully");				
			}
		}return true;								
	}
	
	
	
	public boolean validedVendorList() {
		CommonCode.click(downloads);
		ArrayList<String> expectedVendor = new ArrayList<String>();
		expectedVendor.add("Java Development Kit (JDK)");
		expectedVendor.add("Selenium Server Standalon Jar");
		expectedVendor.add("Selenium Server Source Jar");
		expectedVendor.add("Google Chrome");
		expectedVendor.add("Google Chrome Driver");
		expectedVendor.add("Mozilla Firefox");
		expectedVendor.add("Gecko Driver for Latest firefox");		
		for (int i = 0; i < vendor.size();i++) {
			if (vendor.get(i).getText().equals(expectedVendor.get(i))) {
				System.out.println("Vendor List Match Successfully");
			}else {
				System.out.println("Vendor List Not Match Successfully");
				
			}
		}return true;								
	}
	
	
	
	public boolean validedVersionList() {
		CommonCode.click(downloads);
		ArrayList<String> expectedVersion = new ArrayList<String>();
		expectedVersion.add("1.8");
		expectedVersion.add("2.52.0\n3.9.0");
		expectedVersion.add("2.46.0");
		expectedVersion.add("76.0");
		expectedVersion.add("76.0");
		expectedVersion.add("69.0");
		expectedVersion.add("0.24.0");		
		for (int i = 0; i < version.size();i++) {
			String actualHeader = version.get(i).getText();
			if (actualHeader.equals(expectedVersion.get(i))) {
				System.out.println("Version List Match Successfully");					
			}else {
				System.out.println("Version List Not Match Successfully");				
			}
		}return true;								
	}
	
	
	public boolean validedJdk() {
		CommonCode.click(downloads);
		for (int i=0; i< vendor.size();i++) {
			if (vendor.get(i).getText().contains("Java")) {
				System.out.println(vendor.get(i).getText()+" Is Available In "+bit.get(i).getText()+ " And "+bits.get(i).getText()+" For Downloads");			
			}
		}return true;								
	}
		
	public List<String> validedJdk1() {
		
		ArrayList<String>vendorNames=new ArrayList<String>();
	
		CommonCode.click(downloads);
		for (int i = 0; i < vendor.size();i++) 
			vendorNames.add(vendor.get(i).getText());
		
		return vendorNames;
	}
	
	
	
	
	public boolean validedSelenium() {
		CommonCode.click(downloads);
		for (int i = 1; i < vendor.size();i++) {
			String vendorList = vendor.get(i).getText();
			if (vendorList.contains("Selenium")) {
				String versionList = version.get(i).getText();
				System.out.println(vendor.get(i).getText()+" Is Available In "+versionList+" Version For Downloads");	
			}
		}return true;								
	}
	
	public boolean validedGoogle() {
		CommonCode.click(downloads);
		for (int i = 1; i < vendor.size();i++) {
			String vendorList = vendor.get(i).getText();
			if (vendorList.contains("Google")) {
				String versionList = version.get(i).getText();
				System.out.println(vendor.get(i).getText()+" Is Available In "+versionList+" Version For Downloads");				
			}
		}return true;								
	}
	
	public boolean validedVendorSize() {
		CommonCode.click(downloads);
		     if (vendor.size()==7) {
				System.out.println("Vendor List Contain Seven Vendor Available For Download");
				return true;
			}else {
				System.out.println("Vendor List Not Contain Required Vendor For Download");
				return false;
			}
        }

    public boolean validedOfficialSourceSize() {
	CommonCode.click(downloads);
	if (officialSource.size()==7) {
		System.out.println(" There Are Seven Official Source Page Link Is Available ");
		return true;
	}else {
		System.out.println(" There Are Seven Official Source Page Link Is Not Available");
		return false;
	}
}
    
    public boolean validedOfficiaalSites() {
    	CommonCode.click(downloads);  		    	
    	List <WebElement> officialLinks = officialSite;
    	int count =0;
    	for (WebElement link : officialLinks)
    		
		CommonCode.windowHandle(link, driver);    	
    	if (count==8) {
    		System.out.println(" There Are Eight Windows Open After Official Source Page Link Click ");
    		return true;
    	}else {
    		System.out.println(" No Window Open After Official Source Page Link Click");
    		return false;
    	}
    }
    
    public boolean validatingOracleSiteTitle() {   	
		CommonCode.click(downloads);		
		String actualSiteTitle=  CommonCode.windowHandle(oracle, driver);
		if (actualSiteTitle.equals(actualSiteTitle)) {
			System.out.println("This Is Oracle site To Download JDK Software");
               return true;
		} else {
			System.out.println("This Is Note Oracle site To Download JDK Software");
			   return false;
		}
    }
		public boolean validatingSeleniumStandaloneSiteTitle() {   	
			CommonCode.click(downloads);				
			String actualSiteTitle=  CommonCode.windowHandle(seleniumStandalone, driver);
			if (actualSiteTitle.contains("selenium")) {
				System.out.println("This Is Selenium Standalone site To Download Selenium Standalone");
				return true;
			} else {
				System.out.println("This Is Note Selenium site To Download Selenium Standalone Software");
				return false;
			}
		}


		
		
			
						
		
	}
    

