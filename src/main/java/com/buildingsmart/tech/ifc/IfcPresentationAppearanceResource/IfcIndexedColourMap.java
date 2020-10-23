// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("72a45e5a-521d-4b77-ba81-0938e73dffff")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIndexedColourMap extends IfcPresentationItem
{
	@Description("Reference to the <em>IfcTessellatedFaceSet</em> to which it applies the colours and alpha channel.")
	@DataMember(Order = 0)
	@Required()
	@Guid("46f7bd1c-d9b3-427b-b0c8-c3d9bcc29edd")
	@JsonIgnore
	private IfcTessellatedFaceSet mappedTo;

	@Description("The the opacity value, that applies equaly to all faces of the tessellated face set. 1.0 means opaque, and 0.0 completely transparent. If not provided, 1.0 is assumed (all colours are opque).    <blockquote class=\"note\">NOTE&nbsp; The definition of the alpha channel component for opacity follows the new definitions in image processing, where 0.0 means full transparency and 1.0 (or 2<sup>bit depths</sup> -1) means fully opaque. This is contrary to the definition of transparency in <i>IfcSurfaceStyleShading</i>.</blockquote>")
	@DataMember(Order = 1)
	@Guid("95d4d17c-ac0b-4a8d-9c90-545c63064df1")
	@JacksonXmlProperty(isAttribute=false, localName = "opacity")
	private IfcNormalisedRatioMeasure opacity;

	@Description("Indexable list of lists of quadruples, representing RGB colours.")
	@DataMember(Order = 2)
	@Required()
	@Guid("9098328d-ff84-4d4a-a892-224c18ad3d85")
	@JacksonXmlProperty(isAttribute=false, localName = "colours")
	private IfcColourRgbList colours;

	@Description("Index into the <em>IfcColourRgbList</em> for each face of the <em>IfcTriangulatedFaceSet</em>. The colour is applied uniformly to the indexed face.")
	@DataMember(Order = 3)
	@Required()
	@Guid("f4863512-f7e4-43f8-8add-5f016ad7c46d")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPositiveInteger")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "colourIndex")
	private List<IfcPositiveInteger> colourIndex;


	public IfcIndexedColourMap()
	{
	}

	public IfcIndexedColourMap(IfcTessellatedFaceSet mappedTo, IfcColourRgbList colours, IfcPositiveInteger[] colourIndex)
	{
		this.mappedTo = mappedTo;
		this.colours = colours;
		this.colourIndex = new ArrayList<>(Arrays.asList(colourIndex));
	}

	public IfcTessellatedFaceSet getMappedTo() {
		return this.mappedTo;
	}

	public void setMappedTo(IfcTessellatedFaceSet mappedTo) {
		this.mappedTo = mappedTo;
	}

	public IfcNormalisedRatioMeasure getOpacity() {
		return this.opacity;
	}

	public void setOpacity(IfcNormalisedRatioMeasure opacity) {
		this.opacity = opacity;
	}

	public IfcColourRgbList getColours() {
		return this.colours;
	}

	public void setColours(IfcColourRgbList colours) {
		this.colours = colours;
	}

	public List<IfcPositiveInteger> getColourIndex() {
		return this.colourIndex;
	}


}

