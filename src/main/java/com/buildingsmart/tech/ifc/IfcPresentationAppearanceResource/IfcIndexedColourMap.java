// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("72a45e5a-521d-4b77-ba81-0938e73dffff")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIndexedColourMap extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@JsonIgnore
	@Description("Reference to the <em>IfcTessellatedFaceSet</em> to which it applies the colours and alpha channel.")
	@Required()
	@Guid("46f7bd1c-d9b3-427b-b0c8-c3d9bcc29edd")
	private com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet mappedTo;

	@JacksonXmlProperty(isAttribute=true, localName = "Opacity")
	@Description("The the opacity value, that applies equaly to all faces of the tessellated face set. 1.0 means opaque, and 0.0 completely transparent. If not provided, 1.0 is assumed (all colours are opque).    <blockquote class=\"note\">NOTE&nbsp; The definition of the alpha channel component for opacity follows the new definitions in image processing, where 0.0 means full transparency and 1.0 (or 2<sup>bit depths</sup> -1) means fully opaque. This is contrary to the definition of transparency in <i>IfcSurfaceStyleShading</i>.</blockquote>")
	@Guid("95d4d17c-ac0b-4a8d-9c90-545c63064df1")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure opacity;

	@JacksonXmlProperty(isAttribute=false, localName = "Colours")
	@Description("Indexable list of lists of quadruples, representing RGB colours.")
	@Required()
	@Guid("9098328d-ff84-4d4a-a892-224c18ad3d85")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgbList colours;

	@JacksonXmlProperty(isAttribute=true, localName = "ColourIndex")
	@Description("Index into the <em>IfcColourRgbList</em> for each face of the <em>IfcTriangulatedFaceSet</em>. The colour is applied uniformly to the indexed face.")
	@Required()
	@MinLength(1)
	@Guid("f4863512-f7e4-43f8-8add-5f016ad7c46d")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger> colourIndex = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger>();


	public IfcIndexedColourMap()
	{
	}

	public IfcIndexedColourMap(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet mappedTo, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgbList colours, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger[] colourIndex)
	{
		this.mappedTo = mappedTo;
		this.colours = colours;
		this.colourIndex = new ArrayList<>(Arrays.asList(colourIndex));
	}

	public com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet getMappedTo() {
		return this.mappedTo;
	}

	public void setMappedTo(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet mappedTo) {
		this.mappedTo = mappedTo;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getOpacity() {
		return this.opacity;
	}

	public void setOpacity(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure opacity) {
		this.opacity = opacity;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgbList getColours() {
		return this.colours;
	}

	public void setColours(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgbList colours) {
		this.colours = colours;
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger> getColourIndex() {
		return this.colourIndex;
	}


}

