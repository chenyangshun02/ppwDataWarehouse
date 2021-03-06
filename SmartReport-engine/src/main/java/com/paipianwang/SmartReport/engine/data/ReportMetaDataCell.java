package com.paipianwang.SmartReport.engine.data;

public class ReportMetaDataCell {

	private final ReportMetaDataColumn column;
	private final String name;
	private final Object value;

	public ReportMetaDataCell(ReportMetaDataColumn column, String name, Object value) {
		this.column = column;
		this.name = name;
		this.value = value;
	}

	public ReportMetaDataColumn getColumn() {
		return column;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}

}
