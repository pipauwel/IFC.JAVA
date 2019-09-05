// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2d5e432b-e7f0-4c0d-8a56-abea523cfc61")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEvent extends com.buildingsmart.tech.ifc.IfcKernel.IfcProcess
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Identifies the predefined types of an event from which       the type required may be set.")
	@Guid("d38ae629-7960-4a14-beb5-e6d1a11097d4")
	private com.buildingsmart.tech.ifc.IfcProcessExtension.IfcEventTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "EventTriggerType")
	@Description("Identifies the predefined types of event trigger from which       the type required may be set.")
	@Guid("a6bffe9c-b7a3-46d8-a8a9-f5a4e77906dc")
	private com.buildingsmart.tech.ifc.IfcProcessExtension.IfcEventTriggerTypeEnum eventTriggerType;

	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedEventTriggerType")
	@Description("A user defined event trigger type, the value of which is       asserted when the value of an event trigger type is declared       as USERDEFINED.")
	@Guid("d670c1b3-96ee-4dbc-af96-eb6097871532")
	private String userDefinedEventTriggerType;

	@JacksonXmlProperty(isAttribute=false, localName = "EventOccurenceTime")
	@Description("The date and/or time at which an event occurs.")
	@Guid("ba8ea655-c837-44ec-b7ce-e7e45f796e64")
	private com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcEventTime eventOccurenceTime;


	public IfcEvent()
	{
	}

	public IfcEvent(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcProcessExtension.IfcEventTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcProcessExtension.IfcEventTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcProcessExtension.IfcEventTriggerTypeEnum getEventTriggerType() {
		return this.eventTriggerType;
	}

	public void setEventTriggerType(com.buildingsmart.tech.ifc.IfcProcessExtension.IfcEventTriggerTypeEnum eventTriggerType) {
		this.eventTriggerType = eventTriggerType;
	}

	public String getUserDefinedEventTriggerType() {
		return this.userDefinedEventTriggerType;
	}

	public void setUserDefinedEventTriggerType(String userDefinedEventTriggerType) {
		this.userDefinedEventTriggerType = userDefinedEventTriggerType;
	}

	public com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcEventTime getEventOccurenceTime() {
		return this.eventOccurenceTime;
	}

	public void setEventOccurenceTime(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcEventTime eventOccurenceTime) {
		this.eventOccurenceTime = eventOccurenceTime;
	}


}

