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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcGeometricCurveSet;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcGeometricSetSelect;

@Guid("fee86dc6-fa63-40dc-b7c9-cde3957f7e9e")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcGeometricCurveSet.class, name = "IfcGeometricCurveSet"))
public class IfcGeometricSet extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Description("The geometric elements which make up the geometric set, these may be points, curves or surfaces; but are required to be of the same coordinate space dimensionality.")
	@Required()
	@Guid("2fbfb910-86f0-40a1-bc8c-23b799cd1b0c")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcGeometricSetSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Elements")
	private Set<IfcGeometricSetSelect> elements;


	public IfcGeometricSet()
	{
	}

	public IfcGeometricSet(IfcGeometricSetSelect[] elements)
	{
		this.elements = new HashSet<>(Arrays.asList(elements));
	}

	public Set<IfcGeometricSetSelect> getElements() {
		return this.elements;
	}

	public int getDim() {
		return 0;
	}


}

