// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
	@JacksonXmlProperty(isAttribute=false, localName = "faceSurface")
	private IfcSurface faceSurface;

	@Description("This flag indicates whether the sense of the surface normal agrees with (TRUE), or opposes (FALSE), the sense of the topological normal to the face.")
	@DataMember(Order = 1)
	@Required()
	@Guid("330e740a-dd30-4ff0-ad4a-713fed936b0b")
	@JacksonXmlProperty(isAttribute=false, localName = "sameSense")
	private IfcBoolean sameSense;


	public IfcFaceSurface()
	{
	}

	public IfcFaceSurface(IfcFaceBound[] bounds, IfcSurface faceSurface, IfcBoolean sameSense)
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

	public IfcBoolean getSameSense() {
		return this.sameSense;
	}

	public void setSameSense(IfcBoolean sameSense) {
		this.sameSense = sameSense;
	}


}

