package dev.mayaqq.chippinin.compat;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.options.AccessibilityOptionsScreen;

public class ModMenuEntrypoint implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        // Temp until I pick a config library.
        return screen -> new AccessibilityOptionsScreen(screen, Minecraft.getInstance().options);
    }
}
