// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("39b687ba-1327-4a70-927b-47733d3e370b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRailing extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic types for a railing that are specified in an enumeration. There may be a property set given for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcRailingType</em> is assigned, providing its own <em>IfcRailingType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x\">IFC2x CHANGE&nbsp; The attribute has been changed into an OPTIONAL attribute.</blockquote>")
	@DataMember(Order = 0)
	@Guid("a41e385b-cc54-4bd0-a2e7-bdc2cd206b45")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcRailingTypeEnum predefinedType;


	public IfcRailing()
	{
	}

	public IfcRailing(String globalId)
	{
		super(globalId);
	}

	public IfcRailingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcRailingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

