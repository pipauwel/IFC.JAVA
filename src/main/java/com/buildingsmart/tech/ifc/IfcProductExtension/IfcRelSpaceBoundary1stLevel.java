// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bae52a64-1034-464e-8c4d-a00aa45bafa0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelSpaceBoundary1stLevel extends IfcRelSpaceBoundary
{
	@JacksonXmlProperty(isAttribute=false, localName = "ParentBoundary")
	@Description("Reference to the host, or parent, space boundary within which this inner boundary is defined.")
	@Guid("b82c885d-c05b-4881-9c67-820a0aa13e35")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary1stLevel parentBoundary;

	@Description("Reference to the inner boundaries of the space boundary. Inner boundaries are defined by the space boundaries of openings, doors and windows.")
	@Guid("17fdcd0c-9332-432d-9933-30d0938105e8")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary1stLevel> innerBoundaries = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary1stLevel>();


	public IfcRelSpaceBoundary1stLevel()
	{
	}

	public IfcRelSpaceBoundary1stLevel(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpaceBoundarySelect relatingSpace, com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatedBuildingElement, com.buildingsmart.tech.ifc.IfcProductExtension.IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary, com.buildingsmart.tech.ifc.IfcProductExtension.IfcInternalOrExternalEnum internalOrExternalBoundary)
	{
		super(globalId, relatingSpace, relatedBuildingElement, physicalOrVirtualBoundary, internalOrExternalBoundary);
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary1stLevel getParentBoundary() {
		return this.parentBoundary;
	}

	public void setParentBoundary(com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary1stLevel parentBoundary) {
		this.parentBoundary = parentBoundary;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary1stLevel> getInnerBoundaries() {
		return this.innerBoundaries;
	}


}

