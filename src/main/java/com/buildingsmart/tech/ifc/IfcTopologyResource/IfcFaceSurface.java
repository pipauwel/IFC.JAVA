// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcAdvancedFace;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFace;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFaceBound;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;

@Guid("d6ead809-0b4d-450c-af17-45d526239263")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcAdvancedFace.class, name = "IfcAdvancedFace"))
public class IfcFaceSurface extends IfcFace implements com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcSurfaceOrFaceSurface
{
	@Description("The surface which defines the internal shape of the face. This surface may be unbounded. The domain of the face is defined by this surface and the bounding loops in the inherited attribute SELF\\FaceBounds.")
	@DataMember(Order = 0)
	@Required()
	@Guid("7626166a-83c4-45cd-aaeb-d26d2f7279a4")
	@JacksonXmlProperty(isAttribute=false, localName = "FaceSurface")
	private IfcSurface faceSurface;

	@Description("This flag indicates whether the sense of the surface normal agrees with (TRUE), or opposes (FALSE), the sense of the topological normal to the face.")
	@DataMember(Order = 1)
	@Required()
	@Guid("330e740a-dd30-4ff0-ad4a-713fed936b0b")
	@JacksonXmlProperty(isAttribute=true, localName = "SameSense")
	private Boolean sameSense;


	public IfcFaceSurface()
	{
	}

	public IfcFaceSurface(IfcFaceBound[] bounds, IfcSurface faceSurface, Boolean sameSense)
	{
		super(bounds);
		this.faceSurface = faceSurface;
		this.sameSense = sameSense;
	}

	public IfcSurface getFaceSurface() {
		return this.faceSurface;
	}

	public void setFaceSurface(IfcSurface faceSurface) {
		this.faceSurface = faceSurface;
	}

	public Boolean getSameSense() {
		return this.sameSense;
	}

	public void setSameSense(Boolean sameSense) {
		this.sameSense = sameSense;
	}


}

