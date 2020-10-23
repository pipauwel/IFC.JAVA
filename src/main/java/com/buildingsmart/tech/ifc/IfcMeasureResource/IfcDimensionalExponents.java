// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ef3f0882-12e2-4d20-b7bb-0c455f3d1dad")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDimensionalExponents
{
	@Description("The power of the length base quantity.")
	@DataMember(Order = 0)
	@Required()
	@Guid("e6e8038f-c561-4d2d-a3bb-e768958c320e")
	@JacksonXmlProperty(isAttribute=true, localName = "lengthExponent")
	private Integer lengthExponent;

	@Description("The power of the mass base quantity.")
	@DataMember(Order = 1)
	@Required()
	@Guid("1c89c3c7-34fe-4d0a-9c68-00bc5b7dcb1a")
	@JacksonXmlProperty(isAttribute=true, localName = "massExponent")
	private Integer massExponent;

	@Description("The power of the time base quantity.")
	@DataMember(Order = 2)
	@Required()
	@Guid("4cfe7c87-c8df-4693-bfad-aae2cc98d8ae")
	@JacksonXmlProperty(isAttribute=true, localName = "timeExponent")
	private Integer timeExponent;

	@Description("The power of the electric current base quantity.")
	@DataMember(Order = 3)
	@Required()
	@Guid("3d9b42b9-b568-4afc-bcbf-cfda31e81ca4")
	@JacksonXmlProperty(isAttribute=true, localName = "electricCurrentExponent")
	private Integer electricCurrentExponent;

	@Description("The power of the thermodynamic temperature base quantity.")
	@DataMember(Order = 4)
	@Required()
	@Guid("62bd0e1f-76af-4dd8-978e-e61f1877691c")
	@JacksonXmlProperty(isAttribute=true, localName = "thermodynamicTemperatureExponent")
	private Integer thermodynamicTemperatureExponent;

	@Description("The power of the amount of substance base quantity.")
	@DataMember(Order = 5)
	@Required()
	@Guid("83ed42eb-f403-4a34-8e18-f3f5097b9ec4")
	@JacksonXmlProperty(isAttribute=true, localName = "amountOfSubstanceExponent")
	private Integer amountOfSubstanceExponent;

	@Description("The power of the luminous intensity base quantity.")
	@DataMember(Order = 6)
	@Required()
	@Guid("e1c165b8-59ba-40d1-9c8a-3e1a4f9dea54")
	@JacksonXmlProperty(isAttribute=true, localName = "luminousIntensityExponent")
	private Integer luminousIntensityExponent;


	public IfcDimensionalExponents()
	{
	}

	public IfcDimensionalExponents(int lengthExponent, int massExponent, int timeExponent, int electricCurrentExponent,
								   int thermodynamicTemperatureExponent, int amountOfSubstanceExponent, int luminousIntensityExponent)
	{
		this.lengthExponent = lengthExponent;
		this.massExponent = massExponent;
		this.timeExponent = timeExponent;
		this.electricCurrentExponent = electricCurrentExponent;
		this.thermodynamicTemperatureExponent = thermodynamicTemperatureExponent;
		this.amountOfSubstanceExponent = amountOfSubstanceExponent;
		this.luminousIntensityExponent = luminousIntensityExponent;
	}

	public int getLengthExponent() {
		return this.lengthExponent;
	}

	public void setLengthExponent(int lengthExponent) {
		this.lengthExponent = lengthExponent;
	}

	public int getMassExponent() {
		return this.massExponent;
	}

	public void setMassExponent(int massExponent) {
		this.massExponent = massExponent;
	}

	public int getTimeExponent() {
		return this.timeExponent;
	}

	public void setTimeExponent(int timeExponent) {
		this.timeExponent = timeExponent;
	}

	public int getElectricCurrentExponent() {
		return this.electricCurrentExponent;
	}

	public void setElectricCurrentExponent(int electricCurrentExponent) {
		this.electricCurrentExponent = electricCurrentExponent;
	}

	public int getThermodynamicTemperatureExponent() {
		return this.thermodynamicTemperatureExponent;
	}

	public void setThermodynamicTemperatureExponent(int thermodynamicTemperatureExponent) {
		this.thermodynamicTemperatureExponent = thermodynamicTemperatureExponent;
	}

	public int getAmountOfSubstanceExponent() {
		return this.amountOfSubstanceExponent;
	}

	public void setAmountOfSubstanceExponent(int amountOfSubstanceExponent) {
		this.amountOfSubstanceExponent = amountOfSubstanceExponent;
	}

	public int getLuminousIntensityExponent() {
		return this.luminousIntensityExponent;
	}

	public void setLuminousIntensityExponent(int luminousIntensityExponent) {
		this.luminousIntensityExponent = luminousIntensityExponent;
	}


}

