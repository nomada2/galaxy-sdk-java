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
 * 表分片信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-26")
public class PartitionInfo implements libthrift091.TBase<PartitionInfo, PartitionInfo._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionInfo> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("PartitionInfo");

  private static final libthrift091.protocol.TField PUT_REQUEST_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("putRequestNumber", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField DELETE_REQUEST_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("deleteRequestNumber", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField INCREMENT_REQUEST_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("incrementRequestNumber", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField COLLECTED_EDIT_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("collectedEditNumber", libthrift091.protocol.TType.I64, (short)4);
  private static final libthrift091.protocol.TField RETRIEVED_EDIT_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("retrievedEditNumber", libthrift091.protocol.TType.I64, (short)5);
  private static final libthrift091.protocol.TField FULL_SCAN_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("fullScanNumber", libthrift091.protocol.TType.I64, (short)6);
  private static final libthrift091.protocol.TField COMPACTION_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("compactionNumber", libthrift091.protocol.TType.I64, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PartitionInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PartitionInfoTupleSchemeFactory());
  }

  public long putRequestNumber; // optional
  public long deleteRequestNumber; // optional
  public long incrementRequestNumber; // optional
  public long collectedEditNumber; // optional
  public long retrievedEditNumber; // optional
  public long fullScanNumber; // optional
  public long compactionNumber; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    PUT_REQUEST_NUMBER((short)1, "putRequestNumber"),
    DELETE_REQUEST_NUMBER((short)2, "deleteRequestNumber"),
    INCREMENT_REQUEST_NUMBER((short)3, "incrementRequestNumber"),
    COLLECTED_EDIT_NUMBER((short)4, "collectedEditNumber"),
    RETRIEVED_EDIT_NUMBER((short)5, "retrievedEditNumber"),
    FULL_SCAN_NUMBER((short)6, "fullScanNumber"),
    COMPACTION_NUMBER((short)7, "compactionNumber");

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
        case 1: // PUT_REQUEST_NUMBER
          return PUT_REQUEST_NUMBER;
        case 2: // DELETE_REQUEST_NUMBER
          return DELETE_REQUEST_NUMBER;
        case 3: // INCREMENT_REQUEST_NUMBER
          return INCREMENT_REQUEST_NUMBER;
        case 4: // COLLECTED_EDIT_NUMBER
          return COLLECTED_EDIT_NUMBER;
        case 5: // RETRIEVED_EDIT_NUMBER
          return RETRIEVED_EDIT_NUMBER;
        case 6: // FULL_SCAN_NUMBER
          return FULL_SCAN_NUMBER;
        case 7: // COMPACTION_NUMBER
          return COMPACTION_NUMBER;
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
  private static final int __PUTREQUESTNUMBER_ISSET_ID = 0;
  private static final int __DELETEREQUESTNUMBER_ISSET_ID = 1;
  private static final int __INCREMENTREQUESTNUMBER_ISSET_ID = 2;
  private static final int __COLLECTEDEDITNUMBER_ISSET_ID = 3;
  private static final int __RETRIEVEDEDITNUMBER_ISSET_ID = 4;
  private static final int __FULLSCANNUMBER_ISSET_ID = 5;
  private static final int __COMPACTIONNUMBER_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PUT_REQUEST_NUMBER,_Fields.DELETE_REQUEST_NUMBER,_Fields.INCREMENT_REQUEST_NUMBER,_Fields.COLLECTED_EDIT_NUMBER,_Fields.RETRIEVED_EDIT_NUMBER,_Fields.FULL_SCAN_NUMBER,_Fields.COMPACTION_NUMBER};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PUT_REQUEST_NUMBER, new libthrift091.meta_data.FieldMetaData("putRequestNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.DELETE_REQUEST_NUMBER, new libthrift091.meta_data.FieldMetaData("deleteRequestNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.INCREMENT_REQUEST_NUMBER, new libthrift091.meta_data.FieldMetaData("incrementRequestNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.COLLECTED_EDIT_NUMBER, new libthrift091.meta_data.FieldMetaData("collectedEditNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.RETRIEVED_EDIT_NUMBER, new libthrift091.meta_data.FieldMetaData("retrievedEditNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.FULL_SCAN_NUMBER, new libthrift091.meta_data.FieldMetaData("fullScanNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.COMPACTION_NUMBER, new libthrift091.meta_data.FieldMetaData("compactionNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(PartitionInfo.class, metaDataMap);
  }

  public PartitionInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionInfo(PartitionInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.putRequestNumber = other.putRequestNumber;
    this.deleteRequestNumber = other.deleteRequestNumber;
    this.incrementRequestNumber = other.incrementRequestNumber;
    this.collectedEditNumber = other.collectedEditNumber;
    this.retrievedEditNumber = other.retrievedEditNumber;
    this.fullScanNumber = other.fullScanNumber;
    this.compactionNumber = other.compactionNumber;
  }

  public PartitionInfo deepCopy() {
    return new PartitionInfo(this);
  }

  @Override
  public void clear() {
    setPutRequestNumberIsSet(false);
    this.putRequestNumber = 0;
    setDeleteRequestNumberIsSet(false);
    this.deleteRequestNumber = 0;
    setIncrementRequestNumberIsSet(false);
    this.incrementRequestNumber = 0;
    setCollectedEditNumberIsSet(false);
    this.collectedEditNumber = 0;
    setRetrievedEditNumberIsSet(false);
    this.retrievedEditNumber = 0;
    setFullScanNumberIsSet(false);
    this.fullScanNumber = 0;
    setCompactionNumberIsSet(false);
    this.compactionNumber = 0;
  }

  public long getPutRequestNumber() {
    return this.putRequestNumber;
  }

  public PartitionInfo setPutRequestNumber(long putRequestNumber) {
    this.putRequestNumber = putRequestNumber;
    setPutRequestNumberIsSet(true);
    return this;
  }

  public void unsetPutRequestNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PUTREQUESTNUMBER_ISSET_ID);
  }

  /** Returns true if field putRequestNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetPutRequestNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __PUTREQUESTNUMBER_ISSET_ID);
  }

  public void setPutRequestNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PUTREQUESTNUMBER_ISSET_ID, value);
  }

  public long getDeleteRequestNumber() {
    return this.deleteRequestNumber;
  }

  public PartitionInfo setDeleteRequestNumber(long deleteRequestNumber) {
    this.deleteRequestNumber = deleteRequestNumber;
    setDeleteRequestNumberIsSet(true);
    return this;
  }

  public void unsetDeleteRequestNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DELETEREQUESTNUMBER_ISSET_ID);
  }

  /** Returns true if field deleteRequestNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetDeleteRequestNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __DELETEREQUESTNUMBER_ISSET_ID);
  }

  public void setDeleteRequestNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DELETEREQUESTNUMBER_ISSET_ID, value);
  }

  public long getIncrementRequestNumber() {
    return this.incrementRequestNumber;
  }

  public PartitionInfo setIncrementRequestNumber(long incrementRequestNumber) {
    this.incrementRequestNumber = incrementRequestNumber;
    setIncrementRequestNumberIsSet(true);
    return this;
  }

  public void unsetIncrementRequestNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INCREMENTREQUESTNUMBER_ISSET_ID);
  }

  /** Returns true if field incrementRequestNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetIncrementRequestNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __INCREMENTREQUESTNUMBER_ISSET_ID);
  }

  public void setIncrementRequestNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INCREMENTREQUESTNUMBER_ISSET_ID, value);
  }

  public long getCollectedEditNumber() {
    return this.collectedEditNumber;
  }

  public PartitionInfo setCollectedEditNumber(long collectedEditNumber) {
    this.collectedEditNumber = collectedEditNumber;
    setCollectedEditNumberIsSet(true);
    return this;
  }

  public void unsetCollectedEditNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COLLECTEDEDITNUMBER_ISSET_ID);
  }

  /** Returns true if field collectedEditNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetCollectedEditNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __COLLECTEDEDITNUMBER_ISSET_ID);
  }

  public void setCollectedEditNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COLLECTEDEDITNUMBER_ISSET_ID, value);
  }

  public long getRetrievedEditNumber() {
    return this.retrievedEditNumber;
  }

  public PartitionInfo setRetrievedEditNumber(long retrievedEditNumber) {
    this.retrievedEditNumber = retrievedEditNumber;
    setRetrievedEditNumberIsSet(true);
    return this;
  }

  public void unsetRetrievedEditNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RETRIEVEDEDITNUMBER_ISSET_ID);
  }

  /** Returns true if field retrievedEditNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetRetrievedEditNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __RETRIEVEDEDITNUMBER_ISSET_ID);
  }

  public void setRetrievedEditNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RETRIEVEDEDITNUMBER_ISSET_ID, value);
  }

  public long getFullScanNumber() {
    return this.fullScanNumber;
  }

  public PartitionInfo setFullScanNumber(long fullScanNumber) {
    this.fullScanNumber = fullScanNumber;
    setFullScanNumberIsSet(true);
    return this;
  }

  public void unsetFullScanNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FULLSCANNUMBER_ISSET_ID);
  }

  /** Returns true if field fullScanNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetFullScanNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __FULLSCANNUMBER_ISSET_ID);
  }

  public void setFullScanNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FULLSCANNUMBER_ISSET_ID, value);
  }

  public long getCompactionNumber() {
    return this.compactionNumber;
  }

  public PartitionInfo setCompactionNumber(long compactionNumber) {
    this.compactionNumber = compactionNumber;
    setCompactionNumberIsSet(true);
    return this;
  }

  public void unsetCompactionNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMPACTIONNUMBER_ISSET_ID);
  }

  /** Returns true if field compactionNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetCompactionNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __COMPACTIONNUMBER_ISSET_ID);
  }

  public void setCompactionNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMPACTIONNUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PUT_REQUEST_NUMBER:
      if (value == null) {
        unsetPutRequestNumber();
      } else {
        setPutRequestNumber((Long)value);
      }
      break;

    case DELETE_REQUEST_NUMBER:
      if (value == null) {
        unsetDeleteRequestNumber();
      } else {
        setDeleteRequestNumber((Long)value);
      }
      break;

    case INCREMENT_REQUEST_NUMBER:
      if (value == null) {
        unsetIncrementRequestNumber();
      } else {
        setIncrementRequestNumber((Long)value);
      }
      break;

    case COLLECTED_EDIT_NUMBER:
      if (value == null) {
        unsetCollectedEditNumber();
      } else {
        setCollectedEditNumber((Long)value);
      }
      break;

    case RETRIEVED_EDIT_NUMBER:
      if (value == null) {
        unsetRetrievedEditNumber();
      } else {
        setRetrievedEditNumber((Long)value);
      }
      break;

    case FULL_SCAN_NUMBER:
      if (value == null) {
        unsetFullScanNumber();
      } else {
        setFullScanNumber((Long)value);
      }
      break;

    case COMPACTION_NUMBER:
      if (value == null) {
        unsetCompactionNumber();
      } else {
        setCompactionNumber((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PUT_REQUEST_NUMBER:
      return Long.valueOf(getPutRequestNumber());

    case DELETE_REQUEST_NUMBER:
      return Long.valueOf(getDeleteRequestNumber());

    case INCREMENT_REQUEST_NUMBER:
      return Long.valueOf(getIncrementRequestNumber());

    case COLLECTED_EDIT_NUMBER:
      return Long.valueOf(getCollectedEditNumber());

    case RETRIEVED_EDIT_NUMBER:
      return Long.valueOf(getRetrievedEditNumber());

    case FULL_SCAN_NUMBER:
      return Long.valueOf(getFullScanNumber());

    case COMPACTION_NUMBER:
      return Long.valueOf(getCompactionNumber());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PUT_REQUEST_NUMBER:
      return isSetPutRequestNumber();
    case DELETE_REQUEST_NUMBER:
      return isSetDeleteRequestNumber();
    case INCREMENT_REQUEST_NUMBER:
      return isSetIncrementRequestNumber();
    case COLLECTED_EDIT_NUMBER:
      return isSetCollectedEditNumber();
    case RETRIEVED_EDIT_NUMBER:
      return isSetRetrievedEditNumber();
    case FULL_SCAN_NUMBER:
      return isSetFullScanNumber();
    case COMPACTION_NUMBER:
      return isSetCompactionNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PartitionInfo)
      return this.equals((PartitionInfo)that);
    return false;
  }

  public boolean equals(PartitionInfo that) {
    if (that == null)
      return false;

    boolean this_present_putRequestNumber = true && this.isSetPutRequestNumber();
    boolean that_present_putRequestNumber = true && that.isSetPutRequestNumber();
    if (this_present_putRequestNumber || that_present_putRequestNumber) {
      if (!(this_present_putRequestNumber && that_present_putRequestNumber))
        return false;
      if (this.putRequestNumber != that.putRequestNumber)
        return false;
    }

    boolean this_present_deleteRequestNumber = true && this.isSetDeleteRequestNumber();
    boolean that_present_deleteRequestNumber = true && that.isSetDeleteRequestNumber();
    if (this_present_deleteRequestNumber || that_present_deleteRequestNumber) {
      if (!(this_present_deleteRequestNumber && that_present_deleteRequestNumber))
        return false;
      if (this.deleteRequestNumber != that.deleteRequestNumber)
        return false;
    }

    boolean this_present_incrementRequestNumber = true && this.isSetIncrementRequestNumber();
    boolean that_present_incrementRequestNumber = true && that.isSetIncrementRequestNumber();
    if (this_present_incrementRequestNumber || that_present_incrementRequestNumber) {
      if (!(this_present_incrementRequestNumber && that_present_incrementRequestNumber))
        return false;
      if (this.incrementRequestNumber != that.incrementRequestNumber)
        return false;
    }

    boolean this_present_collectedEditNumber = true && this.isSetCollectedEditNumber();
    boolean that_present_collectedEditNumber = true && that.isSetCollectedEditNumber();
    if (this_present_collectedEditNumber || that_present_collectedEditNumber) {
      if (!(this_present_collectedEditNumber && that_present_collectedEditNumber))
        return false;
      if (this.collectedEditNumber != that.collectedEditNumber)
        return false;
    }

    boolean this_present_retrievedEditNumber = true && this.isSetRetrievedEditNumber();
    boolean that_present_retrievedEditNumber = true && that.isSetRetrievedEditNumber();
    if (this_present_retrievedEditNumber || that_present_retrievedEditNumber) {
      if (!(this_present_retrievedEditNumber && that_present_retrievedEditNumber))
        return false;
      if (this.retrievedEditNumber != that.retrievedEditNumber)
        return false;
    }

    boolean this_present_fullScanNumber = true && this.isSetFullScanNumber();
    boolean that_present_fullScanNumber = true && that.isSetFullScanNumber();
    if (this_present_fullScanNumber || that_present_fullScanNumber) {
      if (!(this_present_fullScanNumber && that_present_fullScanNumber))
        return false;
      if (this.fullScanNumber != that.fullScanNumber)
        return false;
    }

    boolean this_present_compactionNumber = true && this.isSetCompactionNumber();
    boolean that_present_compactionNumber = true && that.isSetCompactionNumber();
    if (this_present_compactionNumber || that_present_compactionNumber) {
      if (!(this_present_compactionNumber && that_present_compactionNumber))
        return false;
      if (this.compactionNumber != that.compactionNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_putRequestNumber = true && (isSetPutRequestNumber());
    list.add(present_putRequestNumber);
    if (present_putRequestNumber)
      list.add(putRequestNumber);

    boolean present_deleteRequestNumber = true && (isSetDeleteRequestNumber());
    list.add(present_deleteRequestNumber);
    if (present_deleteRequestNumber)
      list.add(deleteRequestNumber);

    boolean present_incrementRequestNumber = true && (isSetIncrementRequestNumber());
    list.add(present_incrementRequestNumber);
    if (present_incrementRequestNumber)
      list.add(incrementRequestNumber);

    boolean present_collectedEditNumber = true && (isSetCollectedEditNumber());
    list.add(present_collectedEditNumber);
    if (present_collectedEditNumber)
      list.add(collectedEditNumber);

    boolean present_retrievedEditNumber = true && (isSetRetrievedEditNumber());
    list.add(present_retrievedEditNumber);
    if (present_retrievedEditNumber)
      list.add(retrievedEditNumber);

    boolean present_fullScanNumber = true && (isSetFullScanNumber());
    list.add(present_fullScanNumber);
    if (present_fullScanNumber)
      list.add(fullScanNumber);

    boolean present_compactionNumber = true && (isSetCompactionNumber());
    list.add(present_compactionNumber);
    if (present_compactionNumber)
      list.add(compactionNumber);

    return list.hashCode();
  }

  @Override
  public int compareTo(PartitionInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPutRequestNumber()).compareTo(other.isSetPutRequestNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPutRequestNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.putRequestNumber, other.putRequestNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeleteRequestNumber()).compareTo(other.isSetDeleteRequestNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleteRequestNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.deleteRequestNumber, other.deleteRequestNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncrementRequestNumber()).compareTo(other.isSetIncrementRequestNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncrementRequestNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.incrementRequestNumber, other.incrementRequestNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCollectedEditNumber()).compareTo(other.isSetCollectedEditNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCollectedEditNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.collectedEditNumber, other.collectedEditNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRetrievedEditNumber()).compareTo(other.isSetRetrievedEditNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetrievedEditNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.retrievedEditNumber, other.retrievedEditNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFullScanNumber()).compareTo(other.isSetFullScanNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFullScanNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.fullScanNumber, other.fullScanNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompactionNumber()).compareTo(other.isSetCompactionNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompactionNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.compactionNumber, other.compactionNumber);
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
    StringBuilder sb = new StringBuilder("PartitionInfo(");
    boolean first = true;

    if (isSetPutRequestNumber()) {
      sb.append("putRequestNumber:");
      sb.append(this.putRequestNumber);
      first = false;
    }
    if (isSetDeleteRequestNumber()) {
      if (!first) sb.append(", ");
      sb.append("deleteRequestNumber:");
      sb.append(this.deleteRequestNumber);
      first = false;
    }
    if (isSetIncrementRequestNumber()) {
      if (!first) sb.append(", ");
      sb.append("incrementRequestNumber:");
      sb.append(this.incrementRequestNumber);
      first = false;
    }
    if (isSetCollectedEditNumber()) {
      if (!first) sb.append(", ");
      sb.append("collectedEditNumber:");
      sb.append(this.collectedEditNumber);
      first = false;
    }
    if (isSetRetrievedEditNumber()) {
      if (!first) sb.append(", ");
      sb.append("retrievedEditNumber:");
      sb.append(this.retrievedEditNumber);
      first = false;
    }
    if (isSetFullScanNumber()) {
      if (!first) sb.append(", ");
      sb.append("fullScanNumber:");
      sb.append(this.fullScanNumber);
      first = false;
    }
    if (isSetCompactionNumber()) {
      if (!first) sb.append(", ");
      sb.append("compactionNumber:");
      sb.append(this.compactionNumber);
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

  private static class PartitionInfoStandardSchemeFactory implements SchemeFactory {
    public PartitionInfoStandardScheme getScheme() {
      return new PartitionInfoStandardScheme();
    }
  }

  private static class PartitionInfoStandardScheme extends StandardScheme<PartitionInfo> {

    public void read(libthrift091.protocol.TProtocol iprot, PartitionInfo struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PUT_REQUEST_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.putRequestNumber = iprot.readI64();
              struct.setPutRequestNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DELETE_REQUEST_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.deleteRequestNumber = iprot.readI64();
              struct.setDeleteRequestNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INCREMENT_REQUEST_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.incrementRequestNumber = iprot.readI64();
              struct.setIncrementRequestNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COLLECTED_EDIT_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.collectedEditNumber = iprot.readI64();
              struct.setCollectedEditNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RETRIEVED_EDIT_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.retrievedEditNumber = iprot.readI64();
              struct.setRetrievedEditNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // FULL_SCAN_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.fullScanNumber = iprot.readI64();
              struct.setFullScanNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // COMPACTION_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.compactionNumber = iprot.readI64();
              struct.setCompactionNumberIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, PartitionInfo struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPutRequestNumber()) {
        oprot.writeFieldBegin(PUT_REQUEST_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.putRequestNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDeleteRequestNumber()) {
        oprot.writeFieldBegin(DELETE_REQUEST_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.deleteRequestNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIncrementRequestNumber()) {
        oprot.writeFieldBegin(INCREMENT_REQUEST_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.incrementRequestNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCollectedEditNumber()) {
        oprot.writeFieldBegin(COLLECTED_EDIT_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.collectedEditNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRetrievedEditNumber()) {
        oprot.writeFieldBegin(RETRIEVED_EDIT_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.retrievedEditNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetFullScanNumber()) {
        oprot.writeFieldBegin(FULL_SCAN_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.fullScanNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCompactionNumber()) {
        oprot.writeFieldBegin(COMPACTION_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.compactionNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionInfoTupleSchemeFactory implements SchemeFactory {
    public PartitionInfoTupleScheme getScheme() {
      return new PartitionInfoTupleScheme();
    }
  }

  private static class PartitionInfoTupleScheme extends TupleScheme<PartitionInfo> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, PartitionInfo struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPutRequestNumber()) {
        optionals.set(0);
      }
      if (struct.isSetDeleteRequestNumber()) {
        optionals.set(1);
      }
      if (struct.isSetIncrementRequestNumber()) {
        optionals.set(2);
      }
      if (struct.isSetCollectedEditNumber()) {
        optionals.set(3);
      }
      if (struct.isSetRetrievedEditNumber()) {
        optionals.set(4);
      }
      if (struct.isSetFullScanNumber()) {
        optionals.set(5);
      }
      if (struct.isSetCompactionNumber()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetPutRequestNumber()) {
        oprot.writeI64(struct.putRequestNumber);
      }
      if (struct.isSetDeleteRequestNumber()) {
        oprot.writeI64(struct.deleteRequestNumber);
      }
      if (struct.isSetIncrementRequestNumber()) {
        oprot.writeI64(struct.incrementRequestNumber);
      }
      if (struct.isSetCollectedEditNumber()) {
        oprot.writeI64(struct.collectedEditNumber);
      }
      if (struct.isSetRetrievedEditNumber()) {
        oprot.writeI64(struct.retrievedEditNumber);
      }
      if (struct.isSetFullScanNumber()) {
        oprot.writeI64(struct.fullScanNumber);
      }
      if (struct.isSetCompactionNumber()) {
        oprot.writeI64(struct.compactionNumber);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, PartitionInfo struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.putRequestNumber = iprot.readI64();
        struct.setPutRequestNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.deleteRequestNumber = iprot.readI64();
        struct.setDeleteRequestNumberIsSet(true);
      }
      if (incoming.get(2)) {
        struct.incrementRequestNumber = iprot.readI64();
        struct.setIncrementRequestNumberIsSet(true);
      }
      if (incoming.get(3)) {
        struct.collectedEditNumber = iprot.readI64();
        struct.setCollectedEditNumberIsSet(true);
      }
      if (incoming.get(4)) {
        struct.retrievedEditNumber = iprot.readI64();
        struct.setRetrievedEditNumberIsSet(true);
      }
      if (incoming.get(5)) {
        struct.fullScanNumber = iprot.readI64();
        struct.setFullScanNumberIsSet(true);
      }
      if (incoming.get(6)) {
        struct.compactionNumber = iprot.readI64();
        struct.setCompactionNumberIsSet(true);
      }
    }
  }

}

