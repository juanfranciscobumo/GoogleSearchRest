package com.google.www.models;

public class SearchInformation {

	private Float searchTime;
	private String formattedSearchTime;
	private String totalResults;
	private String formattedTotalResults;

	public Float getSearchTime() {
		return searchTime;
	}

	public void setSearchTime(Float searchTime) {
		this.searchTime = searchTime;
	}

	public String getFormattedSearchTime() {
		return formattedSearchTime;
	}

	public void setFormattedSearchTime(String formattedSearchTime) {
		this.formattedSearchTime = formattedSearchTime;
	}

	public String getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}

	public String getFormattedTotalResults() {
		return formattedTotalResults;
	}

	public void setFormattedTotalResults(String formattedTotalResults) {
		this.formattedTotalResults = formattedTotalResults;
	}

}
