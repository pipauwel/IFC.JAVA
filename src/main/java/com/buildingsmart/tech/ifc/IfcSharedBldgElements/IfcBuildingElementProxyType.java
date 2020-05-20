// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f6c56c32-4f7f-4f3d-935a-a19ad5b50f7c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBuildingElementProxyType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Predefined types to define the particular type of an building element proxy. There may be property set definitions available for each predefined or user defined type.")
	@DataMember(Order = 0)
	@Required()
	@Guid("7a223a57-61ce-470d-a396-3af434eccef5")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcBuildingElementProxyTypeEnum predefinedType;


	public IfcBuildingElementProxyType()
	{
	}

	public IfcBuildingElementProxyType(String globalId, IfcBuildingElementProxyTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcBuildingElementProxyTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcBuildingElementProxyTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

