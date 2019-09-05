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

@Guid("0fb1cf26-3a59-44f5-9a5e-adc7ac27e46a")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcTypeResource extends IfcTypeObject implements IfcResourceSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	@Description("An identifying designation given to a resource type.")
	@Guid("5e812f44-4e04-4aaf-bd53-4a6055e2c355")
	private String identification;

	@JacksonXmlProperty(isAttribute=true, localName = "LongDescription")
	@Description("An long description, or text, describing the resource in detail.  <blockquote class=\"note\">NOTE&nbsp; The inherited <em>SELF\\IfcRoot.Description</em> attribute is used as the short description.</blockquote>")
	@Guid("e0c1e0d9-98d4-427d-95ff-0d0763cff6b4")
	private String longDescription;

	@JacksonXmlProperty(isAttribute=true, localName = "ResourceType")
	@Description("The type denotes a particular type that indicates the resource further. The use has to be established at the level of instantiable subtypes. In particular it holds the user defined type, if the enumeration of the attribute 'PredefinedType' is set to USERDEFINED.")
	@Guid("dcfa4479-34ce-4047-bd7e-85fc017e6834")
	private String resourceType;

	@Description("Set of relationships to other objects, e.g. products, processes, controls, resources or actors to which this resource type is a resource.  <blockquote class=\"history\">HISTORY New inverse relationship in IFC4.</blockquote>")
	@Guid("c8fa0b60-bb75-4c92-9360-ebbe138f9d20")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToResource> resourceOf = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToResource>();


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

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToResource> getResourceOf() {
		return this.resourceOf;
	}


}

