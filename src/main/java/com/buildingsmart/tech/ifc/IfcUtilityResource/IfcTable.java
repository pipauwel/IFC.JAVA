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
import com.buildingsmart.tech.ifc.IfcUtilityResource.*;

@Guid("a998a201-457f-4f17-9337-b5f2acb084d8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTable implements com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect
{
	@DataMember(Order = 0)
	@Guid("9abc07c5-b708-450e-a8bd-c055f3dd735e")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("Reference to information content of rows.")
	@DataMember(Order = 1)
	@Guid("7022ee4b-bd52-48f7-9edb-ef5c09c44206")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcTableRow")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Rows")
	private List<IfcTableRow> rows;

	@Description("The column information associated with this table.")
	@DataMember(Order = 2)
	@Guid("6290f013-626e-4be6-a71e-0133059ad85e")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcTableColumn")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Columns")
	private List<IfcTableColumn> columns;


	public IfcTable()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IfcTableRow> getRows() {
		return this.rows;
	}

	public List<IfcTableColumn> getColumns() {
		return this.columns;
	}

	public int getNumberOfCellsInRow() {
		return 0;
	}

	public int getNumberOfHeadings() {
		return 0;
	}

	public int getNumberOfDataRows() {
		return 0;
	}


}

