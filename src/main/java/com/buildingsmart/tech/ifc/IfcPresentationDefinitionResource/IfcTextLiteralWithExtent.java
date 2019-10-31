// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource;

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
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcTextLiteral;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcTextPath;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPlanarExtent;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcBoxAlignment;

@Guid("4ab54421-83da-48e9-9931-2e0f8051029b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextLiteralWithExtent extends IfcTextLiteral
{
	@Description("The extent in the x and y direction of the text literal.")
	@Required()
	@Guid("2f249a57-152d-4616-af5b-ba3c4b2d9f54")
	@JacksonXmlProperty(isAttribute=false, localName = "Extent")
	private IfcPlanarExtent extent;

	@Description("The alignment of the text literal relative to its position.")
	@Required()
	@Guid("10d84bed-12f2-4bf3-8e3c-5e87145f7132")
	@JacksonXmlProperty(isAttribute=false, localName = "BoxAlignment")
	private IfcBoxAlignment boxAlignment;


	public IfcTextLiteralWithExtent()
	{
	}

	public IfcTextLiteralWithExtent(String literal, IfcAxis2Placement placement, IfcTextPath path, IfcPlanarExtent extent, IfcBoxAlignment boxAlignment)
	{
		super(literal, placement, path);
		this.extent = extent;
		this.boxAlignment = boxAlignment;
	}

	public IfcPlanarExtent getExtent() {
		return this.extent;
	}

	public void setExtent(IfcPlanarExtent extent) {
		this.extent = extent;
	}

	public IfcBoxAlignment getBoxAlignment() {
		return this.boxAlignment;
	}

	public void setBoxAlignment(IfcBoxAlignment boxAlignment) {
		this.boxAlignment = boxAlignment;
	}


}

