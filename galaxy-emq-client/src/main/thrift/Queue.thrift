
include "Common.thrift"
include "Message.thrift"

namespace java com.xiaomi.infra.galaxy.emq.thrift
namespace php EMQ.Queue
namespace py emq.queue
namespace go emq.queue

/**
 * Copyright 2015, Xiaomi.
 * All rights reserved.
 * Author: shenyuannan@xiaomi.com
 */

struct QueueAttribute {
  /**
  * Queue delay seconds, message send to this queue will invisible until after
  * delaySeconds, default 0s (0s ~ 15min)
  **/
  1: optional i32 delaySeconds;

  /**
  * Queue invisibility seconds, after message received form this queue, in
  * invisibilitySeconds this will not received through receiveMessage. When
  * after invisibilitySeconds if no deleteMessage called for this message, this
  * message will receive again, default 30s (2s ~ 12hour)
  **/
  2: optional i32 invisibilitySeconds;

  /**
  * The seconds wait when receiveMessage called, default 0s (0s ~ 20s)
  **/
  3: optional i32 receiveMessageWaitSeconds;

  /**
  * Maximum receive message number in this queue, default 100(1 ~ 100)
  **/
  4: optional i32 receiveMessageMaximumNumber;

  /**
  * message retention seconds in this queue, default 4days (60s ~ 14days)
  **/
  5: optional i32 messageRetentionSeconds;

  /**
  * Max message size in this queue, default 256K (1K ~ 256K)
  **/
  6: optional i32 messageMaximumBytes;

  /**
  * Partition number for this queue default 4 (1 ~ 255)
  **/
  7: optional i32 partitionNumber;

  /**
  * User-defined attributes;
  **/
  8: optional map<string, string> userAttributes;


  9: optional string owner;
}

struct QueueState {
  /**
  * Queue create timestamp;
  **/
  1: required i64 createTimestamp;

  /**
  * Queue last modified timestamp;
  **/
  2: required i64 lastModifiedTimestamp;

  /**
  * The approximate message number in this queue;
  **/
  3: required i64 approximateMessageNumber;

  /**
  * The available message number in this queue, this is for message that could
  * be get using receivedMessage
  **/
  4: required i64 approximateAvailableMessageNumber;

  /**
  * The invisibility message number in this queue, this is for received message
  * that in invisibilitySeconds and not deleted;
  **/
  5: required i64 approximateInvisibilityMessageNumber;
}

struct Throughput {
  /**
   * Queue read qps;
   **/
  1: optional i64 readQps;

  /**
   * Queue write qps;
   **/
  2: optional i64 writeQps;
}

struct QueueQuota {
  /**
   * Queue read and qps;
   **/
  2: optional Throughput throughput;
}

struct CreateQueueRequest {
  /**
  * The queue name;
  **/
  1: required string queueName;

  /**
  * The queue attribute;
  **/
  2: optional QueueAttribute queueAttribute;

  /**
   * The queue quota, including space quota, read qps, and write qps;
   **/
  3: optional QueueQuota queueQuota;

  /**
   * Set the queue be a dead letter queue or not;
   **/
  4: optional bool deadLetterQueue;

  /**
   * Set the queue using priority of not;
   **/
  5: optional bool enablePriority;

  /**
   * Set the queue be a topic queue or not;
   * All messages with the same topic in topic queue will be received one by one
   * Default: false
   **/
  6: optional bool topicQueue;

  /**
   * Purge expired messages even if they have not been received by users
   * Default: true
   **/
  7: optional bool deleteMessageForce = true;

  /**
   * Name default tag
   * You can use "" as default tag name while receiving messages if this field is not set
   **/
  8: optional string defaultTagName;

  9: optional RedrivePolicy redrivePolicy;
}

struct CreateQueueResponse {
  /**
  * The queue name;
  * The name returned here may be a little different from user set in request (with developerId as prefix).
  * So the user should use the name returned by this response for those following operations
  **/
  1: required string queueName;

