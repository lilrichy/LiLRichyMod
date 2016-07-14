package lilrichy.lilrichymod.gui.listener;


import lilrichy.lilrichymod.gui.BaseComponent;

public interface IMouseDownListener extends IListenerBase {
    void componentMouseDown(BaseComponent component, int x, int y, int button);
}