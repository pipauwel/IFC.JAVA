// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("5b7db4a0-6145-4e7b-b0a4-ad1956d47316")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcExternalSpatialStructureElement extends IfcSpatialElement
{

	public IfcExternalSpatialStructureElement()
	{
	}

	public IfcExternalSpatialStructureElement(String globalId)
	{
		super(globalId);
	}


}

