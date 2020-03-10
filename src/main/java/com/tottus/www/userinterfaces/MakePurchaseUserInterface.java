package com.tottus.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class MakePurchaseUserInterface {

	public static final Target VENTANAEMERGENTE = Target.the("VENTANA EMERGENTE").located(By.id("onesignal-popover-cancel-button"));
	public static final Target OPTTECNOLOGIA = Target.the("OPCION TECNOLOGIA").locatedBy("//nav[@class=\"supermenu\"]/ul/li/p[contains(text(),'Tecnología')]");
	public static final Target BTNPRODUCTO = Target.the("SELECCIONAR EL PRODUCTO").locatedBy("//*[contains(text(),'{0}')]");
	public static final Target BTNAGREGAR = Target.the("AGREGAR EL PRODUCTO").locatedBy("//div[@class=\"price-selector\"]/div[4]/input[3]");
	public static final Target DESPLEGARPRODUCTOS = Target.the("DESPLEGAR PRODUCTOS").located(By.id("atg_store_cart_total"));
	public static final Target VERPRODUCTO = Target.the("VER PRODUCTO SELECCIONADO").located(By.className("atg_store_richCartItemDescription"));
	
}
