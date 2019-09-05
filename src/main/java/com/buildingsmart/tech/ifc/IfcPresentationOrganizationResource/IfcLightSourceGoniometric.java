// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("50d32070-67dc-40a9-8ba3-9cf188f08490")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightSourceGoniometric extends IfcLightSource
{
	@JacksonXmlProperty(isAttribute=false, localName = "Position")
	@Description("The position of the light source. It is used to orientate the light distribution curves.")
	@Required()
	@Guid("10f820ef-0969-49be-a112-b3b8988cdc6b")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position;

	@JacksonXmlProperty(isAttribute=false, localName = "ColourAppearance")
	@Description("Artificial light sources are classified in terms of their color appearance. To the human eye they all appear to be white; the difference can only be detected by direct comparison. Visual performance is not directly affected by differences in color appearance.")
	@Guid("96390381-e987-42f6-8aa1-325d44d21da5")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb colourAppearance;

	@JacksonXmlProperty(isAttribute=true, localName = "ColourTemperature")
	@Description("The color temperature of any source of radiation is defined as the temperature (in Kelvin) of a black-body or Planckian radiator whose radiation has the same chromaticity as the source of radiation. Often the values are only approximate color temperatures as the black-body radiator cannot emit radiation of every chromaticity value. The color temperatures of the commonest artificial light sources range from less than 3000K (warm white) to 4000K (intermediate) and over 5000K (daylight).")
	@Required()
	@Guid("11216eca-b470-41c3-8bd1-2546c5c1d4c2")
	private double colourTemperature;

	@JacksonXmlProperty(isAttribute=true, localName = "LuminousFlux")
	@Description("Luminous flux is a photometric measure of radiant flux, i.e. the volume of light emitted from a light source. Luminous flux is measured either for the interior as a whole or for a part of the interior (partial luminous flux for a solid angle). All other photometric parameters are derivatives of luminous flux. Luminous flux is measured in lumens (lm). The luminous flux is given as a nominal value for each lamp.")
	@Required()
	@Guid("605578d0-d677-4f04-a024-df7329cfd8be")
	private double luminousFlux;

	@JacksonXmlProperty(isAttribute=true, localName = "LightEmissionSource")
	@Description("Identifies the types of light emitter from which the type required may be set.")
	@Required()
	@Guid("1ce774e2-c56f-4522-abc6-f228ff5716e3")
	private com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightEmissionSourceEnum lightEmissionSource;

	@Description("The data source from which light distribution data is obtained.")
	@Required()
	@Guid("326d0721-6b8b-4920-abfa-f202528203b1")
	private com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionDataSourceSelect lightDistributionDataSource;


	public IfcLightSourceGoniometric()
	{
	}

	public IfcLightSourceGoniometric(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb lightColour, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position, double colourTemperature, double luminousFlux, com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightEmissionSourceEnum lightEmissionSource, com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionDataSourceSelect lightDistributionDataSource)
	{
		super(lightColour);
		this.position = position;
		this.colourTemperature = colourTemperature;
		this.luminousFlux = luminousFlux;
		this.lightEmissionSource = lightEmissionSource;
		this.lightDistributionDataSource = lightDistributionDataSource;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D getPosition() {
		return this.position;
	}

	public void setPosition(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position) {
		this.position = position;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb getColourAppearance() {
		return this.colourAppearance;
	}

	public void setColourAppearance(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb colourAppearance) {
		this.colourAppearance = colourAppearance;
	}

	public double getColourTemperature() {
		return this.colourTemperature;
	}

	public void setColourTemperature(double colourTemperature) {
		this.colourTemperature = colourTemperature;
	}

	public double getLuminousFlux() {
		return this.luminousFlux;
	}

	public void setLuminousFlux(double luminousFlux) {
		this.luminousFlux = luminousFlux;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightEmissionSourceEnum getLightEmissionSource() {
		return this.lightEmissionSource;
	}

	public void setLightEmissionSource(com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightEmissionSourceEnum lightEmissionSource) {
		this.lightEmissionSource = lightEmissionSource;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionDataSourceSelect getLightDistributionDataSource() {
		return this.lightDistributionDataSource;
	}

	public void setLightDistributionDataSource(com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionDataSourceSelect lightDistributionDataSource) {
		this.lightDistributionDataSource = lightDistributionDataSource;
	}


}

