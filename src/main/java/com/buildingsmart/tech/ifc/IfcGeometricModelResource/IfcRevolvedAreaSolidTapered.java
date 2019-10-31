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
import com.buildingsmart.tech.ifc.IfcProfileResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcRevolvedAreaSolid;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement;

@Guid("d15358b0-162a-4760-993f-02cce84f936b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRevolvedAreaSolidTapered extends IfcRevolvedAreaSolid
{
	@Required()
	@Guid("965ddc62-69c3-429c-b725-41e028fb1a3d")
	@JacksonXmlProperty(isAttribute=false, localName = "EndSweptArea")
	private IfcProfileDef endSweptArea;


	public IfcRevolvedAreaSolidTapered()
	{
	}

	public IfcRevolvedAreaSolidTapered(IfcProfileDef sweptArea, IfcAxis1Placement axis, double angle, IfcProfileDef endSweptArea)
	{
		super(sweptArea, axis, angle);
		this.endSweptArea = endSweptArea;
	}

	public IfcProfileDef getEndSweptArea() {
		return this.endSweptArea;
	}

	public void setEndSweptArea(IfcProfileDef endSweptArea) {
		this.endSweptArea = endSweptArea;
	}


}

