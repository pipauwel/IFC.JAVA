// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcHalfSpaceSolid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBoundingBox;

@Guid("6d52ef81-4176-4ab5-a2d3-39b86c31c378")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoxedHalfSpace extends IfcHalfSpaceSolid
{
	@Description("The box which bounds the resulting solid of the Boolean operation involving the half space solid for computational purposes only.")
	@Required()
	@Guid("1dfdfca3-ec6b-45af-8bdf-d2bdffe279bc")
	@JacksonXmlProperty(isAttribute=false, localName = "Enclosure")
	private IfcBoundingBox enclosure;


	public IfcBoxedHalfSpace()
	{
	}

	public IfcBoxedHalfSpace(IfcSurface baseSurface, Boolean agreementFlag, IfcBoundingBox enclosure)
	{
		super(baseSurface, agreementFlag);
		this.enclosure = enclosure;
	}

	public IfcBoundingBox getEnclosure() {
		return this.enclosure;
	}

	public void setEnclosure(IfcBoundingBox enclosure) {
		this.enclosure = enclosure;
	}


}

