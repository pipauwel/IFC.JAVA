// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("30261543-34bc-4fcc-bd68-c6643fc090c9")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcFaceSurface.class, name = "IfcFaceSurface"))
public class IfcFace extends IfcTopologicalRepresentationItem
{
	@Description("Boundaries of the face.")
	@DataMember(Order = 0)
	@Required()
	@Guid("35969d0d-9b89-4823-9320-b7dc72f3ab94")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcFaceBound")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "bounds")
	private Set<IfcFaceBound> bounds;

	@InverseProperty(InverseProp = "mappedTo", Range = "IfcTextureMap")
	@Guid("f4c1aa64-ef3e-4267-a0e3-47c4bfc89b38")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcTextureMap")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasTextureMaps")
	private Set<IfcTextureMap> hasTextureMaps;


	public IfcFace()
	{
	}

	public IfcFace(IfcFaceBound[] bounds)
	{
		this.bounds = new HashSet<>(Arrays.asList(bounds));
	}

	public Set<IfcFaceBound> getBounds() {
		return this.bounds;
	}

	public Set<IfcTextureMap> getHasTextureMaps() {
		return this.hasTextureMaps;
	}


}

