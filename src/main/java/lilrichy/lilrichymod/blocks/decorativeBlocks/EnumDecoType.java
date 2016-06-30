package lilrichy.lilrichymod.blocks.decorativeBlocks;

import net.minecraft.util.IStringSerializable;

/**
 * Created by LiLRichy on 2/15/2016.
 */
public enum EnumDecoType implements IStringSerializable {

    DECOVAR0(0, "DecoVar0"), DECOVAR1(1, "DecoVar1"), DECOVAR2(2, "DecoVar2"), DECOVAR3(3,
            "DecoVar3"), DECOVAR4(4, "DecoVar4"), DECOVAR5(5, "DecoVar5"), DECOVAR6(
            6, "DecoVar6"), DECOVAR7(7, "DecoVar7"), DECOVAR8(8, "DecoVar8"), DECOVAR9(9, "DecoVar9"),
    DECOVAR10(10, "DecoVar10"), DECOVAR11(11, "DecoVar11"), DECOVAR12(12, "DecoVar12"), DECOVAR13(13, "DecoVar13"), DECOVAR14(14, "DecoVar14");

    private int ID;
    private String name;

    private EnumDecoType(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}