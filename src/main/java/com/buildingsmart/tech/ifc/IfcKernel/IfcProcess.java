// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

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
import com.buildingsmart.tech.ifc.IfcKernel.*;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcEvent;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcProcedure;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcTask;
import com.buildingsmart.tech.ifc.IfcKernel.IfcObject;

@Guid("f56a4e45-de47-49a7-83d1-3628609eb4f3")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcEvent.class, name = "IfcEvent"), @JsonSubTypes.Type(value = IfcProcedure.class, name = "IfcProcedure"), @JsonSubTypes.Type(value = IfcTask.class, name = "IfcTask")})
public abstract class IfcProcess extends IfcObject implements IfcProcessSelect
{
	@Description("An identifying designation given to a process or activity.      It is the identifier at the occurrence level.       <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute promoted from subtypes.</blockquote>")
	@DataMember(Order = 0)
	@Guid("66e9489d-b4ed-4ba1-a9bb-eebd2225c8f1")
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	private String identification;

	@Description("An extended description or narrative that may be provided.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.</blockquote>")
	@DataMember(Order = 1)
	@Guid("a6480a2f-193a-4d98-af8a-dcc00c42d675")
	@JacksonXmlProperty(isAttribute=true, localName = "LongDescription")
	private String longDescription;

	@Description("Dependency between two activities, it refers to the subsequent activity for which this activity is the predecessor. The link between two activities can include a link type and a lag time.")
	@InverseProperty(InverseProp = "RelatingProcess", Range = "IfcRelSequence")
	@Guid("e95a3b00-ba20-4428-9ea0-0dac117a2339")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelSequence")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "IsPredecessorTo")
	private Set<IfcRelSequence> isPredecessorTo;

	@Description("Dependency between two activities, it refers to the previous activity for which this activity is the successor. The link between two activities can include a link type and a lag time.")
	@InverseProperty(InverseProp = "RelatedProcess", Range = "IfcRelSequence")
	@Guid("06cc4698-e7f3-4905-a123-e09c3e2bb81d")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelSequence")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "IsSuccessorFrom")
	private Set<IfcRelSequence> isSuccessorFrom;

	@Description("Set of relationships to other objects, e.g. products, processes, controls, resources or actors, that are operated on by the process.")
	@InverseProperty(InverseProp = "RelatingProcess", Range = "IfcRelAssignsToProcess")
	@Guid("c6ab7167-e878-400c-9125-45a74e99ef1d")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssignsToProcess")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "OperatesOn")
	private Set<IfcRelAssignsToProcess> operatesOn;


	public IfcProcess()
	{
	}

	public IfcProcess(String globalId)
	{
		super(globalId);
	}

	public String getIdentification() {
		return this.identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Set<IfcRelSequence> getIsPredecessorTo() {
		return this.isPredecessorTo;
	}

	public Set<IfcRelSequence> getIsSuccessorFrom() {
		return this.isSuccessorFrom;
	}

	public Set<IfcRelAssignsToProcess> getOperatesOn() {
		return this.operatesOn;
	}


}

