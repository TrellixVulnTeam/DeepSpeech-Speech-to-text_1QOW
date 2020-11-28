/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.mozilla.deepspeech.libdeepspeech;

/**
 * Stores the entire CTC output as an array of character metadata objects
 */
public class Metadata {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Metadata(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Metadata obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        implJNI.delete_Metadata(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  /**
   *  List of items 
   */
  public void setItems(MetadataItem value) {
    implJNI.Metadata_items_set(swigCPtr, this, MetadataItem.getCPtr(value), value);
  }

  /**
   *  List of items 
   */
  public MetadataItem getItems() {
    long cPtr = implJNI.Metadata_items_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MetadataItem(cPtr, false);
  }

  /**
   *  Size of the list of items 
   */
  public void setNum_items(int value) {
    implJNI.Metadata_num_items_set(swigCPtr, this, value);
  }

  /**
   *  Size of the list of items 
   */
  public int getNum_items() {
    return implJNI.Metadata_num_items_get(swigCPtr, this);
  }

  /**
   *  Approximated confidence value for this transcription. This is roughly the<br>
   * sum of the acoustic model logit values for each timestep/character that<br>
   * contributed to the creation of this transcription.
   */
  public void setConfidence(double value) {
    implJNI.Metadata_confidence_set(swigCPtr, this, value);
  }

  /**
   *  Approximated confidence value for this transcription. This is roughly the<br>
   * sum of the acoustic model logit values for each timestep/character that<br>
   * contributed to the creation of this transcription.
   */
  public double getConfidence() {
    return implJNI.Metadata_confidence_get(swigCPtr, this);
  }

  /**
   * Retrieve one MetadataItem element<br>
   * <br>
   * @param i Array index of the MetadataItem to get<br>
   * <br>
   * @return The MetadataItem requested or null
   */
  public MetadataItem getItem(int i) {
    return new MetadataItem(implJNI.Metadata_getItem(swigCPtr, this, i), true);
  }

}
