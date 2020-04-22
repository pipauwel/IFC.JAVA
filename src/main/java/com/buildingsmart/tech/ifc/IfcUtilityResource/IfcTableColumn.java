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
import com.buildingsmart.tech.ifc.IfcConstraintResource.*;

@Guid("8ddc55ed-5fdd-4eec-bbba-86270d59039c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTableColumn
{
	@Description("The <i>Identifier</i> identifies the column within the table. If provided, it must be unique within the table. Columns may be cross-referenced across multiple tables by sharing the same column identifier.")
	@DataMember(Order = 0)
	@Guid("58747f37-ddaf-41c1-8fec-9773e615026d")
	@JacksonXmlProperty(isAttribute=true, localName = "Identifier")
	private String identifier;

	@Description("The <i>Name</i> is a human-readable caption for the table column. It is not necessarilly unique.")
	@DataMember(Order = 1)
	@Guid("6dc5612f-9033-42ae-a603-d4b940f2c5e8")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("The <i>Description</i> provides human-readable text describing the table column.")
	@DataMember(Order = 2)
	@Guid("749535b7-e5ca-4935-bf2d-2e42c04c7972")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("The <i>Unit</i> indicates the unit of measure to be used for this column's data. If not provided, then project default units are assumed. If <i>ReferencePath</i> is provided, the the unit must be of the same measure as the referenced attribute.")
	@DataMember(Order = 3)
	@Guid("006b5097-750b-4881-8007-fabfea21405f")
	@JacksonXmlProperty(isAttribute=true, localName = "Unit")
	private IfcUnit unit;

	@Description("The <i>ReferencePath</i> indicates a relative path to the object and attribute for which data within this column is to be applied.     For constraints, such path is relative to the <i>IfcObjectDefinition</i> associated by <i>IfcRelAssociatesConstraint</i>.RelatedObjects. For a constraint to be satisified, exactly one row of the table must match the referenced object for all columns where the <i>ReferencePath</i> attribute is set.")
	@DataMember(Order = 4)
	@Guid("e176b358-4817-483a-851e-7d75f75aa4eb")
	@JacksonXmlProperty(isAttribute=false, localName = "ReferencePath")
	private IfcReference referencePath;


	public IfcTableColumn()
	{
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public IfcUnit getUnit() {
		return this.unit;
	}

	public void setUnit(IfcUnit unit) {
		this.unit = unit;
	}

	public IfcReference getReferencePath() {
		return this.referencePath;
	}

	public void setReferencePath(IfcReference referencePath) {
		this.referencePath = referencePath;
	}


}

