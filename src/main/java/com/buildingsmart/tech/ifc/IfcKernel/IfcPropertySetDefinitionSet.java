// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("d5a72992-5672-4281-bb31-ce25d74519d4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertySetDefinitionSet implements IfcPropertySetDefinitionSelect {
	public com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinition value;

	public IfcPropertySetDefinitionSet() {
	}

	public IfcPropertySetDefinitionSet(com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinition value) {
		this();
		this.value = value;
	}

	public com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinition getValue() {
		return this.value;
	}

	public void setValue(com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinition value) {
		this.value = value;
	}
}

