// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcQuantityResource.*;
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity;

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
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasQuantities")
	private Set<IfcPhysicalQuantity> hasQuantities;

	@Description("Identification of the discrimination by which this physical complex property is distinguished. Examples of discriminations are 'layer', 'steel bar diameter', etc.")
	@DataMember(Order = 1)
	@Required()
	@Guid("255d3f36-39db-4848-a022-f6a547983e93")
	@JacksonXmlProperty(isAttribute=true, localName = "Discrimination")
	private String discrimination;

	@Description("Additional indication of a quality of the quantities that are grouped under this physical complex quantity.")
	@DataMember(Order = 2)
	@Guid("88ec8e96-7f5a-4b88-b912-235f95a7d465")
	@JacksonXmlProperty(isAttribute=true, localName = "Quality")
	private String quality;

	@Description("Additional indication of a usage type of the quantities that are grouped under this physical complex quantity.")
	@DataMember(Order = 3)
	@Guid("72695135-81f8-47a6-91d6-04e5db515b5b")
	@JacksonXmlProperty(isAttribute=true, localName = "Usage")
	private String usage;


	public IfcPhysicalComplexQuantity()
	{
	}

	public IfcPhysicalComplexQuantity(String name, IfcPhysicalQuantity[] hasQuantities, String discrimination)
	{
		super(name);
		this.hasQuantities = new HashSet<>(Arrays.asList(hasQuantities));
		this.discrimination = discrimination;
	}

	public Set<IfcPhysicalQuantity> getHasQuantities() {
		return this.hasQuantities;
	}

	public String getDiscrimination() {
		return this.discrimination;
	}

	public void setDiscrimination(String discrimination) {
		this.discrimination = discrimination;
	}

	public String getQuality() {
		return this.quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getUsage() {
		return this.usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}


}

