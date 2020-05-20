// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.*;

@Guid("94e16249-95c6-4654-92c9-5cfac4e1e234")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFillAreaStyleTiles extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcFillStyleSelect
{
	@Description("A two direction repeat factor defining the shape and relative positioning of the tiles.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute type has changed to directly reference two <em>IfcVector</em>'s.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("85b936d1-2755-4739-9fd0-716ef0622f80")
	@MinLength(2)
	@MaxLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcVector")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "tilingPattern")
	private List<IfcVector> tilingPattern;

	@Description("A set of constituents of the tile being a styled item that is used as the annotation symbol for tiling the filled area.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The data type has been changed to <em>IfcStyledItem</em>.</blockquote>  <blockquote class=\"note\">NOTE&nbsp; Only <em>IfcStyleItem</em>'s that refer to a compatible geometric representation item and presentation style shall be used.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("5812d5a2-edd8-486a-8237-149034e4dcaa")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcStyledItem")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "tiles")
	private Set<IfcStyledItem> tiles;

	@Description("The scale factor applied to each tile as it is placed in the annotation fill area.")
	@DataMember(Order = 2)
	@Required()
	@Guid("0200d8ed-49fd-4670-a213-284158f9200d")
	@JacksonXmlProperty(isAttribute=false, localName = "tilingScale")
	private IfcPositiveRatioMeasure tilingScale;


	public IfcFillAreaStyleTiles()
	{
	}

	public IfcFillAreaStyleTiles(IfcVector[] tilingPattern, IfcStyledItem[] tiles, IfcPositiveRatioMeasure tilingScale)
	{
		this.tilingPattern = new ArrayList<>(Arrays.asList(tilingPattern));
		this.tiles = new HashSet<>(Arrays.asList(tiles));
		this.tilingScale = tilingScale;
	}

	public List<IfcVector> getTilingPattern() {
		return this.tilingPattern;
	}

	public Set<IfcStyledItem> getTiles() {
		return this.tiles;
	}

	public IfcPositiveRatioMeasure getTilingScale() {
		return this.tilingScale;
	}

	public void setTilingScale(IfcPositiveRatioMeasure tilingScale) {
		this.tilingScale = tilingScale;
	}


}

