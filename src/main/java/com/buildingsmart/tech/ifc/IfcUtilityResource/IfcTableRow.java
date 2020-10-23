// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcUtilityResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("dcf395ca-c227-4340-a8db-8f53ebd905d5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTableRow
{
	@Description("The data value of the table cell..")
	@DataMember(Order = 0)
	@Guid("7ed2c99d-404d-4ff3-8b17-ba94de77e474")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "rowCells")
	private List<IfcValue> rowCells;

	@Description("Flag which identifies if the row is a heading row or a row which contains row values. <blockquote class=\"note\">NOTE - If the row is a heading, the flag takes the value = TRUE.</blockquote>")
	@DataMember(Order = 1)
	@Guid("ee01b240-9331-4036-9859-66837096adae")
	@JacksonXmlProperty(isAttribute=false, localName = "isHeading")
	private IfcBoolean isHeading;


	public IfcTableRow()
	{
	}

	public List<IfcValue> getRowCells() {
		return this.rowCells;
	}

	public IfcBoolean getIsHeading() {
		return this.isHeading;
	}

	public void setIsHeading(IfcBoolean isHeading) {
		this.isHeading = isHeading;
	}


}

