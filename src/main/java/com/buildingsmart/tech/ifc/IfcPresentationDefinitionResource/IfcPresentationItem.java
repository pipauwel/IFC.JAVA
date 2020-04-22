// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource;

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
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgbList;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourSpecification;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFont;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontAndScaling;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontPattern;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcIndexedColourMap;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPreDefinedItem;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleLighting;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleRefraction;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleShading;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleWithTextures;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextStyleForDefinedFont;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextStyleTextModel;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureCoordinate;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertex;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertexList;

@Guid("247bfb53-ed19-4eb9-b1da-240eb5672bb3")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcColourRgbList.class, name = "IfcColourRgbList"), @JsonSubTypes.Type(value = IfcColourSpecification.class, name = "IfcColourSpecification"), @JsonSubTypes.Type(value = IfcCurveStyleFont.class, name = "IfcCurveStyleFont"), @JsonSubTypes.Type(value = IfcCurveStyleFontAndScaling.class, name = "IfcCurveStyleFontAndScaling"), @JsonSubTypes.Type(value = IfcCurveStyleFontPattern.class, name = "IfcCurveStyleFontPattern"), @JsonSubTypes.Type(value = IfcIndexedColourMap.class, name = "IfcIndexedColourMap"), @JsonSubTypes.Type(value = IfcPreDefinedItem.class, name = "IfcPreDefinedItem"), @JsonSubTypes.Type(value = IfcSurfaceStyleLighting.class, name = "IfcSurfaceStyleLighting"), @JsonSubTypes.Type(value = IfcSurfaceStyleRefraction.class, name = "IfcSurfaceStyleRefraction"), @JsonSubTypes.Type(value = IfcSurfaceStyleShading.class, name = "IfcSurfaceStyleShading"), @JsonSubTypes.Type(value = IfcSurfaceStyleWithTextures.class, name = "IfcSurfaceStyleWithTextures"), @JsonSubTypes.Type(value = IfcSurfaceTexture.class, name = "IfcSurfaceTexture"), @JsonSubTypes.Type(value = IfcTextStyleForDefinedFont.class, name = "IfcTextStyleForDefinedFont"), @JsonSubTypes.Type(value = IfcTextStyleTextModel.class, name = "IfcTextStyleTextModel"), @JsonSubTypes.Type(value = IfcTextureCoordinate.class, name = "IfcTextureCoordinate"), @JsonSubTypes.Type(value = IfcTextureVertex.class, name = "IfcTextureVertex"), @JsonSubTypes.Type(value = IfcTextureVertexList.class, name = "IfcTextureVertexList")})
public abstract class IfcPresentationItem
{

	public IfcPresentationItem()
	{
	}


}