  /**
  * The queue attribute;
  **/
  2: required QueueAttribute queueAttribute;

  /**
   * The queue quota;
   **/
  3: optional QueueQuota queueQuota;

  /**
   * The queue is a dead letter queue or not;
   **/
  4: optional bool deadLetterQueue;

  /**
   * The queue is using priority of not;
   **/
  5: optional bool enablePriority;

  /**
   * Set the queue be a topic queue or not;
   **/
  6: optional bool topicQueue;

  /**
   * Purge expired messages even if they have not been received by users
   **/
  7: optional bool deleteMessageForce;

  8: optional string defaultTagName;

  9: optional RedrivePolicy redrivePolicy;
}

struct DeleteQueueRequest {
  /**
  * The queue name;
  **/
  1: required string queueName;
}

struct PurgeQueueRequest {
  /**
  * The queue name;
  **/
  1: required string queueName;
}

struct SetQueueAttributesRequest {
  /**
  * The queue name;
  **/
  1: required string queueName;

  /**
  * The queue attribute;
  **/
  2: optional QueueAttribute queueAttribute;

}

struct SetQueueAttributesResponse {
  /**
  * The queue name;
  **/
  1: required string queueName;

  /**
  * The queue attribute;
  **/
  2: required QueueAttribute queueAttribute;
}

struct SetQueueQuotaRequest {
  /**
  * The queue name;
  **/
  1: required string queueName;

  /**
  * The queue quota;
  **/
  2: optional QueueQuota queueQuota;
}

struct SetQueueQuotaResponse {
  /**
  * The queue name;
  **/
  1: required string queueName;

  /**
  * The queue quota;
  **/
  2: optional QueueQuota queueQuota;
}

struct RedrivePolicy {
  /**
  * The dead letter queue name;
  **/
  1: required string dlqName;

  /**
  * The max receive time;
  **/
  2: required i32 maxReceiveTime;
}

struct GetQueueInfoRequest {
  /**
  * The queue name;
  **/
  1: required string queueName;
}

struct GetQueueInfoResponse {
  /**
  * The queue name;
  **/
  1: required string queueName;

  /**
  * The queue attribute;
  **/
  2: required QueueAttribute queueAttribute;

  /**
  * The queue state;
  **/
  3: required QueueState queueState;

  /**
  * The queue quota;
  **/
  4: optional QueueQuota queueQuota;

  /**
  * Whether the queue is a dead letter queue;
  **/
  5: optional bool isDeadLetterQueue;

  /**
  * The queue redrive policy, dead letter queue doesn't have redrive policy;
  **/
  6: optional RedrivePolicy redrivePolicy;

  /**
   * The queue using priority of not;
   **/
  7: optional bool enablePriority;

  /**
   * Set the queue be a topic queue or not;
   **/
  8: optional bool topicQueue;

  /**
   * Purge expired messages even if they have not been received by users
   **/
  9: optional bool deleteMessageForce;

  10: optional string defaultTagName;

  11: optional list<string> sourceQueues;

}

struct SetQueueRedrivePolicyRequest{
  1: required string queueName;
  2: required RedrivePolicy redrivePolicy
}

struct SetQueueRedrivePolicyResponse{
  1: required string queueName;
  2: required RedrivePolicy redrivePolicy
}

struct RemoveQueueRedrivePolicyRequest{
  1: required string queueName;
}

struct ListQueueRequest {
  /**
  * The queue name prefix;
  **/
  1: optional string queueNamePrefix = "";
}

struct ListQueueResponse {
  /**
  * The queueName list with queueNamePrefix;
  **/
  1: required list<string> queueName;
}

struct QueryPrivilegedQueueRequest {
  /**
  * The queue name prefix;
  **/
  1: optional string queueNamePrefix = "";
}

struct QueryPrivilegedQueueResponseEntry {
  1: required string queueName;

