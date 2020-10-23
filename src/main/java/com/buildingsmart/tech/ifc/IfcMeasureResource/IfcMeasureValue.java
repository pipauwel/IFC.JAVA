// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@Guid("569e5cd1-78ab-4ea1-846f-1b2a40319321")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonSubTypes({@JsonSubTypes.Type(value = IfcVolumetricFlowRateMeasure.class, name = "IfcVolumetricFlowRateMeasure"),
        @JsonSubTypes.Type(value = IfcVolumeMeasure.class, name = "IfcVolumeMeasure"),
        @JsonSubTypes.Type(value = IfcTimeMeasure.class, name = "IfcTimeMeasure"),
        @JsonSubTypes.Type(value = IfcThermodynamicTemperatureMeasure.class, name = "IfcThermodynamicTemperatureMeasure"),
        @JsonSubTypes.Type(value = IfcSolidAngleMeasure.class, name = "IfcSolidAngleMeasure"),
        @JsonSubTypes.Type(value = IfcPositiveRatioMeasure.class, name = "IfcPositiveRatioMeasure"),
        @JsonSubTypes.Type(value = IfcRatioMeasure.class, name = "IfcRatioMeasure"),
        @JsonSubTypes.Type(value = IfcPositivePlaneAngleMeasure.class, name = "IfcPositivePlaneAngleMeasure"),
        @JsonSubTypes.Type(value = IfcPlaneAngleMeasure.class, name = "IfcPlaneAngleMeasure"),
        @JsonSubTypes.Type(value = IfcParameterValue.class, name = "IfcParameterValue"),
        @JsonSubTypes.Type(value = IfcNumericMeasure.class, name = "IfcNumericMeasure"),
        @JsonSubTypes.Type(value = IfcMassMeasure.class, name = "IfcMassMeasure"),
        @JsonSubTypes.Type(value = IfcPositiveLengthMeasure.class, name = "IfcPositiveLengthMeasure"),
        @JsonSubTypes.Type(value = IfcLengthMeasure.class, name = "IfcLengthMeasure"),
        @JsonSubTypes.Type(value = IfcElectricCurrentMeasure.class, name = "IfcElectricCurrentMeasure"),
        @JsonSubTypes.Type(value = IfcDescriptiveMeasure.class, name = "IfcDescriptiveMeasure"),
        @JsonSubTypes.Type(value = IfcCountMeasure.class, name = "IfcCountMeasure"),
        @JsonSubTypes.Type(value = IfcContextDependentMeasure.class, name = "IfcContextDependentMeasure"),
        @JsonSubTypes.Type(value = IfcAreaMeasure.class, name = "IfcAreaMeasure"),
        @JsonSubTypes.Type(value = IfcAmountOfSubstanceMeasure.class, name = "IfcAmountOfSubstanceMeasure"),
        @JsonSubTypes.Type(value = IfcLuminousIntensityMeasure.class, name = "IfcLuminousIntensityMeasure"),
        @JsonSubTypes.Type(value = IfcNormalisedRatioMeasure.class, name = "IfcNormalisedRatioMeasure"),
        @JsonSubTypes.Type(value = IfcComplexNumber.class, name = "IfcComplexNumber"),
        @JsonSubTypes.Type(value = IfcNonNegativeLengthMeasure.class, name = "IfcNonNegativeLengthMeasure")})
public interface IfcMeasureValue extends IfcValue {

}
