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

@Guid("63ee3d6e-fbeb-4c25-a0a5-13c7bceed367")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDistributionFlowElement extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElement
{
	@Description("Reference to the relationship object that relates control elements.")
	@MaxLength(1)
	@Guid("7b76723e-76d9-4d81-906b-eb95f697c628")
	private Set<com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcRelFlowControlElements> hasControlElements = new HashSet<com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcRelFlowControlElements>();


	public IfcDistributionFlowElement()
	{
	}

	public IfcDistributionFlowElement(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcRelFlowControlElements> getHasControlElements() {
		return this.hasControlElements;
	}


}

