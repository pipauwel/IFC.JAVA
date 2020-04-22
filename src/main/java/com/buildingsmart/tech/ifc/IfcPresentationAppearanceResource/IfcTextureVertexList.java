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
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem;

@Guid("323bf335-cd8c-483b-bb95-0d441da83e76")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextureVertexList extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("List of texture vertices defined by S-coordinate and T-coordinate.")
	@DataMember(Order = 0)
	@Required()
	@Guid("3249e956-2ae8-4e82-97d5-bcca53a9aea5")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "TexCoordsList")
	private List<Double> texCoordsList;


	public IfcTextureVertexList()
	{
	}

	public IfcTextureVertexList(Double[] texCoordsList)
	{
		this.texCoordsList = new ArrayList<>(Arrays.asList(texCoordsList));
	}

	public List<Double> getTexCoordsList() {
		return this.texCoordsList;
	}


}

