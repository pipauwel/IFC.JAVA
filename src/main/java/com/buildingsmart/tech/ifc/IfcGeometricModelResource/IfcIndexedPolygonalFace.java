// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Guid("d254b777-e1d5-480f-a356-6496977d5a4a")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcIndexedPolygonalFaceWithVoids.class, name = "IfcIndexedPolygonalFaceWithVoids"))
public class IfcIndexedPolygonalFace extends IfcTessellatedItem
{
	@Description("One-dimensional list with the indices for the three or more points, that define the vertices of the outer loop. If the tessellated face set is closed, indicated by <em>SELF\\IfcTessellatedFaceSet.Closed</em>, then the points, defining the outer loop, shall connect counter clockwise, as seen from the outside of the body, so that the resulting normal will point outwards.  <blockquote class=\"note\">NOTE&nbsp; The coordinates of the vertices are provided by the indexed list of <em>SELF\\IfcTessellatedFaceSet.Coordinates.CoordList</em>. If the  <em>SELF\\IfcTessellatedFaceSet.PnIndex</em> is provided, the indices point into it, otherwise directly into the <em>IfcCartesianPointList3D</em>.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("e98eb6ec-1d91-49a2-848d-43f835c2b769")
	@MinLength(3)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPositiveInteger")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "coordIndex")
	private List<IfcPositiveInteger> coordIndex;

	@Description("Reference to the <em>IfcPolygonalFaceSet</em> for which this face is associated.")
	@InverseProperty(InverseProp = "faces", Range = "IfcPolygonalFaceSet")
	@Guid("539ffe91-454c-4cc6-a6ee-03a20eaf9166")
	@MinLength(1)
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcPolygonalFaceSet")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "toFaceSet")*/
	@JsonIgnore
	private Set<IfcPolygonalFaceSet> toFaceSet;


	public IfcIndexedPolygonalFace()
	{
	}

	public IfcIndexedPolygonalFace(IfcPositiveInteger[] coordIndex)
	{
		this.coordIndex = new ArrayList<>(Arrays.asList(coordIndex));
	}

	public List<IfcPositiveInteger> getCoordIndex() {
		return this.coordIndex;
	}

	public Set<IfcPolygonalFaceSet> getToFaceSet() {
		return this.toFaceSet;
	}


}

