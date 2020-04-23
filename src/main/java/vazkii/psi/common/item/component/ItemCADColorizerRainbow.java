/*
 * This class is distributed as a part of the Psi Mod.
 * Get the Source Code on GitHub:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: https://psi.vazkii.net/license.php
 */
package vazkii.psi.common.item.component;

import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import vazkii.psi.client.core.handler.ClientTickHandler;

import java.awt.*;

public class ItemCADColorizerRainbow extends ItemCADColorizer {
	public ItemCADColorizerRainbow(Properties properties) {
		super(properties);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public int getColor(ItemStack stack) {
		float time = ClientTickHandler.total;
		return Color.HSBtoRGB(time * 0.005F, 1F, 1F);
	}
}
