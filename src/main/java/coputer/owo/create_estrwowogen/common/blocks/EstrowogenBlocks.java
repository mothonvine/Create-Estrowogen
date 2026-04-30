package coputer.owo.create_estrwowogen.common.blocks;

import coputer.owo.create_estrwowogen.Estrowogen;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static coputer.owo.create_estrwowogen.common.items.EstrowogenItems.ESTROWOGEN_ITEMS;

public class EstrowogenBlocks {
    public static final DeferredRegister.Blocks ESTROWOGEN_BLOCKS = DeferredRegister.createBlocks(Estrowogen.MODID);

    public static final DeferredBlock<Block> BASE =
            registerBlockWithItem(
                    "base",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                    ));


    private static <B extends Block> DeferredBlock<B> registerBlockWithItem(String name, Supplier<? extends B> supplier){
        DeferredBlock<B> return_block = ESTROWOGEN_BLOCKS.register(name, supplier);
        ESTROWOGEN_ITEMS.registerSimpleBlockItem(name, return_block);
        return return_block;
    };

    public static void register(IEventBus eventBus){
        ESTROWOGEN_BLOCKS.register(eventBus);
    }
}
