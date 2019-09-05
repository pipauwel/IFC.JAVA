// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("8bc99d1e-30dc-4cc0-8017-4b73c4160a91")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcFlowTerminalType extends IfcDistributionFlowElementType
{

	public IfcFlowTerminalType()
	{
	}

	public IfcFlowTerminalType(String globalId)
	{
		super(globalId);
	}


}

