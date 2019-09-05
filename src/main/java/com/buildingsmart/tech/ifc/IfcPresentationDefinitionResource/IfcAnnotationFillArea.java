// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7acedf96-0cb4-4829-86d1-d848d4577671")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAnnotationFillArea extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@JacksonXmlProperty(isAttribute=false, localName = "OuterBoundary")
	@Description("A closed curve that defines the outer boundary of the fill area. The areas defined by the outer boundary (minus potentially defined inner boundaries) is filled by the fill area style.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The two new attributes <em>OuterBoundary</em> and <em>InnerBoundaries</em> replace the old single attribute Boundaries.</blockquote>")
	@Required()
	@Guid("02811150-4de5-4f4f-8175-289ca39326a2")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve outerBoundary;

	@Description("A set of inner curves that define the inner boundaries of the fill area. The areas defined by the inner boundaries are excluded from applying the fill area style.  <blockquote class=\"note\">IFC2x3 CHANGE&nbsp; The two new attributes <em>OuterBoundary</em> and <em>InnerBoundaries</em> replace the old single attribute Boundaries.</blockquote>")
	@MinLength(1)
	@Guid("472c05cc-8e55-4527-bbd6-6ce26e081b5e")
	private Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve> innerBoundaries = new HashSet<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve>();


	public IfcAnnotationFillArea()
	{
	}

	public IfcAnnotationFillArea(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve outerBoundary)
	{
		this.outerBoundary = outerBoundary;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve getOuterBoundary() {
		return this.outerBoundary;
	}

	public void setOuterBoundary(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve outerBoundary) {
		this.outerBoundary = outerBoundary;
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve> getInnerBoundaries() {
		return this.innerBoundaries;
	}


}

