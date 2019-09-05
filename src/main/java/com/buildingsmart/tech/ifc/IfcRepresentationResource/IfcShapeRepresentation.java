// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("2f5eefcc-2d23-4bbf-89e3-b10ffc7e8889")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcShapeRepresentation extends IfcShapeModel
{

	public IfcShapeRepresentation()
	{
	}

	public IfcShapeRepresentation(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext contextOfItems, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationItem[] items)
	{
		super(contextOfItems, items);
	}


}

