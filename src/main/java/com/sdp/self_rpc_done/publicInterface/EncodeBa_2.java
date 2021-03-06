package com.sdp.self_rpc_done.publicInterface;

import com.sdp.self_rpc_done.protoEntity.response;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/***************************************************
 * Copyright (C) didi_global                      
 * FileName:         encodeBa                      
 * Author:           Sun Dongpo                   
 * Date:             2020/4/22 7:06 PM              
 * Description:                     
 * Tele:             15029155474                  
 * mail:             sundongpo_i@didiglobal.com   
 **************************************************
 */


public class EncodeBa_2 extends MessageToByteEncoder<response.ResponseBody> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, response.ResponseBody msg, ByteBuf out) throws Exception {
        byte[] bytes = msg.toByteArray();// 将对象转换为byte
        int length = bytes.length;// 读取消息的长度
        ByteBuf buf = Unpooled.buffer(2 + length);
        buf.writeShort(length);// 先将消息长度写入，也就是消息头
        buf.writeBytes(bytes);// 消息体中包含我们要发送的数据
        out.writeBytes(buf);
    }
}
