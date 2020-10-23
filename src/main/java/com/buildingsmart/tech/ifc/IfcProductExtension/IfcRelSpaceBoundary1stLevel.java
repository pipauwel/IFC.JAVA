// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("bae52a64-1034-464e-8c4d-a00aa45bafa0")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcRelSpaceBoundary2ndLevel.class, name = "IfcRelSpaceBoundary2ndLevel"))
public class IfcRelSpaceBoundary1stLevel extends IfcRelSpaceBoundary
{
	@Description("Reference to the host, or parent, space boundary within which this inner boundary is defined.")
	@DataMember(Order = 0)
	@Guid("b82c885d-c05b-4881-9c67-820a0aa13e35")
	@JacksonXmlProperty(isAttribute=false, localName = "parentBoundary")
	private IfcRelSpaceBoundary1stLevel parentBoundary;

	@Description("Reference to the inner boundaries of the space boundary. Inner boundaries are defined by the space boundaries of openings, doors and windows.")
	@InverseProperty(InverseProp = "parentBoundary", Range = "IfcRelSpaceBoundary1stLevel")
	@Guid("17fdcd0c-9332-432d-9933-30d0938105e8")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelSpaceBoundary1stLevel")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "innerBoundaries")
	private Set<IfcRelSpaceBoundary1stLevel> innerBoundaries;


	public IfcRelSpaceBoundary1stLevel()
	{
	}

	public IfcRelSpaceBoundary1stLevel(String globalId, IfcSpaceBoundarySelect relatingSpace, IfcElement relatedBuildingElement, IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary, IfcInternalOrExternalEnum internalOrExternalBoundary)
	{
		super(globalId, relatingSpace, relatedBuildingElement, physicalOrVirtualBoundary, internalOrExternalBoundary);
	}

	public IfcRelSpaceBoundary1stLevel getParentBoundary() {
		return this.parentBoundary;
	}

	public void setParentBoundary(IfcRelSpaceBoundary1stLevel parentBoundary) {
		this.parentBoundary = parentBoundary;
	}

	public Set<IfcRelSpaceBoundary1stLevel> getInnerBoundaries() {
		return this.innerBoundaries;
	}


}

