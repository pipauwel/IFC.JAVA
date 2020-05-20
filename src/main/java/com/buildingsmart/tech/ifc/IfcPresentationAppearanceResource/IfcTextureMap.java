// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFace;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("d3acf0b2-2c3f-4fc7-afb8-e82f32d6fa12")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextureMap extends IfcTextureCoordinate
{
	@Description("List of texture coordinate vertices that are applied to the corresponding points of the polyloop defining a face bound.")
	@DataMember(Order = 0)
	@Required()
	@Guid("03815b41-69d3-4f06-8e96-0e5ac53ab8c1")
	@MinLength(3)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcTextureVertex")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "vertices")
	private List<IfcTextureVertex> vertices;

	@Description("The face that defines the corresponding list of points along the bounding poly loop of the face outer bound.  <blockquote class=\"note\">NOTE&nbsp; The face may have additional inner loops. The <em>IfcTextureMap</em> and its <em>Vertices</em> only correspond with the coordinates of the <em>IfcPolyloop</em> representing the outer bound.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("21dc192f-d35b-4f70-8f37-5c46b77243b4")
	@JacksonXmlProperty(isAttribute=false, localName = "mappedTo")
	private IfcFace mappedTo;


	public IfcTextureMap()
	{
	}

	public IfcTextureMap(IfcSurfaceTexture[] maps, IfcTextureVertex[] vertices, IfcFace mappedTo)
	{
		super(maps);
		this.vertices = new ArrayList<>(Arrays.asList(vertices));
		this.mappedTo = mappedTo;
	}

	public List<IfcTextureVertex> getVertices() {
		return this.vertices;
	}

	public IfcFace getMappedTo() {
		return this.mappedTo;
	}

	public void setMappedTo(IfcFace mappedTo) {
		this.mappedTo = mappedTo;
	}


}

