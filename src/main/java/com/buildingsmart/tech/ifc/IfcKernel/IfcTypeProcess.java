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

@Guid("638492f3-23b3-4ca5-a78e-9370f5343f65")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcTypeProcess extends IfcTypeObject implements IfcProcessSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	@Description("An identifying designation given to a process type.")
	@Guid("6af3b748-7491-4f6e-80d3-90aab2d7b303")
	private String identification;

	@JacksonXmlProperty(isAttribute=true, localName = "LongDescription")
	@Description("An long description, or text, describing the activity in detail.  <blockquote class=\"note\">NOTE&nbsp; The inherited <em>SELF\\IfcRoot.Description</em> attribute is used as the short description.</blockquote>")
	@Guid("1c815fb1-05b1-4e37-b1cf-9dfd19d1c533")
	private String longDescription;

	@JacksonXmlProperty(isAttribute=true, localName = "ProcessType")
	@Description("The type denotes a particular type that indicates the process further. The use has to be established at the level of instantiable subtypes. In particular it holds the user defined type, if the enumeration of the attribute 'PredefinedType' is set to USERDEFINED.")
	@Guid("a65347e8-d16e-4a6f-b7d5-ddb89c9c7592")
	private String processType;

	@Description("Set of relationships to other objects, e.g. products, processes, controls, resources or actors that are operated on by the process type.  <blockquote class=\"history\">HISTORY  New inverse relationship in IFC4.</blockquote>")
	@Guid("1d7bcb8a-6c9f-4994-a414-1ddc9c2c6863")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProcess> operatesOn = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProcess>();


	public IfcTypeProcess()
	{
	}

	public IfcTypeProcess(String globalId)
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

	public String getProcessType() {
		return this.processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToProcess> getOperatesOn() {
		return this.operatesOn;
	}


}

