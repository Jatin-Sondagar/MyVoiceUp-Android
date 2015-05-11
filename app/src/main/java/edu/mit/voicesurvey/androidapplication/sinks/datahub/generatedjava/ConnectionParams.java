/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.mit.voicesurvey.androidapplication.sinks.datahub.generatedjava;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class ConnectionParams implements org.apache.thrift.TBase<ConnectionParams, ConnectionParams._Fields>, java.io.Serializable, Cloneable, Comparable<ConnectionParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ConnectionParams");

  private static final org.apache.thrift.protocol.TField CLIENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("client_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SEQ_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("seq_id", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField APP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("app_id", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField APP_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("app_token", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField REPO_BASE_FIELD_DESC = new org.apache.thrift.protocol.TField("repo_base", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ConnectionParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ConnectionParamsTupleSchemeFactory());
  }

  public String client_id; // optional
  public String seq_id; // optional
  public String user; // optional
  public String password; // optional
  public String app_id; // optional
  public String app_token; // optional
  public String repo_base; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLIENT_ID((short)1, "client_id"),
    SEQ_ID((short)2, "seq_id"),
    USER((short)3, "user"),
    PASSWORD((short)4, "password"),
    APP_ID((short)5, "app_id"),
    APP_TOKEN((short)6, "app_token"),
    REPO_BASE((short)7, "repo_base");

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
        case 1: // CLIENT_ID
          return CLIENT_ID;
        case 2: // SEQ_ID
          return SEQ_ID;
        case 3: // USER
          return USER;
        case 4: // PASSWORD
          return PASSWORD;
        case 5: // APP_ID
          return APP_ID;
        case 6: // APP_TOKEN
          return APP_TOKEN;
        case 7: // REPO_BASE
          return REPO_BASE;
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
  private static final _Fields optionals[] = {_Fields.CLIENT_ID,_Fields.SEQ_ID,_Fields.USER,_Fields.PASSWORD,_Fields.APP_ID,_Fields.APP_TOKEN,_Fields.REPO_BASE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLIENT_ID, new org.apache.thrift.meta_data.FieldMetaData("client_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEQ_ID, new org.apache.thrift.meta_data.FieldMetaData("seq_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APP_ID, new org.apache.thrift.meta_data.FieldMetaData("app_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APP_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("app_token", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REPO_BASE, new org.apache.thrift.meta_data.FieldMetaData("repo_base", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ConnectionParams.class, metaDataMap);
  }

  public ConnectionParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ConnectionParams(ConnectionParams other) {
    if (other.isSetClient_id()) {
      this.client_id = other.client_id;
    }
    if (other.isSetSeq_id()) {
      this.seq_id = other.seq_id;
    }
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetApp_id()) {
      this.app_id = other.app_id;
    }
    if (other.isSetApp_token()) {
      this.app_token = other.app_token;
    }
    if (other.isSetRepo_base()) {
      this.repo_base = other.repo_base;
    }
  }

  public ConnectionParams deepCopy() {
    return new ConnectionParams(this);
  }

  @Override
  public void clear() {
    this.client_id = null;
    this.seq_id = null;
    this.user = null;
    this.password = null;
    this.app_id = null;
    this.app_token = null;
    this.repo_base = null;
  }

  public String getClient_id() {
    return this.client_id;
  }

  public ConnectionParams setClient_id(String client_id) {
    this.client_id = client_id;
    return this;
  }

  public void unsetClient_id() {
    this.client_id = null;
  }

  /** Returns true if field client_id is set (has been assigned a value) and false otherwise */
  public boolean isSetClient_id() {
    return this.client_id != null;
  }

  public void setClient_idIsSet(boolean value) {
    if (!value) {
      this.client_id = null;
    }
  }

  public String getSeq_id() {
    return this.seq_id;
  }

  public ConnectionParams setSeq_id(String seq_id) {
    this.seq_id = seq_id;
    return this;
  }

  public void unsetSeq_id() {
    this.seq_id = null;
  }

  /** Returns true if field seq_id is set (has been assigned a value) and false otherwise */
  public boolean isSetSeq_id() {
    return this.seq_id != null;
  }

  public void setSeq_idIsSet(boolean value) {
    if (!value) {
      this.seq_id = null;
    }
  }

  public String getUser() {
    return this.user;
  }

  public ConnectionParams setUser(String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public ConnectionParams setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public String getApp_id() {
    return this.app_id;
  }

  public ConnectionParams setApp_id(String app_id) {
    this.app_id = app_id;
    return this;
  }

  public void unsetApp_id() {
    this.app_id = null;
  }

  /** Returns true if field app_id is set (has been assigned a value) and false otherwise */
  public boolean isSetApp_id() {
    return this.app_id != null;
  }

  public void setApp_idIsSet(boolean value) {
    if (!value) {
      this.app_id = null;
    }
  }

  public String getApp_token() {
    return this.app_token;
  }

  public ConnectionParams setApp_token(String app_token) {
    this.app_token = app_token;
    return this;
  }

  public void unsetApp_token() {
    this.app_token = null;
  }

  /** Returns true if field app_token is set (has been assigned a value) and false otherwise */
  public boolean isSetApp_token() {
    return this.app_token != null;
  }

  public void setApp_tokenIsSet(boolean value) {
    if (!value) {
      this.app_token = null;
    }
  }

  public String getRepo_base() {
    return this.repo_base;
  }

  public ConnectionParams setRepo_base(String repo_base) {
    this.repo_base = repo_base;
    return this;
  }

  public void unsetRepo_base() {
    this.repo_base = null;
  }

  /** Returns true if field repo_base is set (has been assigned a value) and false otherwise */
  public boolean isSetRepo_base() {
    return this.repo_base != null;
  }

  public void setRepo_baseIsSet(boolean value) {
    if (!value) {
      this.repo_base = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLIENT_ID:
      if (value == null) {
        unsetClient_id();
      } else {
        setClient_id((String)value);
      }
      break;

    case SEQ_ID:
      if (value == null) {
        unsetSeq_id();
      } else {
        setSeq_id((String)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case APP_ID:
      if (value == null) {
        unsetApp_id();
      } else {
        setApp_id((String)value);
      }
      break;

    case APP_TOKEN:
      if (value == null) {
        unsetApp_token();
      } else {
        setApp_token((String)value);
      }
      break;

    case REPO_BASE:
      if (value == null) {
        unsetRepo_base();
      } else {
        setRepo_base((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLIENT_ID:
      return getClient_id();

    case SEQ_ID:
      return getSeq_id();

    case USER:
      return getUser();

    case PASSWORD:
      return getPassword();

    case APP_ID:
      return getApp_id();

    case APP_TOKEN:
      return getApp_token();

    case REPO_BASE:
      return getRepo_base();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLIENT_ID:
      return isSetClient_id();
    case SEQ_ID:
      return isSetSeq_id();
    case USER:
      return isSetUser();
    case PASSWORD:
      return isSetPassword();
    case APP_ID:
      return isSetApp_id();
    case APP_TOKEN:
      return isSetApp_token();
    case REPO_BASE:
      return isSetRepo_base();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ConnectionParams)
      return this.equals((ConnectionParams)that);
    return false;
  }

  public boolean equals(ConnectionParams that) {
    if (that == null)
      return false;

    boolean this_present_client_id = true && this.isSetClient_id();
    boolean that_present_client_id = true && that.isSetClient_id();
    if (this_present_client_id || that_present_client_id) {
      if (!(this_present_client_id && that_present_client_id))
        return false;
      if (!this.client_id.equals(that.client_id))
        return false;
    }

    boolean this_present_seq_id = true && this.isSetSeq_id();
    boolean that_present_seq_id = true && that.isSetSeq_id();
    if (this_present_seq_id || that_present_seq_id) {
      if (!(this_present_seq_id && that_present_seq_id))
        return false;
      if (!this.seq_id.equals(that.seq_id))
        return false;
    }

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_app_id = true && this.isSetApp_id();
    boolean that_present_app_id = true && that.isSetApp_id();
    if (this_present_app_id || that_present_app_id) {
      if (!(this_present_app_id && that_present_app_id))
        return false;
      if (!this.app_id.equals(that.app_id))
        return false;
    }

    boolean this_present_app_token = true && this.isSetApp_token();
    boolean that_present_app_token = true && that.isSetApp_token();
    if (this_present_app_token || that_present_app_token) {
      if (!(this_present_app_token && that_present_app_token))
        return false;
      if (!this.app_token.equals(that.app_token))
        return false;
    }

    boolean this_present_repo_base = true && this.isSetRepo_base();
    boolean that_present_repo_base = true && that.isSetRepo_base();
    if (this_present_repo_base || that_present_repo_base) {
      if (!(this_present_repo_base && that_present_repo_base))
        return false;
      if (!this.repo_base.equals(that.repo_base))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_client_id = true && (isSetClient_id());
    list.add(present_client_id);
    if (present_client_id)
      list.add(client_id);

    boolean present_seq_id = true && (isSetSeq_id());
    list.add(present_seq_id);
    if (present_seq_id)
      list.add(seq_id);

    boolean present_user = true && (isSetUser());
    list.add(present_user);
    if (present_user)
      list.add(user);

    boolean present_password = true && (isSetPassword());
    list.add(present_password);
    if (present_password)
      list.add(password);

    boolean present_app_id = true && (isSetApp_id());
    list.add(present_app_id);
    if (present_app_id)
      list.add(app_id);

    boolean present_app_token = true && (isSetApp_token());
    list.add(present_app_token);
    if (present_app_token)
      list.add(app_token);

    boolean present_repo_base = true && (isSetRepo_base());
    list.add(present_repo_base);
    if (present_repo_base)
      list.add(repo_base);

    return list.hashCode();
  }

  @Override
  public int compareTo(ConnectionParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClient_id()).compareTo(other.isSetClient_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.client_id, other.client_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSeq_id()).compareTo(other.isSetSeq_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeq_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.seq_id, other.seq_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApp_id()).compareTo(other.isSetApp_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApp_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.app_id, other.app_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApp_token()).compareTo(other.isSetApp_token());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApp_token()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.app_token, other.app_token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRepo_base()).compareTo(other.isSetRepo_base());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRepo_base()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.repo_base, other.repo_base);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ConnectionParams(");
    boolean first = true;

    if (isSetClient_id()) {
      sb.append("client_id:");
      if (this.client_id == null) {
        sb.append("null");
      } else {
        sb.append(this.client_id);
      }
      first = false;
    }
    if (isSetSeq_id()) {
      if (!first) sb.append(", ");
      sb.append("seq_id:");
      if (this.seq_id == null) {
        sb.append("null");
      } else {
        sb.append(this.seq_id);
      }
      first = false;
    }
    if (isSetUser()) {
      if (!first) sb.append(", ");
      sb.append("user:");
      if (this.user == null) {
        sb.append("null");
      } else {
        sb.append(this.user);
      }
      first = false;
    }
    if (isSetPassword()) {
      if (!first) sb.append(", ");
      sb.append("password:");
      if (this.password == null) {
        sb.append("null");
      } else {
        sb.append(this.password);
      }
      first = false;
    }
    if (isSetApp_id()) {
      if (!first) sb.append(", ");
      sb.append("app_id:");
      if (this.app_id == null) {
        sb.append("null");
      } else {
        sb.append(this.app_id);
      }
      first = false;
    }
    if (isSetApp_token()) {
      if (!first) sb.append(", ");
      sb.append("app_token:");
      if (this.app_token == null) {
        sb.append("null");
      } else {
        sb.append(this.app_token);
      }
      first = false;
    }
    if (isSetRepo_base()) {
      if (!first) sb.append(", ");
      sb.append("repo_base:");
      if (this.repo_base == null) {
        sb.append("null");
      } else {
        sb.append(this.repo_base);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ConnectionParamsStandardSchemeFactory implements SchemeFactory {
    public ConnectionParamsStandardScheme getScheme() {
      return new ConnectionParamsStandardScheme();
    }
  }

  private static class ConnectionParamsStandardScheme extends StandardScheme<ConnectionParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ConnectionParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLIENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.client_id = iprot.readString();
              struct.setClient_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SEQ_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.seq_id = iprot.readString();
              struct.setSeq_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // APP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.app_id = iprot.readString();
              struct.setApp_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // APP_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.app_token = iprot.readString();
              struct.setApp_tokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // REPO_BASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.repo_base = iprot.readString();
              struct.setRepo_baseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ConnectionParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.client_id != null) {
        if (struct.isSetClient_id()) {
          oprot.writeFieldBegin(CLIENT_ID_FIELD_DESC);
          oprot.writeString(struct.client_id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.seq_id != null) {
        if (struct.isSetSeq_id()) {
          oprot.writeFieldBegin(SEQ_ID_FIELD_DESC);
          oprot.writeString(struct.seq_id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.user != null) {
        if (struct.isSetUser()) {
          oprot.writeFieldBegin(USER_FIELD_DESC);
          oprot.writeString(struct.user);
          oprot.writeFieldEnd();
        }
      }
      if (struct.password != null) {
        if (struct.isSetPassword()) {
          oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
          oprot.writeString(struct.password);
          oprot.writeFieldEnd();
        }
      }
      if (struct.app_id != null) {
        if (struct.isSetApp_id()) {
          oprot.writeFieldBegin(APP_ID_FIELD_DESC);
          oprot.writeString(struct.app_id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.app_token != null) {
        if (struct.isSetApp_token()) {
          oprot.writeFieldBegin(APP_TOKEN_FIELD_DESC);
          oprot.writeString(struct.app_token);
          oprot.writeFieldEnd();
        }
      }
      if (struct.repo_base != null) {
        if (struct.isSetRepo_base()) {
          oprot.writeFieldBegin(REPO_BASE_FIELD_DESC);
          oprot.writeString(struct.repo_base);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ConnectionParamsTupleSchemeFactory implements SchemeFactory {
    public ConnectionParamsTupleScheme getScheme() {
      return new ConnectionParamsTupleScheme();
    }
  }

  private static class ConnectionParamsTupleScheme extends TupleScheme<ConnectionParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ConnectionParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetClient_id()) {
        optionals.set(0);
      }
      if (struct.isSetSeq_id()) {
        optionals.set(1);
      }
      if (struct.isSetUser()) {
        optionals.set(2);
      }
      if (struct.isSetPassword()) {
        optionals.set(3);
      }
      if (struct.isSetApp_id()) {
        optionals.set(4);
      }
      if (struct.isSetApp_token()) {
        optionals.set(5);
      }
      if (struct.isSetRepo_base()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetClient_id()) {
        oprot.writeString(struct.client_id);
      }
      if (struct.isSetSeq_id()) {
        oprot.writeString(struct.seq_id);
      }
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
      if (struct.isSetApp_id()) {
        oprot.writeString(struct.app_id);
      }
      if (struct.isSetApp_token()) {
        oprot.writeString(struct.app_token);
      }
      if (struct.isSetRepo_base()) {
        oprot.writeString(struct.repo_base);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ConnectionParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.client_id = iprot.readString();
        struct.setClient_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.seq_id = iprot.readString();
        struct.setSeq_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(3)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(4)) {
        struct.app_id = iprot.readString();
        struct.setApp_idIsSet(true);
      }
      if (incoming.get(5)) {
        struct.app_token = iprot.readString();
        struct.setApp_tokenIsSet(true);
      }
      if (incoming.get(6)) {
        struct.repo_base = iprot.readString();
        struct.setRepo_baseIsSet(true);
      }
    }
  }

}
