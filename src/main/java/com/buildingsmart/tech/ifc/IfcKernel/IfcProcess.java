// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f56a4e45-de47-49a7-83d1-3628609eb4f3")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcProcess extends IfcObject implements IfcProcessSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	@Description("An identifying designation given to a process or activity.      It is the identifier at the occurrence level.       <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute promoted from subtypes.</blockquote>")
	@Guid("66e9489d-b4ed-4ba1-a9bb-eebd2225c8f1")
	private String identification;

	@JacksonXmlProperty(isAttribute=true, localName = "LongDescription")
	@Description("An extended description or narrative that may be provided.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.</blockquote>")
	@Guid("a6480a2f-193a-4d98-af8a-dcc00c42d675")
	private String longDescription;

	@Description("Dependency between two activities, it refers to the subsequent activity for which this activity is the predecessor. The link between two activities can include a link type and a lag time.")
	@Guid("e95a3b00-ba20-4428-9ea0-0dac117a2339")
	private Set<com.buildingsmart.tech.ifc.IfcProcessExtension.IfcRelSequence> isPredecessorTo = new HashSet<com.buildingsmart.tech.ifc.IfcProcessExtension.IfcRelSequence>();

	@Description("Dependency between two activities, it refers to the previous activity for which this activity is the successor. The link between two activities can include a link type and a lag time.")
	@Guid("06cc4698-e7f3-4905-a123-e09c3e2bb81d")
	private Set<com.buildingsmart.tech.ifc.IfcProcessExtension.IfcRelSequence> isSuccessorFrom = new HashSet<com.buildingsmart.tech.ifc.IfcProcessExtension.IfcRelSequence>();

	@Description("Set of relationships to other objects, e.g. products, processes, controls, resources or actors, that are operated on by the process.")
	@Guid("c6ab7167-e878-400c-9125-45a74e99ef1d")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProcess> operatesOn = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProcess>();


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

	public Set<com.buildingsmart.tech.ifc.IfcProcessExtension.IfcRelSequence> getIsPredecessorTo() {
		return this.isPredecessorTo;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProcessExtension.IfcRelSequence> getIsSuccessorFrom() {
		return this.isSuccessorFrom;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProcess> getOperatesOn() {
		return this.operatesOn;
	}


}

