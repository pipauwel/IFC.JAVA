// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPlanarForceMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2b69ecd6-ac6b-4bbe-b84f-4f4ec62e97ad")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadPlanarForce extends IfcStructuralLoadStatic
{
	@Description("Planar force value in x-direction.")
	@DataMember(Order = 0)
	@Guid("6eb58171-0dcb-41c6-8d57-65ba25daf21f")
	@JacksonXmlProperty(isAttribute=false, localName = "planarForceX")
	private IfcPlanarForceMeasure planarForceX;

	@Description("Planar force value in y-direction.")
	@DataMember(Order = 1)
	@Guid("b44e2300-fb5e-48e9-be76-dbfc689e30cd")
	@JacksonXmlProperty(isAttribute=false, localName = "planarForceY")
	private IfcPlanarForceMeasure planarForceY;

	@Description("Planar force value in z-direction.")
	@DataMember(Order = 2)
	@Guid("9247264a-9686-4133-bd06-98fb14f99e97")
	@JacksonXmlProperty(isAttribute=false, localName = "planarForceZ")
	private IfcPlanarForceMeasure planarForceZ;


	public IfcStructuralLoadPlanarForce()
	{
	}

	public IfcPlanarForceMeasure getPlanarForceX() {
		return this.planarForceX;
	}

	public void setPlanarForceX(IfcPlanarForceMeasure planarForceX) {
		this.planarForceX = planarForceX;
	}

	public IfcPlanarForceMeasure getPlanarForceY() {
		return this.planarForceY;
	}

	public void setPlanarForceY(IfcPlanarForceMeasure planarForceY) {
		this.planarForceY = planarForceY;
	}

	public IfcPlanarForceMeasure getPlanarForceZ() {
		return this.planarForceZ;
	}

	public void setPlanarForceZ(IfcPlanarForceMeasure planarForceZ) {
		this.planarForceZ = planarForceZ;
	}


}

