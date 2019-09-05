// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d5d6da22-1509-418b-8dea-278c3dc7e2d8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIrregularTimeSeriesValue
{
	@JacksonXmlProperty(isAttribute=true, localName = "TimeStamp")
	@Description("The specification of the time point.")
	@Required()
	@Guid("70b6fcf0-2c15-4753-ab4b-d93840eeffd5")
	private String timeStamp;

	@Description("A list of time-series values. At least one value is required.")
	@Required()
	@MinLength(1)
	@Guid("5d205088-4f1b-4a4d-a27a-f36529a1c467")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> listValues = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue>();


	public IfcIrregularTimeSeriesValue()
	{
	}

	public IfcIrregularTimeSeriesValue(String timeStamp, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue[] listValues)
	{
		this.timeStamp = timeStamp;
		this.listValues = new ArrayList<>(Arrays.asList(listValues));
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> getListValues() {
		return this.listValues;
	}


}

