package fr.raphoulfifou.cyanlib;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @since 0.0.1
 */
@Environment(EnvType.SERVER)
public class CyanLibServerCore implements DedicatedServerModInitializer
{

    public static final String MODID = "cyanlib";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public static final String SERVERMODNAME = "[CyanLibServer]";

    @Override
    // Initialize the differents parts of the mod when lauched on server
    public void onInitializeServer()
    {
        LOGGER.info("{} Successfuly initialized", SERVERMODNAME);
    }

}
