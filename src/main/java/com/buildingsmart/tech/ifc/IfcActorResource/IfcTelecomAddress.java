// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

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
import com.buildingsmart.tech.ifc.IfcActorResource.IfcAddress;

@Guid("dd829d63-2572-480c-8a2d-ccbe3578cd7e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTelecomAddress extends IfcAddress
{
	@Description("The list of telephone numbers at which telephone messages may be received.")
	@DataMember(Order = 0)
	@Guid("9358a531-c10f-457c-bcf0-946d1c341bc3")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "String")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "TelephoneNumbers")
	private List<String> telephoneNumbers;

	@Description("The list of fax numbers at which fax messages may be received.")
	@DataMember(Order = 1)
	@Guid("a68d66be-04b8-47ac-80c1-b4971391f2ad")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "String")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "FacsimileNumbers")
	private List<String> facsimileNumbers;

	@Description("The pager number at which paging messages may be received.")
	@DataMember(Order = 2)
	@Guid("d5ed08a3-ff1e-4ae7-b3f3-649f7ee3bdab")
	@JacksonXmlProperty(isAttribute=true, localName = "PagerNumber")
	private String pagerNumber;

	@Description("The list of Email addresses at which Email messages may be received.")
	@DataMember(Order = 3)
	@Guid("3fdd78b3-816a-46ab-9f02-ff719a7336ee")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "String")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ElectronicMailAddresses")
	private List<String> electronicMailAddresses;

	@Description("The world wide web address at which the preliminary page of information for the person or organization can be located.  <blockquote class=\"note\">NOTE&nbsp; Information on the world wide web for a person or organization may be separated   into a number of pages and across a number of host sites, all of which may be linked together. It is assumed that   all such information may be referenced from a single page that is termed the home page for that person or organization.</blockquote>")
	@DataMember(Order = 4)
	@Guid("f12c145c-6872-4c79-ab6f-1794a162599b")
	@JacksonXmlProperty(isAttribute=true, localName = "WWWHomePageURL")
	private String wWWHomePageURL;

	@Description("IDs or addresses for any other means of telecommunication, for example instant messaging, voice-over-IP, or file transfer protocols. The communication protocol is indicated by the URI value with scheme designations such as irc:, sip:, or ftp:.")
	@DataMember(Order = 5)
	@Guid("7e4cda12-be43-4268-a3d4-ff872d3d0233")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "String")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "MessagingIDs")
	private List<String> messagingIDs;


	public IfcTelecomAddress()
	{
	}

	public List<String> getTelephoneNumbers() {
		return this.telephoneNumbers;
	}

	public List<String> getFacsimileNumbers() {
		return this.facsimileNumbers;
	}

	public String getPagerNumber() {
		return this.pagerNumber;
	}

	public void setPagerNumber(String pagerNumber) {
		this.pagerNumber = pagerNumber;
	}

	public List<String> getElectronicMailAddresses() {
		return this.electronicMailAddresses;
	}

	public String getWWWHomePageURL() {
		return this.wWWHomePageURL;
	}

	public void setWWWHomePageURL(String wWWHomePageURL) {
		this.wWWHomePageURL = wWWHomePageURL;
	}

	public List<String> getMessagingIDs() {
		return this.messagingIDs;
	}


}

