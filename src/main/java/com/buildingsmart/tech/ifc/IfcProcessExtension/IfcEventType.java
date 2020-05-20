// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("155c5cde-5c7b-4097-ab18-9e8bbd7c4981")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEventType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProcess
{
	@Description("Identifies the predefined types of an event from which       the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("976cded4-c6b7-475a-a751-62ccf9a6c0cd")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcEventTypeEnum predefinedType;

	@Description("Identifies the predefined types of event trigger from which       the type required may be set.")
	@DataMember(Order = 1)
	@Required()
	@Guid("92939a07-578d-4064-986a-57a451d29ca4")
	@JacksonXmlProperty(isAttribute=true, localName = "eventTriggerType")
	private IfcEventTriggerTypeEnum eventTriggerType;

	@Description("A user defined event trigger type, the value of which       is asserted when the value of an event trigger type is       declared as USERDEFINED.")
	@DataMember(Order = 2)
	@Guid("d36c4da1-e713-4327-8b73-c6657fdca770")
	@JacksonXmlProperty(isAttribute=true, localName = "userDefinedEventTriggerType")
	private String userDefinedEventTriggerType;


	public IfcEventType()
	{
	}

	public IfcEventType(String globalId, IfcEventTypeEnum predefinedType, IfcEventTriggerTypeEnum eventTriggerType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
		this.eventTriggerType = eventTriggerType;
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


}

