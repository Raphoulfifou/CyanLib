package fr.raphoulfifou.cyanlib;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/**
 * @since 0.0.1
 */
@Environment(EnvType.CLIENT)
public class CyanLibClientCore implements ClientModInitializer
{

    public static final String CLIENTMODNAME = "[CyanLibClient]";

    @Override
    public void onInitializeClient()
    {
        CyanLibServerCore.LOGGER.info("{} Successfuly initialized", CLIENTMODNAME);
    }

}
