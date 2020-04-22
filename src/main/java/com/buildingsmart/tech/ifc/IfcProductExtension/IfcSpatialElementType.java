// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

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
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialStructureElementType;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialZoneType;
import com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProduct;

@Guid("c1bd7c3f-4af0-4154-9bb9-6fcbe16820ae")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcSpatialStructureElementType.class, name = "IfcSpatialStructureElementType"), @JsonSubTypes.Type(value = IfcSpatialZoneType.class, name = "IfcSpatialZoneType")})
public abstract class IfcSpatialElementType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProduct
{
	@Description("The type denotes a particular type that indicates the object further. The use has to be established at the level of instantiable subtypes. In particular it holds the user defined type, if the enumeration of the attribute 'PredefinedType' is set to USERDEFINED.")
	@DataMember(Order = 0)
	@Guid("03628bd8-d742-4a37-8f2e-8b7d142a64be")
	@JacksonXmlProperty(isAttribute=true, localName = "ElementType")
	private String elementType;


	public IfcSpatialElementType()
	{
	}

	public IfcSpatialElementType(String globalId)
	{
		super(globalId);
	}

	public String getElementType() {
		return this.elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}


}

