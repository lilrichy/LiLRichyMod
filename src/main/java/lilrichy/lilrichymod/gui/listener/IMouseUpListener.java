package lilrichy.lilrichymod.gui.listener;


import lilrichy.lilrichymod.gui.BaseComponent;

public interface IMouseUpListener extends IListenerBase {
    void componentMouseUp(BaseComponent component, int x, int y, int button);
}