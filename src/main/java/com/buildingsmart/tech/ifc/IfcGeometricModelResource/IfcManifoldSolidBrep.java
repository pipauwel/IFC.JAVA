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
import com.buildingsmart.tech.ifc.IfcTopologyResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcAdvancedBrep;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcFacetedBrep;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcSolidModel;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcClosedShell;

@Guid("a50d65b5-c2d5-47ea-a0a6-786fe005e10b")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAdvancedBrep.class, name = "IfcAdvancedBrep"), @JsonSubTypes.Type(value = IfcFacetedBrep.class, name = "IfcFacetedBrep")})
public abstract class IfcManifoldSolidBrep extends IfcSolidModel
{
	@Description("A closed shell defining the exterior boundary of the solid. The shell normal shall point away from the interior of the solid.")
	@DataMember(Order = 0)
	@Required()
	@Guid("037a2664-7d98-4059-af1b-cf56b8255a6f")
	@JacksonXmlProperty(isAttribute=false, localName = "Outer")
	private IfcClosedShell outer;


	public IfcManifoldSolidBrep()
	{
	}

	public IfcManifoldSolidBrep(IfcClosedShell outer)
	{
		this.outer = outer;
	}

	public IfcClosedShell getOuter() {
		return this.outer;
	}

	public void setOuter(IfcClosedShell outer) {
		this.outer = outer;
	}


}

