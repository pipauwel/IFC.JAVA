// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("baf231ed-97be-4368-a9f9-10ae70bad78e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCompositeCurveSegment extends IfcGeometricRepresentationItem
{
	@JacksonXmlProperty(isAttribute=true, localName = "Transition")
	@Description("The state of transition (i.e., geometric continuity from the last point of this segment to the first point of the next segment) in a composite curve.")
	@Required()
	@Guid("67cb0bf1-ea16-4e1b-b20a-aed69f9f06fe")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcTransitionCode transition;

	@JacksonXmlProperty(isAttribute=true, localName = "SameSense")
	@Description("An indicator of whether or not the sense of the segment agrees with, or opposes, that of the parent curve. If <em>SameSense</em> is false, the point with highest parameter value is taken as the first point of the segment.  <blockquote class=\"note\">NOTE&nbsp; If the datatype of <em>ParentCurve</em> is <em>IfcTrimmedCurve</em>, the value of <em>SameSense</em> overrides the value of <em>IfcTrimmedCurve.SenseAgreement</em></blockquote>")
	@Required()
	@Guid("5fada968-7c27-4344-9a3a-39128e5d33e9")
	private Boolean sameSense;

	@JacksonXmlProperty(isAttribute=false, localName = "ParentCurve")
	@Description("The bounded curve which defines the geometry of the segment.")
	@Required()
	@Guid("88a9a6ec-70af-43d3-a2cc-d43758ecd898")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve parentCurve;

	@Description("The set of composite curves which use this composite curve segment as a segment. This set shall not be empty.")
	@MinLength(1)
	@Guid("1cede6f4-cc66-4b43-8893-d6a8a6afe94a")
	private Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurve> usingCurves = new HashSet<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurve>();


	public IfcCompositeCurveSegment()
	{
	}

	public IfcCompositeCurveSegment(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcTransitionCode transition, Boolean sameSense, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve parentCurve)
	{
		this.transition = transition;
		this.sameSense = sameSense;
		this.parentCurve = parentCurve;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcTransitionCode getTransition() {
		return this.transition;
	}

	public void setTransition(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcTransitionCode transition) {
		this.transition = transition;
	}

	public Boolean getSameSense() {
		return this.sameSense;
	}

	public void setSameSense(Boolean sameSense) {
		this.sameSense = sameSense;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve getParentCurve() {
		return this.parentCurve;
	}

	public void setParentCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve parentCurve) {
		this.parentCurve = parentCurve;
	}

	public int getDim() {
		return 0;
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurve> getUsingCurves() {
		return this.usingCurves;
	}


}

