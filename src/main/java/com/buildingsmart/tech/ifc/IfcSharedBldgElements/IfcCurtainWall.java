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

@Guid("3395e66f-bd77-4cce-a82f-4ccb81430e2c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurtainWall extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic type for a curtain wall that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcCurtainWallType</em> is assigned, providing its own <em>IfcCurtainWallType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 0)
	@Guid("3868f9f2-95c6-4770-bb71-6ef7a9f4fced")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcCurtainWallTypeEnum predefinedType;


	public IfcCurtainWall()
	{
	}

	public IfcCurtainWall(String globalId)
	{
		super(globalId);
	}

	public IfcCurtainWallTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCurtainWallTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

