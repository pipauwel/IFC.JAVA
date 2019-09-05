// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("dffb2f7f-2ba0-4b5f-88e4-bde0fa72fa1d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSystem extends com.buildingsmart.tech.ifc.IfcKernel.IfcGroup
{
	@Description("Reference to the <strike>building</strike> spatial structure via the objectified relationship <em>IfcRelServicesBuildings</em>, which is serviced by the system.")
	@MaxLength(1)
	@Guid("9aebcdcb-6859-4a94-9ebc-9143ff0fcde4")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelServicesBuildings> servicesBuildings = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelServicesBuildings>();


	public IfcSystem()
	{
	}

	public IfcSystem(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelServicesBuildings> getServicesBuildings() {
		return this.servicesBuildings;
	}


}

