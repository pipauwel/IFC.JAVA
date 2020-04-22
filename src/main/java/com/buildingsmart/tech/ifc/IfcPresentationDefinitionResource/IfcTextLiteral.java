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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcTextLiteralWithExtent;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcTextPath;

@Guid("fff1fb35-13c2-4e24-92f4-c2bfd5a9ba17")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcTextLiteralWithExtent.class, name = "IfcTextLiteralWithExtent"))
public class IfcTextLiteral extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Description("The text literal to be presented.")
	@DataMember(Order = 0)
	@Required()
	@Guid("55eb2d39-e680-4ba3-9d6a-8daf9dde4691")
	@JacksonXmlProperty(isAttribute=true, localName = "Literal")
	private String literal;

	@Description("An <em>IfcAxis2Placement</em> that determines the placement and orientation of the presented string.")
	@DataMember(Order = 1)
	@Required()
	@Guid("eaf62d6a-c033-4077-8aa5-7a11008ec5c5")
	@JacksonXmlProperty(isAttribute=true, localName = "Placement")
	private IfcAxis2Placement placement;

	@Description("The writing direction of the text literal.")
	@DataMember(Order = 2)
	@Required()
	@Guid("5d004ead-6e33-418a-b7b0-5e97200cc4b0")
	@JacksonXmlProperty(isAttribute=true, localName = "Path")
	private IfcTextPath path;


	public IfcTextLiteral()
	{
	}

	public IfcTextLiteral(String literal, IfcAxis2Placement placement, IfcTextPath path)
	{
		this.literal = literal;
		this.placement = placement;
		this.path = path;
	}

	public String getLiteral() {
		return this.literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}

	public IfcAxis2Placement getPlacement() {
		return this.placement;
	}

	public void setPlacement(IfcAxis2Placement placement) {
		this.placement = placement;
	}

	public IfcTextPath getPath() {
		return this.path;
	}

	public void setPath(IfcTextPath path) {
		this.path = path;
	}


}

