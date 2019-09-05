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

@Guid("a998a201-457f-4f17-9337-b5f2acb084d8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTable implements com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Guid("9abc07c5-b708-450e-a8bd-c055f3dd735e")
	private String name;

	@Description("Reference to information content of rows.")
	@MinLength(1)
	@Guid("7022ee4b-bd52-48f7-9edb-ef5c09c44206")
	private List<com.buildingsmart.tech.ifc.IfcUtilityResource.IfcTableRow> rows = new ArrayList<com.buildingsmart.tech.ifc.IfcUtilityResource.IfcTableRow>();

	@Description("The column information associated with this table.")
	@MinLength(1)
	@Guid("6290f013-626e-4be6-a71e-0133059ad85e")
	private List<com.buildingsmart.tech.ifc.IfcUtilityResource.IfcTableColumn> columns = new ArrayList<com.buildingsmart.tech.ifc.IfcUtilityResource.IfcTableColumn>();


	public IfcTable()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<com.buildingsmart.tech.ifc.IfcUtilityResource.IfcTableRow> getRows() {
		return this.rows;
	}

	public List<com.buildingsmart.tech.ifc.IfcUtilityResource.IfcTableColumn> getColumns() {
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

