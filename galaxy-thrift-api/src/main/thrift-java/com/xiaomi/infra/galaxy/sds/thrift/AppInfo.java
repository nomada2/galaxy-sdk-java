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
 * 应用信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-1-26")
public class AppInfo implements libthrift091.TBase<AppInfo, AppInfo._Fields>, java.io.Serializable, Cloneable, Comparable<AppInfo> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("AppInfo");

  private static final libthrift091.protocol.TField APP_ID_FIELD_DESC = new libthrift091.protocol.TField("appId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField DEVELOPER_ID_FIELD_DESC = new libthrift091.protocol.TField("developerId", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField TABLE_MAPPINGS_FIELD_DESC = new libthrift091.protocol.TField("tableMappings", libthrift091.protocol.TType.MAP, (short)3);
  private static final libthrift091.protocol.TField OAUTH_APP_MAPPING_FIELD_DESC = new libthrift091.protocol.TField("oauthAppMapping", libthrift091.protocol.TType.MAP, (short)4);
  private static final libthrift091.protocol.TField APP_NAME_FIELD_DESC = new libthrift091.protocol.TField("appName", libthrift091.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AppInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AppInfoTupleSchemeFactory());
  }

  /**
   * 小米应用ID
   */
  public String appId; // optional
  /**
   * 小米开发者ID (注意：不同于小米ID)
   */
  public String developerId; // optional
  /**
   * 表到表ID的映射
   */
  public Map<String,String> tableMappings; // optional
  /**
   * 应用OAuth信息, OAuth提供方到第三方OAuth应用信息(如OAuth AppID)的映射
   */
  public Map<String,String> oauthAppMapping; // optional
  /**
   * 小米应用名称
   */
  public String appName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 小米应用ID
     */
    APP_ID((short)1, "appId"),
    /**
     * 小米开发者ID (注意：不同于小米ID)
     */
    DEVELOPER_ID((short)2, "developerId"),
    /**
     * 表到表ID的映射
     */
    TABLE_MAPPINGS((short)3, "tableMappings"),
    /**
     * 应用OAuth信息, OAuth提供方到第三方OAuth应用信息(如OAuth AppID)的映射
     */
    OAUTH_APP_MAPPING((short)4, "oauthAppMapping"),
    /**
     * 小米应用名称
     */
    APP_NAME((short)5, "appName");

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
        case 1: // APP_ID
          return APP_ID;
        case 2: // DEVELOPER_ID
          return DEVELOPER_ID;
        case 3: // TABLE_MAPPINGS
          return TABLE_MAPPINGS;
        case 4: // OAUTH_APP_MAPPING
          return OAUTH_APP_MAPPING;
        case 5: // APP_NAME
          return APP_NAME;
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
  private static final _Fields optionals[] = {_Fields.APP_ID,_Fields.DEVELOPER_ID,_Fields.TABLE_MAPPINGS,_Fields.OAUTH_APP_MAPPING,_Fields.APP_NAME};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.APP_ID, new libthrift091.meta_data.FieldMetaData("appId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEVELOPER_ID, new libthrift091.meta_data.FieldMetaData("developerId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_MAPPINGS, new libthrift091.meta_data.FieldMetaData("tableMappings", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    tmpMap.put(_Fields.OAUTH_APP_MAPPING, new libthrift091.meta_data.FieldMetaData("oauthAppMapping", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    tmpMap.put(_Fields.APP_NAME, new libthrift091.meta_data.FieldMetaData("appName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(AppInfo.class, metaDataMap);
  }

  public AppInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AppInfo(AppInfo other) {
    if (other.isSetAppId()) {
      this.appId = other.appId;
    }
    if (other.isSetDeveloperId()) {
      this.developerId = other.developerId;
    }
    if (other.isSetTableMappings()) {
      Map<String,String> __this__tableMappings = new HashMap<String,String>(other.tableMappings);
      this.tableMappings = __this__tableMappings;
    }
    if (other.isSetOauthAppMapping()) {
      Map<String,String> __this__oauthAppMapping = new HashMap<String,String>(other.oauthAppMapping);
      this.oauthAppMapping = __this__oauthAppMapping;
    }
    if (other.isSetAppName()) {
      this.appName = other.appName;
    }
  }

  public AppInfo deepCopy() {
    return new AppInfo(this);
  }

  @Override
  public void clear() {
    this.appId = null;
    this.developerId = null;
    this.tableMappings = null;
    this.oauthAppMapping = null;
    this.appName = null;
  }

  /**
   * 小米应用ID
   */
  public String getAppId() {
    return this.appId;
  }

  /**
   * 小米应用ID
   */
  public AppInfo setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public void unsetAppId() {
    this.appId = null;
  }

  /** Returns true if field appId is set (has been assigned a value) and false otherwise */
  public boolean isSetAppId() {
    return this.appId != null;
  }

  public void setAppIdIsSet(boolean value) {
    if (!value) {
      this.appId = null;
    }
  }

  /**
   * 小米开发者ID (注意：不同于小米ID)
   */
  public String getDeveloperId() {
    return this.developerId;
  }

  /**
   * 小米开发者ID (注意：不同于小米ID)
   */
  public AppInfo setDeveloperId(String developerId) {
    this.developerId = developerId;
    return this;
  }

  public void unsetDeveloperId() {
    this.developerId = null;
  }

  /** Returns true if field developerId is set (has been assigned a value) and false otherwise */
  public boolean isSetDeveloperId() {
    return this.developerId != null;
  }

  public void setDeveloperIdIsSet(boolean value) {
    if (!value) {
      this.developerId = null;
    }
  }

  public int getTableMappingsSize() {
    return (this.tableMappings == null) ? 0 : this.tableMappings.size();
  }

  public void putToTableMappings(String key, String val) {
    if (this.tableMappings == null) {
      this.tableMappings = new HashMap<String,String>();
    }
    this.tableMappings.put(key, val);
  }

  /**
   * 表到表ID的映射
   */
  public Map<String,String> getTableMappings() {
    return this.tableMappings;
  }

  /**
   * 表到表ID的映射
   */
  public AppInfo setTableMappings(Map<String,String> tableMappings) {
    this.tableMappings = tableMappings;
    return this;
  }

  public void unsetTableMappings() {
    this.tableMappings = null;
  }

  /** Returns true if field tableMappings is set (has been assigned a value) and false otherwise */
  public boolean isSetTableMappings() {
    return this.tableMappings != null;
  }

  public void setTableMappingsIsSet(boolean value) {
    if (!value) {
      this.tableMappings = null;
    }
  }

  public int getOauthAppMappingSize() {
    return (this.oauthAppMapping == null) ? 0 : this.oauthAppMapping.size();
  }

  public void putToOauthAppMapping(String key, String val) {
    if (this.oauthAppMapping == null) {
      this.oauthAppMapping = new HashMap<String,String>();
    }
    this.oauthAppMapping.put(key, val);
  }

  /**
   * 应用OAuth信息, OAuth提供方到第三方OAuth应用信息(如OAuth AppID)的映射
   */
  public Map<String,String> getOauthAppMapping() {
    return this.oauthAppMapping;
  }

  /**
   * 应用OAuth信息, OAuth提供方到第三方OAuth应用信息(如OAuth AppID)的映射
   */
  public AppInfo setOauthAppMapping(Map<String,String> oauthAppMapping) {
    this.oauthAppMapping = oauthAppMapping;
    return this;
  }

  public void unsetOauthAppMapping() {
    this.oauthAppMapping = null;
  }

  /** Returns true if field oauthAppMapping is set (has been assigned a value) and false otherwise */
  public boolean isSetOauthAppMapping() {
    return this.oauthAppMapping != null;
  }

  public void setOauthAppMappingIsSet(boolean value) {
    if (!value) {
      this.oauthAppMapping = null;
    }
  }

  /**
   * 小米应用名称
   */
  public String getAppName() {
    return this.appName;
  }

  /**
   * 小米应用名称
   */
  public AppInfo setAppName(String appName) {
    this.appName = appName;
    return this;
  }

  public void unsetAppName() {
    this.appName = null;
  }

  /** Returns true if field appName is set (has been assigned a value) and false otherwise */
  public boolean isSetAppName() {
    return this.appName != null;
  }

  public void setAppNameIsSet(boolean value) {
    if (!value) {
      this.appName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case APP_ID:
      if (value == null) {
        unsetAppId();
      } else {
        setAppId((String)value);
      }
      break;

    case DEVELOPER_ID:
      if (value == null) {
        unsetDeveloperId();
      } else {
        setDeveloperId((String)value);
      }
      break;

    case TABLE_MAPPINGS:
      if (value == null) {
        unsetTableMappings();
      } else {
        setTableMappings((Map<String,String>)value);
      }
      break;

    case OAUTH_APP_MAPPING:
      if (value == null) {
        unsetOauthAppMapping();
      } else {
        setOauthAppMapping((Map<String,String>)value);
      }
      break;

    case APP_NAME:
      if (value == null) {
        unsetAppName();
      } else {
        setAppName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case APP_ID:
      return getAppId();

    case DEVELOPER_ID:
      return getDeveloperId();

    case TABLE_MAPPINGS:
      return getTableMappings();

    case OAUTH_APP_MAPPING:
      return getOauthAppMapping();

    case APP_NAME:
      return getAppName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case APP_ID:
      return isSetAppId();
    case DEVELOPER_ID:
      return isSetDeveloperId();
    case TABLE_MAPPINGS:
      return isSetTableMappings();
    case OAUTH_APP_MAPPING:
      return isSetOauthAppMapping();
    case APP_NAME:
      return isSetAppName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AppInfo)
      return this.equals((AppInfo)that);
    return false;
  }

  public boolean equals(AppInfo that) {
    if (that == null)
      return false;

    boolean this_present_appId = true && this.isSetAppId();
    boolean that_present_appId = true && that.isSetAppId();
    if (this_present_appId || that_present_appId) {
      if (!(this_present_appId && that_present_appId))
        return false;
      if (!this.appId.equals(that.appId))
        return false;
    }

    boolean this_present_developerId = true && this.isSetDeveloperId();
    boolean that_present_developerId = true && that.isSetDeveloperId();
    if (this_present_developerId || that_present_developerId) {
      if (!(this_present_developerId && that_present_developerId))
        return false;
      if (!this.developerId.equals(that.developerId))
        return false;
    }

    boolean this_present_tableMappings = true && this.isSetTableMappings();
    boolean that_present_tableMappings = true && that.isSetTableMappings();
    if (this_present_tableMappings || that_present_tableMappings) {
      if (!(this_present_tableMappings && that_present_tableMappings))
        return false;
      if (!this.tableMappings.equals(that.tableMappings))
        return false;
    }

    boolean this_present_oauthAppMapping = true && this.isSetOauthAppMapping();
    boolean that_present_oauthAppMapping = true && that.isSetOauthAppMapping();
    if (this_present_oauthAppMapping || that_present_oauthAppMapping) {
      if (!(this_present_oauthAppMapping && that_present_oauthAppMapping))
        return false;
      if (!this.oauthAppMapping.equals(that.oauthAppMapping))
        return false;
    }

    boolean this_present_appName = true && this.isSetAppName();
    boolean that_present_appName = true && that.isSetAppName();
    if (this_present_appName || that_present_appName) {
      if (!(this_present_appName && that_present_appName))
        return false;
      if (!this.appName.equals(that.appName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_appId = true && (isSetAppId());
    list.add(present_appId);
    if (present_appId)
      list.add(appId);

    boolean present_developerId = true && (isSetDeveloperId());
    list.add(present_developerId);
    if (present_developerId)
      list.add(developerId);

    boolean present_tableMappings = true && (isSetTableMappings());
    list.add(present_tableMappings);
    if (present_tableMappings)
      list.add(tableMappings);

    boolean present_oauthAppMapping = true && (isSetOauthAppMapping());
    list.add(present_oauthAppMapping);
    if (present_oauthAppMapping)
      list.add(oauthAppMapping);

    boolean present_appName = true && (isSetAppName());
    list.add(present_appName);
    if (present_appName)
      list.add(appName);

    return list.hashCode();
  }

  @Override
  public int compareTo(AppInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAppId()).compareTo(other.isSetAppId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.appId, other.appId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeveloperId()).compareTo(other.isSetDeveloperId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeveloperId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.developerId, other.developerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableMappings()).compareTo(other.isSetTableMappings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableMappings()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tableMappings, other.tableMappings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOauthAppMapping()).compareTo(other.isSetOauthAppMapping());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOauthAppMapping()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.oauthAppMapping, other.oauthAppMapping);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppName()).compareTo(other.isSetAppName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.appName, other.appName);
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
    StringBuilder sb = new StringBuilder("AppInfo(");
    boolean first = true;

    if (isSetAppId()) {
      sb.append("appId:");
      if (this.appId == null) {
        sb.append("null");
      } else {
        sb.append(this.appId);
      }
      first = false;
    }
    if (isSetDeveloperId()) {
      if (!first) sb.append(", ");
      sb.append("developerId:");
      if (this.developerId == null) {
        sb.append("null");
      } else {
        sb.append(this.developerId);
      }
      first = false;
    }
    if (isSetTableMappings()) {
      if (!first) sb.append(", ");
      sb.append("tableMappings:");
      if (this.tableMappings == null) {
        sb.append("null");
      } else {
        sb.append(this.tableMappings);
      }
      first = false;
    }
    if (isSetOauthAppMapping()) {
      if (!first) sb.append(", ");
      sb.append("oauthAppMapping:");
      if (this.oauthAppMapping == null) {
        sb.append("null");
      } else {
        sb.append(this.oauthAppMapping);
      }
      first = false;
    }
    if (isSetAppName()) {
      if (!first) sb.append(", ");
      sb.append("appName:");
      if (this.appName == null) {
        sb.append("null");
      } else {
        sb.append(this.appName);
      }
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AppInfoStandardSchemeFactory implements SchemeFactory {
    public AppInfoStandardScheme getScheme() {
      return new AppInfoStandardScheme();
    }
  }

  private static class AppInfoStandardScheme extends StandardScheme<AppInfo> {

    public void read(libthrift091.protocol.TProtocol iprot, AppInfo struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // APP_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.appId = iprot.readString();
              struct.setAppIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEVELOPER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.developerId = iprot.readString();
              struct.setDeveloperIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_MAPPINGS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map0 = iprot.readMapBegin();
                struct.tableMappings = new HashMap<String,String>(2*_map0.size);
                String _key1;
                String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.tableMappings.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setTableMappingsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OAUTH_APP_MAPPING
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map4 = iprot.readMapBegin();
                struct.oauthAppMapping = new HashMap<String,String>(2*_map4.size);
                String _key5;
                String _val6;
                for (int _i7 = 0; _i7 < _map4.size; ++_i7)
                {
                  _key5 = iprot.readString();
                  _val6 = iprot.readString();
                  struct.oauthAppMapping.put(_key5, _val6);
                }
                iprot.readMapEnd();
              }
              struct.setOauthAppMappingIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // APP_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.appName = iprot.readString();
              struct.setAppNameIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, AppInfo struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.appId != null) {
        if (struct.isSetAppId()) {
          oprot.writeFieldBegin(APP_ID_FIELD_DESC);
          oprot.writeString(struct.appId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.developerId != null) {
        if (struct.isSetDeveloperId()) {
          oprot.writeFieldBegin(DEVELOPER_ID_FIELD_DESC);
          oprot.writeString(struct.developerId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tableMappings != null) {
        if (struct.isSetTableMappings()) {
          oprot.writeFieldBegin(TABLE_MAPPINGS_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, struct.tableMappings.size()));
            for (Map.Entry<String, String> _iter8 : struct.tableMappings.entrySet())
            {
              oprot.writeString(_iter8.getKey());
              oprot.writeString(_iter8.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.oauthAppMapping != null) {
        if (struct.isSetOauthAppMapping()) {
          oprot.writeFieldBegin(OAUTH_APP_MAPPING_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, struct.oauthAppMapping.size()));
            for (Map.Entry<String, String> _iter9 : struct.oauthAppMapping.entrySet())
            {
              oprot.writeString(_iter9.getKey());
              oprot.writeString(_iter9.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.appName != null) {
        if (struct.isSetAppName()) {
          oprot.writeFieldBegin(APP_NAME_FIELD_DESC);
          oprot.writeString(struct.appName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AppInfoTupleSchemeFactory implements SchemeFactory {
    public AppInfoTupleScheme getScheme() {
      return new AppInfoTupleScheme();
    }
  }

  private static class AppInfoTupleScheme extends TupleScheme<AppInfo> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, AppInfo struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAppId()) {
        optionals.set(0);
      }
      if (struct.isSetDeveloperId()) {
        optionals.set(1);
      }
      if (struct.isSetTableMappings()) {
        optionals.set(2);
      }
      if (struct.isSetOauthAppMapping()) {
        optionals.set(3);
      }
      if (struct.isSetAppName()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetAppId()) {
        oprot.writeString(struct.appId);
      }
      if (struct.isSetDeveloperId()) {
        oprot.writeString(struct.developerId);
      }
      if (struct.isSetTableMappings()) {
        {
          oprot.writeI32(struct.tableMappings.size());
          for (Map.Entry<String, String> _iter10 : struct.tableMappings.entrySet())
          {
            oprot.writeString(_iter10.getKey());
            oprot.writeString(_iter10.getValue());
          }
        }
      }
      if (struct.isSetOauthAppMapping()) {
        {
          oprot.writeI32(struct.oauthAppMapping.size());
          for (Map.Entry<String, String> _iter11 : struct.oauthAppMapping.entrySet())
          {
            oprot.writeString(_iter11.getKey());
            oprot.writeString(_iter11.getValue());
          }
        }
      }
      if (struct.isSetAppName()) {
        oprot.writeString(struct.appName);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, AppInfo struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.appId = iprot.readString();
        struct.setAppIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.developerId = iprot.readString();
        struct.setDeveloperIdIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TMap _map12 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.tableMappings = new HashMap<String,String>(2*_map12.size);
          String _key13;
          String _val14;
          for (int _i15 = 0; _i15 < _map12.size; ++_i15)
          {
            _key13 = iprot.readString();
            _val14 = iprot.readString();
            struct.tableMappings.put(_key13, _val14);
          }
        }
        struct.setTableMappingsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          libthrift091.protocol.TMap _map16 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.oauthAppMapping = new HashMap<String,String>(2*_map16.size);
          String _key17;
          String _val18;
          for (int _i19 = 0; _i19 < _map16.size; ++_i19)
          {
            _key17 = iprot.readString();
            _val18 = iprot.readString();
            struct.oauthAppMapping.put(_key17, _val18);
          }
        }
        struct.setOauthAppMappingIsSet(true);
      }
      if (incoming.get(4)) {
        struct.appName = iprot.readString();
        struct.setAppNameIsSet(true);
      }
    }
  }

}

