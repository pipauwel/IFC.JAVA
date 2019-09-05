// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("c49fa2f9-55a1-4a45-9f3c-ca8a7106f785")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcMaterialUsageDefinition implements IfcMaterialSelect
{
	@Description("Use of the <em>IfcMaterialUsageDefinition</em> subtypes within the material association of an element occurrence. The association is established by the <em>IfcRelAssociatesMaterial</em> relationship.")
	@MinLength(1)
	@Guid("20912e32-b48d-4caa-9d16-c7b6f378f8a0")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelAssociatesMaterial> associatedTo = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelAssociatesMaterial>();


	public IfcMaterialUsageDefinition()
	{
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelAssociatesMaterial> getAssociatedTo() {
		return this.associatedTo;
	}


}

