// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("a6744c81-6540-4918-b206-1d28320b2ee7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertySet extends IfcPropertySetDefinition
{
	@Description("Contained set of properties. For property sets defined as part of the IFC Object model, the property objects within a property set are defined as part of the standard. If a property is not contained within the set of predefined properties, its value has not been set at this time.")
	@Required()
	@MinLength(1)
	@Guid("b3ed731c-b093-44bc-80d6-6fbd6cb54326")
	private Set<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty> hasProperties = new HashSet<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty>();


	public IfcPropertySet()
	{
	}

	public IfcPropertySet(String globalId, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty[] hasProperties)
	{
		super(globalId);
		this.hasProperties = new HashSet<>(Arrays.asList(hasProperties));
	}

	public Set<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty> getHasProperties() {
		return this.hasProperties;
	}


}

