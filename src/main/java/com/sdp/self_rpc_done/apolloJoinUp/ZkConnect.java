package com.sdp.self_rpc_done.apolloJoinUp;import org.springframework.beans.factory.annotation.Value;/*************************************************** * Copyright (C) didi_global                       * FileName:         ZkConnect                       * Author:           Sun Dongpo                    * Date:             2020/5/4 3:40 PM               * Description:      \                * Tele:             15029155474                   * mail:             sundongpo_i@didiglobal.com    ************************************************** */public class ZkConnect {    //zk服务注册    @Value("${connectString_regist}")    private String connectString_regist;    @Value("${sessionTimeOut_regist}")    private int sessionTimeOut_regist;    @Value("${serviceCreatePath_regist}")    private String serviceCreatePath_regist;    //zk服务发现    @Value("${connectString_find}")    private String connectString_find;    @Value("${sessionTimeOut_find}")    private int sessionTimeOut_find;    @Value("${serviceFindPath_find}")    private String serviceFindPath_find;    public String getConnectString_regist() {        return connectString_regist;    }    public int getSessionTimeOut_regist() {        return sessionTimeOut_regist;    }    public String getServiceCreatePath_regist() {        return serviceCreatePath_regist;    }    public String getConnectString_find() {        return connectString_find;    }    public int getSessionTimeOut_find() {        return sessionTimeOut_find;    }    public String getServiceFindPath_find() {        return serviceFindPath_find;    }    @Override    public String toString() {        return "ZkConnect{" +                "connectString_regist='" + connectString_regist + '\'' +                ", sessionTimeOut_regist=" + sessionTimeOut_regist +                ", serviceCreatePath_regist='" + serviceCreatePath_regist + '\'' +                ", connectString_find='" + connectString_find + '\'' +                ", sessionTimeOut_find=" + sessionTimeOut_find +                ", serviceFindPath_find='" + serviceFindPath_find + '\'' +                '}';    }}