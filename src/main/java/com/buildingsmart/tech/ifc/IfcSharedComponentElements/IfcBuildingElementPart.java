// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

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
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.*;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponent;

@Guid("a8383055-66b2-4dac-abe1-98562ba38cad")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBuildingElementPart extends IfcElementComponent
{
	@Description("Subtype of building element part")
	@Guid("0da05a86-fc94-4001-9141-3943065bd488")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcBuildingElementPartTypeEnum predefinedType;


	public IfcBuildingElementPart()
	{
	}

	public IfcBuildingElementPart(String globalId)
	{
		super(globalId);
	}

	public IfcBuildingElementPartTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcBuildingElementPartTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

