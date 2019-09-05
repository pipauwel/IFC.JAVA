// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("73b41ca6-4101-4683-b783-ffbc11578bb0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFailureConnectionCondition extends IfcStructuralConnectionCondition
{
	@JacksonXmlProperty(isAttribute=true, localName = "TensionFailureX")
	@Description("Tension force in x-direction leading to failure of the connection.")
	@Guid("0c62e9c6-5c74-4b47-af54-ec184492ba5b")
	private double tensionFailureX;

	@JacksonXmlProperty(isAttribute=true, localName = "TensionFailureY")
	@Description("Tension force in y-direction leading to failure of the connection.")
	@Guid("689b2dbf-a5c3-4364-830f-4afd0705c123")
	private double tensionFailureY;

	@JacksonXmlProperty(isAttribute=true, localName = "TensionFailureZ")
	@Description("Tension force in z-direction leading to failure of the connection.")
	@Guid("b66746ad-84a3-4219-a583-3c1a1937a874")
	private double tensionFailureZ;

	@JacksonXmlProperty(isAttribute=true, localName = "CompressionFailureX")
	@Description("Compression force in x-direction leading to failure of the connection.")
	@Guid("86c3366b-ee13-4be2-b32f-d04d403095ce")
	private double compressionFailureX;

	@JacksonXmlProperty(isAttribute=true, localName = "CompressionFailureY")
	@Description("Compression force in y-direction leading to failure of the connection.")
	@Guid("d7954350-4d00-492c-8817-e69166cc68ca")
	private double compressionFailureY;

	@JacksonXmlProperty(isAttribute=true, localName = "CompressionFailureZ")
	@Description("Compression force in z-direction leading to failure of the connection.")
	@Guid("a5b3658b-d26d-437e-a745-20162d82c1d2")
	private double compressionFailureZ;


	public IfcFailureConnectionCondition()
	{
	}

	public double getTensionFailureX() {
		return this.tensionFailureX;
	}

	public void setTensionFailureX(double tensionFailureX) {
		this.tensionFailureX = tensionFailureX;
	}

	public double getTensionFailureY() {
		return this.tensionFailureY;
	}

	public void setTensionFailureY(double tensionFailureY) {
		this.tensionFailureY = tensionFailureY;
	}

	public double getTensionFailureZ() {
		return this.tensionFailureZ;
	}

	public void setTensionFailureZ(double tensionFailureZ) {
		this.tensionFailureZ = tensionFailureZ;
	}

	public double getCompressionFailureX() {
		return this.compressionFailureX;
	}

	public void setCompressionFailureX(double compressionFailureX) {
		this.compressionFailureX = compressionFailureX;
	}

	public double getCompressionFailureY() {
		return this.compressionFailureY;
	}

	public void setCompressionFailureY(double compressionFailureY) {
		this.compressionFailureY = compressionFailureY;
	}

	public double getCompressionFailureZ() {
		return this.compressionFailureZ;
	}

	public void setCompressionFailureZ(double compressionFailureZ) {
		this.compressionFailureZ = compressionFailureZ;
	}


}

