// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f2e1a6b7-3d7a-4c60-a04a-924b62253b52")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGridPlacement extends IfcObjectPlacement
{
	@Description("Placement of the object coordinate system defined by the intersection of two grid axes.")
	@DataMember(Order = 0)
	@Required()
	@Guid("254677ef-164b-42be-9245-68fdbc6f3d44")
	@JacksonXmlProperty(isAttribute=false, localName = "placementLocation")
	private IfcVirtualGridIntersection placementLocation;

	@Description("Reference to either an explicit direction, or a second grid axis intersection, which defines the orientation of the grid placement.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The select of an explict direction has been added.</blockquote>")
	@DataMember(Order = 1)
	@Guid("101b6fcb-9df5-4945-8dfe-9cc885457815")
	@JacksonXmlProperty(isAttribute=true, localName = "placementRefDirection")
	private IfcGridPlacementDirectionSelect placementRefDirection;


	public IfcGridPlacement()
	{
	}

	public IfcGridPlacement(IfcVirtualGridIntersection placementLocation)
	{
		this.placementLocation = placementLocation;
	}

	public IfcVirtualGridIntersection getPlacementLocation() {
		return this.placementLocation;
	}

	public void setPlacementLocation(IfcVirtualGridIntersection placementLocation) {
		this.placementLocation = placementLocation;
	}

	public IfcGridPlacementDirectionSelect getPlacementRefDirection() {
		return this.placementRefDirection;
	}

	public void setPlacementRefDirection(IfcGridPlacementDirectionSelect placementRefDirection) {
		this.placementRefDirection = placementRefDirection;
	}


}

