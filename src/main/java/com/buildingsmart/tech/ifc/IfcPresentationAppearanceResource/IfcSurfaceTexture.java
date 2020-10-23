// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;
import java.util.Set;

@Guid("7ea0af80-1628-45aa-92a8-1fdb01644edc")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBlobTexture.class, name = "IfcBlobTexture"), @JsonSubTypes.Type(value = IfcImageTexture.class, name = "IfcImageTexture"), @JsonSubTypes.Type(value = IfcPixelTexture.class, name = "IfcPixelTexture")})
public abstract class IfcSurfaceTexture extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@Description("The <em>RepeatS</em> field specifies how the texture wraps in the S direction. If <em>RepeatS</em> is TRUE (the default), the texture map is repeated outside the [0.0, 1.0] texture coordinate range in the S direction so that it fills the shape. If <em>RepeatS</em> is FALSE, the texture coordinates are clamped in the S direction to lie within the [0.0, 1.0] range.  <br />")
	@DataMember(Order = 0)
	@Required()
	@Guid("083fc47c-3ee1-47b5-8bd3-40c028d4e31f")
	@JacksonXmlProperty(isAttribute=false, localName = "repeatS")
	private IfcBoolean repeatS;

	@Description("The <em>RepeatT</em> field specifies how the texture wraps in the T direction. If <em>RepeatT</em> is TRUE (the default), the texture map is repeated outside the [0.0, 1.0] texture coordinate range in the T direction so that it fills the shape. If <em>RepeatT</em> is FALSE, the texture coordinates are clamped in the T direction to lie within the [0.0, 1.0] range.   <br />")
	@DataMember(Order = 1)
	@Required()
	@Guid("b78c2d1e-ade1-4cfe-9ad0-600ac9e65db1")
	@JacksonXmlProperty(isAttribute=false, localName = "repeatT")
	private IfcBoolean repeatT;

	@Description("The <em>Mode</em> attribute is provided to control the appearance of a multi textures. The mode then controls the type of blending operation. The mode includes a MODULATE for a lit appearance, a REPLACE for a unlit appearance, and variations of the two.  <blockquote class=\"note\">NOTE&nbsp; The applicable values for the <em>Mode</em> attribute are determined by view definitions or implementer agreements. It is recommended to use the modes described in ISO/IES 19775-1.2:2008 X3D Architecture and base components Edition 2, Part 1. See <a href=\"http://www.web3d.org/x3d/specifications/ISO-IEC-19775-1.2-X3D-AbstractSpecification/Part01/components/texturing.html#MultiTexture\">18.4.3 MultiTexture</a> for recommended values.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute replacing previous TextureType.</blockquote>")
	@DataMember(Order = 2)
	@Guid("5e362a12-f3aa-4a27-8041-36d45f41f8cf")
	@JacksonXmlProperty(isAttribute=false, localName = "mode")
	private IfcIdentifier mode;

	@Description("The <em>TextureTransform</em> defines a 2D transformation that is applied to the texture coordinates. It affects the way texture coordinates are applied to the surfaces of geometric representation itesm. The 2D transformation supports changes to the size, orientation, and position of textures on shapes. Mirroring is not allowed to be used in the <em>IfcCartesianTransformationOperator</em>")
	@DataMember(Order = 3)
	@Guid("c1cd6b51-2e24-4a4e-a44f-8b9143988a34")
	@JacksonXmlProperty(isAttribute=false, localName = "textureTransform")
	private IfcCartesianTransformationOperator2D textureTransform;

	@Description("The <em>Parameter</em> attribute is provided to control the appearance of a multi textures. The applicable parameters depend on the value of the <em>Mode</em> attribute.  <blockquote class=\"note\">NOTE&nbsp; The applicable values for the list of <em>Parameter</em> attributes are determined by view definitions or implementer agreements. It is recommended to use the source and the function fields described in ISO/IES 19775-1.2:2008 X3D Architecture and base components Edition 2, Part 1. See <a href=\"http://www.web3d.org/x3d/specifications/ISO-IEC-19775-1.2-X3D-AbstractSpecification/Part01/components/texturing.html#MultiTexture\">18.4.3 MultiTexture</a> for recommended values.<br />  By convention, <em>Parameter[1]</em> shall then hold the source value, <em>Parameter[2]</em> the function value, <em>Parameter[3]</em> the base RGB color for select operations, and <em>Parameter[4]</em> the alpha value for select operations.</blockquote>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.</blockquote>")
	@DataMember(Order = 4)
	@Guid("28993d40-b769-4a0e-ac66-25d2f615f04b")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcIdentifier")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "parameter")
	private List<IfcIdentifier> parameter;

	@Description("Texture coordinates, either provided by a corresponding list of texture vertices to vertex-based geometric items or by a texture coordinate generator, that applies the surface texture to the surfaces of the geometric items.  <blackquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.</blockquote>")
	@InverseProperty(InverseProp = "maps", Range = "IfcTextureCoordinate")
	@Guid("7207873e-b05f-4ab2-9ec8-f54a10670e4d")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcTextureCoordinate")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "isMappedBy")*/
	@JsonIgnore
	private Set<IfcTextureCoordinate> isMappedBy;

	@InverseProperty(InverseProp = "textures", Range = "IfcSurfaceStyleWithTextures")
	@Guid("a01b593c-80bc-4abc-851a-3da9bfb93c5d")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcSurfaceStyleWithTextures")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "usedInStyles")*/
	@JsonIgnore
	private Set<IfcSurfaceStyleWithTextures> usedInStyles;


	public IfcSurfaceTexture()
	{
	}

	public IfcSurfaceTexture(IfcBoolean repeatS, IfcBoolean repeatT)
	{
		this.repeatS = repeatS;
		this.repeatT = repeatT;
	}

	public IfcBoolean getRepeatS() {
		return this.repeatS;
	}

	public void setRepeatS(IfcBoolean repeatS) {
		this.repeatS = repeatS;
	}

	public IfcBoolean getRepeatT() {
		return this.repeatT;
	}

	public void setRepeatT(IfcBoolean repeatT) {
		this.repeatT = repeatT;
	}

	public IfcIdentifier getMode() {
		return this.mode;
	}

	public void setMode(IfcIdentifier mode) {
		this.mode = mode;
	}

	public IfcCartesianTransformationOperator2D getTextureTransform() {
		return this.textureTransform;
	}

	public void setTextureTransform(IfcCartesianTransformationOperator2D textureTransform) {
		this.textureTransform = textureTransform;
	}

	public List<IfcIdentifier> getParameter() {
		return this.parameter;
	}

	public Set<IfcTextureCoordinate> getIsMappedBy() {
		return this.isMappedBy;
	}

	public Set<IfcSurfaceStyleWithTextures> getUsedInStyles() {
		return this.usedInStyles;
	}


}

