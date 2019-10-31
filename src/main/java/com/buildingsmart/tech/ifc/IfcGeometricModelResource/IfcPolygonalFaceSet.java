// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCartesianPointList3D;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcIndexedPolygonalFace;

@Guid("db4f6cc6-cf8a-4dbe-9456-f8235923f349")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPolygonalFaceSet extends IfcTessellatedFaceSet
{
	@Description("Indication whether the <em>IfcPolygonalFaceSet</em> is a closed shell or not. If omited no such information can be provided.")
	@Guid("6f54d305-9e4f-48f6-802b-83d293cd932e")
	@JacksonXmlProperty(isAttribute=true, localName = "Closed")
	private Boolean closed;

	@Description("The list of polygonal faces, with or without inner loops, that bound the faceted face set.")
	@Required()
	@Guid("ce73f034-79d3-4e8d-a2df-68e051c2606b")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcIndexedPolygonalFace")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Faces")
	private List<IfcIndexedPolygonalFace> faces;

	@Description("The list of integers defining the locations in the <em>IfcCartesianPointList3D</em> to obtain the point coordinates for the indices at the indexed polygonal faces. If the <em>PnIndex</em> is not provided the indices at the indexed polygonal faces point directly into the  <em>IfcCartesianPointList3D</em>.")
	@Guid("d28d398b-ccae-43b7-8470-6d19dcbaf135")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPositiveInteger")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "PnIndex")
	private List<IfcPositiveInteger> pnIndex;


	public IfcPolygonalFaceSet()
	{
	}

	public IfcPolygonalFaceSet(IfcCartesianPointList3D coordinates, IfcIndexedPolygonalFace[] faces)
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

	public List<IfcIndexedPolygonalFace> getFaces() {
		return this.faces;
	}

	public List<IfcPositiveInteger> getPnIndex() {
		return this.pnIndex;
	}


}

