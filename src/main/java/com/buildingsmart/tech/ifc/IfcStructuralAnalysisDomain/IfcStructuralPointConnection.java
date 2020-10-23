// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f8d48d8e-a2e9-4035-bba5-7b4e3b7f75d9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralPointConnection extends IfcStructuralConnection
{
	@Description("Defines a coordinate system used for the description of the support condition properties in <em>SELF\\IfcStructuralConnection.SupportCondition</em>, specified relative to the global coordinate system (global to the structural analysis model) established by <em>SELF.\\IfcProduct.ObjectPlacement</em>.  If left unspecified, the placement <em>IfcAxis2Placement3D</em>((x,y,z), ?, ?) is implied with x,y,z being the coordinates of the reference point of this <em>IfcStructuralPointConnection</em> and the default axes directions being in parallel with the global axes.")
	@DataMember(Order = 0)
	@Guid("2816879e-a513-4b46-982c-30f51576ad62")
	@JacksonXmlProperty(isAttribute=false, localName = "conditionCoordinateSystem")
	private IfcAxis2Placement3D conditionCoordinateSystem;


	public IfcStructuralPointConnection()
	{
	}

	public IfcStructuralPointConnection(String globalId)
	{
		super(globalId);
	}

	public IfcAxis2Placement3D getConditionCoordinateSystem() {
		return this.conditionCoordinateSystem;
	}

	public void setConditionCoordinateSystem(IfcAxis2Placement3D conditionCoordinateSystem) {
		this.conditionCoordinateSystem = conditionCoordinateSystem;
	}


}

