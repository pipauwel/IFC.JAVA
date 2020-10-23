// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcControlExtension.IfcPerformanceHistory;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcWorkCalendar;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcWorkControl;
import com.buildingsmart.tech.ifc.IfcSharedMgmtElements.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("5cc95018-83bd-4c3b-ba54-1475cf5cbdb7")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcActionRequest.class, name = "IfcActionRequest"), @JsonSubTypes.Type(value = IfcCostItem.class, name = "IfcCostItem"), @JsonSubTypes.Type(value = IfcCostSchedule.class, name = "IfcCostSchedule"), @JsonSubTypes.Type(value = IfcPerformanceHistory.class, name = "IfcPerformanceHistory"), @JsonSubTypes.Type(value = IfcPermit.class, name = "IfcPermit"), @JsonSubTypes.Type(value = IfcProjectOrder.class, name = "IfcProjectOrder"), @JsonSubTypes.Type(value = IfcWorkCalendar.class, name = "IfcWorkCalendar"), @JsonSubTypes.Type(value = IfcWorkControl.class, name = "IfcWorkControl")})
public abstract class IfcControl extends IfcObject
{
	@Description("An identifying designation given to a control      It is the identifier at the occurrence level.       <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute unified by promoting from various subtypes of <em>IfcControl</em>.   </blockquote>")
	@DataMember(Order = 0)
	@Guid("5e07c327-7005-44be-babc-5f04a40d37cd")
	@JacksonXmlProperty(isAttribute=false, localName = "identification")
	private IfcIdentifier identification;

	@Description("Reference to the relationship that associates the control to the object(s) being controlled.")
	@InverseProperty(InverseProp = "relatingControl", Range = "IfcRelAssignsToControl")
	@Guid("ace46949-187f-4f1b-b666-1deba88f9136")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssignsToControl")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "controls")
	private Set<IfcRelAssignsToControl> controls;


	public IfcControl()
	{
	}

	public IfcControl(String globalId)
	{
		super(globalId);
	}

	public IfcIdentifier getIdentification() {
		return this.identification;
	}

	public void setIdentification(IfcIdentifier identification) {
		this.identification = identification;
	}

	public Set<IfcRelAssignsToControl> getControls() {
		return this.controls;
	}


}

