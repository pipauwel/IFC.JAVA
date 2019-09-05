// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("97c81448-43b9-4f3b-8b09-5da72f6a499a")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcTessellatedFaceSet extends IfcTessellatedItem implements IfcBooleanOperand
{
	@JacksonXmlProperty(isAttribute=false, localName = "Coordinates")
	@Description("An ordered list of Cartesian points used by the coordinate index defined at the subtypes of <em>IfcTessellatedFaceSet</em>.")
	@Required()
	@Guid("28b00035-2a37-4bda-aa0e-7845352fa060")
	private com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCartesianPointList3D coordinates;

	@JacksonXmlProperty(isAttribute=false, localName = "HasColours")
	@Description("Reference to the indexed colour map providing the corresponding colour RGB values to the faces of the subtypes of <em>IfcTessellatedFaceSet</em>.")
	@MaxLength(1)
	@Guid("91135fdb-fb22-4f3b-8316-c13c64b911c0")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcIndexedColourMap> hasColours = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcIndexedColourMap>();

	@JacksonXmlProperty(isAttribute=false, localName = "HasTextures")
	@Description("Reference to the indexed texture map providing the corresponding texture coordinates to the vertices bounding the faces of the subtypes of <em>IfcTessellatedFaceSet</em>.")
	@Guid("bc9e2551-f6b9-4d6e-a1ea-83aa87876820")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcIndexedTextureMap> hasTextures = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcIndexedTextureMap>();


	public IfcTessellatedFaceSet()
	{
	}

	public IfcTessellatedFaceSet(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCartesianPointList3D coordinates)
	{
		this.coordinates = coordinates;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCartesianPointList3D getCoordinates() {
		return this.coordinates;
	}

	public void setCoordinates(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCartesianPointList3D coordinates) {
		this.coordinates = coordinates;
	}

	public int getDim() {
		return 0;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcIndexedColourMap> getHasColours() {
		return this.hasColours;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcIndexedTextureMap> getHasTextures() {
		return this.hasTextures;
	}


}

