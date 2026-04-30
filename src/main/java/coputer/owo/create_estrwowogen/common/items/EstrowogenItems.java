package coputer.owo.create_estrwowogen.common.items;

import com.google.common.eventbus.EventBus;
import coputer.owo.create_estrwowogen.Estrowogen;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EstrowogenItems {
    public static final DeferredRegister.Items ESTROWOGEN_ITEMS = DeferredRegister.createItems(Estrowogen.MODID);

    public static final Supplier<Item> ITEM = ESTROWOGEN_ITEMS.registerItem("item",
            Item::new,
            new Item.Properties().stacksTo(10));

    public static void register(IEventBus eventBus){
        ESTROWOGEN_ITEMS.register(eventBus);
    }
}
