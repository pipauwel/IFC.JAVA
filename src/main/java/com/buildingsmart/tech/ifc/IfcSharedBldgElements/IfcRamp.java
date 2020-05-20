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

@Guid("21ce7129-20ff-438a-bb0c-04ff211bddf4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRamp extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic types for a ramp that are specified in an enumeration. There may be a property set given for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcRampType</em> is assigned, providing its own <em>IfcRampType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been renamed from ShapeType and changed to be OPTIONAL with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 0)
	@Guid("7cd52433-0239-4210-b977-2f3a6ad39c93")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcRampTypeEnum predefinedType;


	public IfcRamp()
	{
	}

	public IfcRamp(String globalId)
	{
		super(globalId);
	}

	public IfcRampTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcRampTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

