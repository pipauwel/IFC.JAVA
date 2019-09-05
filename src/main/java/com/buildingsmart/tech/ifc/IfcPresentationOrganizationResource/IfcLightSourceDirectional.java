// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("584bad5f-0335-4de5-9c7d-f09eb0a94bf0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightSourceDirectional extends IfcLightSource
{
	@JacksonXmlProperty(isAttribute=false, localName = "Orientation")
	@Description("Definition from ISO/CD 10303-46:1992: This direction is the direction of the light source.  Definition from VRML97 - ISO/IEC 14772-1:1997: The direction field specifies the direction vector of the illumination emanating from the light source in the local coordinate system. Light is emitted along parallel rays from an infinite distance away.")
	@Required()
	@Guid("133f2d5f-188a-4137-9e66-767e47b5ef4d")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection orientation;


	public IfcLightSourceDirectional()
	{
	}

	public IfcLightSourceDirectional(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb lightColour, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection orientation)
	{
		super(lightColour);
		this.orientation = orientation;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection getOrientation() {
		return this.orientation;
	}

	public void setOrientation(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection orientation) {
		this.orientation = orientation;
	}


}

