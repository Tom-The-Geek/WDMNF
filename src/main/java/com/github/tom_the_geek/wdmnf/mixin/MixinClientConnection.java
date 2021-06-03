package com.github.tom_the_geek.wdmnf.mixin;

import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.PacketEncoderException;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.concurrent.TimeoutException;

@Mixin(ClientConnection.class)
public class MixinClientConnection {
    @Shadow @Final private static Logger LOGGER;

    @Inject(method = "exceptionCaught", at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;debug(Ljava/lang/String;Ljava/lang/Throwable;)V"))
    private void on_exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable, CallbackInfo ci) {
        if (throwable instanceof PacketEncoderException) return;
        if (throwable instanceof TimeoutException) return;
        LOGGER.fatal("Exception occurred in netty pipeline", throwable);
    }
}