  /**
  * The approximate message number in this queue;
  **/
  2: required i64 approximateMessageNumber;

  /**
  * The available message number in this queue, this is for message that could
  * be get using receivedMessage
  **/
  3: required i64 approximateAvailableMessageNumber;

  /**
  * The invisibility message number in this queue, this is for received message
  * that in invisibilitySeconds and not deleted;
  **/
  4: required i64 approximateInvisibilityMessageNumber;
}

struct QueryPrivilegedQueueResponse {
  1: required list<QueryPrivilegedQueueResponseEntry> queueList;
}

enum Permission {
  NONE, /* Don't have any specific permission */
  SEND_MESSAGE, /* send messages */
  RECEIVE_MESSAGE, /* receive messages */
  SEND_RECEIVE_MESSAGE, /* send/receive messages */
  HANDLE_MESSAGE, /* receive messages, change messages visibility, delete messages */
  SEND_HANDLE_MESSAGE, /* send/handle messages */
  GET_QUEUE_INFO,  /* get queue info */
  USE_QUEUE, /* get queue info / full control messages */
  ADMIN_QUEUE, /* change attribute of queue / delete queue / list queue / purge queue */
  PEEK_MESSAGE, /* get message no matter whether it has been received */
  DELETE_PEEK_MESSAGE /* delete message that has not been received yet */
  FULL_CONTROL /* all permissions. The owner of queue and the administrator of EMQ have this permission always */
}

struct SetPermissionRequest {
  1: required string queueName;
  2: required string developerId;
  3: required Permission permission;
}

struct RevokePermissionRequest {
  1: required string queueName;
  2: required string developerId;
}

struct QueryPermissionRequest {
  1: required string queueName;
}

struct QueryPermissionResponse {
  1: required Permission permission;
}

struct QueryPermissionForIdRequest {
  1: required string queueName;
  2: required string developerId;
}

struct QueryPermissionForIdResponse {
  1: required Permission permission;
}

struct ListPermissionsRequest {
  1: required string queueName;
}

struct ListPermissionsResponse {
  /* map contains developerId => Permission pair */
  1: map<string, Permission> permissionList;
}

enum LogicalOperator {
  AND;
  OR
}

struct AttributesFilter{
1: required map<string, Message.MessageAttribute> attributes;
2: required LogicalOperator logicalOperator;
}

struct CreateTagRequest {
  1: required string queueName;
  2: required string tagName;
  3: optional i64 startTimestamp;
  4: optional i64 readQPSQuota;
  5: optional string attributeName;
  6: optional Message.MessageAttribute attributeValue;
  7: optional map<string, string> userAttributes;
  8: optional AttributesFilter attributesFilter;
}

struct CreateTagResponse {
  1: required string queueName;
  2: required string tagName;
  3: required i64 startTimestamp;
  4: optional i64 readQPSQuota;
}

struct DeleteTagRequest {
  1: required string queueName;
  2: required string tagName;
}

struct GetTagInfoRequest {
  1: required string queueName;
  2: optional string tagName;
}

struct GetTagInfoResponse {
  1: required string queueName;
  2: optional string tagName;
  3: required QueueState tagState;
  4: required i64 startTimestamp;
  5: optional i64 readQPSQuota;
  6: optional string attributeName;
  7: optional Message.MessageAttribute attributeValue;
  8: optional map<string, string> userAttributes;
  9: optional AttributesFilter attributesFilter;
}

struct ListTagRequest {
  1: required string queueName;
}

struct ListTagResponse {
  1: required string queueName;
  2: required list<string> tagName;
}

