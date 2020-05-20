// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1313c1ee-f455-43d1-99a2-89dea63a0fca")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAxis1Placement.class, name = "IfcAxis1Placement"), @JsonSubTypes.Type(value = IfcAxis2Placement2D.class, name = "IfcAxis2Placement2D"), @JsonSubTypes.Type(value = IfcAxis2Placement3D.class, name = "IfcAxis2Placement3D")})
public abstract class IfcPlacement extends IfcGeometricRepresentationItem
{
	@Description("The geometric position of a reference point, such as the center of a circle, of the item to be located.")
	@DataMember(Order = 0)
	@Required()
	@Guid("23629b11-592b-4e99-bb5e-62ab0cfc52c2")
	@JacksonXmlProperty(isAttribute=false, localName = "location")
	private IfcCartesianPoint location;


	public IfcPlacement()
	{
	}

	public IfcPlacement(IfcCartesianPoint location)
	{
		this.location = location;
	}

	public IfcCartesianPoint getLocation() {
		return this.location;
	}

	public void setLocation(IfcCartesianPoint location) {
		this.location = location;
	}

	@JsonIgnore
	public int getDim() {
		return location.getDim();
	}


}

