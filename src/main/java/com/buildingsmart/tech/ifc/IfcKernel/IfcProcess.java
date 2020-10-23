// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcEvent;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcProcedure;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcRelSequence;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcTask;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("f56a4e45-de47-49a7-83d1-3628609eb4f3")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcEvent.class, name = "IfcEvent"), @JsonSubTypes.Type(value = IfcProcedure.class, name = "IfcProcedure"), @JsonSubTypes.Type(value = IfcTask.class, name = "IfcTask")})
public abstract class IfcProcess extends IfcObject implements IfcProcessSelect
{
	@Description("An identifying designation given to a process or activity.      It is the identifier at the occurrence level.       <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute promoted from subtypes.</blockquote>")
	@DataMember(Order = 0)
	@Guid("66e9489d-b4ed-4ba1-a9bb-eebd2225c8f1")
	@JacksonXmlProperty(isAttribute=false, localName = "identification")
	private IfcIdentifier identification;

	@Description("An extended description or narrative that may be provided.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.</blockquote>")
	@DataMember(Order = 1)
	@Guid("a6480a2f-193a-4d98-af8a-dcc00c42d675")
	@JacksonXmlProperty(isAttribute=false, localName = "longDescription")
	private IfcText longDescription;

	@Description("Dependency between two activities, it refers to the subsequent activity for which this activity is the predecessor. The link between two activities can include a link type and a lag time.")
	@InverseProperty(InverseProp = "relatingProcess", Range = "IfcRelSequence")
	@Guid("e95a3b00-ba20-4428-9ea0-0dac117a2339")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcRelSequence")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "isPredecessorTo")*/
	@JsonIgnore
	private Set<IfcRelSequence> isPredecessorTo;

	@Description("Dependency between two activities, it refers to the previous activity for which this activity is the successor. The link between two activities can include a link type and a lag time.")
	@InverseProperty(InverseProp = "relatedProcess", Range = "IfcRelSequence")
	@Guid("06cc4698-e7f3-4905-a123-e09c3e2bb81d")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelSequence")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "isSuccessorFrom")
	private Set<IfcRelSequence> isSuccessorFrom;

	@Description("Set of relationships to other objects, e.g. products, processes, controls, resources or actors, that are operated on by the process.")
	@InverseProperty(InverseProp = "relatingProcess", Range = "IfcRelAssignsToProcess")
	@Guid("c6ab7167-e878-400c-9125-45a74e99ef1d")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssignsToProcess")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "operatesOn")
	private Set<IfcRelAssignsToProcess> operatesOn;


	public IfcProcess()
	{
	}

	public IfcProcess(String globalId)
	{
		super(globalId);
	}

	public IfcIdentifier getIdentification() {
		return this.identification;
	}

	public void setIdentification(IfcIdentifier identification) {
		this.identification = identification;
	}

	public IfcText getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(IfcText longDescription) {
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

