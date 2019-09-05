// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("5267cce3-e20a-4af6-8fb5-5a1ac1bc92ed")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcElementComponent extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement
{

	public IfcElementComponent()
	{
	}

	public IfcElementComponent(String globalId)
	{
		super(globalId);
	}


}

