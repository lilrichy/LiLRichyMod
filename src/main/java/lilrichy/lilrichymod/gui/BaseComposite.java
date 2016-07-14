package lilrichy.lilrichymod.gui;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by LiLRichy on 7/11/2016.
 */

public abstract class BaseComposite extends BaseComponent {

    protected final List<BaseComponent> components = Lists.newArrayList();

    protected final List<BaseComponent> tickingComponents = Lists.newArrayList();

    public BaseComposite(int x, int y) {
        super(x, y);
    }

    private static boolean isComponentEnabled(BaseComponent component) {
        return component != null && component.isEnabled();
    }

    private static boolean isComponentCapturingMouse(BaseComponent component, int mouseX, int mouseY) {
        return isComponentEnabled(component) && component.isMouseOver(mouseX, mouseY);
    }

    protected boolean areChildrenActive() {
        return true;
    }

    @Override
    public void init(IComponentParent parent) {
        super.init(parent);
        for (BaseComponent child : components)
            child.init(parent);
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    public BaseComposite addComponent(BaseComponent component) {
        components.add(component);
        if (component.isTicking()) tickingComponents.add(component);
        return this;
    }

    protected void renderComponentBackground(int offsetX, int offsetY, int mouseX, int mouseY) {
    }

    protected void renderComponentForeground(int offsetX, int offsetY, int mouseX, int mouseY) {
    }

    @Override
    public final void render(int offsetX, int offsetY, int mouseX, int mouseY) {
        renderComponentBackground(offsetX, offsetY, mouseX, mouseY);

        if (!areChildrenActive()) return;

        final int ownX = offsetX + this.x;
        final int ownY = offsetY + this.y;
        final int relMouseX = mouseX - this.x;
        final int relMouseY = mouseY - this.y;

        for (BaseComponent component : components)
            if (isComponentEnabled(component)) {

                component.render(ownX, ownY, relMouseX, relMouseY);
            }

        renderComponentForeground(offsetX, offsetY, mouseX, mouseY);
    }

    protected void renderComponentOverlay(int offsetX, int offsetY, int mouseX, int mouseY) {
    }

    @Override
    public final void renderOverlay(int offsetX, int offsetY, int mouseX, int mouseY) {
        renderComponentOverlay(offsetX, offsetY, mouseX, mouseY);

        if (!areChildrenActive()) return;

        final int ownX = offsetX + this.x;
        final int ownY = offsetY + this.y;
        final int relMouseX = mouseX - this.x;
        final int relMouseY = mouseY - this.y;

        for (BaseComponent component : components)
            if (isComponentEnabled(component)) {
                component.renderOverlay(ownX, ownY, relMouseX, relMouseY);
            }

    }

    @Override
    public void keyTyped(char keyChar, int keyCode) {
        super.keyTyped(keyChar, keyCode);

        if (!areChildrenActive()) return;

        for (BaseComponent component : components)
            if (isComponentEnabled(component)) {
                component.keyTyped(keyChar, keyCode);
            }
    }

    // for freezing component list, since element layout may change during listener execution
    private List<BaseComponent> selectComponentsCapturingMouse(int mouseX, int mouseY) {
        ImmutableList.Builder<BaseComponent> result = ImmutableList.builder();

        for (BaseComponent component : components)
            if (isComponentCapturingMouse(component, mouseX, mouseY)) result.add(component);

        return result.build();
    }

    @Override
    public void mouseDown(int mouseX, int mouseY, int button) {
        super.mouseDown(mouseX, mouseY, button);

        if (!areChildrenActive()) return;

        for (BaseComponent component : selectComponentsCapturingMouse(mouseX, mouseY))
            component.mouseDown(mouseX - component.x, mouseY - component.y, button);
    }

    @Override
    public void mouseUp(int mouseX, int mouseY, int button) {
        super.mouseUp(mouseX, mouseY, button);

        if (!areChildrenActive()) return;

        for (BaseComponent component : selectComponentsCapturingMouse(mouseX, mouseY))
            component.mouseUp(mouseX - component.x, mouseY - component.y, button);
    }

    @Override
    public void mouseDrag(int mouseX, int mouseY, int button, /* love you */long time) {
        super.mouseDrag(mouseX, mouseY, button, time);

        if (!areChildrenActive()) return;

        for (BaseComponent component : selectComponentsCapturingMouse(mouseX, mouseY))
            component.mouseDrag(mouseX - component.x, mouseY - component.y, button, time);
    }

    @Override
    public boolean isTicking() {
        return !tickingComponents.isEmpty();
    }

    @Override
    public void tick() {
        super.tick();

        for (BaseComponent component : tickingComponents)
            component.tick();
    }

}