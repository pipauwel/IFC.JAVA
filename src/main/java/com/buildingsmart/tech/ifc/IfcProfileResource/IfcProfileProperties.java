// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("ef3b6c2b-9c21-4445-83a4-2fa1d264bc10")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProfileProperties extends com.buildingsmart.tech.ifc.IfcPropertyResource.IfcExtendedProperties
{
	@JsonIgnore
	@Description("Profile definition which is qualified by these properties.")
	@Required()
	@Guid("4b5b5752-c860-48e3-a79f-0f0c9379c2c9")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef profileDefinition;


	public IfcProfileProperties()
	{
	}

	public IfcProfileProperties(com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty[] properties, com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef profileDefinition)
	{
		super(properties);
		this.profileDefinition = profileDefinition;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef getProfileDefinition() {
		return this.profileDefinition;
	}

	public void setProfileDefinition(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef profileDefinition) {
		this.profileDefinition = profileDefinition;
	}


}

