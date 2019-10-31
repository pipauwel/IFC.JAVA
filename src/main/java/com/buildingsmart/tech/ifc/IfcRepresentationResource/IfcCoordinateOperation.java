// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

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
import com.buildingsmart.tech.ifc.IfcRepresentationResource.*;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcMapConversion;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystemSelect;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystem;

@Guid("5abaa3e9-3b43-4c49-9e66-afe0a3c094d5")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcMapConversion.class, name = "IfcMapConversion"))
public abstract class IfcCoordinateOperation
{
	@Description("Source coordinate reference system for the operation.")
	@Required()
	@Guid("3d781952-2086-40fd-a92a-802f85bb3c80")
	@JsonIgnore
	private IfcCoordinateReferenceSystemSelect sourceCRS;

	@Description("Target coordinate reference system for the operation.")
	@Required()
	@Guid("50e043e6-b530-4813-8caa-bc048a759690")
	@JacksonXmlProperty(isAttribute=false, localName = "TargetCRS")
	private IfcCoordinateReferenceSystem targetCRS;


	public IfcCoordinateOperation()
	{
	}

	public IfcCoordinateOperation(IfcCoordinateReferenceSystemSelect sourceCRS, IfcCoordinateReferenceSystem targetCRS)
	{
		this.sourceCRS = sourceCRS;
		this.targetCRS = targetCRS;
	}

	public IfcCoordinateReferenceSystemSelect getSourceCRS() {
		return this.sourceCRS;
	}

	public void setSourceCRS(IfcCoordinateReferenceSystemSelect sourceCRS) {
		this.sourceCRS = sourceCRS;
	}

	public IfcCoordinateReferenceSystem getTargetCRS() {
		return this.targetCRS;
	}

	public void setTargetCRS(IfcCoordinateReferenceSystem targetCRS) {
		this.targetCRS = targetCRS;
	}


}