struct QueryMetricRequest {
  1: optional string queueName;
  2: optional i64 startTime;
  3: optional i64 endTime;
  /**
  * metric name
  **/
  4: optional string metrics;
  /**
  * tags, reference to opentsdb,
  * e.g. <"type", "">
  **/
  5: optional map<string, string> tags;
  /**
  * data aggregator, reference to opentsdb,
  * e.g. max, avg, min
  **/
  6: optional string aggregator;
  /**
  * similar to aggregator above
  **/
  7: optional string downsampleAggregator;
  8: optional i32 downsampleInterval;
  /**
  * downsample interval unit, reference to opentsdb,
  * e.g. ms(milliseconds), s(seconds), d(day)
  **/
  9: optional string downsampleTimeUnit;
  10: optional bool calRate;
  11: optional string tagName;

}

/**
 * metrics time series data
 */
struct TimeSeriesData {
  /**
   * metric name
   */
  1: optional string metric,
  /**
   * tags
   */
  2: optional map<string, string> tags,
  /**
   * data, {timestamp => value}
   */
  3: optional map<i64, double> data,
}

struct VerifyEMQAdminResponse {
  /**
   * Default prefix for admin
   */
  1: required string prefix;
}

struct VerifyEMQAdminRoleRequest {
  1: optional string granteeId;
}

struct VerifyEMQAdminRoleResponse {
  1: required bool isAdminRole;
}

struct QueueTag{
  1: required string queueName;
  2: required string tagName;
  /**
  * Tag id must be more than zero
  **/
  3: required i32 tagId;
  4: optional i64 startTimestamp;
  5: optional i64 createTimestamp;
  6: optional string attributeName;
  7: optional Message.MessageAttribute attributeValue;
  8: optional map<string, string> userAttributes;
}

struct QueueMeta{
  /**
  * The queue name, prefix is developerId, must has prefix;
  **/
  1: required string queueName;

  /**
  * The queue attribute;
  **/
  2: required QueueAttribute queueAttribute;

  /**
   * The queue quota, including space quota, read qps, and write qps;
   **/
  3: optional QueueQuota queueQuota;

  /**
   * Set the queue using priority of not;
   **/
  4: optional bool enablePriority;

  /**
   * Set the queue be a topic queue or not;
   * All messages with the same topic in topic queue will be received one by one
   * Default: false
   **/
  5: optional bool topicQueue;

  /**
   * Purge expired messages even if they have not been received by users
   * Default: true
   **/
  6: optional bool deleteMessageForce = true;

  /**
   * Name default tag
   * You can use "" as default tag name while receiving messages if this field is not set
   **/
  7: optional string defaultTagName;

  /* map contains developerId => Permission pair */
  8: optional map<string, Permission> permissionList;

  9: optional RedrivePolicy redrivePolicy;

  10: optional list<string> sourceQueues;

  /**
  * Queue create timestamp;
  **/
  11: optional i64 createTimestamp;

  /**
  * Queue last modified timestamp;
  **/
  12: optional i64 lastModifiedTimestamp;
  /**
  * Tag ids must be unique in the map
  **/
  13: optional map<string, QueueTag> queueTagMap;
}


struct GetQueueMetaResponse{
  1: required QueueMeta queueMeta;
}

struct CopyQueueRequest{
  1: required QueueMeta queueMeta;
}

