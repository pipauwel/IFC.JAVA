// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("fff1fb35-13c2-4e24-92f4-c2bfd5a9ba17")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextLiteral extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@JacksonXmlProperty(isAttribute=true, localName = "Literal")
	@Description("The text literal to be presented.")
	@Required()
	@Guid("55eb2d39-e680-4ba3-9d6a-8daf9dde4691")
	private String literal;

	@Description("An <em>IfcAxis2Placement</em> that determines the placement and orientation of the presented string.")
	@Required()
	@Guid("eaf62d6a-c033-4077-8aa5-7a11008ec5c5")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement placement;

	@JacksonXmlProperty(isAttribute=true, localName = "Path")
	@Description("The writing direction of the text literal.")
	@Required()
	@Guid("5d004ead-6e33-418a-b7b0-5e97200cc4b0")
	private com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcTextPath path;


	public IfcTextLiteral()
	{
	}

	public IfcTextLiteral(String literal, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement placement, com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcTextPath path)
	{
		this.literal = literal;
		this.placement = placement;
		this.path = path;
	}

	public String getLiteral() {
		return this.literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement getPlacement() {
		return this.placement;
	}

	public void setPlacement(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement placement) {
		this.placement = placement;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcTextPath getPath() {
		return this.path;
	}

	public void setPath(com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcTextPath path) {
		this.path = path;
	}


}

