// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d3acf0b2-2c3f-4fc7-afb8-e82f32d6fa12")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextureMap extends IfcTextureCoordinate
{
	@Description("List of texture coordinate vertices that are applied to the corresponding points of the polyloop defining a face bound.")
	@Required()
	@MinLength(3)
	@Guid("03815b41-69d3-4f06-8e96-0e5ac53ab8c1")
	private List<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertex> vertices = new ArrayList<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertex>();

	@JacksonXmlProperty(isAttribute=false, localName = "MappedTo")
	@Description("The face that defines the corresponding list of points along the bounding poly loop of the face outer bound.  <blockquote class=\"note\">NOTE&nbsp; The face may have additional inner loops. The <em>IfcTextureMap</em> and its <em>Vertices</em> only correspond with the coordinates of the <em>IfcPolyloop</em> representing the outer bound.</blockquote>")
	@Required()
	@Guid("21dc192f-d35b-4f70-8f37-5c46b77243b4")
	private com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFace mappedTo;


	public IfcTextureMap()
	{
	}

	public IfcTextureMap(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture[] maps, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertex[] vertices, com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFace mappedTo)
	{
		super(maps);
		this.vertices = new ArrayList<>(Arrays.asList(vertices));
		this.mappedTo = mappedTo;
	}

	public List<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertex> getVertices() {
		return this.vertices;
	}

	public com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFace getMappedTo() {
		return this.mappedTo;
	}

	public void setMappedTo(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFace mappedTo) {
		this.mappedTo = mappedTo;
	}


}

