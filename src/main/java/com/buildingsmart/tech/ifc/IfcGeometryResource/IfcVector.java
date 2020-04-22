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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;

@Guid("aa519614-ac30-463c-82ff-1733470ef911")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcVector extends IfcGeometricRepresentationItem implements com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcHatchLineDistanceSelect, IfcVectorOrDirection
{
	@Description("The direction of the vector.")
	@DataMember(Order = 0)
	@Required()
	@Guid("724c6299-4acc-41c6-bbed-b436c1426e7a")
	@JacksonXmlProperty(isAttribute=false, localName = "Orientation")
	private IfcDirection orientation;

	@Description("The magnitude of the vector. All vectors of Magnitude 0.0 are regarded as equal in value regardless of the orientation attribute.")
	@DataMember(Order = 1)
	@Required()
	@Guid("5c2c3892-dc4c-467b-95af-92f6de1b2abe")
	@JacksonXmlProperty(isAttribute=true, localName = "Magnitude")
	private double magnitude;


	public IfcVector()
	{
	}

	public IfcVector(IfcDirection orientation, double magnitude)
	{
		this.orientation = orientation;
		this.magnitude = magnitude;
	}

	public IfcDirection getOrientation() {
		return this.orientation;
	}

	public void setOrientation(IfcDirection orientation) {
		this.orientation = orientation;
	}

	public double getMagnitude() {
		return this.magnitude;
	}

	public void setMagnitude(double magnitude) {
		this.magnitude = magnitude;
	}

	public int getDim() {
		return 0;
	}


}

