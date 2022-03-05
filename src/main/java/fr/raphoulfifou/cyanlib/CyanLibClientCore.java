package fr.raphoulfifou.cyanlib;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Raphoulfifou
 * @since 1.0.0
 */
@Environment(EnvType.SERVER)
public class CyanLibClientCore implements DedicatedServerModInitializer
{

    public static final Logger LOGGER = LogManager.getLogger(CyanLibServerCore.MODID);
    public static final String SERVERMODNAME = "[CyanLibClient]";

    @Override
    // Initialize the differents parts of the mod when lauched on client
    public void onInitializeServer()
    {
        CyanLibClientCore.LOGGER.info("{} Initializing", SERVERMODNAME);
    }

}
