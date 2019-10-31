// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcObjectPlacement;
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcVirtualGridIntersection;

@Guid("f2e1a6b7-3d7a-4c60-a04a-924b62253b52")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGridPlacement extends IfcObjectPlacement
{
	@Description("Placement of the object coordinate system defined by the intersection of two grid axes.")
	@Required()
	@Guid("254677ef-164b-42be-9245-68fdbc6f3d44")
	@JacksonXmlProperty(isAttribute=false, localName = "PlacementLocation")
	private IfcVirtualGridIntersection placementLocation;

	@Description("Reference to either an explicit direction, or a second grid axis intersection, which defines the orientation of the grid placement.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The select of an explict direction has been added.</blockquote>")
	@Guid("101b6fcb-9df5-4945-8dfe-9cc885457815")
	@JacksonXmlProperty(isAttribute=true, localName = "PlacementRefDirection")
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

