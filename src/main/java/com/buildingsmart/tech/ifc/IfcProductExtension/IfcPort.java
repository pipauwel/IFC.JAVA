// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionPort;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("032e8ec4-b702-496b-b1c7-582032fc9a31")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcDistributionPort.class, name = "IfcDistributionPort"))
public abstract class IfcPort extends com.buildingsmart.tech.ifc.IfcKernel.IfcProduct
{
	@Description("Reference to the element to port connection relationship. The relationship then refers to the element in which this port is contained.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; The cardinality has been changed from 1:1 to 0:1.  IFC4 DEPRECATION&nbsp; The inverse relationship is deprecated for fixed ports due to deprecation of <em>IfcRelConnectsPortToElement</em> for this usage. Use inverse relationship <em>Nests</em> instead.  </blockquote>")
	@InverseProperty(InverseProp = "relatingPort", Range = "IfcRelConnectsPortToElement")
	@Guid("36e82fa5-2db1-4c7a-8ef6-45624460a621")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelConnectsPortToElement")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "containedIn")
	private Set<IfcRelConnectsPortToElement> containedIn;

	@Description("Reference to a port that is connected by the objectified relationship.")
	@InverseProperty(InverseProp = "relatedPort", Range = "IfcRelConnectsPorts")
	@Guid("1bb39505-d966-41c3-af7f-7fb70e99a055")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "connectedFrom")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "connectedFrom")
	private Set<IfcRelConnectsPorts> connectedFrom;

	@Description("Reference to the port connection relationship. The relationship then refers to the other port to which this port is connected.")
	@InverseProperty(InverseProp = "relatingPort", Range = "IfcRelConnectsPorts")
	@Guid("ab8ec2a9-69ab-4668-b82d-b20d591cbd40")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "connectedTo")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "connectedTo")
	private Set<IfcRelConnectsPorts> connectedTo;


	public IfcPort()
	{
	}

	public IfcPort(String globalId)
	{
		super(globalId);
	}

	public Set<IfcRelConnectsPortToElement> getContainedIn() {
		return this.containedIn;
	}

	public Set<IfcRelConnectsPorts> getConnectedFrom() {
		return this.connectedFrom;
	}

	public Set<IfcRelConnectsPorts> getConnectedTo() {
		return this.connectedTo;
	}


}

