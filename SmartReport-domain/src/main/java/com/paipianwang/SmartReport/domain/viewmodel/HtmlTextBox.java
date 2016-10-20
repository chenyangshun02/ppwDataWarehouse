package com.paipianwang.SmartReport.domain.viewmodel;

public class HtmlTextBox extends HtmlFormElement {

	private String value;
	
	public HtmlTextBox(String name, String text, String value) {
		super(name, text);
		this.type = "textbox";
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}