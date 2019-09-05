// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("707d56d2-d0f4-419a-a790-679333c0e23e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialProperties extends com.buildingsmart.tech.ifc.IfcPropertyResource.IfcExtendedProperties
{
	@JsonIgnore
	@Description("Reference to the material definition to which the set of properties is assigned.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The datatype has been changed to supertype <em>IfcMaterialDefinition</em>.</blockquote>")
	@Required()
	@Guid("1f04c044-1625-4c62-8830-244f32e33e14")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialDefinition material;


	public IfcMaterialProperties()
	{
	}

	public IfcMaterialProperties(com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty[] properties, com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialDefinition material)
	{
		super(properties);
		this.material = material;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialDefinition getMaterial() {
		return this.material;
	}

	public void setMaterial(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialDefinition material) {
		this.material = material;
	}


}

