package com.oculusvr.api;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : OVR_CAPI.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ovrPoseStatef_ extends Structure {
  /** C type : ovrPosef */
  public ovrPosef_ Pose;
  /** C type : ovrVector3f */
  public ovrVector3f_ AngularVelocity;
  /** C type : ovrVector3f */
  public ovrVector3f_ LinearVelocity;
  /** C type : ovrVector3f */
  public ovrVector3f_ AngularAcceleration;
  /** C type : ovrVector3f */
  public ovrVector3f_ LinearAcceleration;
  /** Absolute time of this state sample. */
  public double TimeInSeconds;
  public ovrPoseStatef_() {
    super();
  }
  protected List<? > getFieldOrder() {
    return Arrays.asList("Pose", "AngularVelocity", "LinearVelocity", "AngularAcceleration", "LinearAcceleration", "TimeInSeconds");
  }
  /**
   * @param Pose C type : ovrPosef<br>
   * @param AngularVelocity C type : ovrVector3f<br>
   * @param LinearVelocity C type : ovrVector3f<br>
   * @param AngularAcceleration C type : ovrVector3f<br>
   * @param LinearAcceleration C type : ovrVector3f<br>
   * @param TimeInSeconds Absolute time of this state sample.
   */
  public ovrPoseStatef_(ovrPosef_ Pose, ovrVector3f_ AngularVelocity, ovrVector3f_ LinearVelocity, ovrVector3f_ AngularAcceleration, ovrVector3f_ LinearAcceleration, double TimeInSeconds) {
    super();
    this.Pose = Pose;
    this.AngularVelocity = AngularVelocity;
    this.LinearVelocity = LinearVelocity;
    this.AngularAcceleration = AngularAcceleration;
    this.LinearAcceleration = LinearAcceleration;
    this.TimeInSeconds = TimeInSeconds;
  }
  public static class ByReference extends ovrPoseStatef_ implements Structure.ByReference {
    
  };
  public static class ByValue extends ovrPoseStatef_ implements Structure.ByValue {
    
  };
}