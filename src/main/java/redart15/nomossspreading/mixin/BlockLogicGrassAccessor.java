package redart15.nomossspreading.mixin;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicGrass;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(BlockLogicGrass.class)
public interface BlockLogicGrassAccessor {
	@Accessor(value = "dirt",remap = false)
	Block<?> getDirt();
}
