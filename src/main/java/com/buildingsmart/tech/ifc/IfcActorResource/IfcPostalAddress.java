// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("8a2c94a5-2ae6-4e52-b758-77ba7af2a9b1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPostalAddress extends IfcAddress
{
	@JacksonXmlProperty(isAttribute=true, localName = "InternalLocation")
	@Description("An organization defined address for internal mail delivery.")
	@Guid("70967c62-3fd1-4cc4-ba6b-14392c4b6f22")
	private String internalLocation;

	@JacksonXmlProperty(isAttribute=true, localName = "AddressLines")
	@Description("The postal address.  <blockquote class=\"note\">NOTE&nbsp; A postal address may occupy several lines (or elements) when recorded.   It is expected that normal usage will incorporate relevant elements of the following address concepts:   A location within a building (e.g. 3rd Floor) Building name (e.g. Interoperability House) Street number   (e.g. 6400) Street name (e.g. Alliance Boulevard). Typical content of address lines may vary in different   countries.</blockquote>")
	@MinLength(1)
	@Guid("cda33540-f636-4465-9867-3429456e0ddc")
	private List<String> addressLines = new ArrayList<String>();

	@JacksonXmlProperty(isAttribute=true, localName = "PostalBox")
	@Description("An address that is implied by an identifiable mail drop.")
	@Guid("daae8135-852e-4b66-b5c2-4f48ab9e2c55")
	private String postalBox;

	@JacksonXmlProperty(isAttribute=true, localName = "Town")
	@Description("The name of a town.")
	@Guid("046c6230-7287-4095-b5a2-7e79394162fa")
	private String town;

	@JacksonXmlProperty(isAttribute=true, localName = "Region")
	@Description("The name of a region.  <blockquote class=\"note\">NOTE&nbsp; The counties of the United Kingdom and the states of North America are examples of regions.</blockquote>")
	@Guid("3db96e1a-a47d-4ab7-aef3-20e0393693ee")
	private String region;

	@JacksonXmlProperty(isAttribute=true, localName = "PostalCode")
	@Description("The code that is used by the country's postal service.")
	@Guid("c968eede-3374-4c93-9f2d-34004505076c")
	private String postalCode;

	@JacksonXmlProperty(isAttribute=true, localName = "Country")
	@Description("The name of a country.")
	@Guid("30b91ac3-acff-466f-84db-0ba77430f15d")
	private String country;


	public IfcPostalAddress()
	{
	}

	public String getInternalLocation() {
		return this.internalLocation;
	}

	public void setInternalLocation(String internalLocation) {
		this.internalLocation = internalLocation;
	}

	public List<String> getAddressLines() {
		return this.addressLines;
	}

	public String getPostalBox() {
		return this.postalBox;
	}

	public void setPostalBox(String postalBox) {
		this.postalBox = postalBox;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


}

