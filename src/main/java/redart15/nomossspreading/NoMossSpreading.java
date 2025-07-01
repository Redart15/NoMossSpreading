package redart15.nomossspreading;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.data.gamerule.GameRuleBoolean;
import net.minecraft.core.data.gamerule.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class NoMossSpreading implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static GameRuleBoolean MOSS_SPREADING = GameRules.register(new GameRuleBoolean("doMossSpreading", false));
	public static GameRuleBoolean GRASS_SPREADING = GameRules.register(new GameRuleBoolean("doGrassSpreading", true));

    @Override
    public void onInitialize() {
        LOGGER.info("ExampleMod initialized.");
    }

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}

	@Override
	public void beforeGameStart() {
	}

	@Override
	public void afterGameStart() {

	}
}
