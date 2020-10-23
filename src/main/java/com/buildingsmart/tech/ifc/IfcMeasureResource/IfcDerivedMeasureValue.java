// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@Guid("733e9b3e-2587-4a09-a749-f77cd563d967")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonSubTypes({@JsonSubTypes.Type(value = IfcVolumetricFlowRateMeasure.class, name = "IfcVolumetricFlowRateMeasure"),
        @JsonSubTypes.Type(value = IfcThermalTransmittanceMeasure.class, name = "IfcThermalTransmittanceMeasure"),
        @JsonSubTypes.Type(value = IfcThermalResistanceMeasure.class, name = "IfcThermalResistanceMeasure"),
        @JsonSubTypes.Type(value = IfcThermalAdmittanceMeasure.class, name = "IfcThermalAdmittanceMeasure"),
        @JsonSubTypes.Type(value = IfcPressureMeasure.class, name = "IfcPressureMeasure"),
        @JsonSubTypes.Type(value = IfcPowerMeasure.class, name = "IfcPowerMeasure"),
        @JsonSubTypes.Type(value = IfcMassFlowRateMeasure.class, name = "IfcMassFlowRateMeasure"),
        @JsonSubTypes.Type(value = IfcMassDensityMeasure.class, name = "IfcMassDensityMeasure"),
        @JsonSubTypes.Type(value = IfcLinearVelocityMeasure.class, name = "IfcLinearVelocityMeasure"),
        @JsonSubTypes.Type(value = IfcKinematicViscosityMeasure.class, name = "IfcKinematicViscosityMeasure"),
        @JsonSubTypes.Type(value = IfcIntegerCountRateMeasure.class, name = "IfcIntegerCountRateMeasure"),
        @JsonSubTypes.Type(value = IfcHeatFluxDensityMeasure.class, name = "IfcHeatFluxDensityMeasure"),
        @JsonSubTypes.Type(value = IfcFrequencyMeasure.class, name = "IfcFrequencyMeasure"),
        @JsonSubTypes.Type(value = IfcEnergyMeasure.class, name = "IfcEnergyMeasure"),
        @JsonSubTypes.Type(value = IfcElectricVoltageMeasure.class, name = "IfcElectricVoltageMeasure"),
        @JsonSubTypes.Type(value = IfcDynamicViscosityMeasure.class, name = "IfcDynamicViscosityMeasure"),
        @JsonSubTypes.Type(value = IfcCompoundPlaneAngleMeasure.class, name = "IfcCompoundPlaneAngleMeasure"),
        @JsonSubTypes.Type(value = IfcAngularVelocityMeasure.class, name = "IfcAngularVelocityMeasure"),
        @JsonSubTypes.Type(value = IfcThermalConductivityMeasure.class, name = "IfcThermalConductivityMeasure"),
        @JsonSubTypes.Type(value = IfcMolecularWeightMeasure.class, name = "IfcMolecularWeightMeasure"),
        @JsonSubTypes.Type(value = IfcVaporPermeabilityMeasure.class, name = "IfcVaporPermeabilityMeasure"),
        @JsonSubTypes.Type(value = IfcMoistureDiffusivityMeasure.class, name = "IfcMoistureDiffusivityMeasure"),
        @JsonSubTypes.Type(value = IfcIsothermalMoistureCapacityMeasure.class, name = "IfcIsothermalMoistureCapacityMeasure"),
        @JsonSubTypes.Type(value = IfcSpecificHeatCapacityMeasure.class, name = "IfcSpecificHeatCapacityMeasure"),
        @JsonSubTypes.Type(value = IfcMonetaryMeasure.class, name = "IfcMonetaryMeasure"),
        @JsonSubTypes.Type(value = IfcMagneticFluxDensityMeasure.class, name = "IfcMagneticFluxDensityMeasure"),
        @JsonSubTypes.Type(value = IfcMagneticFluxMeasure.class, name = "IfcMagneticFluxMeasure"),
        @JsonSubTypes.Type(value = IfcLuminousFluxMeasure.class, name = "IfcLuminousFluxMeasure"),
        @JsonSubTypes.Type(value = IfcForceMeasure.class, name = "IfcForceMeasure"),
        @JsonSubTypes.Type(value = IfcInductanceMeasure.class, name = "IfcInductanceMeasure"),
        @JsonSubTypes.Type(value = IfcIlluminanceMeasure.class, name = "IfcIlluminanceMeasure"),
        @JsonSubTypes.Type(value = IfcElectricResistanceMeasure.class, name = "IfcElectricResistanceMeasure"),
        @JsonSubTypes.Type(value = IfcElectricConductanceMeasure.class, name = "IfcElectricConductanceMeasure"),
        @JsonSubTypes.Type(value = IfcElectricChargeMeasure.class, name = "IfcElectricChargeMeasure"),
        @JsonSubTypes.Type(value = IfcDoseEquivalentMeasure.class, name = "IfcDoseEquivalentMeasure"),
        @JsonSubTypes.Type(value = IfcElectricCapacitanceMeasure.class, name = "IfcElectricCapacitanceMeasure"),
        @JsonSubTypes.Type(value = IfcAbsorbedDoseMeasure.class, name = "IfcAbsorbedDoseMeasure"),
        @JsonSubTypes.Type(value = IfcRadioActivityMeasure.class, name = "IfcRadioActivityMeasure"),
        @JsonSubTypes.Type(value = IfcRotationalFrequencyMeasure.class, name = "IfcRotationalFrequencyMeasure"),
        @JsonSubTypes.Type(value = IfcTorqueMeasure.class, name = "IfcTorqueMeasure"),
        @JsonSubTypes.Type(value = IfcAccelerationMeasure.class, name = "IfcAccelerationMeasure"),
        @JsonSubTypes.Type(value = IfcLinearForceMeasure.class, name = "IfcLinearForceMeasure"),
        @JsonSubTypes.Type(value = IfcLinearStiffnessMeasure.class, name = "IfcLinearStiffnessMeasure"),
        @JsonSubTypes.Type(value = IfcModulusOfSubgradeReactionMeasure.class, name = "IfcModulusOfSubgradeReactionMeasure"),
        @JsonSubTypes.Type(value = IfcModulusOfElasticityMeasure.class, name = "IfcModulusOfElasticityMeasure"),
        @JsonSubTypes.Type(value = IfcMomentOfInertiaMeasure.class, name = "IfcMomentOfInertiaMeasure"),
        @JsonSubTypes.Type(value = IfcPlanarForceMeasure.class, name = "IfcPlanarForceMeasure"),
        @JsonSubTypes.Type(value = IfcRotationalStiffnessMeasure.class, name = "IfcRotationalStiffnessMeasure"),
        @JsonSubTypes.Type(value = IfcShearModulusMeasure.class, name = "IfcShearModulusMeasure"),
        @JsonSubTypes.Type(value = IfcLinearMomentMeasure.class, name = "IfcLinearMomentMeasure"),
        @JsonSubTypes.Type(value = IfcLuminousIntensityDistributionMeasure.class, name = "IfcLuminousIntensityDistributionMeasure"),
        @JsonSubTypes.Type(value = IfcCurvatureMeasure.class, name = "IfcCurvatureMeasure"),
        @JsonSubTypes.Type(value = IfcMassPerLengthMeasure.class, name = "IfcMassPerLengthMeasure"),
        @JsonSubTypes.Type(value = IfcModulusOfLinearSubgradeReactionMeasure.class, name = "IfcModulusOfLinearSubgradeReactionMeasure"),
        @JsonSubTypes.Type(value = IfcModulusOfRotationalSubgradeReactionMeasure.class, name = "IfcModulusOfRotationalSubgradeReactionMeasure"),
        @JsonSubTypes.Type(value = IfcRotationalMassMeasure.class, name = "IfcRotationalMassMeasure"),
        @JsonSubTypes.Type(value = IfcSectionalAreaIntegralMeasure.class, name = "IfcSectionalAreaIntegralMeasure"),
        @JsonSubTypes.Type(value = IfcSectionModulusMeasure.class, name = "IfcSectionModulusMeasure"),
        @JsonSubTypes.Type(value = IfcTemperatureGradientMeasure.class, name = "IfcTemperatureGradientMeasure"),
        @JsonSubTypes.Type(value = IfcThermalExpansionCoefficientMeasure.class, name = "IfcThermalExpansionCoefficientMeasure"),
        @JsonSubTypes.Type(value = IfcWarpingConstantMeasure.class, name = "IfcWarpingConstantMeasure"),
        @JsonSubTypes.Type(value = IfcWarpingMomentMeasure.class, name = "IfcWarpingMomentMeasure"),
        @JsonSubTypes.Type(value = IfcSoundPowerMeasure.class, name = "IfcSoundPowerMeasure"),
        @JsonSubTypes.Type(value = IfcSoundPressureMeasure.class, name = "IfcSoundPressureMeasure"),
        @JsonSubTypes.Type(value = IfcHeatingValueMeasure.class, name = "IfcHeatingValueMeasure"),
        @JsonSubTypes.Type(value = IfcPHMeasure.class, name = "IfcPHMeasure"),
        @JsonSubTypes.Type(value = IfcIonConcentrationMeasure.class, name = "IfcIonConcentrationMeasure"),
        @JsonSubTypes.Type(value = IfcTemperatureRateOfChangeMeasure.class, name = "IfcTemperatureRateOfChangeMeasure"),
        @JsonSubTypes.Type(value = IfcAreaDensityMeasure.class, name = "IfcAreaDensityMeasure"),
        @JsonSubTypes.Type(value = IfcSoundPowerLevelMeasure.class, name = "IfcSoundPowerLevelMeasure"),
        @JsonSubTypes.Type(value = IfcSoundPressureLevelMeasure.class, name = "IfcSoundPressureLevelMeasure")})
public interface IfcDerivedMeasureValue extends IfcValue {

}
