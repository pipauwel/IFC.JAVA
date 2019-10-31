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
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture;

@Guid("e7a73b70-71af-407a-a632-68e2de126223")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcImageTexture extends IfcSurfaceTexture
{
	@Description("Location, provided as an URI, at which the image texture is electronically published.")
	@Required()
	@Guid("8565f1be-e86c-49ea-a2c3-cd8b465b2871")
	@JacksonXmlProperty(isAttribute=true, localName = "URLReference")
	private String uRLReference;


	public IfcImageTexture()
	{
	}

	public IfcImageTexture(Boolean repeatS, Boolean repeatT, String uRLReference)
	{
		super(repeatS, repeatT);
		this.uRLReference = uRLReference;
	}

	public String getURLReference() {
		return this.uRLReference;
	}

	public void setURLReference(String uRLReference) {
		this.uRLReference = uRLReference;
	}


}

