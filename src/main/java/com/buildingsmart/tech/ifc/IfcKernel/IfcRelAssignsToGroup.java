// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("20dee03b-bfd0-4795-923f-4619fc628b6c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcRelAssignsToGroupByFactor.class, name = "IfcRelAssignsToGroupByFactor"))
public class IfcRelAssignsToGroup extends IfcRelAssigns
{
	@Description("Reference to group that contains all assigned group members.")
	@DataMember(Order = 0)
	@Required()
	@Guid("1f95caf1-2cb2-4b4d-aaf4-d03e95cb784b")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingGroup")
	private IfcGroup relatingGroup;


	public IfcRelAssignsToGroup()
	{
	}

	public IfcRelAssignsToGroup(String globalId, IfcObjectDefinition[] relatedObjects, IfcGroup relatingGroup)
	{
		super(globalId, relatedObjects);
		this.relatingGroup = relatingGroup;
	}

	public IfcGroup getRelatingGroup() {
		return this.relatingGroup;
	}

	public void setRelatingGroup(IfcGroup relatingGroup) {
		this.relatingGroup = relatingGroup;
	}


}

