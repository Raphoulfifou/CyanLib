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
public class CyanLibServerCore implements DedicatedServerModInitializer
{

    public static final String MODID = "cyanlib";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static final String SERVERMODNAME = "[CyanLibServer]";

    @Override
    // Initialize the differents parts of the mod when lauched on server
    public void onInitializeServer()
    {
        CyanLibServerCore.LOGGER.info("{} Initializing", SERVERMODNAME);
    }

}
