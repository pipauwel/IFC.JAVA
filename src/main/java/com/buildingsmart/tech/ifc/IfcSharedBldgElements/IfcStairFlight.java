// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcInteger;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c9b965ff-02c6-41a5-937f-4788c8513e6c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStairFlight extends IfcBuildingElement
{
	@Description("Number of the risers included in the stair flight  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been deprecated it shall only be exposed with a NIL value. Use <em>Pset_StairFlightCommon.NumberOfRisers</em> instead.</blockquote>")
	@DataMember(Order = 0)
	@Guid("ee984ef4-cde1-44a3-b301-c62a10108bea")
	@JacksonXmlProperty(isAttribute=false, localName = "numberOfRisers")
	private IfcInteger numberOfRisers;

	@Description("Number of treads included in the stair flight.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been deprecated it shall only be exposed with a NIL value. Use <em>Pset_StairFlightCommon.NumberOfTreads</em> instead.</blockquote>")
	@DataMember(Order = 1)
	@Guid("8b933521-d0a8-4793-9290-c694bfdf4941")
	@JacksonXmlProperty(isAttribute=false, localName = "numberOfTreads")
	private IfcInteger numberOfTreads;

	@Description("Vertical distance from tread to tread. The riser height is supposed to be equal for all stairs in a stair flight.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been deprecated it shall only be exposed with a NIL value. Use <em>Pset_StairFlightCommon.RiserHeight</em> instead.</blockquote>")
	@DataMember(Order = 2)
	@Guid("221e43e9-f43c-47d3-b02e-20a0a86fbab6")
	@JacksonXmlProperty(isAttribute=false, localName = "riserHeight")
	private IfcPositiveLengthMeasure riserHeight;

	@Description("Horizontal distance from the front to the back of the tread. The tread length is supposed to be equal for all steps of the stair flight.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been deprecated it shall only be exposed with a NIL value. Use <em>Pset_StairFlightCommon.TreadLength</em> instead.</blockquote>")
	@DataMember(Order = 3)
	@Guid("bf014ecd-1bc8-4fee-bf42-f86df0c5cca6")
	@JacksonXmlProperty(isAttribute=false, localName = "treadLength")
	private IfcPositiveLengthMeasure treadLength;

	@Description("Predefined generic type for a stair flight that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcStairFlightType</em> is assigned, providing its own <em>IfcStairFlightType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 4)
	@Guid("42c2789a-ba85-449f-8a3c-e9920ec67ef4")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcStairFlightTypeEnum predefinedType;


	public IfcStairFlight()
	{
	}

	public IfcStairFlight(String globalId)
	{
		super(globalId);
	}

	public IfcInteger getNumberOfRisers() {
		return this.numberOfRisers;
	}

	public void setNumberOfRisers(IfcInteger numberOfRisers) {
		this.numberOfRisers = numberOfRisers;
	}

	public IfcInteger getNumberOfTreads() {
		return this.numberOfTreads;
	}

	public void setNumberOfTreads(IfcInteger numberOfTreads) {
		this.numberOfTreads = numberOfTreads;
	}

	public IfcPositiveLengthMeasure getRiserHeight() {
		return this.riserHeight;
	}

	public void setRiserHeight(IfcPositiveLengthMeasure riserHeight) {
		this.riserHeight = riserHeight;
	}

	public IfcPositiveLengthMeasure getTreadLength() {
		return this.treadLength;
	}

	public void setTreadLength(IfcPositiveLengthMeasure treadLength) {
		this.treadLength = treadLength;
	}

	public IfcStairFlightTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcStairFlightTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

