// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcObjectPlacement;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement;

@Guid("ca6001c7-db80-4168-bd0d-32259a34d423")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "id")
public class IfcLocalPlacement extends IfcObjectPlacement
{
	@Description("Internal ID")
	@Required()
	@JacksonXmlProperty(isAttribute=false, localName = "Id")
	private UUID id;

	@Description("Reference to Object that provides the relative placement by its local coordinate system. If it is omitted, then the local placement is given to the WCS, established by the geometric representation context.")
	@DataMember(Order = 0)
	@Guid("95a6cbc5-4fea-41ff-9339-39146977d569")
	@JacksonXmlProperty(isAttribute=false, localName = "PlacementRelTo")
	private IfcObjectPlacement placementRelTo;

	@Description("Geometric placement that defines the transformation from the related coordinate system into the relating. The placement can be either 2D or 3D, depending on the dimension count of the coordinate system.")
	@DataMember(Order = 1)
	@Required()
	@Guid("519d256d-2c79-4cf3-b785-70dbe9291d0d")
	@JacksonXmlProperty(isAttribute=true, localName = "RelativePlacement")
	private IfcAxis2Placement relativePlacement;

	public IfcLocalPlacement()
	{
		this.id = UUID.randomUUID();
	}

	public IfcLocalPlacement(IfcAxis2Placement relativePlacement)
	{
		this();
		this.relativePlacement = relativePlacement;
	}

	public UUID getId() {
		return this.id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public IfcObjectPlacement getPlacementRelTo() {
		return this.placementRelTo;
	}

	public void setPlacementRelTo(IfcObjectPlacement placementRelTo) {
		this.placementRelTo = placementRelTo;
	}

	public IfcAxis2Placement getRelativePlacement() {
		return this.relativePlacement;
	}

	public void setRelativePlacement(IfcAxis2Placement relativePlacement) {
		this.relativePlacement = relativePlacement;
	}


}

