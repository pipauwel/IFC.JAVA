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

@Guid("7d23ec63-a69d-48c1-9db7-f4089326e1f2")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcResource extends IfcObject implements IfcResourceSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	@Description("An identifying designation given to a resource.      It is the identifier at the occurrence level.       <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute promoted from subtype <em>IfcConstructionResource</em>.</blockquote>")
	@Guid("0cd017c3-4383-4abf-b0ed-773af9cc8232")
	private String identification;

	@JacksonXmlProperty(isAttribute=true, localName = "LongDescription")
	@Description("A detailed description of the resource (e.g. the skillset for a labor resource).    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute <em>LongDescription</em> is added replacing the <em>ResourceGroup</em> attribute at subtype <em>IfcConstructionResource</em>.</blockquote>")
	@Guid("60a852dc-c4e0-4828-89b6-44ca845ab563")
	private String longDescription;

	@Description("Set of relationships to other objects, e.g. products, processes, controls, resources or actors, for which this resource object is a resource.")
	@Guid("e87b021e-ec74-43eb-9a4e-b35cff326133")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToResource> resourceOf = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToResource>();


	public IfcResource()
	{
	}

	public IfcResource(String globalId)
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

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToResource> getResourceOf() {
		return this.resourceOf;
	}


}

