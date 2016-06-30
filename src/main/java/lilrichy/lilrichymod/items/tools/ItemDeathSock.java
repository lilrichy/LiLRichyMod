//package lilrichy.lilrichymod.items.tools;
//
//import lilrichy.lilrichymod.items.ItemLiLRichyMod;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.ItemStack;
//import net.minecraft.potion.Potion;
//import net.minecraft.potion.PotionEffect;
//
//import net.minecraft.world.World;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;
//
//import java.util.List;
//
///**
// * Created by Rich on 11/19/2015.
// */
//public class ItemDeathSock extends ItemLiLRichyMod {
//    public boolean charged = false;
//    public boolean activated = false;
//    public int chargeTime = 0;
//
//    public ItemDeathSock(String name) {
//        super(name);
//        this.setUnlocalizedName(name);
//        this.maxStackSize = 1;
//    }
//    //ToDo Rendering of blocks, item, block states, and models
//    @SideOnly(Side.CLIENT)
//    public boolean hasEffect(ItemStack par1ItemStack, int pass) {
//        return charged;
//    }
//
//    @Override
//    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean show) {
//        if (charged && !activated) {
//            list.add("Charged Right Click while sneaking to activate the sock!");
//        } else if (activated && chargeTime >= 0) {
//            list.add("Charged " + chargeTime / 10 + "%");
//        } else
//            list.add("Right Click to charge the sock.");
//    }
//
//    @Override
//    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
//        if (player.isSneaking() && charged && !activated) {
//            activated = true;
//            player.addChatMessage((new ChatComponentText("The sock has been activated!")));
//        } else if (!player.isSneaking() && !charged && !activated) {
//            chargeTime = chargeTime + 100;
//            if (chargeTime >= 1000) {
//                player.addChatMessage((new ChatComponentText(Reference.DEATH_SOCK_CHARGED)));
//                charged = true;
//                if (world.isRemote) this.hasEffect(itemStack, 1);
//            } else player.addChatMessage((new ChatComponentText("Charging " + chargeTime / 10 + " %")));
//        }
//        return itemStack;
//    }
//
//    @Override
//    public void onUpdate(ItemStack stack, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) {
//        if (charged && activated) {
//            world.getClosestPlayerToEntity(entity, 10).addPotionEffect(new PotionEffect(Potion.getPotionById(id), 200, 6000, false,true));
//            chargeTime--;
//            if (chargeTime <= -100) {
//                charged = false;
//                activated = false;
//                chargeTime = 0;
//            }
//        }
//    }
//}