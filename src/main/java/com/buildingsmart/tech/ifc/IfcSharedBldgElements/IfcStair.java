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

@Guid("d974f360-0afb-4b3f-a222-03b0b82cf2e3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStair extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic type for a stair that is specified in an enumeration. There may be a property set given specifically for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcStairType</em> is assigned, providing its own <em>IfcStairType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been renamed from <em>ShapeType</em> and changed to be OPTIONAL with upward compatibility for file based exchange.</blockquote>")
	@Guid("8b615fde-d241-43ce-8bff-ccc8693ad6ff")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcStairTypeEnum predefinedType;


	public IfcStair()
	{
	}

	public IfcStair(String globalId)
	{
		super(globalId);
	}

	public IfcStairTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcStairTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

