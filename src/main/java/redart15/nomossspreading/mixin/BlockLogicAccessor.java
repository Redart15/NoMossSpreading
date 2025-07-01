package redart15.nomossspreading.mixin;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(BlockLogic.class)
public interface BlockLogicAccessor {
	@Accessor(value = "block", remap = false)
	Block<?> getBlock();
}
