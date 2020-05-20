// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionResourceType;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("0fb1cf26-3a59-44f5-9a5e-adc7ac27e46a")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcConstructionResourceType.class, name = "IfcConstructionResourceType"))
public abstract class IfcTypeResource extends IfcTypeObject implements IfcResourceSelect
{
	@Description("An identifying designation given to a resource type.")
	@DataMember(Order = 0)
	@Guid("5e812f44-4e04-4aaf-bd53-4a6055e2c355")
	@JacksonXmlProperty(isAttribute=false, localName = "identification")
	private IfcIdentifier identification;

	@Description("An long description, or text, describing the resource in detail.  <blockquote class=\"note\">NOTE&nbsp; The inherited <em>SELF\\IfcRoot.Description</em> attribute is used as the short description.</blockquote>")
	@DataMember(Order = 1)
	@Guid("e0c1e0d9-98d4-427d-95ff-0d0763cff6b4")
	@JacksonXmlProperty(isAttribute=false, localName = "longDescription")
	private IfcText longDescription;

	@Description("The type denotes a particular type that indicates the resource further. The use has to be established at the level of instantiable subtypes. In particular it holds the user defined type, if the enumeration of the attribute 'PredefinedType' is set to USERDEFINED.")
	@DataMember(Order = 2)
	@Guid("dcfa4479-34ce-4047-bd7e-85fc017e6834")
	@JacksonXmlProperty(isAttribute=false, localName = "resourceType")
	private IfcLabel resourceType;

	@Description("Set of relationships to other objects, e.g. products, processes, controls, resources or actors to which this resource type is a resource.  <blockquote class=\"history\">HISTORY New inverse relationship in IFC4.</blockquote>")
	@InverseProperty(InverseProp = "relatingResource", Range = "IfcRelAssignsToResource")
	@Guid("c8fa0b60-bb75-4c92-9360-ebbe138f9d20")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssignsToResource")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "resourceOf")
	private Set<IfcRelAssignsToResource> resourceOf;


	public IfcTypeResource()
	{
	}

	public IfcTypeResource(String globalId)
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

	public IfcLabel getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(IfcLabel resourceType) {
		this.resourceType = resourceType;
	}

	public Set<IfcRelAssignsToResource> getResourceOf() {
		return this.resourceOf;
	}


}

