package com.tottus.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class MakePurchaseUserInterface {
	private MakePurchaseUserInterface() {
		
	}

	public static final Target POPUPWINDOW = Target.the("POP-UP WINDOW").located(By.id("onesignal-popover-cancel-button"));
	public static final Target OPTTECNOLOGY = Target.the("OPTION TECNOLOGY").locatedBy("//nav[@class=\"supermenu\"]/ul/li/p[contains(text(),'Tecnolog')]");
	public static final Target BTNPRODUCT = Target.the("SELECT THE PRODUCT").locatedBy("//*[contains(text(),'{0}')]");
	public static final Target BTNADD = Target.the("ADD THE PRODUCT").locatedBy("//div[@class=\"price-selector\"]/div[4]/input[3]");
	public static final Target DISPLAYPRODUCT = Target.the("DISPLAY PRODUCT").located(By.id("atg_store_cart_total"));
	public static final Target SEEPRODUCT = Target.the("SEE PRODUCT SELECTED").located(By.className("atg_store_richCartItemDescription"));
	
}
