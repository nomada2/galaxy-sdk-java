/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * 表分区订阅统计信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-9")
public class SubscriberStatistics implements libthrift091.TBase<SubscriberStatistics, SubscriberStatistics._Fields>, java.io.Serializable, Cloneable, Comparable<SubscriberStatistics> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SubscriberStatistics");

  private static final libthrift091.protocol.TField CONSUMED_DATA_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("consumedDataNumber", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField COMMITTED_DATA_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("committedDataNumber", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField CONSUMED_EDIT_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("consumedEditNumber", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField COMMITTED_EDIT_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("committedEditNumber", libthrift091.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SubscriberStatisticsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SubscriberStatisticsTupleSchemeFactory());
  }

  public long consumedDataNumber; // optional
  public long committedDataNumber; // optional
  public long consumedEditNumber; // optional
  public long committedEditNumber; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    CONSUMED_DATA_NUMBER((short)1, "consumedDataNumber"),
    COMMITTED_DATA_NUMBER((short)2, "committedDataNumber"),
    CONSUMED_EDIT_NUMBER((short)3, "consumedEditNumber"),
    COMMITTED_EDIT_NUMBER((short)4, "committedEditNumber");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CONSUMED_DATA_NUMBER
          return CONSUMED_DATA_NUMBER;
        case 2: // COMMITTED_DATA_NUMBER
          return COMMITTED_DATA_NUMBER;
        case 3: // CONSUMED_EDIT_NUMBER
          return CONSUMED_EDIT_NUMBER;
        case 4: // COMMITTED_EDIT_NUMBER
          return COMMITTED_EDIT_NUMBER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CONSUMEDDATANUMBER_ISSET_ID = 0;
  private static final int __COMMITTEDDATANUMBER_ISSET_ID = 1;
  private static final int __CONSUMEDEDITNUMBER_ISSET_ID = 2;
  private static final int __COMMITTEDEDITNUMBER_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CONSUMED_DATA_NUMBER,_Fields.COMMITTED_DATA_NUMBER,_Fields.CONSUMED_EDIT_NUMBER,_Fields.COMMITTED_EDIT_NUMBER};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONSUMED_DATA_NUMBER, new libthrift091.meta_data.FieldMetaData("consumedDataNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.COMMITTED_DATA_NUMBER, new libthrift091.meta_data.FieldMetaData("committedDataNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.CONSUMED_EDIT_NUMBER, new libthrift091.meta_data.FieldMetaData("consumedEditNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.COMMITTED_EDIT_NUMBER, new libthrift091.meta_data.FieldMetaData("committedEditNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SubscriberStatistics.class, metaDataMap);
  }

  public SubscriberStatistics() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SubscriberStatistics(SubscriberStatistics other) {
    __isset_bitfield = other.__isset_bitfield;
    this.consumedDataNumber = other.consumedDataNumber;
    this.committedDataNumber = other.committedDataNumber;
    this.consumedEditNumber = other.consumedEditNumber;
    this.committedEditNumber = other.committedEditNumber;
  }

  public SubscriberStatistics deepCopy() {
    return new SubscriberStatistics(this);
  }

  @Override
  public void clear() {
    setConsumedDataNumberIsSet(false);
    this.consumedDataNumber = 0;
    setCommittedDataNumberIsSet(false);
    this.committedDataNumber = 0;
    setConsumedEditNumberIsSet(false);
    this.consumedEditNumber = 0;
    setCommittedEditNumberIsSet(false);
    this.committedEditNumber = 0;
  }

  public long getConsumedDataNumber() {
    return this.consumedDataNumber;
  }

  public SubscriberStatistics setConsumedDataNumber(long consumedDataNumber) {
    this.consumedDataNumber = consumedDataNumber;
    setConsumedDataNumberIsSet(true);
    return this;
  }

  public void unsetConsumedDataNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONSUMEDDATANUMBER_ISSET_ID);
  }

  /** Returns true if field consumedDataNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetConsumedDataNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __CONSUMEDDATANUMBER_ISSET_ID);
  }

  public void setConsumedDataNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONSUMEDDATANUMBER_ISSET_ID, value);
  }

  public long getCommittedDataNumber() {
    return this.committedDataNumber;
  }

  public SubscriberStatistics setCommittedDataNumber(long committedDataNumber) {
    this.committedDataNumber = committedDataNumber;
    setCommittedDataNumberIsSet(true);
    return this;
  }

  public void unsetCommittedDataNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMMITTEDDATANUMBER_ISSET_ID);
  }

  /** Returns true if field committedDataNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetCommittedDataNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __COMMITTEDDATANUMBER_ISSET_ID);
  }

  public void setCommittedDataNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMMITTEDDATANUMBER_ISSET_ID, value);
  }

  public long getConsumedEditNumber() {
    return this.consumedEditNumber;
  }

  public SubscriberStatistics setConsumedEditNumber(long consumedEditNumber) {
    this.consumedEditNumber = consumedEditNumber;
    setConsumedEditNumberIsSet(true);
    return this;
  }

  public void unsetConsumedEditNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONSUMEDEDITNUMBER_ISSET_ID);
  }

  /** Returns true if field consumedEditNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetConsumedEditNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __CONSUMEDEDITNUMBER_ISSET_ID);
  }

  public void setConsumedEditNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONSUMEDEDITNUMBER_ISSET_ID, value);
  }

  public long getCommittedEditNumber() {
    return this.committedEditNumber;
  }

  public SubscriberStatistics setCommittedEditNumber(long committedEditNumber) {
    this.committedEditNumber = committedEditNumber;
    setCommittedEditNumberIsSet(true);
    return this;
  }

  public void unsetCommittedEditNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMMITTEDEDITNUMBER_ISSET_ID);
  }

  /** Returns true if field committedEditNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetCommittedEditNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __COMMITTEDEDITNUMBER_ISSET_ID);
  }

  public void setCommittedEditNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMMITTEDEDITNUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONSUMED_DATA_NUMBER:
      if (value == null) {
        unsetConsumedDataNumber();
      } else {
        setConsumedDataNumber((Long)value);
      }
      break;

    case COMMITTED_DATA_NUMBER:
      if (value == null) {
        unsetCommittedDataNumber();
      } else {
        setCommittedDataNumber((Long)value);
      }
      break;

    case CONSUMED_EDIT_NUMBER:
      if (value == null) {
        unsetConsumedEditNumber();
      } else {
        setConsumedEditNumber((Long)value);
      }
      break;

    case COMMITTED_EDIT_NUMBER:
      if (value == null) {
        unsetCommittedEditNumber();
      } else {
        setCommittedEditNumber((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONSUMED_DATA_NUMBER:
      return Long.valueOf(getConsumedDataNumber());

    case COMMITTED_DATA_NUMBER:
      return Long.valueOf(getCommittedDataNumber());

    case CONSUMED_EDIT_NUMBER:
      return Long.valueOf(getConsumedEditNumber());

    case COMMITTED_EDIT_NUMBER:
      return Long.valueOf(getCommittedEditNumber());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONSUMED_DATA_NUMBER:
      return isSetConsumedDataNumber();
    case COMMITTED_DATA_NUMBER:
      return isSetCommittedDataNumber();
    case CONSUMED_EDIT_NUMBER:
      return isSetConsumedEditNumber();
    case COMMITTED_EDIT_NUMBER:
      return isSetCommittedEditNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SubscriberStatistics)
      return this.equals((SubscriberStatistics)that);
    return false;
  }

  public boolean equals(SubscriberStatistics that) {
    if (that == null)
      return false;

    boolean this_present_consumedDataNumber = true && this.isSetConsumedDataNumber();
    boolean that_present_consumedDataNumber = true && that.isSetConsumedDataNumber();
    if (this_present_consumedDataNumber || that_present_consumedDataNumber) {
      if (!(this_present_consumedDataNumber && that_present_consumedDataNumber))
        return false;
      if (this.consumedDataNumber != that.consumedDataNumber)
        return false;
    }

    boolean this_present_committedDataNumber = true && this.isSetCommittedDataNumber();
    boolean that_present_committedDataNumber = true && that.isSetCommittedDataNumber();
    if (this_present_committedDataNumber || that_present_committedDataNumber) {
      if (!(this_present_committedDataNumber && that_present_committedDataNumber))
        return false;
      if (this.committedDataNumber != that.committedDataNumber)
        return false;
    }

    boolean this_present_consumedEditNumber = true && this.isSetConsumedEditNumber();
    boolean that_present_consumedEditNumber = true && that.isSetConsumedEditNumber();
    if (this_present_consumedEditNumber || that_present_consumedEditNumber) {
      if (!(this_present_consumedEditNumber && that_present_consumedEditNumber))
        return false;
      if (this.consumedEditNumber != that.consumedEditNumber)
        return false;
    }

    boolean this_present_committedEditNumber = true && this.isSetCommittedEditNumber();
    boolean that_present_committedEditNumber = true && that.isSetCommittedEditNumber();
    if (this_present_committedEditNumber || that_present_committedEditNumber) {
      if (!(this_present_committedEditNumber && that_present_committedEditNumber))
        return false;
      if (this.committedEditNumber != that.committedEditNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_consumedDataNumber = true && (isSetConsumedDataNumber());
    list.add(present_consumedDataNumber);
    if (present_consumedDataNumber)
      list.add(consumedDataNumber);

    boolean present_committedDataNumber = true && (isSetCommittedDataNumber());
    list.add(present_committedDataNumber);
    if (present_committedDataNumber)
      list.add(committedDataNumber);

    boolean present_consumedEditNumber = true && (isSetConsumedEditNumber());
    list.add(present_consumedEditNumber);
    if (present_consumedEditNumber)
      list.add(consumedEditNumber);

    boolean present_committedEditNumber = true && (isSetCommittedEditNumber());
    list.add(present_committedEditNumber);
    if (present_committedEditNumber)
      list.add(committedEditNumber);

    return list.hashCode();
  }

  @Override
  public int compareTo(SubscriberStatistics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetConsumedDataNumber()).compareTo(other.isSetConsumedDataNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConsumedDataNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.consumedDataNumber, other.consumedDataNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCommittedDataNumber()).compareTo(other.isSetCommittedDataNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommittedDataNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.committedDataNumber, other.committedDataNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConsumedEditNumber()).compareTo(other.isSetConsumedEditNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConsumedEditNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.consumedEditNumber, other.consumedEditNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCommittedEditNumber()).compareTo(other.isSetCommittedEditNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommittedEditNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.committedEditNumber, other.committedEditNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SubscriberStatistics(");
    boolean first = true;

    if (isSetConsumedDataNumber()) {
      sb.append("consumedDataNumber:");
      sb.append(this.consumedDataNumber);
      first = false;
    }
    if (isSetCommittedDataNumber()) {
      if (!first) sb.append(", ");
      sb.append("committedDataNumber:");
      sb.append(this.committedDataNumber);
      first = false;
    }
    if (isSetConsumedEditNumber()) {
      if (!first) sb.append(", ");
      sb.append("consumedEditNumber:");
      sb.append(this.consumedEditNumber);
      first = false;
    }
    if (isSetCommittedEditNumber()) {
      if (!first) sb.append(", ");
      sb.append("committedEditNumber:");
      sb.append(this.committedEditNumber);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SubscriberStatisticsStandardSchemeFactory implements SchemeFactory {
    public SubscriberStatisticsStandardScheme getScheme() {
      return new SubscriberStatisticsStandardScheme();
    }
  }

  private static class SubscriberStatisticsStandardScheme extends StandardScheme<SubscriberStatistics> {

    public void read(libthrift091.protocol.TProtocol iprot, SubscriberStatistics struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONSUMED_DATA_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.consumedDataNumber = iprot.readI64();
              struct.setConsumedDataNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMMITTED_DATA_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.committedDataNumber = iprot.readI64();
              struct.setCommittedDataNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONSUMED_EDIT_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.consumedEditNumber = iprot.readI64();
              struct.setConsumedEditNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COMMITTED_EDIT_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.committedEditNumber = iprot.readI64();
              struct.setCommittedEditNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, SubscriberStatistics struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetConsumedDataNumber()) {
        oprot.writeFieldBegin(CONSUMED_DATA_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.consumedDataNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCommittedDataNumber()) {
        oprot.writeFieldBegin(COMMITTED_DATA_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.committedDataNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetConsumedEditNumber()) {
        oprot.writeFieldBegin(CONSUMED_EDIT_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.consumedEditNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCommittedEditNumber()) {
        oprot.writeFieldBegin(COMMITTED_EDIT_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.committedEditNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SubscriberStatisticsTupleSchemeFactory implements SchemeFactory {
    public SubscriberStatisticsTupleScheme getScheme() {
      return new SubscriberStatisticsTupleScheme();
    }
  }

  private static class SubscriberStatisticsTupleScheme extends TupleScheme<SubscriberStatistics> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SubscriberStatistics struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetConsumedDataNumber()) {
        optionals.set(0);
      }
      if (struct.isSetCommittedDataNumber()) {
        optionals.set(1);
      }
      if (struct.isSetConsumedEditNumber()) {
        optionals.set(2);
      }
      if (struct.isSetCommittedEditNumber()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetConsumedDataNumber()) {
        oprot.writeI64(struct.consumedDataNumber);
      }
      if (struct.isSetCommittedDataNumber()) {
        oprot.writeI64(struct.committedDataNumber);
      }
      if (struct.isSetConsumedEditNumber()) {
        oprot.writeI64(struct.consumedEditNumber);
      }
      if (struct.isSetCommittedEditNumber()) {
        oprot.writeI64(struct.committedEditNumber);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SubscriberStatistics struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.consumedDataNumber = iprot.readI64();
        struct.setConsumedDataNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.committedDataNumber = iprot.readI64();
        struct.setCommittedDataNumberIsSet(true);
      }
      if (incoming.get(2)) {
        struct.consumedEditNumber = iprot.readI64();
        struct.setConsumedEditNumberIsSet(true);
      }
      if (incoming.get(3)) {
        struct.committedEditNumber = iprot.readI64();
        struct.setCommittedEditNumberIsSet(true);
      }
    }
  }

}

