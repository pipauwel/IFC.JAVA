// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e5a4f246-e6c4-40b9-85b6-af71acb30b68")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelFlowControlElements extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("References control elements which may be used to impart control on the Distribution Element.")
	@Required()
	@MinLength(1)
	@Guid("ee7741ae-f207-410e-a37d-fca605de1cfa")
	private Set<com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement> relatedControlElements = new HashSet<com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement>();

	@JacksonXmlProperty(isAttribute=false, localName = "RelatingFlowElement")
	@Description("Relationship to a distribution flow element")
	@Required()
	@Guid("7dccb4a5-b41e-4572-9f90-7a9b7a5f6f94")
	private com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement relatingFlowElement;


	public IfcRelFlowControlElements()
	{
	}

	public IfcRelFlowControlElements(String globalId, com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement[] relatedControlElements, com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement relatingFlowElement)
	{
		super(globalId);
		this.relatedControlElements = new HashSet<>(Arrays.asList(relatedControlElements));
		this.relatingFlowElement = relatingFlowElement;
	}

	public Set<com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement> getRelatedControlElements() {
		return this.relatedControlElements;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement getRelatingFlowElement() {
		return this.relatingFlowElement;
	}

	public void setRelatingFlowElement(com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement relatingFlowElement) {
		this.relatingFlowElement = relatingFlowElement;
	}


}

