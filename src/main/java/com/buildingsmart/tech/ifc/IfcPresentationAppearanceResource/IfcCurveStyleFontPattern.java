// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

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
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;

@Guid("da500633-fe56-47a8-9405-98c6a95e757b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveStyleFontPattern extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("The length of the visible segment in the pattern definition.  <blockquote class=\"note\">NOTE&nbsp; For a visible segment representing a point, the value 0. should be assigned.</blockquote>  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The datatype has been changed to IfcLengthMeasure with upward compatibility for file-based exchange.</blockquote>")
	@Required()
	@Guid("bf5fb00d-16e8-4146-a8f3-e125fa492723")
	@JacksonXmlProperty(isAttribute=true, localName = "VisibleSegmentLength")
	private double visibleSegmentLength;

	@Description("The length of the invisible segment in the pattern definition.")
	@Required()
	@Guid("317e8bab-7743-45d9-bda6-e034d1b74450")
	@JacksonXmlProperty(isAttribute=false, localName = "InvisibleSegmentLength")
	private IfcPositiveLengthMeasure invisibleSegmentLength;


	public IfcCurveStyleFontPattern()
	{
	}

	public IfcCurveStyleFontPattern(double visibleSegmentLength, IfcPositiveLengthMeasure invisibleSegmentLength)
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

	public IfcPositiveLengthMeasure getInvisibleSegmentLength() {
		return this.invisibleSegmentLength;
	}

	public void setInvisibleSegmentLength(IfcPositiveLengthMeasure invisibleSegmentLength) {
		this.invisibleSegmentLength = invisibleSegmentLength;
	}


}

