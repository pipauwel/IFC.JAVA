// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("34d6582a-8218-4a4c-9073-fdbe06d6d40a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAnnotation extends com.buildingsmart.tech.ifc.IfcKernel.IfcProduct
{
	@Description("Relationship to a spatial structure element, to which the associate is primarily associated.")
	@MaxLength(1)
	@Guid("ee617cc7-7598-48b6-bbbf-fc39ddd793b1")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure> containedInStructure = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure>();


	public IfcAnnotation()
	{
	}

	public IfcAnnotation(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure> getContainedInStructure() {
		return this.containedInStructure;
	}


}

