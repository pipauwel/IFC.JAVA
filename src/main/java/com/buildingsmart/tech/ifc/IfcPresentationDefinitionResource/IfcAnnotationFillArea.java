// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("7acedf96-0cb4-4829-86d1-d848d4577671")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcAnnotationFillArea extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Description("A closed curve that defines the outer boundary of the fill area. The areas defined by the outer boundary (minus potentially defined inner boundaries) is filled by the fill area style.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The two new attributes <em>OuterBoundary</em> and <em>InnerBoundaries</em> replace the old single attribute Boundaries.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("02811150-4de5-4f4f-8175-289ca39326a2")
	@JacksonXmlProperty(isAttribute=false, localName = "outerBoundary")
	private IfcCurve outerBoundary;

	@Description("A set of inner curves that define the inner boundaries of the fill area. The areas defined by the inner boundaries are excluded from applying the fill area style.  <blockquote class=\"note\">IFC2x3 CHANGE&nbsp; The two new attributes <em>OuterBoundary</em> and <em>InnerBoundaries</em> replace the old single attribute Boundaries.</blockquote>")
	@DataMember(Order = 1)
	@Guid("472c05cc-8e55-4527-bbd6-6ce26e081b5e")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCurve")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "innerBoundaries")
	private Set<IfcCurve> innerBoundaries;


	public IfcAnnotationFillArea()
	{
	}

	public IfcAnnotationFillArea(IfcCurve outerBoundary)
	{
		this.outerBoundary = outerBoundary;
	}

	public IfcCurve getOuterBoundary() {
		return this.outerBoundary;
	}

	public void setOuterBoundary(IfcCurve outerBoundary) {
		this.outerBoundary = outerBoundary;
	}

	public Set<IfcCurve> getInnerBoundaries() {
		return this.innerBoundaries;
	}


}

