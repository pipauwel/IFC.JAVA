// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("002bda71-0a52-40b9-8ef9-82bc20f96bf3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelSpaceBoundary2ndLevel extends IfcRelSpaceBoundary1stLevel
{
	@Description("Reference to the other space boundary of the pair of two space boundaries on either side of a space separating thermal boundary element.")
	@DataMember(Order = 0)
	@Guid("6c032ee3-47a6-40de-b826-06a8da0c46b3")
	@JacksonXmlProperty(isAttribute=false, localName = "correspondingBoundary")
	private IfcRelSpaceBoundary2ndLevel correspondingBoundary;

	@Description("Reference to the other space boundary of the pair of two space boundaries on either side of a space separating thermal boundary element.")
	@InverseProperty(InverseProp = "correspondingBoundary", Range = "IfcRelSpaceBoundary2ndLevel")
	@Guid("fa4aeb16-4d01-4f05-9f53-8d4ee0d707c5")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelSpaceBoundary2ndLevel")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "corresponds")
	private Set<IfcRelSpaceBoundary2ndLevel> corresponds;


	public IfcRelSpaceBoundary2ndLevel()
	{
	}

	public IfcRelSpaceBoundary2ndLevel(String globalId, IfcSpaceBoundarySelect relatingSpace, IfcElement relatedBuildingElement, IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary, IfcInternalOrExternalEnum internalOrExternalBoundary)
	{
		super(globalId, relatingSpace, relatedBuildingElement, physicalOrVirtualBoundary, internalOrExternalBoundary);
	}

	public IfcRelSpaceBoundary2ndLevel getCorrespondingBoundary() {
		return this.correspondingBoundary;
	}

	public void setCorrespondingBoundary(IfcRelSpaceBoundary2ndLevel correspondingBoundary) {
		this.correspondingBoundary = correspondingBoundary;
	}

	public Set<IfcRelSpaceBoundary2ndLevel> getCorresponds() {
		return this.corresponds;
	}


}

