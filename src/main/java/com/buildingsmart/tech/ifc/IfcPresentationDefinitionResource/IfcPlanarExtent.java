// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("33b1599e-416e-4c94-9726-005a8cc6c9ef")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcPlanarBox.class, name = "IfcPlanarBox"))
public class IfcPlanarExtent extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Description("The extent in the direction of the x-axis.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a8a8144f-33f1-4701-af25-f640045b7e3c")
	@JacksonXmlProperty(isAttribute=false, localName = "sizeInX")
	private IfcLengthMeasure sizeInX;

	@Description("The extent in the direction of the y-axis.")
	@DataMember(Order = 1)
	@Required()
	@Guid("3408c0ce-a4db-4fbb-8425-e56b5aa384ea")
	@JacksonXmlProperty(isAttribute=false, localName = "sizeInY")
	private IfcLengthMeasure sizeInY;


	public IfcPlanarExtent()
	{
	}

	public IfcPlanarExtent(IfcLengthMeasure sizeInX, IfcLengthMeasure sizeInY)
	{
		this.sizeInX = sizeInX;
		this.sizeInY = sizeInY;
	}

	public IfcLengthMeasure getSizeInX() {
		return this.sizeInX;
	}

	public void setSizeInX(IfcLengthMeasure sizeInX) {
		this.sizeInX = sizeInX;
	}

	public IfcLengthMeasure getSizeInY() {
		return this.sizeInY;
	}

	public void setSizeInY(IfcLengthMeasure sizeInY) {
		this.sizeInY = sizeInY;
	}


}

