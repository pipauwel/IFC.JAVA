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

@Guid("dd829d63-2572-480c-8a2d-ccbe3578cd7e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTelecomAddress extends IfcAddress
{
	@JacksonXmlProperty(isAttribute=true, localName = "TelephoneNumbers")
	@Description("The list of telephone numbers at which telephone messages may be received.")
	@MinLength(1)
	@Guid("9358a531-c10f-457c-bcf0-946d1c341bc3")
	private List<String> telephoneNumbers = new ArrayList<String>();

	@JacksonXmlProperty(isAttribute=true, localName = "FacsimileNumbers")
	@Description("The list of fax numbers at which fax messages may be received.")
	@MinLength(1)
	@Guid("a68d66be-04b8-47ac-80c1-b4971391f2ad")
	private List<String> facsimileNumbers = new ArrayList<String>();

	@JacksonXmlProperty(isAttribute=true, localName = "PagerNumber")
	@Description("The pager number at which paging messages may be received.")
	@Guid("d5ed08a3-ff1e-4ae7-b3f3-649f7ee3bdab")
	private String pagerNumber;

	@JacksonXmlProperty(isAttribute=true, localName = "ElectronicMailAddresses")
	@Description("The list of Email addresses at which Email messages may be received.")
	@MinLength(1)
	@Guid("3fdd78b3-816a-46ab-9f02-ff719a7336ee")
	private List<String> electronicMailAddresses = new ArrayList<String>();

	@JacksonXmlProperty(isAttribute=true, localName = "WWWHomePageURL")
	@Description("The world wide web address at which the preliminary page of information for the person or organization can be located.  <blockquote class=\"note\">NOTE&nbsp; Information on the world wide web for a person or organization may be separated   into a number of pages and across a number of host sites, all of which may be linked together. It is assumed that   all such information may be referenced from a single page that is termed the home page for that person or organization.</blockquote>")
	@Guid("f12c145c-6872-4c79-ab6f-1794a162599b")
	private String wWWHomePageURL;

	@JacksonXmlProperty(isAttribute=true, localName = "MessagingIDs")
	@Description("IDs or addresses for any other means of telecommunication, for example instant messaging, voice-over-IP, or file transfer protocols. The communication protocol is indicated by the URI value with scheme designations such as irc:, sip:, or ftp:.")
	@MinLength(1)
	@Guid("7e4cda12-be43-4268-a3d4-ff872d3d0233")
	private List<String> messagingIDs = new ArrayList<String>();


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

