// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcUtilityResource;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("dcf395ca-c227-4340-a8db-8f53ebd905d5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTableRow
{
	@Description("The data value of the table cell..")
	@MinLength(1)
	@Guid("7ed2c99d-404d-4ff3-8b17-ba94de77e474")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> rowCells = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue>();

	@JacksonXmlProperty(isAttribute=true, localName = "IsHeading")
	@Description("Flag which identifies if the row is a heading row or a row which contains row values. <blockquote class=\"note\">NOTE - If the row is a heading, the flag takes the value = TRUE.</blockquote>")
	@Guid("ee01b240-9331-4036-9859-66837096adae")
	private Boolean isHeading;


	public IfcTableRow()
	{
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> getRowCells() {
		return this.rowCells;
	}

	public Boolean getIsHeading() {
		return this.isHeading;
	}

	public void setIsHeading(Boolean isHeading) {
		this.isHeading = isHeading;
	}


}

