// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("db89d737-4bde-4aef-bb04-156d8b2c8097")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelServicesBuildings extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("System that services the Buildings.")
	@DataMember(Order = 0)
	@Required()
	@Guid("ef4ac800-94ab-4c07-9262-b7e44d13f6a3")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingSystem")
	private IfcSystem relatingSystem;

	@Description("Spatial structure elements (including site, building, storeys) that are serviced by the system.  <blockquote class=\"change-ifc2x\">    IFC2x CHANGE&nbsp; The data type has been changed from <em>IfcBuilding</em> to <em>IfcSpatialStructureElement</em> with upward compatibility for file based exchange.  </blockquote>  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; The data type has been changed from <em>IfcSpatialStructureElement</em> to <em>IfcSpatialElement</em> with upward compatibility for file based exchange.  </blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("9e2d6247-93c2-4b4c-87e7-0a35aec4c0e1")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcSpatialElement")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedBuildings")
	private Set<IfcSpatialElement> relatedBuildings;


	public IfcRelServicesBuildings()
	{
	}

	public IfcRelServicesBuildings(String globalId, IfcSystem relatingSystem, IfcSpatialElement[] relatedBuildings)
	{
		super(globalId);
		this.relatingSystem = relatingSystem;
		this.relatedBuildings = new HashSet<>(Arrays.asList(relatedBuildings));
	}

	public IfcSystem getRelatingSystem() {
		return this.relatingSystem;
	}

	public void setRelatingSystem(IfcSystem relatingSystem) {
		this.relatingSystem = relatingSystem;
	}

	public Set<IfcSpatialElement> getRelatedBuildings() {
		return this.relatedBuildings;
	}


}

