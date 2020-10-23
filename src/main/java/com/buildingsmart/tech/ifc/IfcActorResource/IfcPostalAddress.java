// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("8a2c94a5-2ae6-4e52-b758-77ba7af2a9b1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPostalAddress extends IfcAddress
{
	@Description("An organization defined address for internal mail delivery.")
	@DataMember(Order = 0)
	@Guid("70967c62-3fd1-4cc4-ba6b-14392c4b6f22")
	@JacksonXmlProperty(isAttribute=false, localName = "internalLocation")
	private IfcLabel internalLocation;

	@Description("The postal address.  <blockquote class=\"note\">NOTE&nbsp; A postal address may occupy several lines (or elements) when recorded.   It is expected that normal usage will incorporate relevant elements of the following address concepts:   A location within a building (e.g. 3rd Floor) Building name (e.g. Interoperability House) Street number   (e.g. 6400) Street name (e.g. Alliance Boulevard). Typical content of address lines may vary in different   countries.</blockquote>")
	@DataMember(Order = 1)
	@Guid("cda33540-f636-4465-9867-3429456e0ddc")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcLabel")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "addressLines")
	private List<IfcLabel> addressLines;

	@Description("An address that is implied by an identifiable mail drop.")
	@DataMember(Order = 2)
	@Guid("daae8135-852e-4b66-b5c2-4f48ab9e2c55")
	@JacksonXmlProperty(isAttribute=false, localName = "postalBox")
	private IfcLabel postalBox;

	@Description("The name of a town.")
	@DataMember(Order = 3)
	@Guid("046c6230-7287-4095-b5a2-7e79394162fa")
	@JacksonXmlProperty(isAttribute=false, localName = "town")
	private IfcLabel town;

	@Description("The name of a region.  <blockquote class=\"note\">NOTE&nbsp; The counties of the United Kingdom and the states of North America are examples of regions.</blockquote>")
	@DataMember(Order = 4)
	@Guid("3db96e1a-a47d-4ab7-aef3-20e0393693ee")
	@JacksonXmlProperty(isAttribute=false, localName = "region")
	private IfcLabel region;

	@Description("The code that is used by the country's postal service.")
	@DataMember(Order = 5)
	@Guid("c968eede-3374-4c93-9f2d-34004505076c")
	@JacksonXmlProperty(isAttribute=false, localName = "postalCode")
	private IfcLabel postalCode;

	@Description("The name of a country.")
	@DataMember(Order = 6)
	@Guid("30b91ac3-acff-466f-84db-0ba77430f15d")
	@JacksonXmlProperty(isAttribute=false, localName = "country")
	private IfcLabel country;


	public IfcPostalAddress()
	{
	}

	public IfcLabel getInternalLocation() {
		return this.internalLocation;
	}

	public void setInternalLocation(IfcLabel internalLocation) {
		this.internalLocation = internalLocation;
	}

	public List<IfcLabel> getAddressLines() {
		return this.addressLines;
	}

	public IfcLabel getPostalBox() {
		return this.postalBox;
	}

	public void setPostalBox(IfcLabel postalBox) {
		this.postalBox = postalBox;
	}

	public IfcLabel getTown() {
		return this.town;
	}

	public void setTown(IfcLabel town) {
		this.town = town;
	}

	public IfcLabel getRegion() {
		return this.region;
	}

	public void setRegion(IfcLabel region) {
		this.region = region;
	}

	public IfcLabel getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(IfcLabel postalCode) {
		this.postalCode = postalCode;
	}

	public IfcLabel getCountry() {
		return this.country;
	}

	public void setCountry(IfcLabel country) {
		this.country = country;
	}


}

