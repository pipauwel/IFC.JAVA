// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cffe9f24-4de2-4238-8448-856d95446876")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightDistributionData
{
	@Description("The main plane angle (A, B or C angles, according to the light distribution curve chosen).")
	@DataMember(Order = 0)
	@Required()
	@Guid("8bfeda5d-d746-43d6-9ae7-6099d937f490")
	@JacksonXmlProperty(isAttribute=true, localName = "MainPlaneAngle")
	private double mainPlaneAngle;

	@Description("<p>The list of secondary plane angles (the &#945;, &#946; or &#947; angles) according to the light distribution curve chosen.  </p>  <blockquote class=\"note\">NOTE&nbsp; The <em>SecondaryPlaneAngle</em> and <em>LuminousIntensity</em> lists are corresponding lists.  </blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("3fbe74a3-c4b3-4987-8774-375df54d71eb")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "SecondaryPlaneAngle")
	private List<Double> secondaryPlaneAngle;

	@Description("The luminous intensity distribution measure for this pair of main and secondary plane angles according to the light distribution curve chosen.")
	@DataMember(Order = 2)
	@Required()
	@Guid("226abcef-3fd3-4a2c-a02c-653dc392ba82")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "LuminousIntensity")
	private List<Double> luminousIntensity;


	public IfcLightDistributionData()
	{
	}

	public IfcLightDistributionData(double mainPlaneAngle, Double[] secondaryPlaneAngle, Double[] luminousIntensity)
	{
		this.mainPlaneAngle = mainPlaneAngle;
		this.secondaryPlaneAngle = new ArrayList<>(Arrays.asList(secondaryPlaneAngle));
		this.luminousIntensity = new ArrayList<>(Arrays.asList(luminousIntensity));
	}

	public double getMainPlaneAngle() {
		return this.mainPlaneAngle;
	}

	public void setMainPlaneAngle(double mainPlaneAngle) {
		this.mainPlaneAngle = mainPlaneAngle;
	}

	public List<Double> getSecondaryPlaneAngle() {
		return this.secondaryPlaneAngle;
	}

	public List<Double> getLuminousIntensity() {
		return this.luminousIntensity;
	}


}

