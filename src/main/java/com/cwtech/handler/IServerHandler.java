package com.cwtech.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class IServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("--channelRead-->"+msg);
//        Thread.sleep(2300);
        ctx.writeAndFlush(msg);
    }

    /*@Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        System.out.println("--channelReadComplete");
        ctx.flush();
    }*/

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
