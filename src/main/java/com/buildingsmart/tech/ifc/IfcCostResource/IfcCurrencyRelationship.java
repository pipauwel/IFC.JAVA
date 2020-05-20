// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcCostResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibraryInformation;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDateTime;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMonetaryUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9369fbbe-c581-4604-aa77-92582aa9453c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurrencyRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@Description("The monetary unit from which an exchange is derived. For instance, in the case of a conversion from GBP to USD, the relating monetary unit is GBP.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8ad0cf1d-249d-446c-a3b0-d1a9aeda943d")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingMonetaryUnit")
	private IfcMonetaryUnit relatingMonetaryUnit;

	@Description("The monetary unit to which an exchange results. For instance, in the case of a conversion from GBP to USD, the related monetary unit is USD.")
	@DataMember(Order = 1)
	@Required()
	@Guid("2dd6b7a2-34a1-4238-b477-c09271f157aa")
	@JacksonXmlProperty(isAttribute=false, localName = "relatedMonetaryUnit")
	private IfcMonetaryUnit relatedMonetaryUnit;

	@Description("The currently agreed ratio of the amount of a related monetary unit that is equivalent to a unit amount of the relating monetary unit in a currency relationship. For instance, in the case of a conversion from GBP to USD, the value of the exchange rate may be 1.486 (USD) : 1 (GBP).")
	@DataMember(Order = 2)
	@Required()
	@Guid("b0243b1e-6e24-414e-9b92-5ee782e1c2b7")
	@JacksonXmlProperty(isAttribute=false, localName = "exchangeRate")
	private IfcPositiveRatioMeasure exchangeRate;

	@Description("The date and time at which an exchange rate applies.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Type changed from IfcDateTimeSelect. Attribute made optional.</blockquote>")
	@DataMember(Order = 3)
	@Guid("ec65c0c7-e002-4f68-b956-b479d9fc4a25")
	@JacksonXmlProperty(isAttribute=false, localName = "rateDateTime")
	private IfcDateTime rateDateTime;

	@Description("The source from which an exchange rate is obtained.")
	@DataMember(Order = 4)
	@Guid("89f1b6ce-2442-40b8-b9ab-6e4941cc5459")
	@JacksonXmlProperty(isAttribute=false, localName = "rateSource")
	private IfcLibraryInformation rateSource;


	public IfcCurrencyRelationship()
	{
	}

	public IfcCurrencyRelationship(IfcMonetaryUnit relatingMonetaryUnit, IfcMonetaryUnit relatedMonetaryUnit, IfcPositiveRatioMeasure exchangeRate)
	{
		this.relatingMonetaryUnit = relatingMonetaryUnit;
		this.relatedMonetaryUnit = relatedMonetaryUnit;
		this.exchangeRate = exchangeRate;
	}

	public IfcMonetaryUnit getRelatingMonetaryUnit() {
		return this.relatingMonetaryUnit;
	}

	public void setRelatingMonetaryUnit(IfcMonetaryUnit relatingMonetaryUnit) {
		this.relatingMonetaryUnit = relatingMonetaryUnit;
	}

	public IfcMonetaryUnit getRelatedMonetaryUnit() {
		return this.relatedMonetaryUnit;
	}

	public void setRelatedMonetaryUnit(IfcMonetaryUnit relatedMonetaryUnit) {
		this.relatedMonetaryUnit = relatedMonetaryUnit;
	}

	public IfcPositiveRatioMeasure getExchangeRate() {
		return this.exchangeRate;
	}

	public void setExchangeRate(IfcPositiveRatioMeasure exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public IfcDateTime getRateDateTime() {
		return this.rateDateTime;
	}

	public void setRateDateTime(IfcDateTime rateDateTime) {
		this.rateDateTime = rateDateTime;
	}

	public IfcLibraryInformation getRateSource() {
		return this.rateSource;
	}

	public void setRateSource(IfcLibraryInformation rateSource) {
		this.rateSource = rateSource;
	}


}

