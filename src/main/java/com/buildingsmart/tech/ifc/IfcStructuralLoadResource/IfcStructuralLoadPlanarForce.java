// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2b69ecd6-ac6b-4bbe-b84f-4f4ec62e97ad")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadPlanarForce extends IfcStructuralLoadStatic
{
	@JacksonXmlProperty(isAttribute=true, localName = "PlanarForceX")
	@Description("Planar force value in x-direction.")
	@Guid("6eb58171-0dcb-41c6-8d57-65ba25daf21f")
	private double planarForceX;

	@JacksonXmlProperty(isAttribute=true, localName = "PlanarForceY")
	@Description("Planar force value in y-direction.")
	@Guid("b44e2300-fb5e-48e9-be76-dbfc689e30cd")
	private double planarForceY;

	@JacksonXmlProperty(isAttribute=true, localName = "PlanarForceZ")
	@Description("Planar force value in z-direction.")
	@Guid("9247264a-9686-4133-bd06-98fb14f99e97")
	private double planarForceZ;


	public IfcStructuralLoadPlanarForce()
	{
	}

	public double getPlanarForceX() {
		return this.planarForceX;
	}

	public void setPlanarForceX(double planarForceX) {
		this.planarForceX = planarForceX;
	}

	public double getPlanarForceY() {
		return this.planarForceY;
	}

	public void setPlanarForceY(double planarForceY) {
		this.planarForceY = planarForceY;
	}

	public double getPlanarForceZ() {
		return this.planarForceZ;
	}

	public void setPlanarForceZ(double planarForceZ) {
		this.planarForceZ = planarForceZ;
	}


}

