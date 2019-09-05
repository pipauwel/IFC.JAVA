// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcControlExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("00707e05-63f5-4795-9e7a-2219254df92d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesApproval extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingApproval")
	@Description("Reference to approval that is being applied using this relationship.")
	@Required()
	@Guid("aa4a0a9b-1b67-4b7f-9fae-73e5c2b4d0cb")
	private com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval relatingApproval;


	public IfcRelAssociatesApproval()
	{
	}

	public IfcRelAssociatesApproval(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect[] relatedObjects, com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval relatingApproval)
	{
		super(globalId, relatedObjects);
		this.relatingApproval = relatingApproval;
	}

	public com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval getRelatingApproval() {
		return this.relatingApproval;
	}

	public void setRelatingApproval(com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval relatingApproval) {
		this.relatingApproval = relatingApproval;
	}


}

