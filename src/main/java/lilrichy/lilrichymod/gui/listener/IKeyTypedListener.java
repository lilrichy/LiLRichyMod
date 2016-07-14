package lilrichy.lilrichymod.gui.listener;


import lilrichy.lilrichymod.gui.BaseComponent;

public interface IKeyTypedListener extends IListenerBase {
    void componentKeyTyped(BaseComponent component, char character, int keyCode);
}