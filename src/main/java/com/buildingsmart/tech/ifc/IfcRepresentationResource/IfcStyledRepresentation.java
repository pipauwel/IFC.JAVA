// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("a1be0696-4986-4097-aad4-dc9d385d95b5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStyledRepresentation extends IfcStyleModel
{

	public IfcStyledRepresentation()
	{
	}

	public IfcStyledRepresentation(IfcRepresentationContext contextOfItems, IfcRepresentationItem[] items)
	{
		super(contextOfItems, items);
	}


}

