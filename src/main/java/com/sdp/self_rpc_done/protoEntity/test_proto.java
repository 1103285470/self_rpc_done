package com.sdp.self_rpc_done.protoEntity;/*************************************************** * Copyright (C) didi_global                       * FileName:         test_proto                       * Author:           Sun Dongpo                    * Date:             2020/5/5 1:39 PM               * Description:                      * Tele:             15029155474                   * mail:             sundongpo_i@didiglobal.com    ************************************************** */public class test_proto {    public static void main(String[] args) {        loverProto.Lover.Builder builder = loverProto.Lover.newBuilder();        builder.setId(1);        builder.setName("zyn");        builder.setEmail("11032@qq.com");        loverProto.Lover build = builder.build();    }}