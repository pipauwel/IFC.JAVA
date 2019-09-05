// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ebd15e62-e09c-44c3-8e9c-7f8840bebed8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCompositeCurve extends IfcBoundedCurve
{
	@Description("The component bounded curves, their transitions and senses. The transition attribute for the last segment defines the transition between the end of the last segment and the start of the first; this transition attribute may take the value discontinuous, which indicates an open curve.")
	@Required()
	@MinLength(1)
	@Guid("b32453c8-8375-4bc7-8758-86e6097c7709")
	private List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurveSegment> segments = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurveSegment>();

	@JacksonXmlProperty(isAttribute=true, localName = "SelfIntersect")
	@Description("Indication of whether the curve intersects itself or not; this is for information only.")
	@Required()
	@Guid("8e53369e-bae8-4a7e-81e4-370b1cb785b8")
	private Boolean selfIntersect;


	public IfcCompositeCurve()
	{
	}

	public IfcCompositeCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurveSegment[] segments, Boolean selfIntersect)
	{
		this.segments = new ArrayList<>(Arrays.asList(segments));
		this.selfIntersect = selfIntersect;
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurveSegment> getSegments() {
		return this.segments;
	}

	public Boolean getSelfIntersect() {
		return this.selfIntersect;
	}

	public void setSelfIntersect(Boolean selfIntersect) {
		this.selfIntersect = selfIntersect;
	}

	public int getNSegments() {
		return 0;
	}

	public Boolean getClosedCurve() {
		return null;
	}


}

