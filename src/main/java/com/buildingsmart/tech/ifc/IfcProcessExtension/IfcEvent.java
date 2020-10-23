// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcEventTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2d5e432b-e7f0-4c0d-8a56-abea523cfc61")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEvent extends com.buildingsmart.tech.ifc.IfcKernel.IfcProcess
{
	@Description("Identifies the predefined types of an event from which       the type required may be set.")
	@DataMember(Order = 0)
	@Guid("d38ae629-7960-4a14-beb5-e6d1a11097d4")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcEventTypeEnum predefinedType;

	@Description("Identifies the predefined types of event trigger from which       the type required may be set.")
	@DataMember(Order = 1)
	@Guid("a6bffe9c-b7a3-46d8-a8a9-f5a4e77906dc")
	@JacksonXmlProperty(isAttribute=true, localName = "eventTriggerType")
	private IfcEventTriggerTypeEnum eventTriggerType;

	@Description("A user defined event trigger type, the value of which is       asserted when the value of an event trigger type is declared       as USERDEFINED.")
	@DataMember(Order = 2)
	@Guid("d670c1b3-96ee-4dbc-af96-eb6097871532")
	@JacksonXmlProperty(isAttribute=true, localName = "userDefinedEventTriggerType")
	private String userDefinedEventTriggerType;

	@Description("The date and/or time at which an event occurs.")
	@DataMember(Order = 3)
	@Guid("ba8ea655-c837-44ec-b7ce-e7e45f796e64")
	@JacksonXmlProperty(isAttribute=false, localName = "eventOccurenceTime")
	private IfcEventTime eventOccurenceTime;


	public IfcEvent()
	{
	}

	public IfcEvent(String globalId)
	{
		super(globalId);
	}

	public IfcEventTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcEventTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcEventTriggerTypeEnum getEventTriggerType() {
		return this.eventTriggerType;
	}

	public void setEventTriggerType(IfcEventTriggerTypeEnum eventTriggerType) {
		this.eventTriggerType = eventTriggerType;
	}

	public String getUserDefinedEventTriggerType() {
		return this.userDefinedEventTriggerType;
	}

	public void setUserDefinedEventTriggerType(String userDefinedEventTriggerType) {
		this.userDefinedEventTriggerType = userDefinedEventTriggerType;
	}

	public IfcEventTime getEventOccurenceTime() {
		return this.eventOccurenceTime;
	}

	public void setEventOccurenceTime(IfcEventTime eventOccurenceTime) {
		this.eventOccurenceTime = eventOccurenceTime;
	}


}

