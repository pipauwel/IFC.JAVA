// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("a309fabc-b0bd-4c8d-a1e7-0a91f255ecce")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralConnection.class, name = "IfcStructuralConnection"), @JsonSubTypes.Type(value = IfcStructuralMember.class, name = "IfcStructuralMember")})
public abstract class IfcStructuralItem extends com.buildingsmart.tech.ifc.IfcKernel.IfcProduct implements IfcStructuralActivityAssignmentSelect
{
	@Description("Inverse relationship to all structural activities (i.e. to actions or reactions) which are assigned to this structural member.")
	@InverseProperty(InverseProp = "relatingElement", Range = "IfcRelConnectsStructuralActivity")
	@Guid("ee8db982-5c72-477c-b54a-fed63d0326fd")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelConnectsStructuralActivity")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "assignedStructuralActivity")
	private Set<IfcRelConnectsStructuralActivity> assignedStructuralActivity;


	public IfcStructuralItem()
	{
	}

	public IfcStructuralItem(String globalId)
	{
		super(globalId);
	}

	public Set<IfcRelConnectsStructuralActivity> getAssignedStructuralActivity() {
		return this.assignedStructuralActivity;
	}


}

