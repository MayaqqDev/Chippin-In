package dev.mayaqq.chippinin;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChippinIn {

    public static final String NAME = "@MOD_NAME@";
    public static final String VERSION = "@MOD_VERSION@";
    public static final String ID = "@MOD_ID@";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static void onInitializeCommon() {
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }
}
