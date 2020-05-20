// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcForceMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("73b41ca6-4101-4683-b783-ffbc11578bb0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFailureConnectionCondition extends IfcStructuralConnectionCondition
{
	@Description("Tension force in x-direction leading to failure of the connection.")
	@DataMember(Order = 0)
	@Guid("0c62e9c6-5c74-4b47-af54-ec184492ba5b")
	@JacksonXmlProperty(isAttribute=false, localName = "tensionFailureX")
	private IfcForceMeasure tensionFailureX;

	@Description("Tension force in y-direction leading to failure of the connection.")
	@DataMember(Order = 1)
	@Guid("689b2dbf-a5c3-4364-830f-4afd0705c123")
	@JacksonXmlProperty(isAttribute=false, localName = "tensionFailureY")
	private IfcForceMeasure tensionFailureY;

	@Description("Tension force in z-direction leading to failure of the connection.")
	@DataMember(Order = 2)
	@Guid("b66746ad-84a3-4219-a583-3c1a1937a874")
	@JacksonXmlProperty(isAttribute=false, localName = "tensionFailureZ")
	private IfcForceMeasure tensionFailureZ;

	@Description("Compression force in x-direction leading to failure of the connection.")
	@DataMember(Order = 3)
	@Guid("86c3366b-ee13-4be2-b32f-d04d403095ce")
	@JacksonXmlProperty(isAttribute=false, localName = "compressionFailureX")
	private IfcForceMeasure compressionFailureX;

	@Description("Compression force in y-direction leading to failure of the connection.")
	@DataMember(Order = 4)
	@Guid("d7954350-4d00-492c-8817-e69166cc68ca")
	@JacksonXmlProperty(isAttribute=false, localName = "compressionFailureY")
	private IfcForceMeasure compressionFailureY;

	@Description("Compression force in z-direction leading to failure of the connection.")
	@DataMember(Order = 5)
	@Guid("a5b3658b-d26d-437e-a745-20162d82c1d2")
	@JacksonXmlProperty(isAttribute=false, localName = "compressionFailureZ")
	private IfcForceMeasure compressionFailureZ;


	public IfcFailureConnectionCondition()
	{
	}

	public IfcForceMeasure getTensionFailureX() {
		return this.tensionFailureX;
	}

	public void setTensionFailureX(IfcForceMeasure tensionFailureX) {
		this.tensionFailureX = tensionFailureX;
	}

	public IfcForceMeasure getTensionFailureY() {
		return this.tensionFailureY;
	}

	public void setTensionFailureY(IfcForceMeasure tensionFailureY) {
		this.tensionFailureY = tensionFailureY;
	}

	public IfcForceMeasure getTensionFailureZ() {
		return this.tensionFailureZ;
	}

	public void setTensionFailureZ(IfcForceMeasure tensionFailureZ) {
		this.tensionFailureZ = tensionFailureZ;
	}

	public IfcForceMeasure getCompressionFailureX() {
		return this.compressionFailureX;
	}

	public void setCompressionFailureX(IfcForceMeasure compressionFailureX) {
		this.compressionFailureX = compressionFailureX;
	}

	public IfcForceMeasure getCompressionFailureY() {
		return this.compressionFailureY;
	}

	public void setCompressionFailureY(IfcForceMeasure compressionFailureY) {
		this.compressionFailureY = compressionFailureY;
	}

	public IfcForceMeasure getCompressionFailureZ() {
		return this.compressionFailureZ;
	}

	public void setCompressionFailureZ(IfcForceMeasure compressionFailureZ) {
		this.compressionFailureZ = compressionFailureZ;
	}


}

