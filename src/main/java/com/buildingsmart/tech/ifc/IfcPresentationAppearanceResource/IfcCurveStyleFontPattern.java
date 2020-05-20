// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("da500633-fe56-47a8-9405-98c6a95e757b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveStyleFontPattern extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("The length of the visible segment in the pattern definition.  <blockquote class=\"note\">NOTE&nbsp; For a visible segment representing a point, the value 0. should be assigned.</blockquote>  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The datatype has been changed to IfcLengthMeasure with upward compatibility for file-based exchange.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("bf5fb00d-16e8-4146-a8f3-e125fa492723")
	@JacksonXmlProperty(isAttribute=false, localName = "visibleSegmentLength")
	private IfcLengthMeasure visibleSegmentLength;

	@Description("The length of the invisible segment in the pattern definition.")
	@DataMember(Order = 1)
	@Required()
	@Guid("317e8bab-7743-45d9-bda6-e034d1b74450")
	@JacksonXmlProperty(isAttribute=false, localName = "invisibleSegmentLength")
	private IfcPositiveLengthMeasure invisibleSegmentLength;


	public IfcCurveStyleFontPattern()
	{
	}

	public IfcCurveStyleFontPattern(IfcLengthMeasure visibleSegmentLength, IfcPositiveLengthMeasure invisibleSegmentLength)
	{
		this.visibleSegmentLength = visibleSegmentLength;
		this.invisibleSegmentLength = invisibleSegmentLength;
	}

	public IfcLengthMeasure getVisibleSegmentLength() {
		return this.visibleSegmentLength;
	}

	public void setVisibleSegmentLength(IfcLengthMeasure visibleSegmentLength) {
		this.visibleSegmentLength = visibleSegmentLength;
	}

	public IfcPositiveLengthMeasure getInvisibleSegmentLength() {
		return this.invisibleSegmentLength;
	}

	public void setInvisibleSegmentLength(IfcPositiveLengthMeasure invisibleSegmentLength) {
		this.invisibleSegmentLength = invisibleSegmentLength;
	}


}

