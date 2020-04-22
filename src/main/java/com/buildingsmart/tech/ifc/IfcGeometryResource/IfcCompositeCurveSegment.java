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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcReparametrisedCompositeCurveSegment;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcTransitionCode;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;

@Guid("baf231ed-97be-4368-a9f9-10ae70bad78e")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcReparametrisedCompositeCurveSegment.class, name = "IfcReparametrisedCompositeCurveSegment"))
public class IfcCompositeCurveSegment extends IfcGeometricRepresentationItem
{
	@Description("The state of transition (i.e., geometric continuity from the last point of this segment to the first point of the next segment) in a composite curve.")
	@DataMember(Order = 0)
	@Required()
	@Guid("67cb0bf1-ea16-4e1b-b20a-aed69f9f06fe")
	@JacksonXmlProperty(isAttribute=true, localName = "Transition")
	private IfcTransitionCode transition;

	@Description("An indicator of whether or not the sense of the segment agrees with, or opposes, that of the parent curve. If <em>SameSense</em> is false, the point with highest parameter value is taken as the first point of the segment.  <blockquote class=\"note\">NOTE&nbsp; If the datatype of <em>ParentCurve</em> is <em>IfcTrimmedCurve</em>, the value of <em>SameSense</em> overrides the value of <em>IfcTrimmedCurve.SenseAgreement</em></blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("5fada968-7c27-4344-9a3a-39128e5d33e9")
	@JacksonXmlProperty(isAttribute=true, localName = "SameSense")
	private Boolean sameSense;

	@Description("The bounded curve which defines the geometry of the segment.")
	@DataMember(Order = 2)
	@Required()
	@Guid("88a9a6ec-70af-43d3-a2cc-d43758ecd898")
	@JacksonXmlProperty(isAttribute=false, localName = "ParentCurve")
	private IfcCurve parentCurve;

	@Description("The set of composite curves which use this composite curve segment as a segment. This set shall not be empty.")
	@InverseProperty(InverseProp = "Segments", Range = "IfcCompositeCurve")
	@Guid("1cede6f4-cc66-4b43-8893-d6a8a6afe94a")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCompositeCurve")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "UsingCurves")
	private Set<IfcCompositeCurve> usingCurves;


	public IfcCompositeCurveSegment()
	{
	}

	public IfcCompositeCurveSegment(IfcTransitionCode transition, Boolean sameSense, IfcCurve parentCurve)
	{
		this.transition = transition;
		this.sameSense = sameSense;
		this.parentCurve = parentCurve;
	}

	public IfcTransitionCode getTransition() {
		return this.transition;
	}

	public void setTransition(IfcTransitionCode transition) {
		this.transition = transition;
	}

	public Boolean getSameSense() {
		return this.sameSense;
	}

	public void setSameSense(Boolean sameSense) {
		this.sameSense = sameSense;
	}

	public IfcCurve getParentCurve() {
		return this.parentCurve;
	}

	public void setParentCurve(IfcCurve parentCurve) {
		this.parentCurve = parentCurve;
	}

	public int getDim() {
		return 0;
	}

	public Set<IfcCompositeCurve> getUsingCurves() {
		return this.usingCurves;
	}


}

