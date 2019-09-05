// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("03421a5b-09f0-4284-a397-06d83f4f7684")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProjectedCRS extends IfcCoordinateReferenceSystem
{
	@JacksonXmlProperty(isAttribute=true, localName = "MapProjection")
	@Description("Name by which the map projection is identified.    <blockquote class=\"examples\">EXAMPLE&nbsp; map projects include:  <ul class=\"note\">    <li class=\"note\">UTM</li>    <li class=\"note\">Gaus-Krueger</li>  </ul>")
	@Guid("9e324f9a-8d48-45d4-8936-f526297f87af")
	private String mapProjection;

	@JacksonXmlProperty(isAttribute=true, localName = "MapZone")
	@Description("Name by which the map zone, relating to the <em>MapProjection</em>, is identified.     <blockquote class=\"examples\">EXAMPLE&nbsp;  <ul class=\"note\">    <li class=\"note\">for UTM, the zone number, like 32 for UTM32</li>    <li class=\"note\">for Gaus-Krueger, the zones of longitudinal width, like 3'</li>  </ul>  </blockquote>")
	@Guid("599648d5-3488-4334-b78f-7d9a11dfccc4")
	private String mapZone;

	@JacksonXmlProperty(isAttribute=false, localName = "MapUnit")
	@Description("Unit of the coordinate axes composing the map coordinate system.  <blockquote class=\"note\">NOTE&nbsp; Only length measures are in scope and all two or three axes of the map coordinate system shall have the same length unit.</blockquote>")
	@Guid("410d199b-4a2e-4c82-ac10-3f9869d7da99")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNamedUnit mapUnit;


	public IfcProjectedCRS()
	{
	}

	public IfcProjectedCRS(String name)
	{
		super(name);
	}

	public String getMapProjection() {
		return this.mapProjection;
	}

	public void setMapProjection(String mapProjection) {
		this.mapProjection = mapProjection;
	}

	public String getMapZone() {
		return this.mapZone;
	}

	public void setMapZone(String mapZone) {
		this.mapZone = mapZone;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNamedUnit getMapUnit() {
		return this.mapUnit;
	}

	public void setMapUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNamedUnit mapUnit) {
		this.mapUnit = mapUnit;
	}


}

