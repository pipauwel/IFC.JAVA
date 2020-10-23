// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcHelperDomain.IfcParameterValueList;
import com.buildingsmart.tech.ifc.IfcHelperDomain.IfcPositiveIntegerList;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("f8ed7699-eae0-403b-a7a3-79679b07189f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTriangulatedFaceSet extends IfcTessellatedFaceSet
{
	@Description("An ordered list of three directions for normals. It is a two-dimensional list of directions provided by three parameter   values.  <ul>   <li class=\"small\">The first dimension corresponds to the vertex indices of the <i>Coordindex</i></li>   <li class=\"small\">The second dimension has exactly three values, [1] the x-direction, [2] the y-direction and [3] the z-directions</li>  </ul>")
	@DataMember(Order = 0)
	@Guid("bd591519-475e-4a73-bfa1-93aa2832af2a")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "parameterValues")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "normals")
	private List<IfcParameterValueList> normals;

	@Description("Indication whether the <em>IfcTriangulatedFaceSet</em> is a closed shell or not. If omited no such information can be provided.")
	@DataMember(Order = 1)
	@Guid("738880b2-be27-415d-acee-5b666ad13681")
	@JacksonXmlProperty(isAttribute=false, localName = "closed")
	private IfcBoolean closed;

	@Description("Two-dimensional list for the indexed-based triangles, where   <ul>   <li class=\"small\">The first dimension represents the triangles (from 1 to N)</li>   <li class=\"small\">The second dimension has exactly three values representing the indices to three vertex points (from 1 to 3).</li>  </ul>  <blockquote class=\"note\">NOTE&nbsp; The coordinates of the vertices are provided by the indexed list of <em>SELF\\IfcTessellatedFaceSet.Coordinates.CoordList</em>.</blockquote>")
	@DataMember(Order = 2)
	@Required()
	@Guid("9a0699f0-dcdd-4fa1-8373-7b1a46293902")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "positiveIntegers")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "coordIndex")
	private List<IfcPositiveIntegerList> coordIndex;

	@Description("The list of integers defining the locations in the <em>IfcCartesianPointList3D</em> to obtain the point coordinates for the indices withint the <i>CoordIndex</i>. If the <i>PnIndex</i> is not provided the indices point directly into the <em>IfcCartesianPointList3D</em>.")
	@DataMember(Order = 3)
	@Guid("3d3f022d-8122-46c6-9ac8-db032b84b55d")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "pnIndex")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "pnIndex")
	private List<IfcPositiveInteger> pnIndex;


	public IfcTriangulatedFaceSet()
	{
	}

	public IfcTriangulatedFaceSet(IfcCartesianPointList3D coordinates, List<IfcPositiveIntegerList> coordIndex)
	{
		super(coordinates);
		this.coordIndex = coordIndex;
	}

	public List<IfcParameterValueList> getNormals() {
		return this.normals;
	}

	public IfcBoolean getClosed() {
		return this.closed;
	}

	public void setClosed(IfcBoolean closed) {
		this.closed = closed;
	}

	public List<IfcPositiveIntegerList> getCoordIndex() {
		return this.coordIndex;
	}

	public List<IfcPositiveInteger> getPnIndex() {
		return this.pnIndex;
	}

	@JsonIgnore
	public int getNumberOfTriangles() {
		if(coordIndex != null)
			return coordIndex.size();
		return 0;
	}
}

