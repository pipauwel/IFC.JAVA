// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement2D;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;

@Guid("1313c1ee-f455-43d1-99a2-89dea63a0fca")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAxis1Placement.class, name = "IfcAxis1Placement"), @JsonSubTypes.Type(value = IfcAxis2Placement2D.class, name = "IfcAxis2Placement2D"), @JsonSubTypes.Type(value = IfcAxis2Placement3D.class, name = "IfcAxis2Placement3D")})
public abstract class IfcPlacement extends IfcGeometricRepresentationItem
{
	@Description("The geometric position of a reference point, such as the center of a circle, of the item to be located.")
	@Required()
	@Guid("23629b11-592b-4e99-bb5e-62ab0cfc52c2")
	@JacksonXmlProperty(isAttribute=false, localName = "Location")
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

	public int getDim() {
		return 0;
	}


}

