// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Guid("fee86dc6-fa63-40dc-b7c9-cde3957f7e9e")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcGeometricCurveSet.class, name = "IfcGeometricCurveSet"))
public class IfcGeometricSet extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Description("The geometric elements which make up the geometric set, these may be points, curves or surfaces; but are required to be of the same coordinate space dimensionality.")
	@DataMember(Order = 0)
	@Required()
	@Guid("2fbfb910-86f0-40a1-bc8c-23b799cd1b0c")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcGeometricSetSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "elements")
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

	@JsonIgnore
	public int getDim() {
		//	Dim
		//:=Elements[1].Dim
		Iterator iter = this.elements.iterator();
		IfcGeometricSetSelect o = (IfcGeometricSetSelect) iter.next();
		return o.getDim();
	}


}

