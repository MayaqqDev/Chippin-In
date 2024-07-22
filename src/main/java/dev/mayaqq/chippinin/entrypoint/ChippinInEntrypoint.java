package dev.mayaqq.chippinin.entrypoint;

//#if FABRIC
import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ClientModInitializer;
//#elseif NEOFORGE
//$$ import net.neoforged.bus.api.IEventBus;
//$$ import net.neoforged.fml.common.Mod;
//$$ import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
//$$ import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
//$$ import net.neoforged.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
//#endif

import dev.mayaqq.chippinin.ChippinIn;
import dev.mayaqq.chippinin.client.ChippinInClient;

//#if FORGE-LIKE
//$$ @Mod(ChippinIn.ID)
//#else
//$$ @Mod(modid = ChippinIn.ID, version = ChippinIn.VERSION)
//#endif
public class ChippinInEntrypoint
//#if FABRIC
    implements ModInitializer, ClientModInitializer
//#endif
{
    //#if NEOFORGE
    //$$ public ChippinInEntrypoint(IEventBus modEventBus) {
    //$$     setupForgeEvents(modEventBus);
    //$$ }
    //#endif

    //#if FABRIC
    @Override
    //#endif
    public void onInitialize(
        //#if FORGE-LIKE
        //$$ FMLCommonSetupEvent event
        //#endif
) {
    ChippinIn.onInitializeCommon();
}

    //#if FABRIC
    @Override
    //#endif
    public void onInitializeClient(
        //#if FORGE-LIKE
        //$$ FMLClientSetupEvent event
        //#endif
) {

    ChippinInClient.onInitializeClient();
}
    //#if FORGE-LIKE
    //$$ public void setupForgeEvents(IEventBus modEventBus) {
    //$$     modEventBus.addListener(this::onInitialize);
    //$$     modEventBus.addListener(this::onInitializeClient);
    //$$ }
    //#endif
}
