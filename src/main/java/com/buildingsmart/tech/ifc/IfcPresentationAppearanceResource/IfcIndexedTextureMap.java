// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ac1ef8ed-e75b-403b-a651-72cd4dec16ce")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcIndexedTextureMap extends IfcTextureCoordinate
{
	@JsonIgnore
	@Description("Reference to the <em>IfcTessellatedFaceSet</em> to which it applies the texture map.")
	@Required()
	@Guid("5678ee84-15aa-4bdd-823c-4a04f4455400")
	private com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet mappedTo;

	@JacksonXmlProperty(isAttribute=false, localName = "TexCoords")
	@Description("Indexable list of texture vertices.")
	@Required()
	@Guid("e3ac75e4-db50-4833-aad4-1310cc86ea8c")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertexList texCoords;


	public IfcIndexedTextureMap()
	{
	}

	public IfcIndexedTextureMap(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture[] maps, com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet mappedTo, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertexList texCoords)
	{
		super(maps);
		this.mappedTo = mappedTo;
		this.texCoords = texCoords;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet getMappedTo() {
		return this.mappedTo;
	}

	public void setMappedTo(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet mappedTo) {
		this.mappedTo = mappedTo;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertexList getTexCoords() {
		return this.texCoords;
	}

	public void setTexCoords(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertexList texCoords) {
		this.texCoords = texCoords;
	}


}

