// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcURIReference;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e7a73b70-71af-407a-a632-68e2de126223")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcImageTexture extends IfcSurfaceTexture
{
	@Description("Location, provided as an URI, at which the image texture is electronically published.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8565f1be-e86c-49ea-a2c3-cd8b465b2871")
	@JacksonXmlProperty(isAttribute=false, localName = "URLReference")
	private IfcURIReference URLReference;


	public IfcImageTexture()
	{
	}

	public IfcImageTexture(IfcBoolean repeatS, IfcBoolean repeatT, IfcURIReference URLReference)
	{
		super(repeatS, repeatT);
		this.URLReference = URLReference;
	}

	public IfcURIReference getURLReference() {
		return this.URLReference;
	}

	public void setURLReference(IfcURIReference URLReference) {
		this.URLReference = URLReference;
	}


}

