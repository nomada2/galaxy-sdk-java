/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-11-18")
public class ListPermissionResponse implements libthrift091.TBase<ListPermissionResponse, ListPermissionResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ListPermissionResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ListPermissionResponse");

  private static final libthrift091.protocol.TField PERMISSIONS_FIELD_DESC = new libthrift091.protocol.TField("permissions", libthrift091.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ListPermissionResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ListPermissionResponseTupleSchemeFactory());
  }

  public Map<String,Permission> permissions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    PERMISSIONS((short)1, "permissions");

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
        case 1: // PERMISSIONS
          return PERMISSIONS;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERMISSIONS, new libthrift091.meta_data.FieldMetaData("permissions", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Permission.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ListPermissionResponse.class, metaDataMap);
  }

  public ListPermissionResponse() {
  }

  public ListPermissionResponse(
    Map<String,Permission> permissions)
  {
    this();
    this.permissions = permissions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListPermissionResponse(ListPermissionResponse other) {
    if (other.isSetPermissions()) {
      Map<String,Permission> __this__permissions = new HashMap<String,Permission>(other.permissions.size());
      for (Map.Entry<String, Permission> other_element : other.permissions.entrySet()) {

        String other_element_key = other_element.getKey();
        Permission other_element_value = other_element.getValue();

        String __this__permissions_copy_key = other_element_key;

        Permission __this__permissions_copy_value = other_element_value;

        __this__permissions.put(__this__permissions_copy_key, __this__permissions_copy_value);
      }
      this.permissions = __this__permissions;
    }
  }

  public ListPermissionResponse deepCopy() {
    return new ListPermissionResponse(this);
  }

  @Override
  public void clear() {
    this.permissions = null;
  }

  public int getPermissionsSize() {
    return (this.permissions == null) ? 0 : this.permissions.size();
  }

  public void putToPermissions(String key, Permission val) {
    if (this.permissions == null) {
      this.permissions = new HashMap<String,Permission>();
    }
    this.permissions.put(key, val);
  }

  public Map<String,Permission> getPermissions() {
    return this.permissions;
  }

  public ListPermissionResponse setPermissions(Map<String,Permission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public void unsetPermissions() {
    this.permissions = null;
  }

  /** Returns true if field permissions is set (has been assigned a value) and false otherwise */
  public boolean isSetPermissions() {
    return this.permissions != null;
  }

  public void setPermissionsIsSet(boolean value) {
    if (!value) {
      this.permissions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PERMISSIONS:
      if (value == null) {
        unsetPermissions();
      } else {
        setPermissions((Map<String,Permission>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PERMISSIONS:
      return getPermissions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PERMISSIONS:
      return isSetPermissions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListPermissionResponse)
      return this.equals((ListPermissionResponse)that);
    return false;
  }

  public boolean equals(ListPermissionResponse that) {
    if (that == null)
      return false;

    boolean this_present_permissions = true && this.isSetPermissions();
    boolean that_present_permissions = true && that.isSetPermissions();
    if (this_present_permissions || that_present_permissions) {
      if (!(this_present_permissions && that_present_permissions))
        return false;
      if (!this.permissions.equals(that.permissions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_permissions = true && (isSetPermissions());
    list.add(present_permissions);
    if (present_permissions)
      list.add(permissions);

    return list.hashCode();
  }

  @Override
  public int compareTo(ListPermissionResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPermissions()).compareTo(other.isSetPermissions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermissions()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.permissions, other.permissions);
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
    StringBuilder sb = new StringBuilder("ListPermissionResponse(");
    boolean first = true;

    sb.append("permissions:");
    if (this.permissions == null) {
      sb.append("null");
    } else {
      sb.append(this.permissions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (permissions == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'permissions' was not present! Struct: " + toString());
    }
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ListPermissionResponseStandardSchemeFactory implements SchemeFactory {
    public ListPermissionResponseStandardScheme getScheme() {
      return new ListPermissionResponseStandardScheme();
    }
  }

  private static class ListPermissionResponseStandardScheme extends StandardScheme<ListPermissionResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, ListPermissionResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERMISSIONS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map74 = iprot.readMapBegin();
                struct.permissions = new HashMap<String,Permission>(2*_map74.size);
                String _key75;
                Permission _val76;
                for (int _i77 = 0; _i77 < _map74.size; ++_i77)
                {
                  _key75 = iprot.readString();
                  _val76 = com.xiaomi.infra.galaxy.emr.thrift.Permission.findByValue(iprot.readI32());
                  struct.permissions.put(_key75, _val76);
                }
                iprot.readMapEnd();
              }
              struct.setPermissionsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ListPermissionResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.permissions != null) {
        oprot.writeFieldBegin(PERMISSIONS_FIELD_DESC);
        {
          oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.I32, struct.permissions.size()));
          for (Map.Entry<String, Permission> _iter78 : struct.permissions.entrySet())
          {
            oprot.writeString(_iter78.getKey());
            oprot.writeI32(_iter78.getValue().getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ListPermissionResponseTupleSchemeFactory implements SchemeFactory {
    public ListPermissionResponseTupleScheme getScheme() {
      return new ListPermissionResponseTupleScheme();
    }
  }

  private static class ListPermissionResponseTupleScheme extends TupleScheme<ListPermissionResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ListPermissionResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.permissions.size());
        for (Map.Entry<String, Permission> _iter79 : struct.permissions.entrySet())
        {
          oprot.writeString(_iter79.getKey());
          oprot.writeI32(_iter79.getValue().getValue());
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ListPermissionResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        libthrift091.protocol.TMap _map80 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.I32, iprot.readI32());
        struct.permissions = new HashMap<String,Permission>(2*_map80.size);
        String _key81;
        Permission _val82;
        for (int _i83 = 0; _i83 < _map80.size; ++_i83)
        {
          _key81 = iprot.readString();
          _val82 = com.xiaomi.infra.galaxy.emr.thrift.Permission.findByValue(iprot.readI32());
          struct.permissions.put(_key81, _val82);
        }
      }
      struct.setPermissionsIsSet(true);
    }
  }

}

