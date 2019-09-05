// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("db4f6cc6-cf8a-4dbe-9456-f8235923f349")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPolygonalFaceSet extends IfcTessellatedFaceSet
{
	@JacksonXmlProperty(isAttribute=true, localName = "Closed")
	@Description("Indication whether the <em>IfcPolygonalFaceSet</em> is a closed shell or not. If omited no such information can be provided.")
	@Guid("6f54d305-9e4f-48f6-802b-83d293cd932e")
	private Boolean closed;

	@Description("The list of polygonal faces, with or without inner loops, that bound the faceted face set.")
	@Required()
	@MinLength(1)
	@Guid("ce73f034-79d3-4e8d-a2df-68e051c2606b")
	private List<com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcIndexedPolygonalFace> faces = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcIndexedPolygonalFace>();

	@JacksonXmlProperty(isAttribute=true, localName = "PnIndex")
	@Description("The list of integers defining the locations in the <em>IfcCartesianPointList3D</em> to obtain the point coordinates for the indices at the indexed polygonal faces. If the <em>PnIndex</em> is not provided the indices at the indexed polygonal faces point directly into the  <em>IfcCartesianPointList3D</em>.")
	@MinLength(1)
	@Guid("d28d398b-ccae-43b7-8470-6d19dcbaf135")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger> pnIndex = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger>();


	public IfcPolygonalFaceSet()
	{
	}

	public IfcPolygonalFaceSet(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCartesianPointList3D coordinates, com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcIndexedPolygonalFace[] faces)
	{
		super(coordinates);
		this.faces = new ArrayList<>(Arrays.asList(faces));
	}

	public Boolean getClosed() {
		return this.closed;
	}

	public void setClosed(Boolean closed) {
		this.closed = closed;
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcIndexedPolygonalFace> getFaces() {
		return this.faces;
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger> getPnIndex() {
		return this.pnIndex;
	}


}

