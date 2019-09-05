// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("88b5d7f1-f8b7-4785-bb41-a7440d0f1606")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcShadingDevice extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Predefined generic type for a shading device that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcShadingDeviceType</em> is assigned, providing its own <em>IfcShadingDeviceType.PredefinedType</em>.  </blockquote>")
	@Guid("90d1d5f5-d2cf-4c97-9697-5d0155eb4bf0")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcShadingDeviceTypeEnum predefinedType;


	public IfcShadingDevice()
	{
	}

	public IfcShadingDevice(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcShadingDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcShadingDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

