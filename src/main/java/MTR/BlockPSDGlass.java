package MTR;

import net.minecraft.block.state.IBlockState;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockPSDGlass extends BlockPSD {

	private static final String name = "BlockPSDGlass";

	protected BlockPSDGlass() {
		super();
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(name);
	}

	@Override
	public int damageDropped(IBlockState state) {
		return 1;
	}

	public String getName() {
		return name;
	}
}
