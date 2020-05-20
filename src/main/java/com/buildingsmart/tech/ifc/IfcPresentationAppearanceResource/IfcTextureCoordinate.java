// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("bcd71dc5-c1c1-46c9-8dcf-2d9155a3edff")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcIndexedTextureMap.class, name = "IfcIndexedTextureMap"), @JsonSubTypes.Type(value = IfcTextureCoordinateGenerator.class, name = "IfcTextureCoordinateGenerator"), @JsonSubTypes.Type(value = IfcTextureMap.class, name = "IfcTextureMap")})
public abstract class IfcTextureCoordinate extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("Reference to the one (or many in case of multi textures with identity transformation to geometric surfaces) subtype(s) of <em>IfcSurfaceTexture</em> that are mapped to a geometric surface by the texture coordinate transformation.")
	@DataMember(Order = 0)
	@Required()
	@Guid("044e83c7-c1b4-499a-a541-3ff790ce34fb")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcSurfaceTexture")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "maps")
	private List<IfcSurfaceTexture> maps;


	public IfcTextureCoordinate()
	{
	}

	public IfcTextureCoordinate(IfcSurfaceTexture[] maps)
	{
		this.maps = new ArrayList<>(Arrays.asList(maps));
	}

	public List<IfcSurfaceTexture> getMaps() {
		return this.maps;
	}


}

