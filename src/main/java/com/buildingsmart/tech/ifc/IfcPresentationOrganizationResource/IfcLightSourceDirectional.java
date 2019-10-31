// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightSource;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;

@Guid("584bad5f-0335-4de5-9c7d-f09eb0a94bf0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightSourceDirectional extends IfcLightSource
{
	@Description("Definition from ISO/CD 10303-46:1992: This direction is the direction of the light source.  Definition from VRML97 - ISO/IEC 14772-1:1997: The direction field specifies the direction vector of the illumination emanating from the light source in the local coordinate system. Light is emitted along parallel rays from an infinite distance away.")
	@Required()
	@Guid("133f2d5f-188a-4137-9e66-767e47b5ef4d")
	@JacksonXmlProperty(isAttribute=false, localName = "Orientation")
	private IfcDirection orientation;


	public IfcLightSourceDirectional()
	{
	}

	public IfcLightSourceDirectional(IfcColourRgb lightColour, IfcDirection orientation)
	{
		super(lightColour);
		this.orientation = orientation;
	}

	public IfcDirection getOrientation() {
		return this.orientation;
	}

	public void setOrientation(IfcDirection orientation) {
		this.orientation = orientation;
	}


}

