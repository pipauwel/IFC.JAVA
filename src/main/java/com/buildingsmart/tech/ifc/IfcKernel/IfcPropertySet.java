// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("a6744c81-6540-4918-b206-1d28320b2ee7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertySet extends IfcPropertySetDefinition
{
	@Description("Contained set of properties. For property sets defined as part of the IFC Object model, the property objects within a property set are defined as part of the standard. If a property is not contained within the set of predefined properties, its value has not been set at this time.")
	@DataMember(Order = 0)
	@Required()
	@Guid("b3ed731c-b093-44bc-80d6-6fbd6cb54326")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcProperty")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasProperties")
	private Set<IfcProperty> hasProperties;


	public IfcPropertySet()
	{
	}

	public IfcPropertySet(String globalId, IfcProperty[] hasProperties)
	{
		super(globalId);
		this.hasProperties = new HashSet<>(Arrays.asList(hasProperties));
	}

	public Set<IfcProperty> getHasProperties() {
		return this.hasProperties;
	}


}

