// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("94e16249-95c6-4654-92c9-5cfac4e1e234")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFillAreaStyleTiles extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcFillStyleSelect
{
	@Description("A two direction repeat factor defining the shape and relative positioning of the tiles.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute type has changed to directly reference two <em>IfcVector</em>'s.</blockquote>")
	@Required()
	@MinLength(2)
	@MaxLength(2)
	@Guid("85b936d1-2755-4739-9fd0-716ef0622f80")
	private List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector> tilingPattern = new ArrayList<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector>();

	@Description("A set of constituents of the tile being a styled item that is used as the annotation symbol for tiling the filled area.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The data type has been changed to <em>IfcStyledItem</em>.</blockquote>  <blockquote class=\"note\">NOTE&nbsp; Only <em>IfcStyleItem</em>'s that refer to a compatible geometric representation item and presentation style shall be used.</blockquote>")
	@Required()
	@MinLength(1)
	@Guid("5812d5a2-edd8-486a-8237-149034e4dcaa")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyledItem> tiles = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyledItem>();

	@JacksonXmlProperty(isAttribute=true, localName = "TilingScale")
	@Description("The scale factor applied to each tile as it is placed in the annotation fill area.")
	@Required()
	@Guid("0200d8ed-49fd-4670-a213-284158f9200d")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure tilingScale;


	public IfcFillAreaStyleTiles()
	{
	}

	public IfcFillAreaStyleTiles(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector[] tilingPattern, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyledItem[] tiles, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure tilingScale)
	{
		this.tilingPattern = new ArrayList<>(Arrays.asList(tilingPattern));
		this.tiles = new HashSet<>(Arrays.asList(tiles));
		this.tilingScale = tilingScale;
	}

	public List<com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector> getTilingPattern() {
		return this.tilingPattern;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcStyledItem> getTiles() {
		return this.tiles;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure getTilingScale() {
		return this.tilingScale;
	}

	public void setTilingScale(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure tilingScale) {
		this.tilingScale = tilingScale;
	}


}

