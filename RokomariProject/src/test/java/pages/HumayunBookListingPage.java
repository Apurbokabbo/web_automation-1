package pages;

import org.openqa.selenium.By;

public class HumayunBookListingPage extends BasePage{
	
	public String humayunBookListingPageUrl ="https://www.rokomari.com/book/author/1/humayun-ahmed?ref=mm_p0";

	
	
	public By reSetSortButton = By.xpath("//a[contains(text(),'Reset Sort')]");
	public By reSetFilterButton = By.xpath("//a[contains(text(),'Reset Filter')]");
	public By sortBestSellerLocator = By.xpath("//label[contains(text(),'Best Seller')]");
	public By sortNewReleasedLocator =By.xpath("//label[contains(text(),'New Released')]");
	public By sortPriceLowtoHighLocator = By.xpath("//label[contains(text(),'Price - Low to High')]");
	public By sortPriceHightoLowLocator = By.xpath("//label[contains(text(),'Price - High to Low')]");
	public By sortDiscountLowtoHighLocator = By.xpath("//label[contains(text(),'Discount - Low to High')]");
	public By sortDiscountHightoLow = By.xpath("//label[contains(text(),'Discount - High to Low')]");
	public By filterSamakalinaUpanyasa =By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
	public By filterUpanyasaSamagra =By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
	public By filterRacanaSankalanaOSamagra =By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");
	public By filterRomanṭikaUpanyasa=By.xpath("//label[contains(text(),'রোমান্টিক উপন্যাস')]");
	public By hoverLocator =By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[1]");
	public By addToCartButton = By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/button[1]");
	public By paginationLocator = By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[2]/div[3]");
	public By paginationNextButton =By.xpath("//a[contains(text(),'Next')]");
	public By paginationPage2Locator = By.xpath("//a[contains(text(),'Next')]");
	public By paginationPreviousButton = By.xpath("//a[contains(text(),'Previous')]");

}
