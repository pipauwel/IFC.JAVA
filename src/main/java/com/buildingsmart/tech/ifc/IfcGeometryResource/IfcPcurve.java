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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;

@Guid("dd30ecc9-e76f-48d9-b2d9-5340b2f0c0b8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPcurve extends IfcCurve implements IfcCurveOnSurface
{
	@DataMember(Order = 0)
	@Required()
	@Guid("f38fdab6-e98c-4adb-9126-c3042c4c319e")
	@JacksonXmlProperty(isAttribute=false, localName = "BasisSurface")
	private IfcSurface basisSurface;

	@DataMember(Order = 1)
	@Required()
	@Guid("dc6024e0-af04-459d-857b-4eccd3401110")
	@JacksonXmlProperty(isAttribute=false, localName = "ReferenceCurve")
	private IfcCurve referenceCurve;


	public IfcPcurve()
	{
	}

	public IfcPcurve(IfcSurface basisSurface, IfcCurve referenceCurve)
	{
		this.basisSurface = basisSurface;
		this.referenceCurve = referenceCurve;
	}

	public IfcSurface getBasisSurface() {
		return this.basisSurface;
	}

	public void setBasisSurface(IfcSurface basisSurface) {
		this.basisSurface = basisSurface;
	}

	public IfcCurve getReferenceCurve() {
		return this.referenceCurve;
	}

	public void setReferenceCurve(IfcCurve referenceCurve) {
		this.referenceCurve = referenceCurve;
	}


}

