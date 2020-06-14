package com.google.www.models;

import java.util.List;

public class Pagemap {

	private List<Item> item = null;
	private List<Metatag> metatags = null;
	private List<CseThumbnail> cseThumbnail = null;
	private List<CseImage> cseImage = null;

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public List<Metatag> getMetatags() {
		return metatags;
	}

	public void setMetatags(List<Metatag> metatags) {
		this.metatags = metatags;
	}

	public List<CseThumbnail> getCseThumbnail() {
		return cseThumbnail;
	}

	public void setCseThumbnail(List<CseThumbnail> cseThumbnail) {
		this.cseThumbnail = cseThumbnail;
	}

	public List<CseImage> getCseImage() {
		return cseImage;
	}

	public void setCseImage(List<CseImage> cseImage) {
		this.cseImage = cseImage;
	}

}