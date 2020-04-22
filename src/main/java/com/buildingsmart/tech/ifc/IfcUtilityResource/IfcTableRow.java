// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcUtilityResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;

@Guid("dcf395ca-c227-4340-a8db-8f53ebd905d5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTableRow
{
	@Description("The data value of the table cell..")
	@DataMember(Order = 0)
	@Guid("7ed2c99d-404d-4ff3-8b17-ba94de77e474")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RowCells")
	private List<IfcValue> rowCells;

	@Description("Flag which identifies if the row is a heading row or a row which contains row values. <blockquote class=\"note\">NOTE - If the row is a heading, the flag takes the value = TRUE.</blockquote>")
	@DataMember(Order = 1)
	@Guid("ee01b240-9331-4036-9859-66837096adae")
	@JacksonXmlProperty(isAttribute=true, localName = "IsHeading")
	private Boolean isHeading;


	public IfcTableRow()
	{
	}

	public List<IfcValue> getRowCells() {
		return this.rowCells;
	}

	public Boolean getIsHeading() {
		return this.isHeading;
	}

	public void setIsHeading(Boolean isHeading) {
		this.isHeading = isHeading;
	}


}

