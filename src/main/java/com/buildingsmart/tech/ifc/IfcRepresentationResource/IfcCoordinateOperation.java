// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("5abaa3e9-3b43-4c49-9e66-afe0a3c094d5")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcCoordinateOperation
{
	@JsonIgnore
	@Description("Source coordinate reference system for the operation.")
	@Required()
	@Guid("3d781952-2086-40fd-a92a-802f85bb3c80")
	private com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystemSelect sourceCRS;

	@JacksonXmlProperty(isAttribute=false, localName = "TargetCRS")
	@Description("Target coordinate reference system for the operation.")
	@Required()
	@Guid("50e043e6-b530-4813-8caa-bc048a759690")
	private com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystem targetCRS;


	public IfcCoordinateOperation()
	{
	}

	public IfcCoordinateOperation(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystemSelect sourceCRS, com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystem targetCRS)
	{
		this.sourceCRS = sourceCRS;
		this.targetCRS = targetCRS;
	}

	public com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystemSelect getSourceCRS() {
		return this.sourceCRS;
	}

	public void setSourceCRS(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystemSelect sourceCRS) {
		this.sourceCRS = sourceCRS;
	}

	public com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystem getTargetCRS() {
		return this.targetCRS;
	}

	public void setTargetCRS(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystem targetCRS) {
		this.targetCRS = targetCRS;
	}


}

