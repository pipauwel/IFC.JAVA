// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("0ffbaf6a-8bec-4275-b1b8-f3dcb7318ee3")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcStyleModel extends IfcRepresentation
{

	public IfcStyleModel()
	{
	}

	public IfcStyleModel(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext contextOfItems, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem[] items)
	{
		super(contextOfItems, items);
	}


}

