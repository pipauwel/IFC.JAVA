// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcConstructionResource;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("7d23ec63-a69d-48c1-9db7-f4089326e1f2")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcConstructionResource.class, name = "IfcConstructionResource"))
public abstract class IfcResource extends IfcObject implements IfcResourceSelect
{
	@Description("An identifying designation given to a resource.      It is the identifier at the occurrence level.       <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute promoted from subtype <em>IfcConstructionResource</em>.</blockquote>")
	@DataMember(Order = 0)
	@Guid("0cd017c3-4383-4abf-b0ed-773af9cc8232")
	@JacksonXmlProperty(isAttribute=false, localName = "identification")
	private IfcIdentifier identification;

	@Description("A detailed description of the resource (e.g. the skillset for a labor resource).    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute <em>LongDescription</em> is added replacing the <em>ResourceGroup</em> attribute at subtype <em>IfcConstructionResource</em>.</blockquote>")
	@DataMember(Order = 1)
	@Guid("60a852dc-c4e0-4828-89b6-44ca845ab563")
	@JacksonXmlProperty(isAttribute=true, localName = "longDescription")
	private IfcText longDescription;

	@Description("Set of relationships to other objects, e.g. products, processes, controls, resources or actors, for which this resource object is a resource.")
	@InverseProperty(InverseProp = "relatingResource", Range = "IfcRelAssignsToResource")
	@Guid("e87b021e-ec74-43eb-9a4e-b35cff326133")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssignsToResource")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "resourceOf")*/
	@JsonIgnore
	private Set<IfcRelAssignsToResource> resourceOf;


	public IfcResource()
	{
	}

	public IfcResource(String globalId)
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

	public Set<IfcRelAssignsToResource> getResourceOf() {
		return this.resourceOf;
	}


}