service QueueService extends Common.EMQBaseService {
  /**
  * Create queue;
  **/
  CreateQueueResponse createQueue(1: CreateQueueRequest request) throws (1: Common.GalaxyEmqServiceException e);

  /**
  * Delete queue;
  **/
  void deleteQueue(1: DeleteQueueRequest request) throws (1: Common.GalaxyEmqServiceException e);

  /**
  * Purge queue;
  **/
  void purgeQueue(1: PurgeQueueRequest request) throws (1: Common.GalaxyEmqServiceException e);

  /**
  * Set queue attribute;
  **/
  SetQueueAttributesResponse setQueueAttribute(1: SetQueueAttributesRequest request) throws (1: Common.GalaxyEmqServiceException e);

  /**
  * Set queue quota;
  **/
  SetQueueQuotaResponse setQueueQuota(1: SetQueueQuotaRequest request) throws (1: Common.GalaxyEmqServiceException e);

  /**
  * Get queue info, include QueueAttribute, QueueState and QueueQuota;
  **/
  GetQueueInfoResponse getQueueInfo(1: GetQueueInfoRequest request) throws (1: Common.GalaxyEmqServiceException e);

  /**
  * List queue with queueNamePrefix;
  **/
  ListQueueResponse listQueue(1: ListQueueRequest request) throws (1: Common.GalaxyEmqServiceException e);

  /**
  * Remove queue redrive policy;
  **/
  SetQueueRedrivePolicyResponse setQueueRedrivePolicy(1:SetQueueRedrivePolicyRequest  request) throws (1: Common.GalaxyEmqServiceException e);

  /**
  * Remove queue redrive policy;
  **/
  void removeQueueRedrivePolicy(1:RemoveQueueRedrivePolicyRequest  request) throws (1: Common.GalaxyEmqServiceException e);

  /**
  * Set permission for developer
  * FULL_CONTROL required to use this method
  **/
  void setPermission(1: SetPermissionRequest request)
      throws (1: Common.GalaxyEmqServiceException e);

  /**
  * Revoke permission for developer
  * FULL_CONTROL required to use this method
  */
  void revokePermission(1: RevokePermissionRequest request)
      throws (1: Common.GalaxyEmqServiceException e);

  /**
  * query permission for developer using this method
  * no permission required to use this method
  */
  QueryPermissionResponse queryPermission(1: QueryPermissionRequest request)
      throws (1: Common.GalaxyEmqServiceException e);

  /**
  * List permission for developer
  * ADMIN_QUEUE required to use this method
  */
  QueryPermissionForIdResponse queryPermissionForId(
  1: QueryPermissionForIdRequest request)
      throws (1: Common.GalaxyEmqServiceException e);

  /**
  * list permissions for all users of the queue
  * ADMIN_QUEUE required to use this method
  **/
  ListPermissionsResponse listPermissions(1: ListPermissionsRequest request)
      throws (1: Common.GalaxyEmqServiceException e);

  /**
  * create tag for queue
  * ADMIN_QUEUE required to use this method
  **/
  CreateTagResponse createTag(1: CreateTagRequest request)
      throws (1: Common.GalaxyEmqServiceException e);

  /**
  * delete tag for queue
  * ADMIN_QUEUE required to use this method
  **/
  void deleteTag(1: DeleteTagRequest request)
      throws (1: Common.GalaxyEmqServiceException e);

  /**
  * get info of tag
  * ADMIN_QUEUE required to use this method
  **/
  GetTagInfoResponse getTagInfo(1: GetTagInfoRequest request)
      throws (1: Common.GalaxyEmqServiceException e);

  /**
  * list names of all tag of queue
  * ADMIN_QUEUE required to use this method
  **/
  ListTagResponse listTag(1: ListTagRequest request)
      throws (1: Common.GalaxyEmqServiceException e);

  /**
  * query metrics
  * FULL_CONTROL required to use this method
  **/
  TimeSeriesData queryMetric(1: QueryMetricRequest request)
      throws(1: Common.GalaxyEmqServiceException e);

  /**
  * query privileged queues
  * No permission required
  **/
  QueryPrivilegedQueueResponse queryPrivilegedQueue(1: QueryPrivilegedQueueRequest request)
      throws(1: Common.GalaxyEmqServiceException e);

  VerifyEMQAdminResponse verifyEMQAdmin() 
      throws (1: Common.GalaxyEmqServiceException e);

  VerifyEMQAdminRoleResponse verifyEMQAdminRole(1: VerifyEMQAdminRoleRequest request)
      throws (1: Common.GalaxyEmqServiceException e);

  /**
  * copy queues using queues meta
  **/
  void copyQueue(1: CopyQueueRequest request)
      throws(1: Common.GalaxyEmqServiceException e);

  GetQueueMetaResponse getQueueMeta(1: string queueName)
      throws(1: Common.GalaxyEmqServiceException e);

}
