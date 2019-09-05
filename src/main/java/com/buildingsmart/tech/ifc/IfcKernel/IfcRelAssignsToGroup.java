// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("20dee03b-bfd0-4795-923f-4619fc628b6c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssignsToGroup extends IfcRelAssigns
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingGroup")
	@Description("Reference to group that contains all assigned group members.")
	@Required()
	@Guid("1f95caf1-2cb2-4b4d-aaf4-d03e95cb784b")
	private com.buildingsmart.tech.ifc.IfcKernel.IfcGroup relatingGroup;


	public IfcRelAssignsToGroup()
	{
	}

	public IfcRelAssignsToGroup(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition[] relatedObjects, com.buildingsmart.tech.ifc.IfcKernel.IfcGroup relatingGroup)
	{
		super(globalId, relatedObjects);
		this.relatingGroup = relatingGroup;
	}

	public com.buildingsmart.tech.ifc.IfcKernel.IfcGroup getRelatingGroup() {
		return this.relatingGroup;
	}

	public void setRelatingGroup(com.buildingsmart.tech.ifc.IfcKernel.IfcGroup relatingGroup) {
		this.relatingGroup = relatingGroup;
	}


}

