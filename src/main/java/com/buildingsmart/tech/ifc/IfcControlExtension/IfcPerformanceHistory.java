// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcControlExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e8ca45f2-cf0b-4a93-84ca-ea3c10c7b27e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPerformanceHistory extends com.buildingsmart.tech.ifc.IfcKernel.IfcControl
{
	@Description("Describes the applicable building life-cycle phase. Typical values should be DESIGNDEVELOPMENT, SCHEMATICDEVELOPMENT, CONSTRUCTIONDOCUMENT, CONSTRUCTION, ASBUILT, COMMISSIONING, OPERATION, etc.")
	@DataMember(Order = 0)
	@Required()
	@Guid("36401673-0cb0-4b02-8a3e-b30192a03438")
	@JacksonXmlProperty(isAttribute=false, localName = "lifeCyclePhase")
	private IfcLabel lifeCyclePhase;

	@Description("Predefined generic type for a performace history that is specified in an enumeration.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 1)
	@Guid("a19e5d1f-1c30-4199-b7a2-958bf89b7871")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcPerformanceHistoryTypeEnum predefinedType;


	public IfcPerformanceHistory()
	{
	}

	public IfcPerformanceHistory(String globalId, IfcLabel lifeCyclePhase)
	{
		super(globalId);
		this.lifeCyclePhase = lifeCyclePhase;
	}

	public IfcLabel getLifeCyclePhase() {
		return this.lifeCyclePhase;
	}

	public void setLifeCyclePhase(IfcLabel lifeCyclePhase) {
		this.lifeCyclePhase = lifeCyclePhase;
	}

	public IfcPerformanceHistoryTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPerformanceHistoryTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

