// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("bba24c30-4562-4049-b08d-4c3ed6146531")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcFlowSegmentType extends IfcDistributionFlowElementType
{

	public IfcFlowSegmentType()
	{
	}

	public IfcFlowSegmentType(String globalId)
	{
		super(globalId);
	}


}

