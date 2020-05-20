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

@Guid("54499bfa-3796-45d8-870a-1357fd0e960f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRoof extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic types for a roof that are specified in an enumeration. There may be a property set given for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcRoofType</em> is assigned, providing its own <em>IfcRoofType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been renamed from ShapeType and changed to be OPTIONAL with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 0)
	@Guid("27e57560-ff44-4946-bf77-d8f1d8bdc50a")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcRoofTypeEnum predefinedType;


	public IfcRoof()
	{
	}

	public IfcRoof(String globalId)
	{
		super(globalId);
	}

	public IfcRoofTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcRoofTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

