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
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcEventType;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcProcedureType;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcTaskType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("638492f3-23b3-4ca5-a78e-9370f5343f65")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcEventType.class, name = "IfcEventType"), @JsonSubTypes.Type(value = IfcProcedureType.class, name = "IfcProcedureType"), @JsonSubTypes.Type(value = IfcTaskType.class, name = "IfcTaskType")})
public abstract class IfcTypeProcess extends IfcTypeObject implements IfcProcessSelect
{
	@Description("An identifying designation given to a process type.")
	@DataMember(Order = 0)
	@Guid("6af3b748-7491-4f6e-80d3-90aab2d7b303")
	@JacksonXmlProperty(isAttribute=false, localName = "identification")
	private IfcIdentifier identification;

	@Description("An long description, or text, describing the activity in detail.  <blockquote class=\"note\">NOTE&nbsp; The inherited <em>SELF\\IfcRoot.Description</em> attribute is used as the short description.</blockquote>")
	@DataMember(Order = 1)
	@Guid("1c815fb1-05b1-4e37-b1cf-9dfd19d1c533")
	@JacksonXmlProperty(isAttribute=false, localName = "longDescription")
	private IfcText longDescription;

	@Description("The type denotes a particular type that indicates the process further. The use has to be established at the level of instantiable subtypes. In particular it holds the user defined type, if the enumeration of the attribute 'PredefinedType' is set to USERDEFINED.")
	@DataMember(Order = 2)
	@Guid("a65347e8-d16e-4a6f-b7d5-ddb89c9c7592")
	@JacksonXmlProperty(isAttribute=false, localName = "processType")
	private IfcLabel processType;

	@Description("Set of relationships to other objects, e.g. products, processes, controls, resources or actors that are operated on by the process type.  <blockquote class=\"history\">HISTORY  New inverse relationship in IFC4.</blockquote>")
	@InverseProperty(InverseProp = "relatingProcess", Range = "IfcRelAssignsToProcess")
	@Guid("1d7bcb8a-6c9f-4994-a414-1ddc9c2c6863")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssignsToProcess")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "operatesOn")
	private Set<IfcRelAssignsToProcess> operatesOn;


	public IfcTypeProcess()
	{
	}

	public IfcTypeProcess(String globalId)
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

	public IfcLabel getProcessType() {
		return this.processType;
	}

	public void setProcessType(IfcLabel processType) {
		this.processType = processType;
	}

	public Set<IfcRelAssignsToProcess> getOperatesOn() {
		return this.operatesOn;
	}


}

