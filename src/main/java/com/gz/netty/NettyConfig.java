package com.gz.netty;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * 全局变量
 * @author xiaozefeng
 */
public class NettyConfig {

    /**
     * 存贮每一个客户端介入进来的ChannelGroup
     */
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
