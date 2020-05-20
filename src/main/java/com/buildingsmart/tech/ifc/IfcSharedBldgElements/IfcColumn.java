// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ba7dd489-a3f1-480d-b133-43f23e616b86")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcColumnStandardCase.class, name = "IfcColumnStandardCase"))
public class IfcColumn extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic type for a column that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcColumnType</em> is assigned, providing its own <em>IfcColumnType.PredefinedType</em>.</blockquote>  <blockquote  class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 0)
	@Guid("839e754d-ca64-474c-8b15-4a29da86d337")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcColumnTypeEnum predefinedType;


	public IfcColumn()
	{
	}

	public IfcColumn(String globalId)
	{
		super(globalId);
	}

	public IfcColumnTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcColumnTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

