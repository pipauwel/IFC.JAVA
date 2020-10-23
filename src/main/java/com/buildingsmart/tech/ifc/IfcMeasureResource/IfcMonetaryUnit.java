// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0671cb13-dc5d-4349-956e-d3344b3f2781")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMonetaryUnit implements IfcUnit
{
	@Description("Code or name of the currency.  Permissible values are the three-letter alphabetic currency codes as per <a target=\"_top\" href=\"http://www.iso.org/iso/support/faqs/faqs_widely_used_standards/widely_used_standards_other/currency_codes/currency_codes_list-1.htm\">ISO 4217</a>, for example CNY, EUR, GBP, JPY, USD.")
	@DataMember(Order = 0)
	@Required()
	@Guid("9060944e-647c-499d-9a70-cc9491f4a0cb")
	@JacksonXmlProperty(isAttribute=true, localName = "currency")
	private String currency;


	public IfcMonetaryUnit()
	{
	}

	public IfcMonetaryUnit(String currency)
	{
		this.currency = currency;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}


}

