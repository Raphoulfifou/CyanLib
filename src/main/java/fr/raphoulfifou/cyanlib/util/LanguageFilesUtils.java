package fr.raphoulfifou.cyanlib.util;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.TranslatableText;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static fr.raphoulfifou.cyanlib.util.ChatUtil.sendPlayerMessage;

public class LanguageFilesUtils
{

    public static void setupLangFile(ServerPlayerEntity player, String folderName, String langName, boolean useOneLanguage)
    {
        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.SERVER)
        {
            if (! Files.exists(FabricLoader.getInstance().getConfigDir().resolve(folderName)))
            {
                try
                {
                    Files.createDirectory(Paths.get(String.valueOf(FabricLoader.getInstance().getConfigDir().resolve(folderName))));
                    sendPlayerMessage(player,
                            "Folder created : config/" + folderName + "/",
                            folderName,
                            "cyanlib.message.folderCreated",
                            false,
                            useOneLanguage);
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            try
            {
                File langFile = new File(String.valueOf(FabricLoader.getInstance().getConfigDir().resolve(folderName + "\\" + langName + ".txt")));
                if (langFile.createNewFile())
                {
                    sendPlayerMessage(player,
                            "File created : " + langFile.getName(),
                            langFile.getName(),
                            "cyanlib.message.fileCreated",
                            false,
                            useOneLanguage);
                } else
                {
                    player.sendMessage(new TranslatableText("File already exists."), false);
                    sendPlayerMessage(player,
                            "File already exists.",
                            null,
                            "cyanlib.message.fileAlreadyExists",
                            false,
                            useOneLanguage);
                }
            } catch (IOException e)
            {
                sendPlayerMessage(player,
                        "Could not create the language file",
                        null,
                        "cyanlib.message.error.createFile",
                        false,
                        useOneLanguage);
                e.printStackTrace();
            }
        } else
        {
            sendPlayerMessage(player,
                    "This functionnality only works if you are on a server",
                    null,
                    "cyanlib.message.error.notOnServer",
                    false,
                    useOneLanguage);
        }
    }

}
