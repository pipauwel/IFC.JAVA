// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

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
import com.buildingsmart.tech.ifc.IfcProcessExtension.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProcess;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcEventTypeEnum;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcEventTriggerTypeEnum;

@Guid("155c5cde-5c7b-4097-ab18-9e8bbd7c4981")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEventType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProcess
{
	@Description("Identifies the predefined types of an event from which       the type required may be set.")
	@Required()
	@Guid("976cded4-c6b7-475a-a751-62ccf9a6c0cd")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcEventTypeEnum predefinedType;

	@Description("Identifies the predefined types of event trigger from which       the type required may be set.")
	@Required()
	@Guid("92939a07-578d-4064-986a-57a451d29ca4")
	@JacksonXmlProperty(isAttribute=true, localName = "EventTriggerType")
	private IfcEventTriggerTypeEnum eventTriggerType;

	@Description("A user defined event trigger type, the value of which       is asserted when the value of an event trigger type is       declared as USERDEFINED.")
	@Guid("d36c4da1-e713-4327-8b73-c6657fdca770")
	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedEventTriggerType")
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

