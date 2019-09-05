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

@Guid("8b1d947d-68b2-4aab-b866-8b1fb6d7e22a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceStyleWithTextures extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcSurfaceStyleElementSelect
{
	@Description("The textures applied to the surface. In case of more than one surface texture is included, the <em>IfcSurfaceStyleWithTexture</em> defines a multi texture.  </EMP-HTML>")
	@Required()
	@MinLength(1)
	@Guid("47570f00-dea1-42d6-bbf4-324f534be07d")
	private List<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture> textures = new ArrayList<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture>();


	public IfcSurfaceStyleWithTextures()
	{
	}

	public IfcSurfaceStyleWithTextures(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture[] textures)
	{
		this.textures = new ArrayList<>(Arrays.asList(textures));
	}

	public List<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture> getTextures() {
		return this.textures;
	}


}

