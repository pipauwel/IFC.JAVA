// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

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
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcIndexedTriangleTextureMap;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureCoordinate;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertexList;

@Guid("ac1ef8ed-e75b-403b-a651-72cd4dec16ce")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcIndexedTriangleTextureMap.class, name = "IfcIndexedTriangleTextureMap"))
public abstract class IfcIndexedTextureMap extends IfcTextureCoordinate
{
	@Description("Reference to the <em>IfcTessellatedFaceSet</em> to which it applies the texture map.")
	@Required()
	@Guid("5678ee84-15aa-4bdd-823c-4a04f4455400")
	@JsonIgnore
	private IfcTessellatedFaceSet mappedTo;

	@Description("Indexable list of texture vertices.")
	@Required()
	@Guid("e3ac75e4-db50-4833-aad4-1310cc86ea8c")
	@JacksonXmlProperty(isAttribute=false, localName = "TexCoords")
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

