// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("bec0a45e-76ad-42eb-9bc8-d02b405ab69b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPlanarBox extends IfcPlanarExtent
{
	@Description("The <em>IfcAxis2Placement</em> positions a local coordinate system for the definition of the rectangle. The origin of this local coordinate system serves as the lower left corner of the rectangular box.    <blockquote class=\"note\">NOTE&nbsp; In case of a 3D placement by <em>IfcAxisPlacement3D the <em>IfcPlanarBox</em> is defined within the xy plane of the definition coordinate system.</blockquote>")
	@Required()
	@Guid("7ac3fdb9-4687-4617-b7e8-001ca67aca70")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement placement;


	public IfcPlanarBox()
	{
	}

	public IfcPlanarBox(double sizeInX, double sizeInY, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement placement)
	{
		super(sizeInX, sizeInY);
		this.placement = placement;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement getPlacement() {
		return this.placement;
	}

	public void setPlacement(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement placement) {
		this.placement = placement;
	}


}

