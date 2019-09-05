// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("30261543-34bc-4fcc-bd68-c6643fc090c9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFace extends IfcTopologicalRepresentationItem
{
	@Description("Boundaries of the face.")
	@Required()
	@MinLength(1)
	@Guid("35969d0d-9b89-4823-9320-b7dc72f3ab94")
	private Set<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFaceBound> bounds = new HashSet<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFaceBound>();

	@Guid("f4c1aa64-ef3e-4267-a0e3-47c4bfc89b38")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureMap> hasTextureMaps = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureMap>();


	public IfcFace()
	{
	}

	public IfcFace(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFaceBound[] bounds)
	{
		this.bounds = new HashSet<>(Arrays.asList(bounds));
	}

	public Set<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFaceBound> getBounds() {
		return this.bounds;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureMap> getHasTextureMaps() {
		return this.hasTextureMaps;
	}


}

