// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("b98590b4-3769-4d15-88cf-7716e2c2bada")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPhysicalComplexQuantity extends IfcPhysicalQuantity
{
	@Description("Set of physical quantities that are grouped by this complex physical quantity according to a given discrimination.")
	@DataMember(Order = 0)
	@Required()
	@Guid("614df993-7616-44d2-be2a-d4cf9aafa52a")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPhysicalQuantity")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasQuantities")
	private Set<IfcPhysicalQuantity> hasQuantities;

	@Description("Identification of the discrimination by which this physical complex property is distinguished. Examples of discriminations are 'layer', 'steel bar diameter', etc.")
	@DataMember(Order = 1)
	@Required()
	@Guid("255d3f36-39db-4848-a022-f6a547983e93")
	@JacksonXmlProperty(isAttribute=false, localName = "discrimination")
	private IfcLabel discrimination;

	@Description("Additional indication of a quality of the quantities that are grouped under this physical complex quantity.")
	@DataMember(Order = 2)
	@Guid("88ec8e96-7f5a-4b88-b912-235f95a7d465")
	@JacksonXmlProperty(isAttribute=false, localName = "quality")
	private IfcLabel quality;

	@Description("Additional indication of a usage type of the quantities that are grouped under this physical complex quantity.")
	@DataMember(Order = 3)
	@Guid("72695135-81f8-47a6-91d6-04e5db515b5b")
	@JacksonXmlProperty(isAttribute=false, localName = "usage")
	private IfcLabel usage;


	public IfcPhysicalComplexQuantity()
	{
	}

	public IfcPhysicalComplexQuantity(IfcLabel name, IfcPhysicalQuantity[] hasQuantities, IfcLabel discrimination)
	{
		super(name);
		this.hasQuantities = new HashSet<>(Arrays.asList(hasQuantities));
		this.discrimination = discrimination;
	}

	public Set<IfcPhysicalQuantity> getHasQuantities() {
		return this.hasQuantities;
	}

	public IfcLabel getDiscrimination() {
		return this.discrimination;
	}

	public void setDiscrimination(IfcLabel discrimination) {
		this.discrimination = discrimination;
	}

	public IfcLabel getQuality() {
		return this.quality;
	}

	public void setQuality(IfcLabel quality) {
		this.quality = quality;
	}

	public IfcLabel getUsage() {
		return this.usage;
	}

	public void setUsage(IfcLabel usage) {
		this.usage = usage;
	}


}

