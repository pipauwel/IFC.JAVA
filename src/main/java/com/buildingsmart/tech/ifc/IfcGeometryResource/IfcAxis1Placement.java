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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPlacement;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;

@Guid("c8b3d74c-f4b5-470f-9869-a0abb477b699")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAxis1Placement extends IfcPlacement
{
	@Description("The direction of the local Z axis.")
	@DataMember(Order = 0)
	@Guid("c014a489-c24c-47b9-980e-1ccb8510c66b")
	@JacksonXmlProperty(isAttribute=false, localName = "Axis")
	private IfcDirection axis;


	public IfcAxis1Placement()
	{
	}

	public IfcAxis1Placement(IfcCartesianPoint location)
	{
		super(location);
	}

	public IfcDirection getAxis() {
		return this.axis;
	}

	public void setAxis(IfcDirection axis) {
		this.axis = axis;
	}

	public IfcDirection getZ() {
		return null;
	}


}

