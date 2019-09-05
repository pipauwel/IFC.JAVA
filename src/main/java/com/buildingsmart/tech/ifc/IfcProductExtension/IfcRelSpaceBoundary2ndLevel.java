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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("002bda71-0a52-40b9-8ef9-82bc20f96bf3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelSpaceBoundary2ndLevel extends IfcRelSpaceBoundary1stLevel
{
	@JacksonXmlProperty(isAttribute=false, localName = "CorrespondingBoundary")
	@Description("Reference to the other space boundary of the pair of two space boundaries on either side of a space separating thermal boundary element.")
	@Guid("6c032ee3-47a6-40de-b826-06a8da0c46b3")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary2ndLevel correspondingBoundary;

	@Description("Reference to the other space boundary of the pair of two space boundaries on either side of a space separating thermal boundary element.")
	@MaxLength(1)
	@Guid("fa4aeb16-4d01-4f05-9f53-8d4ee0d707c5")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary2ndLevel> corresponds = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary2ndLevel>();


	public IfcRelSpaceBoundary2ndLevel()
	{
	}

	public IfcRelSpaceBoundary2ndLevel(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpaceBoundarySelect relatingSpace, com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatedBuildingElement, com.buildingsmart.tech.ifc.IfcProductExtension.IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary, com.buildingsmart.tech.ifc.IfcProductExtension.IfcInternalOrExternalEnum internalOrExternalBoundary)
	{
		super(globalId, relatingSpace, relatedBuildingElement, physicalOrVirtualBoundary, internalOrExternalBoundary);
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary2ndLevel getCorrespondingBoundary() {
		return this.correspondingBoundary;
	}

	public void setCorrespondingBoundary(com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary2ndLevel correspondingBoundary) {
		this.correspondingBoundary = correspondingBoundary;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary2ndLevel> getCorresponds() {
		return this.corresponds;
	}


}

