// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.ifc.IfcKernel.IfcProduct;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("34d6582a-8218-4a4c-9073-fdbe06d6d40a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAnnotation extends IfcProduct
{
	@Description("Relationship to a spatial structure element, to which the associate is primarily associated.")
	@InverseProperty(InverseProp = "relatedElements", Range = "IfcRelContainedInSpatialStructure")
	@Guid("ee617cc7-7598-48b6-bbbf-fc39ddd793b1")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelContainedInSpatialStructure")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "containedInStructure")
	private Set<IfcRelContainedInSpatialStructure> containedInStructure;


	public IfcAnnotation()
	{
	}

	public IfcAnnotation(String globalId)
	{
		super(globalId);
	}

	public Set<IfcRelContainedInSpatialStructure> getContainedInStructure() {
		return this.containedInStructure;
	}


}

