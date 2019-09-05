// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7ea0af80-1628-45aa-92a8-1fdb01644edc")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcSurfaceTexture extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@JacksonXmlProperty(isAttribute=true, localName = "RepeatS")
	@Description("The <em>RepeatS</em> field specifies how the texture wraps in the S direction. If <em>RepeatS</em> is TRUE (the default), the texture map is repeated outside the [0.0, 1.0] texture coordinate range in the S direction so that it fills the shape. If <em>RepeatS</em> is FALSE, the texture coordinates are clamped in the S direction to lie within the [0.0, 1.0] range.  <br />")
	@Required()
	@Guid("083fc47c-3ee1-47b5-8bd3-40c028d4e31f")
	private Boolean repeatS;

	@JacksonXmlProperty(isAttribute=true, localName = "RepeatT")
	@Description("The <em>RepeatT</em> field specifies how the texture wraps in the T direction. If <em>RepeatT</em> is TRUE (the default), the texture map is repeated outside the [0.0, 1.0] texture coordinate range in the T direction so that it fills the shape. If <em>RepeatT</em> is FALSE, the texture coordinates are clamped in the T direction to lie within the [0.0, 1.0] range.   <br />")
	@Required()
	@Guid("b78c2d1e-ade1-4cfe-9ad0-600ac9e65db1")
	private Boolean repeatT;

	@JacksonXmlProperty(isAttribute=true, localName = "Mode")
	@Description("The <em>Mode</em> attribute is provided to control the appearance of a multi textures. The mode then controls the type of blending operation. The mode includes a MODULATE for a lit appearance, a REPLACE for a unlit appearance, and variations of the two.  <blockquote class=\"note\">NOTE&nbsp; The applicable values for the <em>Mode</em> attribute are determined by view definitions or implementer agreements. It is recommended to use the modes described in ISO/IES 19775-1.2:2008 X3D Architecture and base components Edition 2, Part 1. See <a href=\"http://www.web3d.org/x3d/specifications/ISO-IEC-19775-1.2-X3D-AbstractSpecification/Part01/components/texturing.html#MultiTexture\">18.4.3 MultiTexture</a> for recommended values.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute replacing previous TextureType.</blockquote>")
	@Guid("5e362a12-f3aa-4a27-8041-36d45f41f8cf")
	private String mode;

	@JacksonXmlProperty(isAttribute=false, localName = "TextureTransform")
	@Description("The <em>TextureTransform</em> defines a 2D transformation that is applied to the texture coordinates. It affects the way texture coordinates are applied to the surfaces of geometric representation itesm. The 2D transformation supports changes to the size, orientation, and position of textures on shapes. Mirroring is not allowed to be used in the <em>IfcCartesianTransformationOperator</em>")
	@Guid("c1cd6b51-2e24-4a4e-a44f-8b9143988a34")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D textureTransform;

	@JacksonXmlProperty(isAttribute=true, localName = "Parameter")
	@Description("The <em>Parameter</em> attribute is provided to control the appearance of a multi textures. The applicable parameters depend on the value of the <em>Mode</em> attribute.  <blockquote class=\"note\">NOTE&nbsp; The applicable values for the list of <em>Parameter</em> attributes are determined by view definitions or implementer agreements. It is recommended to use the source and the function fields described in ISO/IES 19775-1.2:2008 X3D Architecture and base components Edition 2, Part 1. See <a href=\"http://www.web3d.org/x3d/specifications/ISO-IEC-19775-1.2-X3D-AbstractSpecification/Part01/components/texturing.html#MultiTexture\">18.4.3 MultiTexture</a> for recommended values.<br />  By convention, <em>Parameter[1]</em> shall then hold the source value, <em>Parameter[2]</em> the function value, <em>Parameter[3]</em> the base RGB color for select operations, and <em>Parameter[4]</em> the alpha value for select operations.</blockquote>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.</blockquote>")
	@MinLength(1)
	@Guid("28993d40-b769-4a0e-ac66-25d2f615f04b")
	private List<String> parameter = new ArrayList<String>();

	@Description("Texture coordinates, either provided by a corresponding list of texture vertices to vertex-based geometric items or by a texture coordinate generator, that applies the surface texture to the surfaces of the geometric items.  <blackquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.</blockquote>")
	@Guid("7207873e-b05f-4ab2-9ec8-f54a10670e4d")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureCoordinate> isMappedBy = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureCoordinate>();

	@Guid("a01b593c-80bc-4abc-851a-3da9bfb93c5d")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleWithTextures> usedInStyles = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleWithTextures>();


	public IfcSurfaceTexture()
	{
	}

	public IfcSurfaceTexture(Boolean repeatS, Boolean repeatT)
	{
		this.repeatS = repeatS;
		this.repeatT = repeatT;
	}

	public Boolean getRepeatS() {
		return this.repeatS;
	}

	public void setRepeatS(Boolean repeatS) {
		this.repeatS = repeatS;
	}

	public Boolean getRepeatT() {
		return this.repeatT;
	}

	public void setRepeatT(Boolean repeatT) {
		this.repeatT = repeatT;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D getTextureTransform() {
		return this.textureTransform;
	}

	public void setTextureTransform(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator2D textureTransform) {
		this.textureTransform = textureTransform;
	}

	public List<String> getParameter() {
		return this.parameter;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureCoordinate> getIsMappedBy() {
		return this.isMappedBy;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleWithTextures> getUsedInStyles() {
		return this.usedInStyles;
	}


}

