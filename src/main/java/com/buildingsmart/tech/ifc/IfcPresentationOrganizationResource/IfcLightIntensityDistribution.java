// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("bb394b9d-6446-4af5-b07e-add47d8c8b54")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightIntensityDistribution implements IfcLightDistributionDataSourceSelect
{
	@Description("Standardized  light distribution curve used to define the luminous intensity of the light in all directions.")
	@DataMember(Order = 0)
	@Required()
	@Guid("ae46192f-5a5e-4e55-be24-adeceb1bcab5")
	@JacksonXmlProperty(isAttribute=true, localName = "lightDistributionCurve")
	private IfcLightDistributionCurveEnum lightDistributionCurve;

	@Description("<p>Light distribution data applied to the light source. It is defined by a list of main plane angles (B or C according to the light distribution curve chosen) that includes (for each B or C angle) a second list of secondary plane angles (the &#946; or &#947; angles) and the according luminous intensity distribution measures.  </p>")
	@DataMember(Order = 1)
	@Required()
	@Guid("f5fc7d89-d6eb-4d57-b6ca-aaab08228651")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcLightDistributionData")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "distributionData")
	private List<IfcLightDistributionData> distributionData;


	public IfcLightIntensityDistribution()
	{
	}

	public IfcLightIntensityDistribution(IfcLightDistributionCurveEnum lightDistributionCurve, IfcLightDistributionData[] distributionData)
	{
		this.lightDistributionCurve = lightDistributionCurve;
		this.distributionData = new ArrayList<>(Arrays.asList(distributionData));
	}

	public IfcLightDistributionCurveEnum getLightDistributionCurve() {
		return this.lightDistributionCurve;
	}

	public void setLightDistributionCurve(IfcLightDistributionCurveEnum lightDistributionCurve) {
		this.lightDistributionCurve = lightDistributionCurve;
	}

	public List<IfcLightDistributionData> getDistributionData() {
		return this.distributionData;
	}


}

