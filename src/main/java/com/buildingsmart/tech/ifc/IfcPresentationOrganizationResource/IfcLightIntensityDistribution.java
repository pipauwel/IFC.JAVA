// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bb394b9d-6446-4af5-b07e-add47d8c8b54")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightIntensityDistribution implements IfcLightDistributionDataSourceSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "LightDistributionCurve")
	@Description("Standardized  light distribution curve used to define the luminous intensity of the light in all directions.")
	@Required()
	@Guid("ae46192f-5a5e-4e55-be24-adeceb1bcab5")
	private com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionCurveEnum lightDistributionCurve;

	@Description("<p>Light distribution data applied to the light source. It is defined by a list of main plane angles (B or C according to the light distribution curve chosen) that includes (for each B or C angle) a second list of secondary plane angles (the &#946; or &#947; angles) and the according luminous intensity distribution measures.  </p>")
	@Required()
	@MinLength(1)
	@Guid("f5fc7d89-d6eb-4d57-b6ca-aaab08228651")
	private List<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionData> distributionData = new ArrayList<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionData>();


	public IfcLightIntensityDistribution()
	{
	}

	public IfcLightIntensityDistribution(com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionCurveEnum lightDistributionCurve, com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionData[] distributionData)
	{
		this.lightDistributionCurve = lightDistributionCurve;
		this.distributionData = new ArrayList<>(Arrays.asList(distributionData));
	}

	public com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionCurveEnum getLightDistributionCurve() {
		return this.lightDistributionCurve;
	}

	public void setLightDistributionCurve(com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionCurveEnum lightDistributionCurve) {
		this.lightDistributionCurve = lightDistributionCurve;
	}

	public List<com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionData> getDistributionData() {
		return this.distributionData;
	}


}

