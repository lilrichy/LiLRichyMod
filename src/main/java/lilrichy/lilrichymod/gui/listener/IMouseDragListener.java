package lilrichy.lilrichymod.gui.listener;


import lilrichy.lilrichymod.gui.BaseComponent;

public interface IMouseDragListener extends IListenerBase {
    void componentMouseDrag(BaseComponent component, int x, int y, int button, long time);
}