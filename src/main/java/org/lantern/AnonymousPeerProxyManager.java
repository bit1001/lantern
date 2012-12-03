package org.lantern;

import javax.inject.Named;

import org.jboss.netty.channel.group.ChannelGroup;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton @Named("anon")
public class AnonymousPeerProxyManager extends DefaultPeerProxyManager {

    @Inject
    public AnonymousPeerProxyManager(final ChannelGroup channelGroup,
        final XmppHandler xmppHandler, final Stats stats,
        final LanternSocketsUtil socketsUtil) {
        super(true, channelGroup, xmppHandler, stats, socketsUtil);
    }

}