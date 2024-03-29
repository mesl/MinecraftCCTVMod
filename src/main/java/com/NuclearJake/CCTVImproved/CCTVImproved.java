package com.NuclearJake.CCTVImproved;

import com.NuclearJake.CCTVImproved.handler.ConfigurationHandler;
import com.NuclearJake.CCTVImproved.proxy.IProxy;
import com.NuclearJake.CCTVImproved.reference.Reference;
import com.NuclearJake.CCTVImproved.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class CCTVImproved
{
    @Mod.Instance(Reference.MOD_ID)
    public static CCTVImproved instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Pre-initialisation successful.");
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {
        LogHelper.info("Initialisation successful.");
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-initialisation successful.");
    }
}
