// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("f29818b8-d9e0-49fc-a593-993420817803")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDistributionControlElement extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElement
{
	@Description("Reference through the relationship object to related distribution flow elements.")
	@MaxLength(1)
	@Guid("27a6ae84-a0f5-4f78-b04e-96fb34fe6869")
	private Set<com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcRelFlowControlElements> assignedToFlowElement = new HashSet<com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcRelFlowControlElements>();


	public IfcDistributionControlElement()
	{
	}

	public IfcDistributionControlElement(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcRelFlowControlElements> getAssignedToFlowElement() {
		return this.assignedToFlowElement;
	}


}

