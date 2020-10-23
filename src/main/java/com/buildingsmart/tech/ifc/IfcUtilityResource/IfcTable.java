// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcUtilityResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("a998a201-457f-4f17-9337-b5f2acb084d8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTable implements com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect
{
	@DataMember(Order = 0)
	@Guid("9abc07c5-b708-450e-a8bd-c055f3dd735e")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("Reference to information content of rows.")
	@DataMember(Order = 1)
	@Guid("7022ee4b-bd52-48f7-9edb-ef5c09c44206")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcTableRow")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "rows")
	private List<IfcTableRow> rows;

	@Description("The column information associated with this table.")
	@DataMember(Order = 2)
	@Guid("6290f013-626e-4be6-a71e-0133059ad85e")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcTableColumn")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "columns")
	private List<IfcTableColumn> columns;


	public IfcTable()
	{
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public List<IfcTableRow> getRows() {
		return this.rows;
	}

	public List<IfcTableColumn> getColumns() {
		return this.columns;
	}

	@JsonIgnore
	public int getNumberOfCellsInRow() {
		//	NumberOfCellsInRow
		//:=HIINDEX(Rows[1].RowCells)
		return rows.get(0).getRowCells().size();
	}

	@JsonIgnore
	public int getNumberOfHeadings() {
		//TODO
		//	NumberOfHeadings:=SIZEOF(QUERY( Temp <* Rows | Temp.IsHeading))
		return 0;
	}

	@JsonIgnore
	public int getNumberOfDataRows() {
		//TODO
		//	NumberOfDataRows:=SIZEOF(QUERY( Temp <* Rows | NOT(Temp.IsHeading)))
		return 0;
	}


}

