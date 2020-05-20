// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bec0a45e-76ad-42eb-9bc8-d02b405ab69b")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcPlanarBox extends IfcPlanarExtent
{
	@Description("The <em>IfcAxis2Placement</em> positions a local coordinate system for the definition of the rectangle. The origin of this local coordinate system serves as the lower left corner of the rectangular box.    <blockquote class=\"note\">NOTE&nbsp; In case of a 3D placement by <em>IfcAxisPlacement3D the <em>IfcPlanarBox</em> is defined within the xy plane of the definition coordinate system.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("7ac3fdb9-4687-4617-b7e8-001ca67aca70")
	@JacksonXmlProperty(isAttribute=true, localName = "placement")
	private IfcAxis2Placement placement;


	public IfcPlanarBox()
	{
	}

	public IfcPlanarBox(IfcLengthMeasure sizeInX, IfcLengthMeasure sizeInY, IfcAxis2Placement placement)
	{
		super(sizeInX, sizeInY);
		this.placement = placement;
	}

	public IfcAxis2Placement getPlacement() {
		return this.placement;
	}

	public void setPlacement(IfcAxis2Placement placement) {
		this.placement = placement;
	}


}

