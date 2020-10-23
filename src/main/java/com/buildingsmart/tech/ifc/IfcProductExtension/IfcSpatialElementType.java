// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c1bd7c3f-4af0-4154-9bb9-6fcbe16820ae")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcSpatialStructureElementType.class, name = "IfcSpatialStructureElementType"), @JsonSubTypes.Type(value = IfcSpatialZoneType.class, name = "IfcSpatialZoneType")})
public abstract class IfcSpatialElementType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProduct
{
	@Description("The type denotes a particular type that indicates the object further. The use has to be established at the level of instantiable subtypes. In particular it holds the user defined type, if the enumeration of the attribute 'PredefinedType' is set to USERDEFINED.")
	@DataMember(Order = 0)
	@Guid("03628bd8-d742-4a37-8f2e-8b7d142a64be")
	@JacksonXmlProperty(isAttribute=true, localName = "elementType")
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

