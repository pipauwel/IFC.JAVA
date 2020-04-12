// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.Set;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionResourceType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0fb1cf26-3a59-44f5-9a5e-adc7ac27e46a")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcConstructionResourceType.class, name = "IfcConstructionResourceType"))
public abstract class IfcTypeResource extends IfcTypeObject implements IfcResourceSelect
{
	@Description("An identifying designation given to a resource type.")
	@DataMember(Order = 0)
	@Guid("5e812f44-4e04-4aaf-bd53-4a6055e2c355")
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	private String identification;

	@Description("An long description, or text, describing the resource in detail.  <blockquote class=\"note\">NOTE&nbsp; The inherited <em>SELF\\IfcRoot.Description</em> attribute is used as the short description.</blockquote>")
	@DataMember(Order = 1)
	@Guid("e0c1e0d9-98d4-427d-95ff-0d0763cff6b4")
	@JacksonXmlProperty(isAttribute=true, localName = "LongDescription")
	private String longDescription;

	@Description("The type denotes a particular type that indicates the resource further. The use has to be established at the level of instantiable subtypes. In particular it holds the user defined type, if the enumeration of the attribute 'PredefinedType' is set to USERDEFINED.")
	@DataMember(Order = 2)
	@Guid("dcfa4479-34ce-4047-bd7e-85fc017e6834")
	@JacksonXmlProperty(isAttribute=true, localName = "ResourceType")
	private String resourceType;

	@Description("Set of relationships to other objects, e.g. products, processes, controls, resources or actors to which this resource type is a resource.  <blockquote class=\"history\">HISTORY New inverse relationship in IFC4.</blockquote>")
	@Guid("c8fa0b60-bb75-4c92-9360-ebbe138f9d20")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssignsToResource")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ResourceOf")
	private Set<IfcRelAssignsToResource> resourceOf;


	public IfcTypeResource()
	{
	}

	public IfcTypeResource(String globalId)
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public Set<IfcRelAssignsToResource> getResourceOf() {
		return this.resourceOf;
	}


}

