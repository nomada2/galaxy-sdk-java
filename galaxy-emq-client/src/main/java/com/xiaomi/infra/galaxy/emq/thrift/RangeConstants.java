/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

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
public class RangeConstants {

  /**
   * message delay seconds in this queue, default 0s (0s ~ 15min)
   */
  public static final int GALAXY_EMQ_QUEUE_DELAY_SECONDS_DEFAULT = 0;

  public static final int GALAXY_EMQ_QUEUE_DELAY_SECONDS_MINIMAL = 0;

  public static final int GALAXY_EMQ_QUEUE_DELAY_SECONDS_MAXIMAL = 900;

  /**
   * message invisibility seconds in this queue, default 30s (1s ~ 12hour)
   */
  public static final int GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_DEFAULT = 30;

  public static final int GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_MINIMAL = 2;

  public static final int GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_MAXIMAL = 43200;

  /**
   * receive message seconds in this queue, default 0s which means no wait (0s ~ 20s)
   */
  public static final int GALAXY_EMQ_QUEUE_RECEIVE_WAIT_SECONDS_DEFAULT = 0;

  public static final int GALAXY_EMQ_QUEUE_RECEIVE_WAIT_SECONDS_MINIMAL = 0;

  public static final int GALAXY_EMQ_QUEUE_RECEIVE_WAIT_SECONDS_MAXIMAL = 20;

  /**
   * maximum receive message number in this queue, default 100(1 ~ 100)
   */
  public static final int GALAXY_EMQ_QUEUE_RECEIVE_NUMBER_DEFAULT = 100;

  public static final int GALAXY_EMQ_QUEUE_RECEIVE_NUMBER_MINIMAL = 1;

  public static final int GALAXY_EMQ_QUEUE_RECEIVE_NUMBER_MAXIMAL = 100;

  /**
   * message retention seconds in this queue, default 4days (60s ~ 14days)
   */
  public static final int GALAXY_EMQ_QUEUE_RETENTION_SECONDS_DEFAULT = 345600;

  public static final int GALAXY_EMQ_QUEUE_RETENTION_SECONDS_MINIMAL = 60;

  public static final int GALAXY_EMQ_QUEUE_RETENTION_SECONDS_MAXIMAL = 1209600;

  /**
   * max message size in this queue, default 256K (1K ~ 256K)
   */
  public static final int GALAXY_EMQ_QUEUE_MAX_MESSAGE_BYTES_DEFAULT = 262144;

  public static final int GALAXY_EMQ_QUEUE_MAX_MESSAGE_BYTES_MINIMAL = 1024;

  public static final int GALAXY_EMQ_QUEUE_MAX_MESSAGE_BYTES_MAXIMAL = 262144;

  public static final int GALAXY_EMQ_QUEUE_PARTITION_NUMBER_DEFAULT = 4;

  public static final int GALAXY_EMQ_QUEUE_PARTITION_NUMBER_MINIMAL = 1;

  public static final int GALAXY_EMQ_QUEUE_PARTITION_NUMBER_MAXIMAL = 255;

  /**
   * message delay seconds that overwrite GALAXY_EMQ_QUEUE_DELAY_SECONDS,
   * default 0s (0s ~ 15min)
   */
  public static final int GALAXY_EMQ_MESSAGE_DELAY_SECONDS_DEFAULT = 0;

  public static final int GALAXY_EMQ_MESSAGE_DELAY_SECONDS_MINIMAL = 0;

  public static final int GALAXY_EMQ_MESSAGE_DELAY_SECONDS_MAXIMAL = 900;

  /**
   * message invisibility seconds that overwrite
   * GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS, default 30s (0s ~ 12hour)
   */
  public static final int GALAXY_EMQ_MESSAGE_INVISIBILITY_SECONDS_DEFAULT = 30;

  public static final int GALAXY_EMQ_MESSAGE_INVISIBILITY_SECONDS_MINIMAL = 2;

  public static final int GALAXY_EMQ_MESSAGE_INVISIBILITY_SECONDS_MAXIMAL = 43200;

  /**
   * queue space quota
   * default 1G (0 ~ 100G)
   */
  public static final long GALAXY_EMQ_QUEUE_MAX_SPACE_QUOTA_DEFAULT = 1000000000L;

  public static final long GALAXY_EMQ_QUEUE_MAX_SPACE_QUOTA_MINIMAL = 0L;

  public static final long GALAXY_EMQ_QUEUE_MAX_SPACE_QUOTA_MAXIMAL = 100000000000L;

  /**
   * queue read qps, default 1000 (0 ~ 100000)
   */
  public static final long GALAXY_EMQ_QUEUE_READ_QPS_DEFAULT = 1000L;

  public static final long GALAXY_EMQ_QUEUE_READ_QPS_MINIMAL = 0L;

  public static final long GALAXY_EMQ_QUEUE_READ_QPS_MAXIMAL = 100000L;

  /**
   * queue write qps, default 1000 (0 ~ 100000)
   */
  public static final long GALAXY_EMQ_QUEUE_WRITE_QPS_DEFAULT = 1000L;

  public static final long GALAXY_EMQ_QUEUE_WRITE_QPS_MINIMAL = 0L;

  public static final long GALAXY_EMQ_QUEUE_WRITE_QPS_MAXIMAL = 100000L;

}
