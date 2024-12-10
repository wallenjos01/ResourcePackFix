package org.wallentines.packfix.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientConfigurationPacketListenerImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ClientConfigurationPacketListenerImpl.class)
public class MixinClientConfigPacketListener {

    @Redirect(method="onDisconnect", at=@At(value="INVOKE", target="Lnet/minecraft/client/Minecraft;clearDownloadedResourcePacks()V"))
    private void redirectClearPacks(Minecraft instance) {
        // Do nothing
    }


}
