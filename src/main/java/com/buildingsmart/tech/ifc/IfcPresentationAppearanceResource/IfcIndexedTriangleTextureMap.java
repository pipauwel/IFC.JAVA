// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("2749b740-94fa-4cfa-ba95-c6f30ee8024d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIndexedTriangleTextureMap extends IfcIndexedTextureMap
{
	@Description("Index into the <em>IfcTextureVertexList</em> for each vertex of the triangles representing the <em>IfcTriangulatedFaceSet</em>.")
	@MinLength(1)
	@Guid("d5e9ea70-6d42-4103-afbe-45a940d87c3d")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger> texCoordIndex = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger>();


	public IfcIndexedTriangleTextureMap()
	{
	}

	public IfcIndexedTriangleTextureMap(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture[] maps, com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet mappedTo, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertexList texCoords)
	{
		super(maps, mappedTo, texCoords);
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger> getTexCoordIndex() {
		return this.texCoordIndex;
	}


}

