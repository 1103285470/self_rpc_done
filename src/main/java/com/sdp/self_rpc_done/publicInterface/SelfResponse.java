package com.sdp.self_rpc_done.publicInterface;// 指数RPC的输出public class SelfResponse {    private long value;    private long costInNanos;    public SelfResponse() {    }    public SelfResponse(long value) {        this.value = value;    }    public SelfResponse(long value, long costInNanos) {        this.value = value;        this.costInNanos = costInNanos;    }    public long getValue() {        return value;    }    public void setValue(long value) {        this.value = value;    }    public long getCostInNanos() {        return costInNanos;    }    public void setCostInNanos(long costInNanos) {        this.costInNanos = costInNanos;    }}