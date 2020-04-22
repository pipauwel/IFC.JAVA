// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement;

@Guid("88b5d7f1-f8b7-4785-bb41-a7440d0f1606")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcShadingDevice extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic type for a shading device that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcShadingDeviceType</em> is assigned, providing its own <em>IfcShadingDeviceType.PredefinedType</em>.  </blockquote>")
	@DataMember(Order = 0)
	@Guid("90d1d5f5-d2cf-4c97-9697-5d0155eb4bf0")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcShadingDeviceTypeEnum predefinedType;


	public IfcShadingDevice()
	{
	}

	public IfcShadingDevice(String globalId)
	{
		super(globalId);
	}

	public IfcShadingDeviceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcShadingDeviceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

