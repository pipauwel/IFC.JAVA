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

@Guid("8f561139-3792-4723-b343-700785092d40")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcSlabElementedCase.class, name = "IfcSlabElementedCase"), @JsonSubTypes.Type(value = IfcSlabStandardCase.class, name = "IfcSlabStandardCase")})
public class IfcSlab extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic type for a slab that is specified in an enumeration. There may be a property set given specifically for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcSlabType</em> is assigned, providing its own <em>IfcSlabType.PredefinedType</em>.</blockquote>  <blockquote  class=\"change-ifc2x\">IFC2x CHANGE The attribute has been changed into an OPTIONAL attribute.</blockquote>")
	@DataMember(Order = 0)
	@Guid("5f3dcc3b-0c4a-4603-b6c1-2aa940b83049")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSlabTypeEnum predefinedType;


	public IfcSlab()
	{
	}

	public IfcSlab(String globalId)
	{
		super(globalId);
	}

	public IfcSlabTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSlabTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

