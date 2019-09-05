// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d247df5b-2f6d-4ef6-bca1-19a0283512e0")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcWorkControl extends com.buildingsmart.tech.ifc.IfcKernel.IfcControl
{
	@JacksonXmlProperty(isAttribute=true, localName = "CreationDate")
	@Description("The date that the plan is created.")
	@Required()
	@Guid("0a22762a-7121-44bd-92cb-3bbd2bc1e0e2")
	private String creationDate;

	@Description("The authors of the work plan.")
	@MinLength(1)
	@Guid("fed840b2-43b1-4d71-a833-6854015a193b")
	private Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson> creators = new HashSet<com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson>();

	@JacksonXmlProperty(isAttribute=true, localName = "Purpose")
	@Description("A description of the purpose of the work schedule.")
	@Guid("8c118d77-09d3-47b2-a847-5b113d037d15")
	private String purpose;

	@JacksonXmlProperty(isAttribute=true, localName = "Duration")
	@Description("The total duration of the entire work schedule.")
	@Guid("e0b21a3a-7521-46f1-8fc4-4bf3f214537f")
	private String duration;

	@JacksonXmlProperty(isAttribute=true, localName = "TotalFloat")
	@Description("The total time float of the entire work schedule.")
	@Guid("67a16ba6-45d6-4997-bd66-2e4ea6494da8")
	private String totalFloat;

	@JacksonXmlProperty(isAttribute=true, localName = "StartTime")
	@Description("The start time of the schedule.")
	@Required()
	@Guid("0ff50aa4-80b0-42b6-94a8-8738e35d9864")
	private String startTime;

	@JacksonXmlProperty(isAttribute=true, localName = "FinishTime")
	@Description("The finish time of the schedule.")
	@Guid("eb43d20b-df3a-48f8-81f4-bf103d0f01b1")
	private String finishTime;


	public IfcWorkControl()
	{
	}

	public IfcWorkControl(String globalId, String creationDate, String startTime)
	{
		super(globalId);
		this.creationDate = creationDate;
		this.startTime = startTime;
	}

	public String getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson> getCreators() {
		return this.creators;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTotalFloat() {
		return this.totalFloat;
	}

	public void setTotalFloat(String totalFloat) {
		this.totalFloat = totalFloat;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}


}

