// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNamedUnit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("03421a5b-09f0-4284-a397-06d83f4f7684")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProjectedCRS extends IfcCoordinateReferenceSystem
{
	@Description("Name by which the map projection is identified.    <blockquote class=\"examples\">EXAMPLE&nbsp; map projects include:  <ul class=\"note\">    <li class=\"note\">UTM</li>    <li class=\"note\">Gaus-Krueger</li>  </ul>")
	@DataMember(Order = 0)
	@Guid("9e324f9a-8d48-45d4-8936-f526297f87af")
	@JacksonXmlProperty(isAttribute=false, localName = "mapProjection")
	private IfcIdentifier mapProjection;

	@Description("Name by which the map zone, relating to the <em>MapProjection</em>, is identified.     <blockquote class=\"examples\">EXAMPLE&nbsp;  <ul class=\"note\">    <li class=\"note\">for UTM, the zone number, like 32 for UTM32</li>    <li class=\"note\">for Gaus-Krueger, the zones of longitudinal width, like 3'</li>  </ul>  </blockquote>")
	@DataMember(Order = 1)
	@Guid("599648d5-3488-4334-b78f-7d9a11dfccc4")
	@JacksonXmlProperty(isAttribute=false, localName = "mapZone")
	private IfcIdentifier mapZone;

	@Description("Unit of the coordinate axes composing the map coordinate system.  <blockquote class=\"note\">NOTE&nbsp; Only length measures are in scope and all two or three axes of the map coordinate system shall have the same length unit.</blockquote>")
	@DataMember(Order = 2)
	@Guid("410d199b-4a2e-4c82-ac10-3f9869d7da99")
	@JacksonXmlProperty(isAttribute=false, localName = "mapUnit")
	private IfcNamedUnit mapUnit;


	public IfcProjectedCRS()
	{
	}

	public IfcProjectedCRS(IfcLabel name)
	{
		super(name);
	}

	public IfcIdentifier getMapProjection() {
		return this.mapProjection;
	}

	public void setMapProjection(IfcIdentifier mapProjection) {
		this.mapProjection = mapProjection;
	}

	public IfcIdentifier getMapZone() {
		return this.mapZone;
	}

	public void setMapZone(IfcIdentifier mapZone) {
		this.mapZone = mapZone;
	}

	public IfcNamedUnit getMapUnit() {
		return this.mapUnit;
	}

	public void setMapUnit(IfcNamedUnit mapUnit) {
		this.mapUnit = mapUnit;
	}


}

