package dev.mayaqq.chippinin.mixins;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {

    @Shadow
    private void handleKeybinds() {}

    @Inject(method = "runTick", at = @At("TAIL"))
    private void onRunTick(boolean bl, CallbackInfo ci) {
        Minecraft mc = (Minecraft) (Object) this;
        if (mc.player != null) {
            this.handleKeybinds();
        }
    }
}
