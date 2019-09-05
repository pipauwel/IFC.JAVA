// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("006b5d7c-0365-48b1-85a4-b7cc46bfe68e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelConnectsWithRealizingElements extends IfcRelConnectsElements
{
	@Description("Defines the elements that realize a connection relationship.")
	@Required()
	@MinLength(1)
	@Guid("d81eeca1-759e-48b4-9c08-b45f1385450f")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement> realizingElements = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement>();

	@JacksonXmlProperty(isAttribute=true, localName = "ConnectionType")
	@Description("The type of the connection given for informal purposes, it may include labels, like 'joint', 'rigid joint', 'flexible joint', etc.")
	@Guid("cd071293-ee93-4630-9dc7-8272188f95f5")
	private String connectionType;


	public IfcRelConnectsWithRealizingElements()
	{
	}

	public IfcRelConnectsWithRealizingElements(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatingElement, com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatedElement, com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement[] realizingElements)
	{
		super(globalId, relatingElement, relatedElement);
		this.realizingElements = new HashSet<>(Arrays.asList(realizingElements));
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement> getRealizingElements() {
		return this.realizingElements;
	}

	public String getConnectionType() {
		return this.connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}


}

