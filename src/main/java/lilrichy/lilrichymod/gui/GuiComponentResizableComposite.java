package lilrichy.lilrichymod.gui;

/**
 * Created by LiLRichy on 7/11/2016.
 */
public abstract class GuiComponentResizableComposite extends BaseComposite {
    protected int width;
    protected int height;

    public GuiComponentResizableComposite(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
