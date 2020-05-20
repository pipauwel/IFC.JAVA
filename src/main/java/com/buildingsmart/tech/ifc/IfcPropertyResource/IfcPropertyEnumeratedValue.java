// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("0d3d63a5-9a73-4f49-a809-6383082c2216")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyEnumeratedValue extends IfcSimpleProperty
{
	@Description("Enumeration values, which shall be listed in the referenced <em>IfcPropertyEnumeration</em>, if such a reference is provided.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been made optional with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 0)
	@Guid("7f2fce6a-1d45-497e-82f3-61ce510951fe")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "enumerationValues")
	private List<IfcValue> enumerationValues;

	@Description("Enumeration from which a enumeration value has been selected. The referenced enumeration also establishes the unit of the enumeration value.")
	@DataMember(Order = 1)
	@Guid("5fbe4df2-d945-4c3c-8826-2a4f7ca6549e")
	@JacksonXmlProperty(isAttribute=false, localName = "enumerationReference")
	private IfcPropertyEnumeration enumerationReference;


	public IfcPropertyEnumeratedValue()
	{
	}

	public IfcPropertyEnumeratedValue(IfcIdentifier name)
	{
		super(name);
	}

	public List<IfcValue> getEnumerationValues() {
		return this.enumerationValues;
	}

	public IfcPropertyEnumeration getEnumerationReference() {
		return this.enumerationReference;
	}

	public void setEnumerationReference(IfcPropertyEnumeration enumerationReference) {
		this.enumerationReference = enumerationReference;
	}


}

