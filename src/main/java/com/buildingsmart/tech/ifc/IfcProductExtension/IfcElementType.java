// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponentType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("08323994-8b0a-4268-8051-2fe6ad76a2b9")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBuildingElementType.class, name = "IfcBuildingElementType"), @JsonSubTypes.Type(value = IfcCivilElementType.class, name = "IfcCivilElementType"), @JsonSubTypes.Type(value = IfcDistributionElementType.class, name = "IfcDistributionElementType"), @JsonSubTypes.Type(value = IfcElementAssemblyType.class, name = "IfcElementAssemblyType"), @JsonSubTypes.Type(value = IfcElementComponentType.class, name = "IfcElementComponentType"), @JsonSubTypes.Type(value = IfcFurnishingElementType.class, name = "IfcFurnishingElementType"), @JsonSubTypes.Type(value = IfcGeographicElementType.class, name = "IfcGeographicElementType"), @JsonSubTypes.Type(value = IfcTransportElementType.class, name = "IfcTransportElementType")})
public abstract class IfcElementType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProduct
{
	@Description("The type denotes a particular type that indicates the object further. The use has to be established at the level of instantiable subtypes. In particular it holds the user defined type, if the enumeration of the attribute 'PredefinedType' is set to USERDEFINED.")
	@DataMember(Order = 0)
	@Guid("c885a317-562b-4996-824d-45153b4fd48d")
	@JacksonXmlProperty(isAttribute=false, localName = "elementType")
	private IfcLabel elementType;


	public IfcElementType()
	{
	}

	public IfcElementType(String globalId)
	{
		super(globalId);
	}

	public IfcLabel getElementType() {
		return this.elementType;
	}

	public void setElementType(IfcLabel elementType) {
		this.elementType = elementType;
	}


}

