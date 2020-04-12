// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("c2cc1d04-121f-49bb-9e9e-2578ff7811ef")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTopologyRepresentation extends IfcShapeModel
{

	public IfcTopologyRepresentation()
	{
	}

	public IfcTopologyRepresentation(IfcRepresentationContext contextOfItems, IfcRepresentationItem[] items)
	{
		super(contextOfItems, items);
	}


}

