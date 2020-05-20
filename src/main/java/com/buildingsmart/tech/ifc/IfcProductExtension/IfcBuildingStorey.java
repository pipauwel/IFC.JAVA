// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a65d5be3-3ac6-4ee1-bdc9-c587e05beed6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBuildingStorey extends IfcSpatialStructureElement
{
	@Description("<p>Elevation of the base of this storey, relative to the 0,00 internal reference height of the building. The 0.00 level is given by the absolute above sea level height by the <i>ElevationOfRefHeight</i> attribute given at <i>IfcBuilding</i>.</p>    <blockquote class=\"note\">NOTE&nbsp; If the geometric data is provided (<i>ObjectPlacement</i> is specified), the <i>Elevation</i> value shall either not be included, or be equal to the local placement Z value.</blockquote>")
	@DataMember(Order = 0)
	@Guid("367e04fb-f522-45f0-b033-d5dc9b3f433d")
	@JacksonXmlProperty(isAttribute=false, localName = "elevation")
	private IfcLengthMeasure elevation;


	public IfcBuildingStorey()
	{
	}

	public IfcBuildingStorey(String globalId)
	{
		super(globalId);
	}

	public IfcLengthMeasure getElevation() {
		return this.elevation;
	}

	public void setElevation(IfcLengthMeasure elevation) {
		this.elevation = elevation;
	}


}

