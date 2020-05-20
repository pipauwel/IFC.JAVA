// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2e3f9a00-22e8-4d1e-9473-28fab150a1fa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConnectionSurfaceGeometry extends IfcConnectionGeometry
{
	@Description("Surface at which related object is aligned at the relating element, given in the LCS of the relating element.")
	@DataMember(Order = 0)
	@Required()
	@Guid("314adc40-553a-4304-9635-524cc52d9f2b")
	@JacksonXmlProperty(isAttribute=true, localName = "surfaceOnRelatingElement")
	private IfcSurfaceOrFaceSurface surfaceOnRelatingElement;

	@Description("Surface at which the relating element is aligned at the related element, given in the LCS of the related element. If the information is omitted, then the origin of the related element is used.")
	@DataMember(Order = 1)
	@Guid("799673ed-96e5-416c-9b59-e0b232546f8e")
	@JacksonXmlProperty(isAttribute=true, localName = "surfaceOnRelatedElement")
	private IfcSurfaceOrFaceSurface surfaceOnRelatedElement;


	public IfcConnectionSurfaceGeometry()
	{
	}

	public IfcConnectionSurfaceGeometry(IfcSurfaceOrFaceSurface surfaceOnRelatingElement)
	{
		this.surfaceOnRelatingElement = surfaceOnRelatingElement;
	}

	public IfcSurfaceOrFaceSurface getSurfaceOnRelatingElement() {
		return this.surfaceOnRelatingElement;
	}

	public void setSurfaceOnRelatingElement(IfcSurfaceOrFaceSurface surfaceOnRelatingElement) {
		this.surfaceOnRelatingElement = surfaceOnRelatingElement;
	}

	public IfcSurfaceOrFaceSurface getSurfaceOnRelatedElement() {
		return this.surfaceOnRelatedElement;
	}

	public void setSurfaceOnRelatedElement(IfcSurfaceOrFaceSurface surfaceOnRelatedElement) {
		this.surfaceOnRelatedElement = surfaceOnRelatedElement;
	}


}

