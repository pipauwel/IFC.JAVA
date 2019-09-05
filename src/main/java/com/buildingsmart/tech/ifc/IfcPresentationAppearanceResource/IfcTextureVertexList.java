// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("323bf335-cd8c-483b-bb95-0d441da83e76")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextureVertexList extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("List of texture vertices defined by S-coordinate and T-coordinate.")
	@Required()
	@MinLength(1)
	@Guid("3249e956-2ae8-4e82-97d5-bcca53a9aea5")
	private List<Double> texCoordsList = new ArrayList<Double>();


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

