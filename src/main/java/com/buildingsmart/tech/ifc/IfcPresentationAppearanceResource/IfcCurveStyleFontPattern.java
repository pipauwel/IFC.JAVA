// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("da500633-fe56-47a8-9405-98c6a95e757b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveStyleFontPattern extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@JacksonXmlProperty(isAttribute=true, localName = "VisibleSegmentLength")
	@Description("The length of the visible segment in the pattern definition.  <blockquote class=\"note\">NOTE&nbsp; For a visible segment representing a point, the value 0. should be assigned.</blockquote>  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The datatype has been changed to IfcLengthMeasure with upward compatibility for file-based exchange.</blockquote>")
	@Required()
	@Guid("bf5fb00d-16e8-4146-a8f3-e125fa492723")
	private double visibleSegmentLength;

	@JacksonXmlProperty(isAttribute=true, localName = "InvisibleSegmentLength")
	@Description("The length of the invisible segment in the pattern definition.")
	@Required()
	@Guid("317e8bab-7743-45d9-bda6-e034d1b74450")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure invisibleSegmentLength;


	public IfcCurveStyleFontPattern()
	{
	}

	public IfcCurveStyleFontPattern(double visibleSegmentLength, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure invisibleSegmentLength)
	{
		this.visibleSegmentLength = visibleSegmentLength;
		this.invisibleSegmentLength = invisibleSegmentLength;
	}

	public double getVisibleSegmentLength() {
		return this.visibleSegmentLength;
	}

	public void setVisibleSegmentLength(double visibleSegmentLength) {
		this.visibleSegmentLength = visibleSegmentLength;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getInvisibleSegmentLength() {
		return this.invisibleSegmentLength;
	}

	public void setInvisibleSegmentLength(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure invisibleSegmentLength) {
		this.invisibleSegmentLength = invisibleSegmentLength;
	}


}

