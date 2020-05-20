// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ac1ef8ed-e75b-403b-a651-72cd4dec16ce")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcIndexedTriangleTextureMap.class, name = "IfcIndexedTriangleTextureMap"))
public abstract class IfcIndexedTextureMap extends IfcTextureCoordinate
{
	@Description("Reference to the <em>IfcTessellatedFaceSet</em> to which it applies the texture map.")
	@DataMember(Order = 0)
	@Required()
	@Guid("5678ee84-15aa-4bdd-823c-4a04f4455400")
	@JsonIgnore
	private IfcTessellatedFaceSet mappedTo;

	@Description("Indexable list of texture vertices.")
	@DataMember(Order = 1)
	@Required()
	@Guid("e3ac75e4-db50-4833-aad4-1310cc86ea8c")
	@JacksonXmlProperty(isAttribute=false, localName = "texCoords")
	private IfcTextureVertexList texCoords;


	public IfcIndexedTextureMap()
	{
	}

	public IfcIndexedTextureMap(IfcSurfaceTexture[] maps, IfcTessellatedFaceSet mappedTo, IfcTextureVertexList texCoords)
	{
		super(maps);
		this.mappedTo = mappedTo;
		this.texCoords = texCoords;
	}

	public IfcTessellatedFaceSet getMappedTo() {
		return this.mappedTo;
	}

	public void setMappedTo(IfcTessellatedFaceSet mappedTo) {
		this.mappedTo = mappedTo;
	}

	public IfcTextureVertexList getTexCoords() {
		return this.texCoords;
	}

	public void setTexCoords(IfcTextureVertexList texCoords) {
		this.texCoords = texCoords;
	}


}

