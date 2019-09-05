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

@Guid("bcd71dc5-c1c1-46c9-8dcf-2d9155a3edff")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcTextureCoordinate extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("Reference to the one (or many in case of multi textures with identity transformation to geometric surfaces) subtype(s) of <em>IfcSurfaceTexture</em> that are mapped to a geometric surface by the texture coordinate transformation.")
	@Required()
	@MinLength(1)
	@Guid("044e83c7-c1b4-499a-a541-3ff790ce34fb")
	private List<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture> maps = new ArrayList<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture>();


	public IfcTextureCoordinate()
	{
	}

	public IfcTextureCoordinate(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture[] maps)
	{
		this.maps = new ArrayList<>(Arrays.asList(maps));
	}

	public List<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture> getMaps() {
		return this.maps;
	}


}

