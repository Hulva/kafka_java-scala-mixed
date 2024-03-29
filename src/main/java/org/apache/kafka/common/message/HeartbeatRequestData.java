/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// THIS CODE IS AUTOMATICALLY GENERATED.  DO NOT EDIT.

package org.apache.kafka.common.message;

import org.apache.kafka.common.protocol.ApiMessage;
import org.apache.kafka.common.protocol.MessageUtil;
import org.apache.kafka.common.protocol.Readable;
import org.apache.kafka.common.protocol.Writable;
import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.protocol.types.Schema;
import org.apache.kafka.common.protocol.types.Struct;
import org.apache.kafka.common.protocol.types.Type;


public class HeartbeatRequestData implements ApiMessage {
    private String groupId;
    private int generationid;
    private String memberId;
    
    public static final Schema SCHEMA_0 =
        new Schema(
            new Field("group_id", Type.STRING, "The group id."),
            new Field("generationid", Type.INT32, "The generation of the group."),
            new Field("member_id", Type.STRING, "The member ID.")
        );
    
    public static final Schema SCHEMA_1 = SCHEMA_0;
    
    public static final Schema SCHEMA_2 = SCHEMA_1;
    
    public static final Schema[] SCHEMAS = new Schema[] {
        SCHEMA_0,
        SCHEMA_1,
        SCHEMA_2
    };
    
    public HeartbeatRequestData(Readable readable, short version) {
        read(readable, version);
    }
    
    public HeartbeatRequestData(Struct struct, short version) {
        fromStruct(struct, version);
    }
    
    public HeartbeatRequestData() {
        this.groupId = "";
        this.generationid = 0;
        this.memberId = "";
    }
    
    @Override
    public short apiKey() {
        return 12;
    }
    
    @Override
    public short lowestSupportedVersion() {
        return 0;
    }
    
    @Override
    public short highestSupportedVersion() {
        return 2;
    }
    
    @Override
    public void read(Readable readable, short version) {
        this.groupId = readable.readNullableString();
        this.generationid = readable.readInt();
        this.memberId = readable.readNullableString();
    }
    
    @Override
    public void write(Writable writable, short version) {
        writable.writeString(groupId);
        writable.writeInt(generationid);
        writable.writeString(memberId);
    }
    
    @Override
    public void fromStruct(Struct struct, short version) {
        this.groupId = struct.getString("group_id");
        this.generationid = struct.getInt("generationid");
        this.memberId = struct.getString("member_id");
    }
    
    @Override
    public Struct toStruct(short version) {
        Struct struct = new Struct(SCHEMAS[version]);
        struct.set("group_id", this.groupId);
        struct.set("generationid", this.generationid);
        struct.set("member_id", this.memberId);
        return struct;
    }
    
    @Override
    public int size(short version) {
        int size = 0;
        size += 2;
        size += MessageUtil.serializedUtf8Length(groupId);
        size += 4;
        size += 2;
        size += MessageUtil.serializedUtf8Length(memberId);
        return size;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof HeartbeatRequestData)) return false;
        HeartbeatRequestData other = (HeartbeatRequestData) obj;
        if (this.groupId == null) {
            if (other.groupId != null) return false;
        } else {
            if (!this.groupId.equals(other.groupId)) return false;
        }
        if (generationid != other.generationid) return false;
        if (this.memberId == null) {
            if (other.memberId != null) return false;
        } else {
            if (!this.memberId.equals(other.memberId)) return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode = 0;
        hashCode = 31 * hashCode + (groupId == null ? 0 : groupId.hashCode());
        hashCode = 31 * hashCode + generationid;
        hashCode = 31 * hashCode + (memberId == null ? 0 : memberId.hashCode());
        return hashCode;
    }
    
    @Override
    public String toString() {
        return "HeartbeatRequestData("
            + "groupId='" + groupId + "'"
            + ", generationid=" + generationid
            + ", memberId='" + memberId + "'"
            + ")";
    }
    
    public String groupId() {
        return this.groupId;
    }
    
    public int generationid() {
        return this.generationid;
    }
    
    public String memberId() {
        return this.memberId;
    }
    
    public HeartbeatRequestData setGroupId(String v) {
        this.groupId = v;
        return this;
    }
    
    public HeartbeatRequestData setGenerationid(int v) {
        this.generationid = v;
        return this;
    }
    
    public HeartbeatRequestData setMemberId(String v) {
        this.memberId = v;
        return this;
    }
}
